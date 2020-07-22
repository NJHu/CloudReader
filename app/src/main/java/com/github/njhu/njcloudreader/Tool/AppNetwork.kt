package com.github.njhu.njcloudreader.Tool

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

public object AppNetwork {

    public fun getAppService(): AppService {
        return Retrofit.Builder()
            .baseUrl("https://njhu.github.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AppService::class.java)
    }
}