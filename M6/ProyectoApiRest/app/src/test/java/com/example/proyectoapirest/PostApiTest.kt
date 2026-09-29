package com.example.proyectoapirest

import com.example.proyectoapirest.data.network.PostApi
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostApiTest {

    private lateinit var mockWebServer: MockWebServer
    private lateinit var postApi: PostApi

    @Before
    fun setup() {
        val BASE_URL = "https://jsonplaceholder.typicode.com/"
        mockWebServer = MockWebServer()
        mockWebServer.start()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        postApi = retrofit.create(PostApi::class.java)
    }

    @After
    fun teardown() {
        mockWebServer.shutdown()
    }

    @Test
    fun testGetPosts() = runBlocking {
        val posts = postApi.getPosts()
        assertEquals(100, posts.size)
    }

    @Test
    fun testGetPostById() = runBlocking {
        val postId = 1
        val post = postApi.getPostById(postId)
        assertEquals(postId, post.id)
    }


        




}