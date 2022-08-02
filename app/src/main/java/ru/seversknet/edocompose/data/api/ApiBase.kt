package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query
import okhttp3.OkHttpClient
import ru.seversknet.edosevadm.mainscreen.base.DocsData
import java.util.concurrent.TimeUnit


interface ApiBase {
    @GET("Docs")
    @Headers("Accept: application/json")
    fun getDocs(
        @Header("Authorization") token: String,
        @Query("typedoc") typedoc: String?,
        @Query("cut") cut: Boolean?,
        @Query("id") idTask: String?,
        @Query("emptyres") emptyres: Boolean?
    ): retrofit2.Call<MutableList<DocsData>>

    companion object {
        var BASE_URL = "http://192.168.64.86/edo/hs/"
        fun create(): ApiBase {
            var client = OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build()
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiBase::class.java)
        }
    }
}