package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class permission2 : AppCompatActivity() {
    private val permission= arrayOf(android.Manifest.permission.CAMERA,android.Manifest.permission.ACCESS_FINE_LOCATION)
    private val PERMISSION_REQUEST_CODE=123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_permission2)
        if(!hasPermissions(permission)){
            ActivityCompat.requestPermissions(this,permission,PERMISSION_REQUEST_CODE)
        }
        else{
            Toast.makeText(this,"permission already granted",Toast.LENGTH_LONG).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



    }
    private fun hasPermissions(permission: Array<String>):Boolean{
        return permission.all{permission->
            ContextCompat.checkSelfPermission(this,permission)==PackageManager.PERMISSION_GRANTED
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array< String>,
        grantResults: IntArray
    ) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if(requestCode==PERMISSION_REQUEST_CODE){

            val deniedPermission= mutableListOf<String>();
            for(i in permissions.indices){
                if(grantResults[i]!=PackageManager.PERMISSION_GRANTED){
                    deniedPermission.add(permissions[i])
                }
            }
            if(deniedPermission.isEmpty()){
                Toast.makeText(this,"all permission granted",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"permission denied : $deniedPermission",Toast.LENGTH_LONG).show()
            }
        }
    }
}