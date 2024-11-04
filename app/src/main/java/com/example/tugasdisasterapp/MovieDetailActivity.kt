package com.example.tugasdisasterapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var movieImage: ImageView
    private lateinit var movieTitle: TextView
    private lateinit var movieDuration: TextView
    private lateinit var movieRating: TextView
    private lateinit var movieSynopsis: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        movieImage = findViewById(R.id.movieImage)
        movieTitle = findViewById(R.id.movieTitle)
        movieDuration = findViewById(R.id.movieDuration)
        movieRating = findViewById(R.id.movieRating)
        movieSynopsis = findViewById(R.id.movieSynopsis)

        val movie = intent.getParcelableExtra<Movie>("movie")

        movie?.let {
            movieTitle.text = it.title
            movieDuration.text = it.duration // Set duration
            movieRating.text = it.rating // Set rating
            movieSynopsis.text = it.synopsis
            Glide.with(this).load(it.imageUrl).into(movieImage)
        }
    }
}
