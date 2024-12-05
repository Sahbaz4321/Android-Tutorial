package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.appcompat.app.AlertDialog

class CustomAlert_bar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.custom_alert)

        showCustomAlert()
    }
    private fun showCustomAlert(){
        val dialogview=LayoutInflater.from(this).inflate(R.layout.custome_alert_box,null)


        val title=findViewById<TextView>(R.id.custom_title)
        val mag=findViewById<TextView>(R.id.custom_message)
        val ok=findViewById<Button>(R.id.custom_ok)
        val cancel=findViewById<Button>(R.id.custom_cancel)

    val dialog= AlertDialog.Builder(this)

            .setView(dialogview)
            .setCancelable(false)
            .create()

        ok.setOnClickListener{
            dialog.dismiss()
        }
//        layout.setcolor
//        dialog.window?.setBackgroundDrawableResource(R.color.teal_200)
//        color of first layout
//        click of ok change background color
        cancel.setOnClickListener{
           finish()
        }
        dialog.show()


    }

}