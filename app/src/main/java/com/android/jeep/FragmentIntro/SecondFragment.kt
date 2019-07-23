package com.android.jeep.FragmentIntro

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.android.jeep.R

class SecondFragment : Fragment() {

    lateinit var next: TextView
    lateinit var back: TextView
    lateinit var viewPager: ViewPager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        //Initialize ViewPager From Main Activity
        viewPager = activity!!.findViewById(R.id.viewPager)

        next = view.findViewById(R.id.slideTwoNext)
        next.setOnClickListener { viewPager.currentItem = 2 }

        back = view.findViewById(R.id.slideTwoBack)
        back.setOnClickListener { viewPager.currentItem = 0 }

        return view
    }

}// Required empty public constructor
