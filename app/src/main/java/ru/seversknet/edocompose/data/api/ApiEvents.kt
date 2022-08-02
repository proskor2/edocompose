package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path
import ru.seversknet.edosevadm.models.EventId

interface ApiEvents {

//    @GET("events")
//    @Headers("Accept: application/json")
//    fun getEvents(
//        @Header("Authorization") token: String,
//    ): retrofit2.Call<Events>

    @GET("events/{id}")
    @Headers("Accept: application/json")
    fun getEventsId(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): retrofit2.Call<EventId>


    companion object {
        fun create(baseurl: String): ApiEvents {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiEvents::class.java)
        }
    }
}