package com.dizcoding.projectjpr.ui.activities.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dizcoding.projectjpr.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        val pagerAdapter = HomePagerAdapter(this,supportFragmentManager)
        activityHomeBinding.viewPager.adapter = pagerAdapter
        activityHomeBinding.tabs.setupWithViewPager(activityHomeBinding.viewPager)
    }
}