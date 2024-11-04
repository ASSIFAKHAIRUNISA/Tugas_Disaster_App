package com.example.tugasdisasterapp

import android.os.Parcel
import android.os.Parcelable

// berisi informasi tentang film seperti judul, durasi, rating, URL gambar, dan sinopsis.
// Kelas ini mengimplementasikan antarmuka Parcelable, yang memungkinkan objek Movie untuk dipindahkan antar komponen Android
data class Movie(
    val title: String,
    val duration: String,
    val rating: String,
    val imageUrl: String,
    val synopsis: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(duration)
        parcel.writeString(rating)
        parcel.writeString(imageUrl)
        parcel.writeString(synopsis)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}

