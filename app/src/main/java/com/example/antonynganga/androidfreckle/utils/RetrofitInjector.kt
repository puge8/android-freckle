package com.example.antonynganga.androidfreckle.utils

import com.example.antonynganga.androidfreckle.BuildConfig
import com.example.antonynganga.androidfreckle.data.Constants
import com.example.antonynganga.androidfreckle.services.AuthService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInjector {

    val interceptor = if (BuildConfig.DEBUG) {
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    } else {
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE)
    }
    val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

    fun provideRetrofit(baseUrl: String): Retrofit? {
        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    fun provideService(): AuthService? {
        return provideRetrofit(Constants.AUTH_BASE_URL)!!.create(AuthService::class.java)
    }
}
