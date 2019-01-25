package com.example.cristinabautista.lab_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val contactList = (this.application as MyApplication).contact

        val showButtonBackContact = findViewById<Button>(R.id.buttonBackContact)
        showButtonBackContact.setOnClickListener{val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
