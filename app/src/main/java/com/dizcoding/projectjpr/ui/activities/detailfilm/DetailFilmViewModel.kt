package com.dizcoding.projectjpr.ui.activities.detailfilm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dizcoding.projectjpr.data.source.ProjectJPRRepository
import com.dizcoding.projectjpr.data.source.local.entity.FilmDetailEntity

class DetailFilmViewModel(private val projectJPRRepository: ProjectJPRRepository) : ViewModel() {


    fun getDetailMovie(id: Int): LiveData<FilmDetailEntity> =
        projectJPRRepository.getDetailMovie(id)

    fun getDetailTvShow(id: Int): LiveData<FilmDetailEntity> =
        projectJPRRepository.getDetailTv(id)

}