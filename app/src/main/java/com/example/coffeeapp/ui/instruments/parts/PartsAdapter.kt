package com.example.coffeeapp.ui.instruments.parts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeapp.R
import kotlinx.android.synthetic.main.item_instr.view.*

class PartsAdapter(private val colors: List<Parts>)
    : RecyclerView.Adapter<PartsAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflate the custom view from xml layout file
        val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_instr, parent, false)

        // return the view holder
        return ViewHolder(view)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // display the current color
        holder.setPostImageView(colors[position])

    }


    override fun getItemCount(): Int {
        // number of items in the data set held by the adapter
        return colors.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val img : ImageView = itemView.processedImage  //////

        fun setPostImageView(postItem: Parts) {
            img.setImageResource(postItem.imgParts)
        }


    }


    // this two methods useful for avoiding duplicate item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }


    override fun getItemViewType(position: Int): Int {
        return position
    }

}