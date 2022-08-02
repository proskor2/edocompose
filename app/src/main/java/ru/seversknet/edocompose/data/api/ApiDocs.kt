package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import ru.seversknet.edosevadm.models.Docs
import ru.seversknet.edosevadm.models.DocsId

interface ApiDocs {
    @GET("docs")
    @Headers("Accept: application/json")
    fun getDocs(
        @Header("Authorization") token: String,
        @Query("regDataBegin") regDataBegin: String?,
        @Query("regDataEnd") regDataEnd: String?,
        @Query("docType") docType: String?,
        @Query("docCode") docCode: String?,
        @Query("regNumber") regNumber: String?,
    ): retrofit2.Call<List<Docs>>

    @GET("docs/{id}")
    @Headers("Accept: application/json")
    fun getDocsId(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): retrofit2.Call<DocsId>


    companion object {
        fun create(baseurl: String): ApiDocs {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiDocs::class.java)
        }
    }
}