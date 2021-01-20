package com.dizcoding.projectjpr.ui.adapter.tvshow

import android.view.View
import com.dizcoding.projectjpr.base.adapter.AbstractViewHolder
import com.dizcoding.projectjpr.base.adapter.BaseItemModel
import com.dizcoding.projectjpr.base.adapter.BaseTypeFactory

class TvShowFactoryImpl (val callback: TvShowCallback) : BaseTypeFactory {

    override fun type(typeFactory: BaseItemModel): Int {
        if (typeFactory.typeVH == TvShowVH.LAYOUT) return TvShowVH.LAYOUT
        else return 0
    }

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when (type) {
            TvShowVH.LAYOUT -> TvShowVH(parent,callback)
            else -> createViewHolder(parent, type)
        }
    }
}