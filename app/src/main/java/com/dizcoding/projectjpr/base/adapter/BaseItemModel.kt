package com.dizcoding.projectjpr.base.adapter

abstract class BaseItemModel(var isSelected : Boolean = false,var typeVH : Int = 0) {
    abstract fun type(typeFactoryBase: BaseItemTypeFactory): Int
}