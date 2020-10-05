package com.example.coffeeapp.ui.instruments.coffeemachine;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.coffeeapp.R
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val instrItems: MutableList<Instrument> = ArrayList()
        instrItems.add(Instrument(R.drawable.instr1))
        instrItems.add(Instrument(R.drawable.instr2))
        instrItems.add(Instrument(R.drawable.instr3))
        instrItems.add(Instrument(R.drawable.instr4))
        instrItems.add(Instrument(R.drawable.instr5))
        instrItems.add(Instrument(R.drawable.instr6))
        instrItems.add(Instrument(R.drawable.instr7))
        instrItems.add(Instrument(R.drawable.instr8))
        instrItems.add(Instrument(R.drawable.instr9))
        instrItems.add(Instrument(R.drawable.instr10))
        instrItems.add(Instrument(R.drawable.instr11))
        instrItems.add(Instrument(R.drawable.instr12))
        instrItems.add(Instrument(R.drawable.instr13))
        instrItems.add(Instrument(R.drawable.instr14))


        // initialize staggered grid layout manager
        StaggeredGridLayoutManager(
                2, // span count
                StaggeredGridLayoutManager.VERTICAL // orientation
        ).apply {
            // specify the layout manager for recycler view
            recyclerView_instr.layoutManager = this
        }

        // finally, data bind the recycler view with adapter
        recyclerView_instr.adapter = RecyclerViewAdapter(instrItems)
    }
}