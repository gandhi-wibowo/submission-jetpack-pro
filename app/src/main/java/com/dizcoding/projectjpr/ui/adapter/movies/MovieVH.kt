package com.dizcoding.projectjpr.ui.adapter.movies

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide
import com.dizcoding.projectjpr.IConfig
import com.dizcoding.projectjpr.R
import com.dizcoding.projectjpr.base.adapter.AbstractViewHolder
import com.dizcoding.projectjpr.utils.SinggleClickEvent
import kotlinx.android.synthetic.main.item_film.view.*

class MovieVH (itemView : View, val callback: MovieCallback) : AbstractViewHolder<MovieModel>(itemView) {
    private var cvFilm : CardView = itemView.cvFilm
    private var cvShare : CardView = itemView.cvShare
    private var ivPoster : ImageView = itemView.ivPoster
    private var tvTitle : TextView = itemView.tvTitle
    private var tvDescription : TextView = itemView.tvDescription

    companion object {
        val LAYOUT = R.layout.item_film
    }

    override fun bind(element: MovieModel) {
        cvShare.visibility = View.VISIBLE
        Glide
            .with(itemView.context)
            .load(IConfig.IMDB_IMAGE_URL+element.posterPath)
            .fitCenter()
            .into(ivPoster)
        tvTitle.text = element.title
        tvDescription.text = element.description
        cvFilm.setOnClickListener(object : SinggleClickEvent {
            override fun onClick(v: View?) {
                super.onClick(v)
                callback.onMovieItemClick(element)
            }
        })
        cvShare.setOnClickListener(object : SinggleClickEvent {
            override fun onClick(v: View?) {
                super.onClick(v)
                callback.onIconShareClick(element)
            }
        })
    }

}