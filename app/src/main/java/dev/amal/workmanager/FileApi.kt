package dev.amal.workmanager

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    @GET("/9fHLYFMH/toctogul-nature.jpg")
    suspend fun downloadImage(): Response<ResponseBody>

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://i.postimg.cc")
                .build()
                .create(FileApi::class.java)
        }
    }
}