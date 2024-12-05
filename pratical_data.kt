package com.example.myapplication

import android.content.pm.PackageManager
import android.os.Bundle
import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar


class pratical_data : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pratical_data)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
            requestPermission()
        }
        else{
            Toast.makeText(this,"already given",Toast.LENGTH_LONG).show()
        }

//

        val btn = findViewById<Button>(R.id.btn_snack)
        btn.setOnClickListener {
            val snack=Snackbar.make(it,"to restrict sensitive data",Snackbar.LENGTH_LONG)

            snack.show()

            browser()


        }
    }
    fun browser(){
            val url="https://www.google.co.in"
        val intent=Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse(url)
        startActivity(intent)
    }




    private fun requestPermission(){
        val requesPermissionLauncher=registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted:Boolean->
            if(isGranted){
                Toast.makeText(this,"permission given",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"Location is required",Toast.LENGTH_LONG).show()
            }
        }
        requesPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
    }



}