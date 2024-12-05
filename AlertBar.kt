package com.example.myapplication

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlertBar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.alert_bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn=findViewById<Button>(R.id.alert)
        btn.setOnClickListener{
            showAlert()
        }
    }
    fun showAlert(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("alert bar")
        builder.setMessage("this is alert bar")
        builder.setPositiveButton("OK"){dialog,_ ->
            dialog.dismiss()
        }
        builder.setNegativeButton("Cancel"){dialog,_->
            dialog.dismiss()
        }
        builder.setCancelable(false)
        val alert=builder.create()
        alert.show()

    }
}