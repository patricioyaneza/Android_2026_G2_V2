package com.example.proyectoapirest.data.network

import com.example.proyectoapirest.model_api.Post
import retrofit2.http.GET
import retrofit2.http.Path

interface PostApi {
    @GET("/posts")
    suspend fun getPosts(): List<Post>

    @GET("/posts/{id}")
    suspend fun getPostById(id: Int): Post

    @GET("/users/{userId}/posts")
    suspend fun getPostsByUserId(@Path("userId") userId: Int): List<Post>

}