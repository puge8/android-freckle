package com.example.antonynganga.androidfreckle.services

import retrofit2.Call
import retrofit2.http.GET

interface AuthService {

    @GET("/")
    fun getIndexUrl(): Call<String>
}