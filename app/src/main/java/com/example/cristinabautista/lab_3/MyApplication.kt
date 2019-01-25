/*
Cristina Bautista
Carne: 161260
 */
package com.example.cristinabautista.lab_3

import android.app.Application

class MyApplication: Application() {

    var contact: ArrayList<Contact> = ArrayList()

    fun add(name: String, phoneNumber: Int, email: String) {
        val contact: Contact = Contact(name, phoneNumber, email)
        this.contact.add(contact)
    }



}