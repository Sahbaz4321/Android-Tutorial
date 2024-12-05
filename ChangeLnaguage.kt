package com.example.myapplication

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class ChangeLnaguage : AppCompatActivity() {
    val current= Locale.getDefault().language
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.change_lnaguage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val japan=findViewById<Button>(R.id.arabic)
        japan.setOnClickListener{
            val newLanguage = if (current == "hi") "en" else "hi"
            setLocale(newLanguage)
//            setLocale("hi")


        }
    }
    fun setLocale(s:String){
        val current= Locale.getDefault().language
        if(s!=current){
            val locale=Locale(s)
            Locale.setDefault(locale)
            val config= Configuration(resources.configuration)
            config.setLocale(locale)
            resources.updateConfiguration(config,resources.displayMetrics)
            recreate()

        }

    }

}