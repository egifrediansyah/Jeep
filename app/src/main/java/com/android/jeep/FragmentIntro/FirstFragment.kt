package com.android.jeep.FragmentIntro

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.android.jeep.R

class FirstFragment : Fragment(){
    private lateinit var next: TextView
    private lateinit var viewPager: ViewPager

    fun FirstFragment(){
        // Required empty public constructor
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        //Initialize ViewPager From Main Activity
        viewPager = activity!!.findViewById(R.id.viewPager)
        next = view.findViewById(R.id.slideNext)

        next.setOnClickListener { viewPager.currentItem = 1 }
        return view
    }
}