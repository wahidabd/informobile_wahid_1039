package com.wahidabd.movieapps.data.network

import com.wahidabd.movieapps.models.DataMovie
import com.wahidabd.movieapps.models.MovieResponse
import com.wahidabd.movieapps.utils.Constant.API_KEY
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieApi{

    @GET("discover/movie?api_key?=$API_KEY")
    fun getMovie(): Call<MovieResponse>

    @GET("movie/{id}/?api_key?=$API_KEY")
    fun getDetailMovie(
        @Path("id")id: String
    ): Call<DataMovie>
}