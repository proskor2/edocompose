package ru.seversknet.edocompose.data.api

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

    object RetrofitBuilder {
        private val baseurl = BaseURL.baseurl.toString()

        private fun getRetrofit(): Retrofit{
            return Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val apiService = getRetrofit().create(ApiService::class.java)
    }
}