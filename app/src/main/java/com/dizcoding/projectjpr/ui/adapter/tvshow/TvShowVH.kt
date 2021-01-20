package com.dizcoding.projectjpr.ui.adapter.tvshow

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

class TvShowVH (itemView : View, val callback: TvShowCallback) : AbstractViewHolder<TvShowModel>(itemView) {
    private var cvFilm : CardView = itemView.cvFilm
    private var ivPoster : ImageView = itemView.ivPoster
    private var tvTitle : TextView = itemView.tvTitle
    private var tvDescription : TextView = itemView.tvDescription

    companion object {
        val LAYOUT = R.layout.item_film
    }

    override fun bind(element: TvShowModel) {
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
                callback.onTvItemClicked(element)
            }
        })
    }

}