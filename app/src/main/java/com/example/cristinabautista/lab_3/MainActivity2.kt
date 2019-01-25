package com.example.cristinabautista.lab_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val showButtonBack = findViewById<Button>(R.id.buttonBack)
        showButtonBack.setOnClickListener{val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }

        val showButtonCreate = findViewById<Button>(R.id.buttonCreate)
        showButtonCreate.setOnClickListener{val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}
