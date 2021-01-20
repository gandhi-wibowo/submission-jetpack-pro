package com.dizcoding.projectjpr.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dizcoding.projectjpr.IConfig
import com.dizcoding.projectjpr.data.FakeProjectJPRRepository
import com.dizcoding.projectjpr.data.source.local.entity.FilmDetailEntity
import com.dizcoding.projectjpr.data.source.local.entity.MovieEntity
import com.dizcoding.projectjpr.data.source.local.entity.TvEntity
import com.dizcoding.projectjpr.data.source.remote.RemoteDataSource
import com.dizcoding.projectjpr.data.source.remote.response.MovieResponse
import com.dizcoding.projectjpr.ui.fragments.movies.MoviesViewModel
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ProjectJPRRepositoryTest {


    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private lateinit var projectRepository : FakeProjectJPRRepository

    private val movies = IConfig.generateRemoteDummyMovie()
    private val movieId = movies[0].id
    private val tvShow = IConfig.generateRemoteDummyTvShow()
    private val tvShowId = tvShow[0].id

    private val movieDetail = IConfig.generateRemoteDummyMovieDetail(movieId)
    private val tvDetail = IConfig.generateRemoteDummyTvShowDetail(tvShowId)

    @Mock
    private lateinit var movieObserver: Observer<List<MovieEntity>>
    @Mock
    private lateinit var tvObserver: Observer<List<TvEntity>>
    @Mock
    private lateinit var detailObserver: Observer<FilmDetailEntity>

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        projectRepository = FakeProjectJPRRepository(remote)
    }

    @Test
    fun getAllMovies() {

        val dummyMovie = IConfig.generateDataMovieEntity()
        val movie = MutableLiveData<List<MovieEntity>>()
        movie.value = dummyMovie

        `when`(remote.getAllMovies()).thenReturn(movies)
        val movieEntity = projectRepository.getAllMovies().value
        verify<RemoteDataSource>(remote).getAllMovies()
        assertNotNull(movieEntity)
        assertEquals(movies.size.toLong(),movieEntity?.size?.toLong())


        projectRepository.getAllMovies().observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyMovie)
    }

    @Test
    fun getAllTves() {

        val dummyTv = IConfig.generateDataTvEntity()
        val movie = MutableLiveData<List<TvEntity>>()
        movie.value = dummyTv

        `when`(remote.getAllTvShow()).thenReturn(tvShow)
        val movieEntity = projectRepository.getAllTves().value
        verify<RemoteDataSource>(remote).getAllTvShow()
        assertNotNull(movieEntity)
        assertEquals(tvShow.size.toLong(),movieEntity?.size?.toLong())


        projectRepository.getAllTves().observeForever(tvObserver)
        verify(tvObserver).onChanged(dummyTv)

    }

    @Test
    fun getDetailMovie() {

        val dummyTv = IConfig.getDataMovieDetail(movieId)
        val movie = MutableLiveData<FilmDetailEntity>()
        movie.value = dummyTv

        `when`(remote.getDetailMovie(movieId)).thenReturn(movieDetail)
        val movieEntity = projectRepository.getDetailMovie(movieId).value
        verify<RemoteDataSource>(remote).getDetailMovie(movieId)
        assertNotNull(movieEntity)
        assertEquals(movieId,movieEntity?.id)

        projectRepository.getDetailMovie(movieId).observeForever(detailObserver)
        verify(detailObserver).onChanged(dummyTv)

    }

    @Test
    fun getDetailTv() {
        `when`(remote.getDetailTvShow(tvShowId)).thenReturn(tvDetail)
        val movieEntity = projectRepository.getDetailTv(tvShowId).value
        verify<RemoteDataSource>(remote).getDetailTvShow(tvShowId)
        assertNotNull(movieEntity)
        assertEquals(tvShowId,movieEntity?.id)

        val dummyMovie = IConfig.getDataTvDetail(tvShowId)
        val movie = MutableLiveData<FilmDetailEntity>()
        movie.value = dummyMovie

        projectRepository.getDetailTv(tvShowId).observeForever(detailObserver)
        verify(detailObserver).onChanged(dummyMovie)
    }
}