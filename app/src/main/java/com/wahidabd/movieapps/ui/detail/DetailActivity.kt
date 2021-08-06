package com.wahidabd.movieapps.ui.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.wahidabd.movieapps.databinding.ActivityDetailBinding
import com.wahidabd.movieapps.models.DataMovie
import com.wahidabd.movieapps.ui.movie.MovieViewModel
import com.wahidabd.movieapps.utils.loadImage

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<DataMovie>(EXTRA_DATA)

        with(binding){
            if (data != null){
                tvTitle.text = data.title
                tvDesc.text = data.overview
                tvRealaseDate.text = data.release_date
                imgItemPhoto.loadImage(data.poster_path)
                imgItemPreview.loadImage(data.backdrop_path)
            }

            imgBack.setOnClickListener {
                onBackPressed()
            }
        }

    }

    companion object{
        const val EXTRA_DATA = "extra data"
    }
}