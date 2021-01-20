package com.dizcoding.projectjpr.ui.activities.detailfilm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.dizcoding.projectjpr.IConfig
import com.dizcoding.projectjpr.R
import com.dizcoding.projectjpr.data.source.local.entity.FilmDetailEntity
import com.dizcoding.projectjpr.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_detail_film.*
import java.lang.StringBuilder

class DetailFilmActivity : AppCompatActivity() {
    private lateinit var viewModel: DetailFilmViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_film)
        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(
            this,
            factory
        )[DetailFilmViewModel::class.java]


        val typeFilm = intent.getStringExtra("typeFilm")
        val id = intent.getIntExtra("id", 0)

        val presentDataObserver = Observer<FilmDetailEntity> { detailMovie ->
            tvLang.text = StringBuilder("Lang : ${detailMovie.original_language}")
            tvDate.text = StringBuilder("Release Date : ${detailMovie.release_date}")
            tvRate.text = StringBuilder("Rate : ${detailMovie.vote_average}")
            tvTitle.text = detailMovie.name
            tvDescription.text = detailMovie.overview
            Glide
                .with(this)
                .load(IConfig.IMDB_IMAGE_URL + detailMovie.backdrop_path)
                .fitCenter()
                .into(ivPoster)
        }

        if (typeFilm == "tv") viewModel.getDetailTvShow(id).observe(this,presentDataObserver)
        else if (typeFilm == "movie") viewModel.getDetailMovie(id).observe(this,presentDataObserver)
        else finish()
    }
}