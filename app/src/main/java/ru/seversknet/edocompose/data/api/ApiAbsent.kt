package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import ru.seversknet.edosevadm.models.AbsentReasons
import ru.seversknet.edosevadm.models.Absents

interface ApiAbsent {
    @GET("absents")
    @Headers("Accept: application/json")
    fun getAbsents(
        @Header("Authorization") token: String,
    ): retrofit2.Call<List<Absents>>

    @GET("absents/reasons")
    @Headers("Accept: application/json")
    fun getAbsentReasons(
        @Header("Authorization") token: String,
    ): retrofit2.Call<List<AbsentReasons>>

    @GET("absents/{id}")
    @Headers("Accept: application/json")
    fun getAbsentId(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): retrofit2.Call<Absents>

    companion object {
        fun create(baseurl: String): ApiAbsent {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiAbsent::class.java)
        }
    }
}
