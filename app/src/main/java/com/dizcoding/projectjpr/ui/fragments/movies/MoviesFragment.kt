package com.dizcoding.projectjpr.ui.fragments.movies

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dizcoding.projectjpr.base.adapter.BaseListAdapter
import com.dizcoding.projectjpr.databinding.MoviesFragmentBinding
import com.dizcoding.projectjpr.ui.activities.detailfilm.DetailFilmActivity
import com.dizcoding.projectjpr.ui.adapter.movies.MovieCallback
import com.dizcoding.projectjpr.ui.adapter.movies.MovieFactoryImpl
import com.dizcoding.projectjpr.ui.adapter.movies.MovieModel
import com.dizcoding.projectjpr.utils.intentTo
import com.dizcoding.projectjpr.utils.presentData
import com.dizcoding.projectjpr.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.movies_fragment.*

class MoviesFragment : Fragment(), MovieCallback {

    private lateinit var viewModel: MoviesViewModel
    private lateinit var adapter: BaseListAdapter
    private lateinit var moviesFragmentBinding: MoviesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        moviesFragmentBinding = MoviesFragmentBinding.inflate(layoutInflater, container, false)
        return moviesFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            adapter = BaseListAdapter(MovieFactoryImpl(this))
            context?.presentData(rvMovies, LinearLayoutManager.VERTICAL, adapter)

            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[MoviesViewModel::class.java]
            viewModel.getMovies().observe(viewLifecycleOwner, {
                val listMovieModel = arrayListOf<MovieModel>()
                it.forEach { movieEntity ->
                    listMovieModel.add(
                        MovieModel(
                            movieEntity.id,
                            movieEntity.poster_path,
                            movieEntity.title,
                            movieEntity.overview,
                            movieEntity.backdrop_path,
                            movieEntity.original_language,
                            movieEntity.release_date,
                            movieEntity.vote_average
                        )
                    )

                }
                adapter.resetData(listMovieModel)
            })
        }
    }

    override fun onMovieItemClick(element: MovieModel) {
        activity?.intentTo(
            DetailFilmActivity::class.java,
            bundleOf("id" to element.id),
            bundleOf("typeFilm" to "movie")
        )
    }

    override fun onIconShareClick(element: MovieModel) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(
                Intent.EXTRA_TEXT,
                "Hy, look at this movie, i think this is awesome.\nhttps://www.themoviedb.org/movie/" + element.id
            )
            type = "text/plain"
        }
        startActivity(Intent.createChooser(sendIntent, null))
    }

}