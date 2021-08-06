package com.wahidabd.movieapps.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wahidabd.movieapps.databinding.ItemListMovieBinding
import com.wahidabd.movieapps.models.DataMovie
import com.wahidabd.movieapps.utils.loadImage

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    private lateinit var onItemClick: OnItemClick

    private val list = ArrayList<DataMovie>()
    fun setList(list: List<DataMovie>){
        this.list.clear()
        this.list.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
        val binding = ItemListMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(private val binding: ItemListMovieBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data: DataMovie){
            with(binding){
                tvTitle.text = data.title
                imgPhoto.loadImage(data.poster_path)

                itemCard.setOnClickListener {
                    onItemClick.onItemClicked(data)
                }
            }
        }
    }

    fun setOnItemClick(onItemClick: OnItemClick){
        this.onItemClick = onItemClick
    }

    interface OnItemClick{
        fun onItemClicked(data: DataMovie)
    }
}