package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import ru.seversknet.edosevadm.models.CheckId
import ru.seversknet.edosevadm.models.InformId
import ru.seversknet.edosevadm.models.ReviewId
import ru.seversknet.edosevadm.models.Tasks

interface ApiTasks {
    @GET("tasks")
    @Headers("Accept: application/json")
    fun getTasks(
        @Header("Authorization") token: String,
        @Query("type") type: String
    ): retrofit2.Call<List<Tasks>>

    @GET("tasks/{id}/review")
    @Headers("Accept: application/json")
    fun getTaskReviewId(
        @Header("Authorization") token: String,
        @Path("id") idTask: String
    ): retrofit2.Call<ReviewId>

    @GET("tasks/{id}/check")
    @Headers("Accept: application/json")
    fun getTaskCheckId(
        @Header("Authorization") token: String,
        @Path("id") idTask: String
    ): retrofit2.Call<CheckId>

    @GET("tasks/{id}/inform")
    @Headers("Accept: application/json")
    fun getTaskInformId(
        @Header("Authorization") token: String,
        @Path("id") idTask: String
    ): retrofit2.Call<InformId>

    companion object {
        fun create(baseurl: String): ApiTasks {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiTasks::class.java)
        }
    }
}