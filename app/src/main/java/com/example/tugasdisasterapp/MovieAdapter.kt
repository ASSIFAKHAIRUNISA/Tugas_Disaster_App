package com.example.tugasdisasterapp

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter(
    private val context: Context,
    private val movieList: List<Movie>
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view)
    }

    // Memasukkan data dari movieList ke dalam View yang diikat ke MovieViewHolder.
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.movieTitle.text = movie.title
        holder.movieDuration.text = movie.duration
        holder.movieRating.text = movie.rating

        Glide.with(context).load(movie.imageUrl).into(holder.movieImage)

        // Menambahkan OnClickListener untuk membuka MovieDetailActivity dengan data movie saat item diklik.
        holder.itemView.setOnClickListener {
            Log.d("MovieAdapter", "Movie clicked: ${movie.title}")
            val intent = Intent(context, MovieDetailActivity::class.java)
            intent.putExtra("movie", movie) // Menggunakan Parcelable
            context.startActivity(intent)
        }
    }

    // Mengembalikan jumlah item dalam movieList.
    override fun getItemCount(): Int {
        return movieList.size
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieImage: ImageView = itemView.findViewById(R.id.movieImage)
        val movieTitle: TextView = itemView.findViewById(R.id.movieTitle)
        val movieDuration: TextView = itemView.findViewById(R.id.movieDuration)
        val movieRating: TextView = itemView.findViewById(R.id.movieRating)
    }
}
