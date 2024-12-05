package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TestActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "UnsafeIntentLaunch")
    val arr=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_test)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listview=findViewById<ListView>(R.id.listview12)
        val edittext=findViewById<EditText>(R.id.add_text)
        val button=findViewById<Button>(R.id.add_item)
//        val arr=arrayOf("java","python","xml")
        val arr_adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        listview.adapter=arr_adapter







        button.setOnClickListener{
            val new_item=edittext.text.toString().trim();
            if(new_item.isNotEmpty()){
                arr.add(new_item)
                arr_adapter.notifyDataSetChanged()
                edittext.text.clear()
                Toast.makeText(this,"you add $new_item",Toast.LENGTH_LONG).show()

            }
            else{
                Toast.makeText(this,"please enter item",Toast.LENGTH_LONG).show()
            }

        }
        listview.setOnItemClickListener { parent, view, position, id ->
            val selected_item=arr[position]
            val intent=Intent(this,code1::class.java)
            intent.putExtra("selected",selected_item)
            startActivity(intent)


//






            }










        }

    }
