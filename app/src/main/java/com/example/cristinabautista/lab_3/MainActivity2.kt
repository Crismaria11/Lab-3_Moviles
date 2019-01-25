package com.example.cristinabautista.lab_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import java.util.ArrayList

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val contactList = (this.application as MyApplication)

        val showTextName = findViewById<TextView>(R.id.textName)

        val showTelefono = findViewById<TextView>(R.id.telefono)

        val showCorreo = findViewById<TextView>(R.id.correo)


        val showButtonBack = findViewById<Button>(R.id.buttonBack)
        showButtonBack.setOnClickListener{val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }

        val showButtonCreate = findViewById<Button>(R.id.buttonCreate)
        showButtonCreate.setOnClickListener{val intent = Intent(this, MainActivity1::class.java)
            contactList.add(showTextName.text.toString(), showTelefono.text.toString(), showCorreo.text.toString())



            startActivity(intent)

        }




    }
}



/*private var <E> ArrayList<E>.setOnClickListener: Unit
    get() {}

        */
