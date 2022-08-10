package ru.seversknet.edocompose.data.api

import com.google.gson.GsonBuilder
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query
import ru.seversknet.edosevadm.models.Tasks

interface ApiService {
    @GET("tasks")
    @Headers("Accept: application/json")
    suspend fun getTasks(
        @Header("Authorization") token: String,
        @Query("type") type: String
    ): List<Tasks>

    object AppConfig{
        private const val BASE_URL = "http://192.168.64.86/edo/hs/"

        //create retrofit service
        fun ApiService(): ApiService =
            Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
                .create(ApiService::class.java)
    }
}