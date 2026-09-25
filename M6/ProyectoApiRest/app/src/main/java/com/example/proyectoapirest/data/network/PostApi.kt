package com.example.proyectoapirest.data.network

import com.example.proyectoapirest.model_api.Post
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface PostApi {
    @GET("/posts")
    suspend fun getPosts(): List<Post>

    @GET("/posts/{id}")
    suspend fun getPostById(@Path("id") id: Int): Post

    @GET("/users/{userId}/posts")
    suspend fun getPostsByUserId(@Path("userId") userId: Int): List<Post>

    @POST("/posts")
    suspend fun createPost(@Body post: Post): Post
}