package com.example.proyectoapirest.data.network

import com.example.proyectoapirest.model_api.Post
import retrofit2.http.GET

interface PostApi {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}