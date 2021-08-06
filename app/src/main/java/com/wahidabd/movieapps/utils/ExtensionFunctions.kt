package com.wahidabd.movieapps.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.wahidabd.movieapps.utils.Constant.IMAGE_URL

fun ImageView.loadImage(url: String){
    Glide.with(this)
        .load(IMAGE_URL+url)
        .into(this)
}