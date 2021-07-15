package com.wahidabd.movieapps.data

interface DataCallback<T> {
    fun onDataReceived(response: T)
}