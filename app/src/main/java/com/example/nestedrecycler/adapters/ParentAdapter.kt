package com.example.nestedrecycler.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecycler.R
import com.example.nestedrecycler.models.ParentModel
import kotlinx.android.synthetic.main.parent_recycler.view.*

/**

 * Author: Roni Reynal Fitri  on $ {DATE} $ {HOUR}: $ {MINUTE}

 * Email: biruprinting@gmail.com

 */
class ParentAdapter(private val parents : List<ParentModel>) : RecyclerView.Adapter<ParentAdapter.ViewHolder>(){

    private val viewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.parent_recycler,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return parents.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val parent = parents[position]
        holder.textView.text = parent.title
        holder.recyclerView.apply {
            layoutManager = LinearLayoutManager(holder.recyclerView.context, RecyclerView.HORIZONTAL, false)
            adapter = ChildAdapter(parent.children)
           // recycledViewPool.get
            //recycledViewPool = viewPool
            setRecycledViewPool(viewPool)
            //RecyclerView.setRecycledViewPool(RecyclerView.RecycledViewPool)
        }
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val recyclerView : RecyclerView = itemView.rv_child
        val textView: TextView = itemView.textView
    }
}