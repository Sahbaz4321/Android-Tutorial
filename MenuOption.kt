//package com.example.myapplication
//
//import android.os.Bundle
//import android.view.Menu
//import android.view.MenuItem
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class MenuOption : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_menu_option)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//
//    }
//    override fun onCreateOptionsMenu(menu: Menu?):Boolean{
//        menuInflater.inflate(R.menu.exammenu,menu)
//        return true
//    }
//    override fun onOptionsItemSelected(item: MenuItem):Boolean{
//        return when(item.itemId){
//            R.id.notification->{
//                Toast.makeText(this,"No notification occured",Toast.LENGTH_LONG).show()
//                true
//            }
//            else->{
//                Toast.makeText(this,"No notification occured",Toast.LENGTH_LONG).show()
//                true
//            }
//        }
//    }
//}