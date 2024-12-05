package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Snackbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class suit_ladies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.suit_ladies)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val images= arrayOf(
            R.drawable.dupatta1,
                    R.drawable.dupatta2,
                    R.drawable.dupatta3,
                    R.drawable.dupatta4,
                    R.drawable.dupatta5,
                    R.drawable.dupatta6,
                    R.drawable.dupatta7,
            R.drawable.dupatta8


        )
        val prices = arrayOf(
            "₹440",
            "₹450",
            "₹460",
            "₹470",
            "₹480",
            "₹490",
            "₹500",
            "₹510"
        )

        val buttonIds = arrayOf(
            R.id.buy_now1,
            R.id.buy_now2,
            R.id.buy_now3,
            R.id.buy_now4,
            R.id.buy_now5,
            R.id.buy_now6,
            R.id.buy_now7,
            R.id.buy_now8
        )
        for(i in images.indices){


            val buy_btn:Button?=findViewById<Button>(buttonIds[i])

            buy_btn?.setOnClickListener{
                val intent= Intent(this,buyNow::class.java).apply {
                    putExtra("images_res_id",images[i])
                    putExtra("price",prices[i])
                }
                startActivity(intent)
            }



        }
        val cartId = arrayOf(
            R.id.add_now1,
            R.id.add_now2,
            R.id.add_now3,
            R.id.add_now4,
            R.id.add_now5,
            R.id.add_now6,
            R.id.add_now7,
            R.id.add_now8
        )
        for(i in images.indices){


            val add_now:Button?=findViewById<Button>(cartId[i])

          add_now?.setOnClickListener{
                val intent= Intent(this,CartActivity::class.java).apply {
                    putExtra("cart_id",images[i])
                    putExtra("price",prices[i])
                }
                startActivity(intent)
              Toast.makeText(this,"item is addred in cart",Toast.LENGTH_LONG).show()

            }



        }







    }
}