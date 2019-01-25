package com.example.cristinabautista.lab_3

class MyApplication {
    private var contact: ArrayList<Contact> = ArrayList()

    fun add(name: String, phoneNumber: Int, email: String) {
        val contact: Contact = Contact(name, phoneNumber, email)
        this.contact.add(contact)
    }
}