package com.example.cristinabautista.lab_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val showButtonAddContactos = findViewById<Button>(R.id.buttonAddContactos)
        showButtonAddContactos.setOnClickListener{val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }

}
