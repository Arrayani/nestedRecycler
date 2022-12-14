package com.example.nestedrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecycler.adapters.ParentAdapter
import com.example.nestedrecycler.models.ParentDataFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        lateinit var recyclerView: RecyclerView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            initRecycler()
        }

        private fun initRecycler(){
            recyclerView = rv_parent

            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
                adapter = ParentAdapter(ParentDataFactory.getParents(40))
            }

        }
    }
