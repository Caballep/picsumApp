package com.example.picsumapp.source.remote.dto

data class PicsumDtoItem(
    val author: String,
    val download_url: String,
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)