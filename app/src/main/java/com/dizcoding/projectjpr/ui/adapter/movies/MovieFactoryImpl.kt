package com.dizcoding.projectjpr.ui.adapter.movies

import android.view.View
import com.dizcoding.projectjpr.base.adapter.AbstractViewHolder
import com.dizcoding.projectjpr.base.adapter.BaseItemModel
import com.dizcoding.projectjpr.base.adapter.BaseTypeFactory

class MovieFactoryImpl (val callback: MovieCallback) : BaseTypeFactory {

    override fun type(typeFactory: BaseItemModel): Int {
        if (typeFactory.typeVH == MovieVH.LAYOUT) return MovieVH.LAYOUT
        else return 0
    }

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when (type) {
            MovieVH.LAYOUT -> MovieVH(parent,callback)
            else -> createViewHolder(parent, type)
        }
    }
}