package com.android.jeep.FragmentIntro

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.android.jeep.MenuActivity
import com.android.jeep.R

class ThirdFragment: Fragment() {

     lateinit var back: TextView
     lateinit var done: TextView
     lateinit var viewPager: ViewPager




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        //Initialize ViewPager From Main Activity
        viewPager = getActivity()!!.findViewById(R.id.viewPager)

        back = view.findViewById(R.id.slideThreeBack)
        back.setOnClickListener { viewPager.currentItem = 1 }

        done = view.findViewById(R.id.slideDone)
        done.setOnClickListener {
            startActivity(Intent(activity, MenuActivity::class.java))
            Toast.makeText(getActivity(), "Selamat Datang...", Toast.LENGTH_LONG).show() }
        return view
    }

}
