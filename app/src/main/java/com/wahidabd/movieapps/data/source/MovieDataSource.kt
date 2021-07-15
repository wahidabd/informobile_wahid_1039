package com.wahidabd.movieapps.data.source

import android.util.Log
import com.wahidabd.movieapps.data.DataCallback
import com.wahidabd.movieapps.data.network.MovieApi
import com.wahidabd.movieapps.models.DataMovie
import com.wahidabd.movieapps.models.MovieResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MovieDataSource @Inject constructor(private val api: MovieApi) {

    fun getMovie(callback: DataCallback<List<DataMovie>>){
        api.getMovie().enqueue(object : Callback<MovieResponse>{
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                response.body()?.results?.let { callback.onDataReceived(it) }
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                Log.e("Movie Data Source", t.printStackTrace().toString())
            }
        })
    }

    fun getDetailMovie(id: String, callback: DataCallback<DataMovie>){
        api.getDetailMovie(id).enqueue(object : Callback<DataMovie>{
            override fun onResponse(call: Call<DataMovie>, response: Response<DataMovie>) {
                response.body()?.let { callback.onDataReceived(it) }
            }

            override fun onFailure(call: Call<DataMovie>, t: Throwable) {
                Log.e("Movie Data Source", t.printStackTrace().toString())
            }
        })
    }
}