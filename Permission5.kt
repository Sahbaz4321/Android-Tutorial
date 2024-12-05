package com.example.myapplication

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.Manifest
import androidx.activity.result.contract.ActivityResultContracts


class Permission5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.permission5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.READ_PHONE_NUMBERS)!= PackageManager.PERMISSION_GRANTED){
           permission()
        }
        else{

        }
    }
    fun permission(){
        val p=registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted:Boolean-> if(isGranted){
            accessLocation()
        } }
        p.launch(Manifest.permission.READ_PHONE_NUMBERS)
    }
    fun accessLocation(){

    }
}