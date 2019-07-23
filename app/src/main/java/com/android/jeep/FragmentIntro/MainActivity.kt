package com.android.jeep.FragmentIntro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.android.jeep.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        val adapter = IntroAdapter(supportFragmentManager)
        viewPager.setAdapter(adapter)
    }
}
