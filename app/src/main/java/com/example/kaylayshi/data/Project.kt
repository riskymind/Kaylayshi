package com.example.kaylayshi.data

import androidx.annotation.DrawableRes

data class Project(
    val title: String,
    @DrawableRes val image: Int,
    val description: String
)
