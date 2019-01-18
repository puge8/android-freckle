package com.example.antonynganga.android_freckle.utils;

import com.example.antonynganga.android_freckle.services.AuthService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInjector {
    fun provideRetrofit(baseUrl:String): Retrofit? {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun provideService(): AuthService? {
        return provideRetrofit("https://secure.letsfreckle.com")!!.create(AuthService::class.java)
    }
}
