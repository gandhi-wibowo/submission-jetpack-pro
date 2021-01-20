package com.dizcoding.projectjpr.base.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class BaseListAdapter(
    private val adapterTypeFactoryBase: BaseItemTypeFactory,
    private val items: ArrayList<BaseItemModel> = arrayListOf()
) : RecyclerView.Adapter<AbstractViewHolder<BaseItemModel>>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AbstractViewHolder<BaseItemModel> {
        val view = inflateItem(parent, viewType)
        return adapterTypeFactoryBase.createViewHolder(
            view,
            viewType
        ) as AbstractViewHolder<BaseItemModel>
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: AbstractViewHolder<BaseItemModel>, position: Int) {
        holder.bind(items[position])
    }

    private fun inflateItem(viewGroup: ViewGroup, viewType: Int): View {
        return LayoutInflater.from(viewGroup.context).inflate(viewType, viewGroup, false)
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type(adapterTypeFactoryBase)
    }

    fun getSelected(): ArrayList<BaseItemModel> {
        val ret: ArrayList<BaseItemModel> = arrayListOf()
        this.items.forEach {
            if (it.isSelected) ret.add(it)
        }
        return ret
    }

    fun addSelected(item: BaseItemModel, position: Int) {
        this.items.removeAt(position)
        item.isSelected = !item.isSelected
        this.items.add(position, item)
        notifyItemChanged(position)
    }

    // purpose for adding data selected, but only for singgle selected type
    fun addSinggleSelected(item: BaseItemModel, position: Int){
        removeSelectedMarker()
        addSelected(item,position)
    }

    fun removeSelectedMarker(){
        var position : Int = 0
        this.items.forEach {
            it.isSelected = false
            notifyItemChanged(position)
            position++
        }
    }

    // reload all data
    fun resetData(items: List<BaseItemModel>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun clearItems(){
        this.items.clear()
        notifyDataSetChanged()
    }

    // purpose to make update one item
    fun updateItem(item: BaseItemModel, position: Int) {
        this.items.removeAt(position)
        this.items.add(position, item)
        notifyItemChanged(position)
    }

    // purpose for adding singgle data
    fun addItem(item: BaseItemModel) {
        this.items.add(item)
        notifyDataSetChanged()
    }

    // purpose for adding multiple data
    fun addItems(items: List<BaseItemModel>) {
        var lastPosition = 0
        if (this.items.isNotEmpty()) lastPosition = (this.items.size - 1)
        this.items.addAll(items)
        notifyItemRangeInserted(lastPosition,items.size)
    }

    fun getItems()  = this.items

    // purpose for delete multiple data
    fun removeItems(items: List<BaseItemModel>) {
        this.items.removeAll(items)
        notifyDataSetChanged()
    }

    // purpose for delete one data
    fun removeItem(item: BaseItemModel) {
        this.items.remove(item)
        notifyDataSetChanged()
    }

    private var currentPage = 1
    private var maxPage = 1
    private var isFirstLoad = true
    fun setPaginationData(maxPage : Int){
        if (isFirstLoad){
            this.maxPage = maxPage
            isFirstLoad = false
        }
    }

    fun setOnLoadMoreListener(rv : RecyclerView,listener : BaseListAdapterOnLoadMore){
        rv.addOnScrollListener(object : EndlessRecyclerViewScrollListener(rv.layoutManager as LinearLayoutManager){
            override fun onLoadMore() {
                if (currentPage <= maxPage){
                    currentPage++
                    listener.loadMore(currentPage)
                }
            }

        })
    }
}