package com.wahidabd.movieapps.ui.movie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.wahidabd.movieapps.databinding.ActivityMainBinding
import com.wahidabd.movieapps.models.DataMovie
import com.wahidabd.movieapps.ui.detail.DetailActivity
import com.wahidabd.movieapps.utils.LoadingDialog
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MovieViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]
        viewModel.getAllMovie().observe(this, {
            with(binding.rvMovie){
                val adapter = MovieAdapter()
                adapter.setList(it)
                this.adapter = adapter
                layoutManager = GridLayoutManager(this@MainActivity, 2)

                adapter.setOnItemClick(object : MovieAdapter.OnItemClick{
                    override fun onItemClicked(data: DataMovie) {
                        startActivity(Intent(this@MainActivity, DetailActivity::class.java)
                            .putExtra(DetailActivity.EXTRA_DATA, data))
                    }

                })

            }
        })

    }
}