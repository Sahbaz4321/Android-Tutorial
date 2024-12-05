//package com.example.myapplication
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.view.ContextMenu
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import android.widget.TextView
//import android.view.View
//import android.view.MenuItem
//import android.widget.Toast
//import androidx.compose.ui.graphics.Color
//
//class ContextMenu : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.context_menu)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//        val textview=findViewById<TextView>(R.id.contextmenu)
//        registerForContextMenu(textview)
//
//        val t1=findViewById<TextView>(R.id.fetcht)
////      val name=  intent.getStringExtra("Data",t1)
//
//    }
//
//    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
//        super.onCreateContextMenu(menu, v, menuInfo)
//        menuInflater.inflate(R.menu.menu2,menu)
//    }
//
//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        return when(item.itemId){
//            R.id.send->{
////                Toast.makeText(this,"hi",Toast.LENGTH_LONG).show
//                val textcolor=findViewById<TextView>(R.id.contextmenu)
//                textcolor.setTextColor(getColor(R.color.teal_200))
//
//
//
//                true
//            }
//            else->{
//                true
//            }
//        }
//    }
//
//}