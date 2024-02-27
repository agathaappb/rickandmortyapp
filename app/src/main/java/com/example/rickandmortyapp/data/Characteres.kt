package com.example.rickandmortyapp.data

import androidx.annotation.DrawableRes

data class Characteres(
    val name: String,
    @DrawableRes val photo: Int
)
