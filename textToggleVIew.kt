package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class textToggleVIew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.text_toggle_view)

        val btn=findViewById<Button>(R.id.save)
        btn.setOnClickListener{

            Toast.makeText(this,"you clicked button",Toast.LENGTH_LONG).show()
        }
        val open=findViewById<Button>(R.id.click1)

        fun clickable(view : View){
            Toast.makeText(this,"open selected",Toast.LENGTH_LONG).show()
        }



        val checkbox=findViewById<CheckBox>(R.id.check)
        checkbox.setOnCheckedChangeListener{ _ ,isChecked ->

                if (isChecked) {
                    Toast.makeText(this, "you checked", Toast.LENGTH_LONG).show();
                }
            else{
                Toast.makeText(this,"not checked",Toast.LENGTH_LONG).show()
                }

        }
        val radio_group=findViewById<RadioGroup>(R.id.radio_grp)
        radio_group.setOnCheckedChangeListener{ _ ,isChecked -> if(isChecked == R.id.option1){
            Toast.makeText(this,"you clicked option 1 ",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this,"you clicked option 2 ",Toast.LENGTH_LONG).show()

        }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}