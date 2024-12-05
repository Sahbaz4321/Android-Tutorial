package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Test3KT : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._test3_kt)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text=findViewById<TextView>(R.id.text_play)
        registerForContextMenu(text)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu45,menu)

    }

    override fun onContextItemSelected(menuItem: MenuItem): Boolean {
        return when(menuItem.itemId){
            R.id.share->{
                val intent= Intent(Intent.ACTION_SENDTO)

                val number="12345"
                val text="hi hello"

                intent.data= Uri.parse("sms:$number")
                intent.putExtra("sms_body",text)
                startActivity(intent)


                true
            }
            R.id.rename->{
                val text=findViewById<TextView>(R.id.text_play)
                text.setTextColor(R.color.purple_200)
                true

            }
            R.id.delete->{
                val intent=Intent(this,Custome12::class.java)
                startActivity(intent)
                true
            }
            else->{
                true

            }
        }
    }

}