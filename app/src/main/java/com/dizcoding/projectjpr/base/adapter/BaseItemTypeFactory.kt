package com.dizcoding.projectjpr.base.adapter

import android.view.View

interface BaseItemTypeFactory {
    fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*>
}