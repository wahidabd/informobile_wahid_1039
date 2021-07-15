package com.wahidabd.movieapps.data.repository

import androidx.lifecycle.LiveData
import com.wahidabd.movieapps.data.source.MovieDataSource
import javax.inject.Inject

class MovieRepository @Inject constructor(private val source: MovieDataSource) {

}