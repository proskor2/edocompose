package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import ru.seversknet.edosevadm.models.SupportThemes
import ru.seversknet.edosevadm.mainscreen.support.SupportId
import ru.seversknet.edosevadm.mainscreen.support.Supports

interface ApiSupport {
    @GET("supports")
    @Headers("Accept: application/json")
    fun getSupports(
        @Header("Authorization") token: String,
    ): retrofit2.Call<List<Supports>>

    @GET("supports/themes")
    @Headers("Accept: application/json")
    fun getSupportThemes(
        @Header("Authorization") token: String,
    ): retrofit2.Call<List<SupportThemes>>

    @GET("supports/{id}")
    @Headers("Accept: application/json")
    fun getSupportId(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): retrofit2.Call<SupportId>

//    @POST("supports")
//    @Multipart
//    @Headers("Content-Type: multipart/form-data")
//    fun postSupports(
//        @Header("Authorization") token: String,
//    ): retrofit2.Call<FilesAll>

    companion object {
        fun create(baseurl: String): ApiSupport {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiSupport::class.java)
        }
    }
}
