package com.dizcoding.projectjpr.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dizcoding.projectjpr.data.source.ProjectJPRRepository
import com.dizcoding.projectjpr.di.Injection
import com.dizcoding.projectjpr.ui.activities.detailfilm.DetailFilmViewModel
import com.dizcoding.projectjpr.ui.fragments.movies.MoviesViewModel
import com.dizcoding.projectjpr.ui.fragments.tvshow.TvShowViewModel

class ViewModelFactory private constructor (private val projectJPRRepository: ProjectJPRRepository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context))
            }
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when{
            modelClass.isAssignableFrom(MoviesViewModel::class.java) -> {
                return MoviesViewModel(projectJPRRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                return TvShowViewModel(projectJPRRepository) as T
            }
            modelClass.isAssignableFrom(DetailFilmViewModel::class.java) -> {
                return DetailFilmViewModel(projectJPRRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}