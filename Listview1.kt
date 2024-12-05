package com.example.myapplication

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class Listview1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.listview1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val textFetch=findViewById<TextView>(R.id.intent_getText)

//        val t=intent.getStringExtra("Name")
//        textFetch.text=t
        val arr=arrayOf("hindi","english","french")
        val list=findViewById<ListView>(R.id.list_element)
        val adapter_arr=ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        list.adapter=adapter_arr

        list.setOnItemClickListener{
            parent,item,position,id->
            val selected_item=arr[position]
            when(selected_item){
                "english"->setLocale("en")
                "hindi"->setLocale("hi")
                "french"->setLocale("fr")
            }
//            Toast.makeText(this,"you clicked this $selected_item",Toast.LENGTH_LONG).show()
        }
//        val textview=findViewById<TextView>(R.id.change_edit)
////        textview.text=getString(R.string.Hello)
        val btn=findViewById<Button>(R.id.btn_change)
//        text1.text=text1

        btn.setOnClickListener{
            action()
//            textview.text=getString(R.string.Hello)
//            textview.text=getString(R.string.Hello)
        }

    }
    fun action(){
        val text1=findViewById<TextView>(R.id.change_text)
      val data=  text1.text.toString()
        Log.d("button","ypu selected buttpn")

        Log.d("input_activity",data)


    }
    fun setLocale(s:String){
        val current= Locale.getDefault().language

        if(s!=current){
            val locale=Locale(s)
            Locale.setDefault(locale)
            val config=Configuration(resources.configuration)
            config.setLocale(locale)
            resources.updateConfiguration(config,resources.displayMetrics)
            recreate()

        }
    }
}