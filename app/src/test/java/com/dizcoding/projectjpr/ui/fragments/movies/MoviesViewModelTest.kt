package com.dizcoding.projectjpr.ui.fragments.movies

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dizcoding.projectjpr.IConfig
import com.dizcoding.projectjpr.data.source.ProjectJPRRepository
import com.dizcoding.projectjpr.data.source.local.entity.MovieEntity
import com.dizcoding.projectjpr.ui.adapter.movies.MovieModel
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MoviesViewModelTest {

    private lateinit var viewModel: MoviesViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var projectRepository: ProjectJPRRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun setUp() {
        viewModel = MoviesViewModel(projectRepository)
    }

    @Test
    fun MoviesViewModelTest() {
        val dummyMovie = IConfig.generateDataMovieEntity()
        val movie = MutableLiveData<List<MovieEntity>>()
        movie.value = dummyMovie

        `when` (projectRepository.getAllMovies()).thenReturn(movie)
        val movieEntity = viewModel.getMovies().value
        verify(projectRepository).getAllMovies()
        assertNotNull(movieEntity)
        assertEquals(40, movieEntity?.size)

        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }
}