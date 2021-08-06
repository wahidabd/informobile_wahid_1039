package com.wahidabd.movieapps.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataMovie(
    val id: Int,
    val title: String,
    val overview: String,
    val poster_path: String,
    val backdrop_path: String,
    val release_date: String
): Parcelable