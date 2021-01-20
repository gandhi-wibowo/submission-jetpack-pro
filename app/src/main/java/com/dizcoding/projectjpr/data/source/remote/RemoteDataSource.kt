package com.dizcoding.projectjpr.data.source.remote

import com.dizcoding.projectjpr.data.source.remote.response.MovieResponse
import com.dizcoding.projectjpr.data.source.remote.response.TvResponse
import com.dizcoding.projectjpr.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper)
            }
    }

    fun getAllMovies () : List<MovieResponse> = jsonHelper.loadMovies()
    fun getDetailMovie(movieId : Int) : MovieResponse = jsonHelper.loadMovieDetail(movieId)
    fun getAllTvShow()  : List<TvResponse> = jsonHelper.loadTvShows()
    fun getDetailTvShow(tvId : Int) : TvResponse = jsonHelper.loadTvShowDetail(tvId)
}