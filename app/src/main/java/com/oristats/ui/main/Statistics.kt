package com.oristats.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.oristats.R


class Statistics : Fragment() {



    companion object {
        fun newInstance() = Statistics()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.statistics_fragment, container, false)
    }


/*
    private fun initViews() {
        tabs = findViewById(R.id.tabs)
        viewpager = findViewById(R.id.viewpager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
    }

    private fun setupViewPager() {
        val adapter = MyFragmentPagerAdapter(getSupportFragmentManager())

        var firstFragment: MyFragment = MyFragment.newInstance("First Fragment")
        var secondFragment: MyFragment = MyFragment.newInstance("Second Fragment")
        var thirdFragment: MyFragment = MyFragment.newInstance("Third Fragment")

        adapter.addFragment(firstFragment, "ONE")
        adapter.addFragment(secondFragment, "TWO")
        adapter.addFragment(thirdFragment, "THREE")

        viewpager.adapter = adapter

        tabs.setupWithViewPager(viewpager)

    }*/







}






//}
