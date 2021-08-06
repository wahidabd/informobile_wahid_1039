package com.wahidabd.movieapps.ui.movie

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wahidabd.movieapps.models.DataMovie
import com.wahidabd.movieapps.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getAllMovie(): LiveData<List<DataMovie>> = DataDummy.getAllMovie()
}