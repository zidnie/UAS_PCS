package com.github.uasapi.data.remote

import com.github.uasapi.data.model.DetailUser
import com.github.uasapi.data.model.User
import com.github.uasapi.data.model.UserList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface UserService {

    @GET("search/users")
    @Headers("Authorization: token 183eb216fadee63ad174672eff578918ee2e11c3")
    fun searchUser(@Query("q") query: String): Call<UserList>

    @GET("users/{username}")
    @Headers("Authorization: token 183eb216fadee63ad174672eff578918ee2e11c3")
    fun detailUser(@Path("username") username: String): Call<DetailUser>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 183eb216fadee63ad174672eff578918ee2e11c3")
    fun getFollowers(@Path("username") username: String): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 183eb216fadee63ad174672eff578918ee2e11c3")
    fun getFollowing(@Path("username") username: String): Call<ArrayList<User>>

}