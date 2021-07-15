package com.wahidabd.movieapps.models

data class MovieResponse (
    val results: List<DataMovie>? = null,
    val page: Int? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)