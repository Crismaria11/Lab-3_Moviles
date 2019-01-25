package com.example.cristinabautista.lab_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import java.util.ArrayList

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val contactList = (this.application as MyApplication).contact


        val showButtonBack = findViewById<Button>(R.id.buttonBack)
        showButtonBack.setOnClickListener{val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }

        val showButtonCreate = findViewById<Button>(R.id.buttonCreate)
        showButtonCreate.setOnClickListener{val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contactList)
        contactList.adapter = adapter

        contactList.setOnClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            contact.
        }


    }
}



private var <E> ArrayList<E>.setOnClickListener: Unit
    get() {}

private var <E> ArrayList<E>.adapter: ArrayAdapter<Contact>
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    set() {}
