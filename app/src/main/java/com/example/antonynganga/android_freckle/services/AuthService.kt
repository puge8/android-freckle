package com.example.antonynganga.android_freckle.services

import retrofit2.Call
import retrofit2.http.GET

interface AuthService {

    @GET("/")
    fun getIndexUrl(): Call<String>
}