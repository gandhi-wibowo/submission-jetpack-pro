package com.dizcoding.projectjpr.data.source.local.entity

data class FilmDetailEntity(
    var name: String,
    var backdrop_path: String,
    var id: Int,
    var original_language: String,
    var overview: String,
    var popularity: Double,
    var poster_path: String,
    var release_date: String,
    var vote_average: Double,
    var vote_count: Int
)