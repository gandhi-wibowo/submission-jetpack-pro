package com.dizcoding.projectjpr.ui.activities.detailfilm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dizcoding.projectjpr.IConfig
import com.dizcoding.projectjpr.data.source.ProjectJPRRepository
import com.dizcoding.projectjpr.data.source.local.entity.FilmDetailEntity
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailFilmActivityViewModelTest {

    private lateinit var viewModel: DetailFilmViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var projectRepository: ProjectJPRRepository

    @Mock
    private lateinit var observer: Observer<FilmDetailEntity>

    @Before
    fun setUp() {
        viewModel = DetailFilmViewModel(projectRepository)
    }


    @Test
    fun getDetailTvShow() {
        val dummyMovie = IConfig.getDataTvDetail(77169)
        val movie = MutableLiveData<FilmDetailEntity>()
        movie.value = dummyMovie

        Mockito.`when`(projectRepository.getDetailTv(77169)).thenReturn(movie)
        val movieEntity = viewModel.getDetailTvShow(77169).value
        verify(projectRepository).getDetailTv(77169)
        assertNotNull(movieEntity)
        assertEquals(77169, movieEntity?.id)

        viewModel.getDetailTvShow(77169).observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

    @Test
    fun getDetailMovie() {
        val dummyMovie = IConfig.getDataMovieDetail(508442)
        val movie = MutableLiveData<FilmDetailEntity>()
        movie.value = dummyMovie

        Mockito.`when`(projectRepository.getDetailMovie(508442)).thenReturn(movie)
        val movieEntity = viewModel.getDetailMovie(508442).value
        verify(projectRepository).getDetailMovie(508442)
        assertNotNull(movieEntity)
        assertEquals(508442, movieEntity?.id)

        viewModel.getDetailMovie(508442).observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }
}