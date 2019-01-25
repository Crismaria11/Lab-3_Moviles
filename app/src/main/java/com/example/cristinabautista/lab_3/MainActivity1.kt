package com.example.cristinabautista.lab_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import java.util.ArrayList

class MainActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val contactList = (this.application as MyApplication).contact

        val showButtonAddContactos = findViewById<Button>(R.id.buttonAddContactos)
        showButtonAddContactos.setOnClickListener{val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contactList)
        contactList.adapter = adapter



    }

}
internal var <E> ArrayList<E>.adapter: ArrayAdapter<Contact>
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    set() {}