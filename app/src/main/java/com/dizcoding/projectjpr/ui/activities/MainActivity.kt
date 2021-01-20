package com.dizcoding.projectjpr.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.dizcoding.projectjpr.R
import com.dizcoding.projectjpr.ui.activities.home.HomeActivity
import com.dizcoding.projectjpr.utils.intentFinishTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(mainLooper).postDelayed({
            intentFinishTo(HomeActivity::class.java)
        }, 3000)
    }
}