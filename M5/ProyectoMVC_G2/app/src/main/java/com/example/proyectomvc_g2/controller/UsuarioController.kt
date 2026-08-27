package com.example.proyectomvc_g2.controller

import com.example.proyectomvc_g2.model.UsuarioModel


class UsuarioController {

    private val usuarioModel: UsuarioModel

    init {
        usuarioModel = UsuarioModel()
    }

    fun guardar(rut: String, nombre: String, correo: String, edad: Int): Boolean {
        return usuarioModel.guardar(rut, nombre, correo, edad)
    }
    fun mostrarCorreo(): String
    {
        return usuarioModel.correo
    }

    fun imprimir(): String {
        return usuarioModel.imprimirDatos()
    }

}