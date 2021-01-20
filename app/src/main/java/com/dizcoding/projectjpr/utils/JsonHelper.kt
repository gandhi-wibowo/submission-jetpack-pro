package com.dizcoding.projectjpr.utils

import android.content.Context
import com.dizcoding.projectjpr.data.source.remote.response.MovieResponse
import com.dizcoding.projectjpr.data.source.remote.response.TvResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovieDetail(movieId: Int): MovieResponse {
        var retData: MovieResponse? = null
        loadMovies().forEach { movies ->
            if (movies.id == movieId) retData = movies
        }
        return retData as MovieResponse
    }

    fun loadMovies(): List<MovieResponse> {
        val retData = arrayListOf<MovieResponse>()

        try {
            val responseObject = JSONObject(parsingFileToString("movie_popular.json").toString())
            val listArray = responseObject.getJSONArray("results")
            for (i in 0 until listArray.length()) {
                val movies = listArray.getJSONObject(i)

                val adult: Boolean = movies.getBoolean("adult")
                val backdrop_path: String = movies.getString("backdrop_path")
                val id: Int = movies.getInt("id")
                val original_language: String = movies.getString("original_language")
                val original_title: String = movies.getString("original_title")
                val overview: String = movies.getString("overview")
                val popularity: Double = movies.getDouble("popularity")
                val poster_path: String = movies.getString("poster_path")
                val release_date: String = movies.getString("release_date")
                val title: String = movies.getString("title")
                val video: Boolean = movies.getBoolean("video")
                val vote_average: Double = movies.getDouble("vote_average")
                val vote_count: Int = movies.getInt("vote_count")


                val movie = MovieResponse(
                    adult,
                    backdrop_path,
                    id,
                    original_language,
                    original_title,
                    overview,
                    popularity,
                    poster_path,
                    release_date,
                    title,
                    video,
                    vote_average,
                    vote_count
                )
                retData.add(movie)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return retData
    }

    fun loadTvShowDetail(tvId: Int): TvResponse {
        var retData: TvResponse? = null
        loadTvShows().forEach { movies ->
            if (movies.id == tvId) retData = movies
        }
        return retData as TvResponse
    }

    fun loadTvShows(): List<TvResponse> {
        val retData = arrayListOf<TvResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("tv_popular.json").toString())
            val listArray = responseObject.getJSONArray("results")
            for (i in 0 until listArray.length()) {
                val tvs = listArray.getJSONObject(i)

                val backdrop_path: String = tvs.getString("backdrop_path")
                val id: Int = tvs.getInt("id")
                val original_language: String = tvs.getString("original_language")
                val overview: String = tvs.getString("overview")
                val popularity: Double = tvs.getDouble("popularity")
                val poster_path: String = tvs.getString("poster_path")
                val vote_average: Double = tvs.getDouble("vote_average")
                val vote_count: Int = tvs.getInt("vote_count")
                val first_air_date: String = tvs.getString("first_air_date")
                val name: String = tvs.getString("name")
                val original_name: String = tvs.getString("original_name")

                val tv = TvResponse(
                    backdrop_path,
                    id,
                    original_language,
                    overview,
                    popularity,
                    poster_path,
                    vote_average,
                    vote_count,
                    first_air_date,
                    name,
                    original_name
                )
                retData.add(tv)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return retData
    }

}