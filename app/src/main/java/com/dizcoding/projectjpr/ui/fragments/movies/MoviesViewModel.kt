package com.dizcoding.projectjpr.ui.fragments.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dizcoding.projectjpr.data.source.ProjectJPRRepository
import com.dizcoding.projectjpr.data.source.local.entity.MovieEntity

class MoviesViewModel(private val projectJPRRepository: ProjectJPRRepository) : ViewModel() {

    fun getMovies(): LiveData<List<MovieEntity>> = projectJPRRepository.getAllMovies()
}