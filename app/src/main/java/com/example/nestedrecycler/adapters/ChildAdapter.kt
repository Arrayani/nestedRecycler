package com.example.nestedrecycler.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecycler.R
import com.example.nestedrecycler.models.ChildModel
import kotlinx.android.synthetic.main.child_recycler.view.*

/**

 * Author: Roni Reynal Fitri  on $ {DATE} $ {HOUR}: $ {MINUTE}

 * Email: biruprinting@gmail.com

 */
class ChildAdapter(private val children : List<ChildModel>)
    : RecyclerView.Adapter<ChildAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =  LayoutInflater.from(parent.context)
            .inflate(R.layout.child_recycler,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val child = children[position]
        holder.imageView.setImageResource(child.image)
        holder.textView.text = child.title
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val textView : TextView = itemView.child_textView
        val imageView: ImageView = itemView.child_imageView

    }
}