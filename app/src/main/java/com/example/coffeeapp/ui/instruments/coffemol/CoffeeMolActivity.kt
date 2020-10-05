package com.example.coffeeapp.ui.instruments.coffemol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.coffeeapp.R
import kotlinx.android.synthetic.main.activity_coffe_mol.*
import java.util.ArrayList

class CoffeeMolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffe_mol)


        val instrItems: MutableList<CoffeeMol> = ArrayList()
        instrItems.add(CoffeeMol(R.drawable.mol))
        instrItems.add(CoffeeMol(R.drawable.mol1))
        instrItems.add(CoffeeMol(R.drawable.mol2))
        instrItems.add(CoffeeMol(R.drawable.mol3))
        instrItems.add(CoffeeMol(R.drawable.mol4))
        instrItems.add(CoffeeMol(R.drawable.mol5))
        instrItems.add(CoffeeMol(R.drawable.mol6))
        instrItems.add(CoffeeMol(R.drawable.mol7))
        instrItems.add(CoffeeMol(R.drawable.mol8))
        instrItems.add(CoffeeMol(R.drawable.mol9))


        // initialize staggered grid layout manager
        StaggeredGridLayoutManager(
                2, // span count
                StaggeredGridLayoutManager.VERTICAL // orientation
        ).apply {
            // specify the layout manager for recycler view
            recyclerView_mol.layoutManager = this
        }

        // finally, data bind the recycler view with adapter
        recyclerView_mol.adapter = MolAdapter(instrItems)
    }
}