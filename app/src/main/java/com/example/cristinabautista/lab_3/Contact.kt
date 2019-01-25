package com.example.cristinabautista.lab_3

class Contact(var nombre: String, var phoneNumber: Int, var email: String) {
    override fun toString(): String {
        return """
            ${this.nombre} ---
            ${this.phoneNumber} ---
            ${this.email} ---
        """.trimIndent()
    }
}