package com.example.myapplication

import android.annotation.SuppressLint

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlertBox2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.alert_box2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn=findViewById<Button>(R.id.btn_alert)
        btn.setOnClickListener{
            view->showAlert(view)
        }

    }
    private fun showAlert(view: View){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("alert box")
        builder.setMessage("this is alert box")
        builder.setPositiveButton("OK"){dialog,_->
            dialog.dismiss()
        }
        builder.setNegativeButton("CANCEL"){dialog,_->
            dialog.dismiss()
        }
        builder.setCancelable(false)
        builder.setNeutralButton("*"){dialog,_->
            dialog.dismiss()
        }
        val alert_bar=builder.create();
        alert_bar.show()


    }
}