package com.dizcoding.projectjpr.ui.fragments.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dizcoding.projectjpr.data.source.ProjectJPRRepository
import com.dizcoding.projectjpr.data.source.local.entity.TvEntity

class TvShowViewModel(private val projectJPRRepository: ProjectJPRRepository) : ViewModel() {

    fun getTvShow(): LiveData<List<TvEntity>>  = projectJPRRepository.getAllTves()
}