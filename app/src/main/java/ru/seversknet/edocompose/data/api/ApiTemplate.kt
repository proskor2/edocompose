package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query
import ru.seversknet.edosevadm.models.Templates

interface ApiTemplate {
    @GET("templates/types")
    @Headers("Accept: application/json")
    fun getTemplatesTypes(
        @Header("Authorization") token: String,
    ): retrofit2.Call<List<Templates>>

    @GET("templates/{type}")
    @Headers("Accept: application/json")
    fun getTemplates(
        @Header("Authorization") token: String,
        @Query("type") type: String,
    ): retrofit2.Call<List<Templates>>

    companion object {
        fun create(baseurl: String): ApiTemplate {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiTemplate::class.java)
        }
    }
}