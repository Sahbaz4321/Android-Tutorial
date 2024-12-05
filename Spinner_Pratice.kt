package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Spinner_Pratice : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner_pratice)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text=findViewById<TextView>(R.id.linear_hello)
        text.setTextColor(R.color.purple_500)
        val main=findViewById<LinearLayout>(R.id.linear_main)
        main.setBackgroundColor(R.color.teal_700)


        val list=findViewById<ListView>(R.id.linear_list)

        val arr=arrayOf("bmw","java","php");

        val ada=ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        list.adapter=ada
        list.setOnItemClickListener{
                parent,view,position,id ->
            val selected_item=arr[position]
            Toast.makeText(this,"$selected_item", Toast.LENGTH_LONG).show()
        }



        val spinner=findViewById<Spinner>(R.id.spinner_item)
        val array_adapter= ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr)


        array_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=array_adapter

        spinner.onItemSelectedListener=object: AdapterView.OnItemSelectedListener{


            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val item=parent?.getItemAtPosition(position).toString()
                Toast.makeText(parent?.context,"you selected $item",Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



    }
}