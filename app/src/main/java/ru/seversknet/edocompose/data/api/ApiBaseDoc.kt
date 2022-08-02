package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query
import ru.seversknet.edosevadm.mainscreen.base.DocsData

interface ApiBaseDoc {
    @GET("Docs")
    @Headers("Accept: application/json")
    fun getDocs(
        @Header("Authorization") token: String,
        @Query("typedoc") typedoc: String,
        @Query("idTask") idTask: String?
    ): retrofit2.Call<DocsData>

    companion object {
        var BASE_URL = "http://192.168.64.86/edo/hs/"
        fun create(): ApiBaseDoc {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiBaseDoc::class.java)
        }
    }
}