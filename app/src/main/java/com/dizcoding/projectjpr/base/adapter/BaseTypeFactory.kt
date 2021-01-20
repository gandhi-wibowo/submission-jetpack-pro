package com.dizcoding.projectjpr.base.adapter

interface BaseTypeFactory : BaseItemTypeFactory {
    fun type(typeFactory: BaseItemModel) : Int
}