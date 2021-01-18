package com.github.githubuserapi.api

import com.github.githubuserapi.data.model.DetailUserResponse
import com.github.githubuserapi.data.model.User
import com.github.githubuserapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token ddcb68ac842d9276ad5367bd93aeb20086f8437d")
    fun getSearchUser(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token ddcb68ac842d9276ad5367bd93aeb20086f8437d")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token ddcb68ac842d9276ad5367bd93aeb20086f8437d")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token ddcb68ac842d9276ad5367bd93aeb20086f8437d")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}