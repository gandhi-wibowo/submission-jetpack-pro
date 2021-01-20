package com.dizcoding.projectjpr.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dizcoding.projectjpr.data.source.ProjectJPRDataSource
import com.dizcoding.projectjpr.data.source.local.entity.FilmDetailEntity
import com.dizcoding.projectjpr.data.source.local.entity.MovieEntity
import com.dizcoding.projectjpr.data.source.local.entity.TvEntity
import com.dizcoding.projectjpr.data.source.remote.RemoteDataSource

class FakeProjectJPRRepository(private val remoteDataSource: RemoteDataSource) :
    ProjectJPRDataSource {


    override fun getAllMovies(): LiveData<List<MovieEntity>> {
        val movie = MutableLiveData<List<MovieEntity>>()

        val retData = arrayListOf<MovieEntity>()
        remoteDataSource.getAllMovies().forEach { movieResponse ->
            retData.add(
                MovieEntity(
                    movieResponse.adult,
                    movieResponse.backdrop_path,
                    movieResponse.id,
                    movieResponse.original_language,
                    movieResponse.original_title,
                    movieResponse.overview,
                    movieResponse.popularity,
                    movieResponse.poster_path,
                    movieResponse.release_date,
                    movieResponse.title,
                    movieResponse.video,
                    movieResponse.vote_average,
                    movieResponse.vote_count
                )
            )
        }
        movie.postValue(retData)

        return movie
    }

    override fun getAllTves(): LiveData<List<TvEntity>> {
        val movie = MutableLiveData<List<TvEntity>>()
        val retData = arrayListOf<TvEntity>()
        remoteDataSource.getAllTvShow().forEach {
            retData.add(
                TvEntity(
                    it.backdrop_path,
                    it.id,
                    it.original_language,
                    it.overview,
                    it.popularity,
                    it.poster_path,
                    it.vote_average,
                    it.vote_count,
                    it.first_air_date,
                    it.name,
                    it.original_name
                )
            )
        }
        movie.postValue(retData)
        return movie
    }

    override fun getDetailMovie(movieId: Int): LiveData<FilmDetailEntity> {
        val movie = MutableLiveData<FilmDetailEntity>()
        val retData: FilmDetailEntity
        val it = remoteDataSource.getDetailMovie(movieId)
        retData = FilmDetailEntity(
            it.title,
            it.backdrop_path,
            it.id,
            it.original_language,
            it.overview,
            it.popularity,
            it.poster_path,
            it.release_date,
            it.vote_average,
            it.vote_count
        )
        movie.postValue(retData)
        return movie
    }

    override fun getDetailTv(movieId: Int): LiveData<FilmDetailEntity> {
        val movie = MutableLiveData<FilmDetailEntity>()
        var retData: FilmDetailEntity? = null
        val it = remoteDataSource.getDetailTvShow(movieId)
        retData = FilmDetailEntity(
            it.name,
            it.backdrop_path,
            it.id,
            it.original_language,
            it.overview,
            it.popularity,
            it.poster_path,
            it.first_air_date,
            it.vote_average,
            it.vote_count
        )
        movie.postValue(retData)
        return movie
    }
}