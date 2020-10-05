package com.example.coffeeapp.ui.instruments.parts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.coffeeapp.R
import kotlinx.android.synthetic.main.activity_parts.*
import java.util.ArrayList

class PartsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parts)


        val instrItems: MutableList<Parts> = ArrayList()
        instrItems.add(Parts(R.drawable.p1))
        instrItems.add(Parts(R.drawable.p2))
        instrItems.add(Parts(R.drawable.p3))
        instrItems.add(Parts(R.drawable.p4))
        instrItems.add(Parts(R.drawable.p5))
        instrItems.add(Parts(R.drawable.p6))
        instrItems.add(Parts(R.drawable.p7))
        instrItems.add(Parts(R.drawable.p8))
        instrItems.add(Parts(R.drawable.p9))



        // initialize staggered grid layout manager
        StaggeredGridLayoutManager(
                2, // span count
                StaggeredGridLayoutManager.VERTICAL // orientation
        ).apply {
            // specify the layout manager for recycler view
            recyclerView_parts.layoutManager = this
        }

        // finally, data bind the recycler view with adapter
        recyclerView_parts.adapter = PartsAdapter(instrItems)
    }
}