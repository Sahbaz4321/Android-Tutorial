package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ActionBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.action_bar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.appmenu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        return when(item.itemId){

            R.id.search->{
//                Toast.makeText(this,"searched clicked",Toast.LENGTH_LONG).show()

                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                true
            }

R.id.callSearch->{
//    Toast.makeText(this,"you clicked call icon",Toast.LENGTH_LONG).show()
    val number="12345"
    val intent=Intent(Intent.ACTION_DIAL)
    intent.data= Uri.parse("tel:$number")
    startActivity(intent)
    true
}


            R.id.homePage->{
               Toast.makeText(this,"you clicked home icon",Toast.LENGTH_LONG).show()

                true
            }

            R.id.aboutUs->{
                Toast.makeText(this,"you clicked about us page",Toast.LENGTH_LONG).show()
                true
            }
            R.id.contactUs->{
                Toast.makeText(this,"you clicked contact us ",Toast.LENGTH_LONG).show()
                true

            }
            R.id.dashboard->{
                Toast.makeText(this,"you clicked dashboard  ",Toast.LENGTH_LONG).show()
                true
            }

            R.id.attendance->{
                Toast.makeText(this,"you clicked attendance  ",Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)




        }
    }

    }