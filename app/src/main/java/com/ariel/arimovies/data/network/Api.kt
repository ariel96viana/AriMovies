package com.ariel.arimovies.data.network

import com.ariel.arimovies.data.model.GetMoviesResponse

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "1e0a6f5f31de5c26446bdb7374ec373a",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}