package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityHomemenu1Binding

class homemenu1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_homemenu1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val categry_detail=findViewById<CardView>(R.id.category)
        categry_detail.setOnClickListener{
            val intent=Intent(this,Category_project::class.java)
            startActivity(intent)
        }

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.homemenu,menu)
        menuInflater.inflate(R.menu.class_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){

            R.id.login->{
//                Toast.makeText(this,"you click cll icon",Toast.LENGTH_LONG).show()
                val intent= Intent(this,MainLoginPage::class.java)
                startActivity(intent)
                true
            }
            R.id.searchbar1->{
                val intent=Intent(this,searchBar_listview::class.java)
                startActivity(intent)
                true
            }
            R.id.home_page->{
                val intent=Intent(this,homemenu1::class.java)
                startActivity(intent)
                true
            }
            R.id.contact_us->{
                val intent=Intent(this,Contact_page::class.java)
                startActivity(intent)
                true
            }
            R.id.about_us->{
                val intent=Intent(this,About_us::class.java)
                startActivity(intent)
                true
            }

            else->{
                Toast.makeText(this,"default",Toast.LENGTH_LONG).show()
                true
            }
        }
    }

}