package com.dizcoding.projectjpr.data.source.remote.response

data class TvResponse (
    var backdrop_path : String,
    var id : Int,
    var original_language : String,
    var overview : String,
    var popularity : Double,
    var poster_path : String,
    var vote_average : Double,
    var vote_count : Int,
    var first_air_date : String,
    var name : String,
    var original_name : String
)