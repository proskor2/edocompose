package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import ru.seversknet.edosevadm.models.Controls

interface ApiControls {
    @GET("controls")
    @Headers("Accept: application/json")
    fun getControls(
        @Header("Authorization") token: String,
    ): retrofit2.Call<List<Controls>>

    companion object {
        fun create(baseurl: String): ApiControls {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiControls::class.java)
        }
    }

}