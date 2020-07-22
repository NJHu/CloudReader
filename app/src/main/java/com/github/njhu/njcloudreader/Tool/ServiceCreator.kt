package com.github.njhu.njcloudreader.Tool

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    private const val BASE_URL = "https://njhu.github.io/"
    private var retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> create(serviceClass: Class<T>): T {
        return  retrofit.create(serviceClass)
    }
    fun createAppService(): AppService {
        return create(AppService::class.java)
    }
}