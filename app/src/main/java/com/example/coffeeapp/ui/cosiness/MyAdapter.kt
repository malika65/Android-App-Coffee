package com.example.coffeeapp.ui.cosiness

import android.content.Context;
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {

            when (position) {
                0 -> {
                    return NewFragment()
                }
                1 -> {
                    return CommentsFragment()
                }


            }
        return NewFragment()

    }
}