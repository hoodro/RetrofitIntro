package com.example.retrofitintro

import com.example.retrofitintro.pojo.MultipleResource
import com.example.retrofitintro.pojo.User
import com.example.retrofitintro.pojo.UserList
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

internal interface APIInterface {
    @GET("/api/unknown")
    fun doGetListResources(): Call<MultipleResource?>

    @POST("/api/users")
    fun createUser(@Body user: User?): Call<User?>

    @GET("/api/users?")
    fun doGetUserList(@Query("page") page: String?): Call<UserList?>

    @FormUrlEncoded
    @POST("/api/users?")
    fun doCreateUserWithField(@Field("name") name: String?, @Field("job") job: String?): Call<User?>
}