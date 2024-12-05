package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.window.Popup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Practice2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practice2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val image1=findViewById<ImageView>(R.id.image1)
        registerForContextMenu(image1)
        val btn=findViewById<Button>(R.id.btnplay)
        btn.setOnClickListener{
            view->showpopup(view)
        }

    }
 fun showpopup(view:View){
    val popup= PopupMenu(this,view)
     popup.menuInflater.inflate(R.menu.combinemenu,popup.menu)
     val text1=findViewById<TextView>(R.id.textplay1)

     popup.setOnMenuItemClickListener { menuItem: MenuItem ->
         when (menuItem.itemId) {
             R.id.textbtn1 -> {
                 text1.text = "change the text"
                 true

             }

             else -> {
                 Toast.makeText(this, "wrong message", Toast.LENGTH_LONG).show()
                 true
             }
         }
     }
         popup.show()




}
    override fun onCreateOptionsMenu(menu: Menu?):Boolean{
        menuInflater.inflate(R.menu.combinemenu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem):Boolean {
        val text1=findViewById<TextView>(R.id.textplay1)
      val  text2=text1.text.toString()




        return when (item.itemId) {
            R.id.next -> {

                val intent = Intent(this, intentTutorial::class.java)
                intent.putExtra("data",text2)
                startActivity(intent)

                true
            }

            else -> {
                Toast.makeText(this, "hi ", Toast.LENGTH_LONG).show()
                true


            }
        }
    }
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.combinemenu,menu)
    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.colorchange->{
                val image1=findViewById<ImageView>(R.id.image1)
                image1.setBackgroundColor(R.color.teal_200)

                true
            }
            else->{
                Toast.makeText(this, "hi how are you", Toast.LENGTH_SHORT).show()
                true
            }
        }
    }
}