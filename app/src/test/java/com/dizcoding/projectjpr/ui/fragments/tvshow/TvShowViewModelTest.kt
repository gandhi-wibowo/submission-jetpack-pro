package com.dizcoding.projectjpr.ui.fragments.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dizcoding.projectjpr.IConfig
import com.dizcoding.projectjpr.data.source.ProjectJPRRepository
import com.dizcoding.projectjpr.data.source.local.entity.MovieEntity
import com.dizcoding.projectjpr.data.source.local.entity.TvEntity
import com.dizcoding.projectjpr.ui.fragments.movies.MoviesViewModel
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var projectRepository: ProjectJPRRepository

    @Mock
    private lateinit var observer: Observer<List<TvEntity>>

    @Before
    fun setUp() {
        viewModel = TvShowViewModel(projectRepository)
    }

    @Test
    fun fetchTvShow() {
        val dummyMovie = IConfig.generateDataTvEntity()
        val movie = MutableLiveData<List<TvEntity>>()
        movie.value = dummyMovie

        Mockito.`when`(projectRepository.getAllTves()).thenReturn(movie)
        val movieEntity = viewModel.getTvShow().value
        verify(projectRepository).getAllTves()
        assertNotNull(movieEntity)
        assertEquals(40, movieEntity?.size)

        viewModel.getTvShow().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }
}