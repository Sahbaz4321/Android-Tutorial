package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class list_view : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._list_view)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//        val listview=findViewById<ListView>(R.id.listview)
//        val arr= arrayOf("python","c++","java","html")
//        val array_adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
//
//        listview.adapter=array_adapter
//
//        listview.setOnItemClickListener{
//            parent,view,position,id ->
//            val selected_item=arr[position]
//            Toast.makeText(this,"$selected_item", Toast.LENGTH_LONG).show()
//        }
        supportActionBar?.title = "My Custom Title"

        // Enable the app icon in the Action Bar
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.drawable.baseline_add_ic_call_24)
    }
}