package ru.seversknet.edosevadm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import ru.seversknet.edosevadm.models.*

interface ApiUsers {

    @GET("users/auth")
    @Headers("Accept: application/json")
    fun getUserAuth(
        @Header("Authorization") token: String,
    ): retrofit2.Call<UserAuth>

    @GET("users/birthday")
    fun getUserBirthday(
        @Header("Authorization") token: String
    ): retrofit2.Call<List<UserBirthday>>

    @GET("users/employee")
    fun getUserEmployees(
        @Header("Authorization") token: String,
        @Query("isFavorite") isFavorite: Boolean
    ): retrofit2.Call<List<UserEmployees>>

    @GET("users/{id}")
    fun getUserId(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): retrofit2.Call<UserId>

    @GET("users/{id}/detail")
    fun getUserDetail(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): retrofit2.Call<UserDetail>

    @GET("users")
    @Headers("Accept: application/json")
    fun getUser(
        @Header("Authorization") token: String,
    ): retrofit2.Call<List<User>>

    @POST("users/photo")
    @Multipart
    @Headers("Content-Type: multipart/form-data")
    fun postPhoto(
        @Header("Authorization") token: String,
    ): retrofit2.Call<FilesAll>

    companion object {
        fun create(baseurl: String): ApiUsers {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build()
            return retrofit.create(ApiUsers::class.java)
        }
    }
}