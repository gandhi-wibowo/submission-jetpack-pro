package com.dizcoding.projectjpr.ui.activities.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.dizcoding.projectjpr.IConfig
import com.dizcoding.projectjpr.R
import org.junit.Before
import org.junit.Test

class HomeTest {

    private val dataMovie = IConfig.generateDataMovie()
    private val dataTv = IConfig.generateTvShow()

    @Before
    fun setup() {
        ActivityScenario.launch(HomeActivity::class.java)
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rvMovies)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dataMovie.size
            )
        )
    }

    @Test
    fun loadMovieDetail() {
        onView(withId(R.id.rvMovies)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                (dataMovie.size - 1),
                click()
            )
        )
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(dataMovie[dataMovie.size - 1].title)))
        onView(withId(R.id.tvDescription)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDescription)).check(matches(withText(dataMovie[dataMovie.size - 1].description)))

        onView(withId(R.id.tvDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDate)).check(matches(withText("Release Date : "+dataMovie[dataMovie.size - 1].relDate)))
        onView(withId(R.id.tvRate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRate)).check(matches(withText("Rate : "+dataMovie[dataMovie.size - 1].rate)))
        onView(withId(R.id.tvLang)).check(matches(isDisplayed()))
        onView(withId(R.id.tvLang)).check(matches(withText("Lang : "+dataMovie[dataMovie.size - 1].lang)))
    }

    @Test
    fun loadTvShow() {
        onView(withText("Tv Show")).perform(click())
        onView(withId(R.id.rvTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShow)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dataTv.size
            )
        )
    }

    @Test
    fun loadTvShowDetail() {
        onView(withText("Tv Show")).perform(click())
        onView(withId(R.id.rvTvShow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                (dataTv.size - 1),
                click()
            )
        )
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(dataTv[dataTv.size - 1].title)))
        onView(withId(R.id.tvDescription)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDescription)).check(matches(withText(dataTv[dataTv.size - 1].description)))

        onView(withId(R.id.tvDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDate)).check(matches(withText("Release Date : "+dataTv[dataTv.size - 1].relDate)))
        onView(withId(R.id.tvRate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRate)).check(matches(withText("Rate : "+dataTv[dataTv.size - 1].rate)))
        onView(withId(R.id.tvLang)).check(matches(isDisplayed()))
        onView(withId(R.id.tvLang)).check(matches(withText("Lang : "+dataTv[dataTv.size - 1].lang)))
    }
}