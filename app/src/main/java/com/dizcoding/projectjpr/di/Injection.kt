package com.dizcoding.projectjpr.di

import android.content.Context
import com.dizcoding.projectjpr.data.source.ProjectJPRRepository
import com.dizcoding.projectjpr.data.source.remote.RemoteDataSource
import com.dizcoding.projectjpr.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): ProjectJPRRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return ProjectJPRRepository.getInstance(remoteDataSource)
    }
}