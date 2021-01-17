package com.Taufik0637.pcs.ui.main.api

import com.Taufik0637.pcs.ui.main.data.model.DetailUserResponse
import com.Taufik0637.pcs.ui.main.data.model.User
import retrofit2.Call
import com.Taufik0637.pcs.ui.main.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 4f43fb5d7106162307ddb19c951ee23c4695b118")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 4f43fb5d7106162307ddb19c951ee23c4695b118")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 4f43fb5d7106162307ddb19c951ee23c4695b118")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 4f43fb5d7106162307ddb19c951ee23c4695b118")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>

}