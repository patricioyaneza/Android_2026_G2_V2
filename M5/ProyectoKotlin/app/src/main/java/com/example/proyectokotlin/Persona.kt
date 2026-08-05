package com.example.proyectokotlin

class Persona(var rut: Int, var nombre: String?, var apellido: String?, var email: String?) {
    override fun toString(): String {
        return "Persona [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]"
    }
}
// function