package com.dizcoding.projectjpr.ui.adapter.movies

import com.dizcoding.projectjpr.base.adapter.BaseItemModel
import com.dizcoding.projectjpr.base.adapter.BaseItemTypeFactory
import com.dizcoding.projectjpr.base.adapter.BaseTypeFactory

class MovieModel(
    val id : Int?,
    val posterPath : String?,
    val title : String?,
    val description : String?,
    val backDropPath: String = "",
    val lang: String = "",
    val relDate: String = "",
    val rate: Double = 0.toDouble()
) : BaseItemModel() {
    override fun type(typeFactoryBase: BaseItemTypeFactory): Int {
        typeVH = MovieVH.LAYOUT
        return (typeFactoryBase as BaseTypeFactory).type(this)
    }
}