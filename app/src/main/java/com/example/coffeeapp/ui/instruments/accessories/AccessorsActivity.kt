package com.example.coffeeapp.ui.instruments.accessories
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.coffeeapp.R
import kotlinx.android.synthetic.main.activity_accessors.*
import java.util.*

class AccessorsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accessors)


        val instrItems: MutableList<Accessors> = ArrayList()
        instrItems.add(Accessors(R.drawable.ac1))
        instrItems.add(Accessors(R.drawable.ac2))
        instrItems.add(Accessors(R.drawable.ac3))
        instrItems.add(Accessors(R.drawable.ac4))
        instrItems.add(Accessors(R.drawable.ac5))
        instrItems.add(Accessors(R.drawable.ac6))
        instrItems.add(Accessors(R.drawable.ac7))
        instrItems.add(Accessors(R.drawable.ac8))
        instrItems.add(Accessors(R.drawable.ac9))
        instrItems.add(Accessors(R.drawable.ac10))


        // initialize staggered grid layout manager
        StaggeredGridLayoutManager(
                2, // span count
                StaggeredGridLayoutManager.VERTICAL // orientation
        ).apply {
            // specify the layout manager for recycler view
            recyclerView_accessour.layoutManager = this
        }

        // finally, data bind the recycler view with adapter
        recyclerView_accessour.adapter = AccessorsAdapter(instrItems)
    }
}