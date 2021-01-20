package com.dizcoding.projectjpr.ui.activities.vaforit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dizcoding.projectjpr.R
import com.dizcoding.projectjpr.databinding.ActivityHomeBinding
import com.dizcoding.projectjpr.databinding.ActivityVaforitBinding
import com.dizcoding.projectjpr.ui.activities.home.HomePagerAdapter

class VaforitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityVaforitBinding = ActivityVaforitBinding.inflate(layoutInflater)
        setContentView(activityVaforitBinding.root)

        val pagerAdapter = HomePagerAdapter(this,supportFragmentManager)
        activityVaforitBinding.viewPager.adapter = pagerAdapter
        activityVaforitBinding.tabs.setupWithViewPager(activityVaforitBinding.viewPager)
    }
}