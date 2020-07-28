package com.github.njhu.njcloudreader.Tool


import retrofit2.http.GET
import retrofit2.Call
import com.github.njhu.njcloudreader.Bean.Article as Article

interface AppService {
    @GET("files/articleList.json")
    fun getArticleList(): Call<List<Article>>

}