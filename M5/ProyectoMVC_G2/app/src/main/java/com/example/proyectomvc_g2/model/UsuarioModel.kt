package com.example.proyectomvc_g2.model

class UsuarioModel {
    var rut: String = ""
    var nombre: String = ""
    var correo: String = ""
    var edad: Int = 0

    fun guardar(rut: String, nombre: String, correo: String, edad: Int): Boolean {
        if(rut.isEmpty() || nombre.isEmpty() || correo.isEmpty() || edad < 1)
            return false

        this.rut = rut
        this.nombre = nombre
        this.correo = correo
        this.edad = edad
        return true
    }

    fun imprimirDatos(): String{
        return "Rut: $rut Nombre: $nombre Correo: $correo Edad: $edad"
    }
}