package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomAlert1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.custom_alert1)

        showAlert()
    }
    @SuppressLint("MissingInflatedId")
    fun showAlert(){
        val dialogView= LayoutInflater.from(this).inflate(R.layout.custome_alert_box,null)
        val title=dialogView.findViewById<TextView>(R.id.custom_title)
        val msg=dialogView.findViewById<TextView>(R.id.custom_message)
        val ok=dialogView.findViewById<Button>(R.id.custom_ok)
        val cancel=dialogView.findViewById<Button>(R.id.custom_cancel)



        val dialog= AlertDialog.Builder(this).setView(dialogView).setCancelable(false).create()

        ok.setOnClickListener {
            val main =findViewById<LinearLayout>(R.id.custom_main)
//            val color = ContextCompat.getColor(this, R.color.teal_200)
            main.setBackgroundColor(R.color.purple_200)
            dialog.dismiss()
        }
        cancel.setOnClickListener{
            finish()
        }

        dialog.show()
    }
}