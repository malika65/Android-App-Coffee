package com.example.coffeeapp.ui.instruments.roast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.coffeeapp.R
import kotlinx.android.synthetic.main.activity_roast.*
import java.util.ArrayList

class RoastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roast)


        val instrItems: MutableList<Roast> = ArrayList()
        instrItems.add(Roast(R.drawable.r1))
        instrItems.add(Roast(R.drawable.rr2))
        instrItems.add(Roast(R.drawable.r3))
        instrItems.add(Roast(R.drawable.r4))
        instrItems.add(Roast(R.drawable.r5))



        // initialize staggered grid layout manager
        StaggeredGridLayoutManager(
                2, // span count
                StaggeredGridLayoutManager.VERTICAL // orientation
        ).apply {
            // specify the layout manager for recycler view
            recyclerView_roast.layoutManager = this
        }

        // finally, data bind the recycler view with adapter
        recyclerView_roast.adapter = RoastAdapter(instrItems)
    }
}