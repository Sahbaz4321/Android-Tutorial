package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.media.audiofx.BassBoost
import android.media.audiofx.Equalizer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.TopAppBar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.androidgamesdk.gametextinput.Settings
import java.util.Locale

class Ca2Preparation : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.ca2_preparatio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val url=findViewById<Button>(R.id.implicit1)
//        url.setOnClickListener{
//            val link="https://www.youtube.com"
//            val intent= Intent(Intent.ACTION_VIEW)
//            intent.data= Uri.parse(link)
//            startActivity(intent)
//        }

        val dial=findViewById<Button>(R.id.explicit1)
        dial.setOnClickListener{
            val number="12345"
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:$number")
            startActivity(intent)
        }
        val msg=findViewById<Button>(R.id.msg)
        msg.setOnClickListener{
            val number="12345"
            val text_msg="hi helloe"
            val intent=Intent(Intent.ACTION_SENDTO)
            intent.data=Uri.parse("smsto:$number")
            intent.putExtra("sms_body",text_msg)
            startActivity(intent)
        }

        val map=findViewById<Button>(R.id.map_l)
        map.setOnClickListener{
            val location="geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California"
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse(location)
            startActivity(intent)
        }
     val aa=findViewById<Button>(R.id.exp)

        aa.setOnClickListener{


            val intent=Intent(this,practice_1::class.java)
            startActivity(intent)


        }

//        val list=findViewById<ListView>(R.id.list1)
//        val arr=arrayOf("ActionBar2","_login_page","java")
//        val arr_adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
//        list.adapter=arr_adapter
//
//
//list.setOnItemClickListener{
//    parent,view,position,id->
//        val item=arr[position]
////    Toast.makeText(this,"you select $item",Toast.LENGTH_LONG).show()
//    val intent=when(item){
//        "ActionBar2"->Intent(this,ActionBar2::class.java)
//        "_login_page"->Intent(this,_login_page::class.java)
//
//
//        else->{
//            Toast.makeText(this,"not exist",Toast.LENGTH_LONG).show()
//            return@setOnItemClickListener
//        }
//    }
//
//
//    startActivity(intent)
//
//
//
//}

//        val spinner=findViewById<Spinner>(R.id.spinner_12)
//        val arr= arrayOf("_login_page","ActionBar2","java")
//        val arr_adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr)
//        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinner.adapter=arr_adapter


        val btn=findViewById<Button>(R.id.logcat)
        btn.setOnClickListener{
            Log.d("Ca2Preparation","you clicke button");
        }

val spinner=findViewById<Spinner>(R.id.spinner_12)
        val arr=arrayOf("a","b","c");
        val arr_adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr)
        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=arr_adapter

        spinner.onItemSelectedListener=object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent:AdapterView<*>?,view: View?,position:Int,id:Long){
                val selected_item=parent?.getItemAtPosition(position).toString()
                Toast.makeText(parent?.context,"you selected $selected_item",Toast.LENGTH_LONG).show()



        }
            override fun onNothingSelected(parent:AdapterView<*>?){


            }            }



//        val btn=findViewById<Button>(R.id.language_change)
//
//        btn.setOnClickListener{
//            setLocale("hi")
//        }
//
//        val reset=findViewById<Button>(R.id.reset_lang)
//        reset.setOnClickListener{
//            setLocale("en")
//        }




//        val btn=findViewById<Button>(R.id.snackbar1)
//        btn.setOnClickListener{
//
//val snackbar=Snackbar.make(it,"you cut it",Snackbar.LENGTH_LONG).setAction("*"){
//    Toast.makeText(this,"you close it",Toast.LENGTH_LONG).show()
//}
//            snackbar.setActionTextColor(Color.RED)
//            snackbar.setBackgroundTint(Color.BLUE)
//            snackbar.setTextColor(Color.CYAN)
//            snackbar.show()

//            Snackbar.make(it,"you cut it",Snackbar.LENGTH_LONG).setAction("*"){
//                Toast.makeText(this,"you close it",Toast.LENGTH_LONG)
//            }
//                .show()
//        }




    }
//
//    fun setLocale(s:String){
//        val current=Locale.getDefault().language
//        if(s!=current) {
//
//
//            val locale = Locale(s)
//            Locale.setDefault(locale)
//            val config= Configuration(resources.configuration)
//           config.setLocale(locale)
//            resources.updateConfiguration(config,resources.displayMetrics)
//            recreate()
//
//
//
//
//        }
//        }

}