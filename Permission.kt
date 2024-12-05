package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.pm.PackageManager
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.Toast
import androidx.compose.material3.TopAppBar

class Permission : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.permission)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
            requestLocationPermission()
        }
        else{
            accessLocation()
        }

    }

    private fun requestLocationPermission(){
        val requesPermissionLauncher=registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted:Boolean->
            if(isGranted){
                accessLocation()
            }
            else{
                Toast.makeText(this,"Location is required",Toast.LENGTH_LONG).show()
            }
        }
        requesPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
    }
    private fun accessLocation(){
        Toast.makeText(this,"Access Location..",Toast.LENGTH_LONG).show()
    }
}