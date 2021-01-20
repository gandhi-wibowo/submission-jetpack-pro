package com.dizcoding.projectjpr.data.source

import androidx.lifecycle.LiveData
import com.dizcoding.projectjpr.data.source.local.entity.FilmDetailEntity
import com.dizcoding.projectjpr.data.source.local.entity.MovieEntity
import com.dizcoding.projectjpr.data.source.local.entity.TvEntity

interface ProjectJPRDataSource {
    fun getAllMovies() : LiveData<List<MovieEntity>>
    fun getAllTves() : LiveData<List<TvEntity>>
    fun getDetailMovie(movieId : Int) : LiveData<FilmDetailEntity>
    fun getDetailTv(movieId: Int) : LiveData<FilmDetailEntity>
}