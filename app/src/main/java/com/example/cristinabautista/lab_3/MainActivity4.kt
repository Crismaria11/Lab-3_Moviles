package com.example.cristinabautista.lab_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val contactList = (this.application as MyApplication).contact

        val showButtonSend = findViewById<Button>(R.id.buttonSend)
        showButtonSend.setOnClickListener{val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }
    }
}
