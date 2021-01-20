package com.dizcoding.projectjpr.ui.fragments.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dizcoding.projectjpr.R
import com.dizcoding.projectjpr.base.adapter.BaseListAdapter
import com.dizcoding.projectjpr.ui.activities.detailfilm.DetailFilmActivity
import com.dizcoding.projectjpr.ui.adapter.tvshow.TvShowCallback
import com.dizcoding.projectjpr.ui.adapter.tvshow.TvShowFactoryImpl
import com.dizcoding.projectjpr.ui.adapter.tvshow.TvShowModel
import com.dizcoding.projectjpr.utils.intentTo
import com.dizcoding.projectjpr.utils.presentData
import com.dizcoding.projectjpr.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.tv_show_fragment.*

class TvShowFragment : Fragment(), TvShowCallback {

    private lateinit var viewModel: TvShowViewModel
    private lateinit var adapter: BaseListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tv_show_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            adapter = BaseListAdapter(TvShowFactoryImpl(this))
            context?.presentData(rvTvShow, LinearLayoutManager.VERTICAL, adapter)
            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]
            viewModel.getTvShow().observe(viewLifecycleOwner, {
                val tvShowModel = arrayListOf<TvShowModel>()
                it.forEach { tvEntity ->
                    tvShowModel.add(
                        TvShowModel(
                            tvEntity.id,
                            tvEntity.poster_path,
                            tvEntity.name,
                            tvEntity.overview,
                            tvEntity.backdrop_path,
                            tvEntity.original_language,
                            tvEntity.first_air_date,
                            tvEntity.vote_average
                        )
                    )
                }
                adapter.resetData(tvShowModel)
            })
        }
    }

    override fun onTvItemClicked(element: TvShowModel) {
        activity?.intentTo(
            DetailFilmActivity::class.java,
            bundleOf("id" to element.id),
            bundleOf("typeFilm" to "tv")
        )
    }

}