package com.dizcoding.projectjpr.ui.adapter.movies

interface MovieCallback {
    fun onMovieItemClick(element: MovieModel)
    fun onIconShareClick(element: MovieModel)
}