package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import ru.seversknet.edosevadm.models.*

interface ApiCounterparties {
    @GET("сounterparties")
    @Headers("Accept: application/json")
    fun getCounterparties(
        @Header("Authorization") token: String,
    ): retrofit2.Call<List<Counterparties>>

    @GET("сounterparties/{id}")
    @Headers("Accept: application/json")
    fun getCounterpartiesId(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): retrofit2.Call<CounterpartiesId>


    companion object {
        fun create(baseurl: String): ApiCounterparties {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiCounterparties::class.java)
        }
    }
}
