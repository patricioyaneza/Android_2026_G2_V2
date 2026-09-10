package com.example.proyectoalmacenamiento.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.proyectoalmacenamiento.dao.UsuarioDAO
import com.example.proyectoalmacenamiento.model.UsuarioModel

@Database(entities = [UsuarioModel::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDAO

    companion object {
        private var instance: AppDataBase? = null
        fun getInstance(context: Context): AppDataBase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "app_database"
                ).build()
            }
            return instance!!
        }
    }
}