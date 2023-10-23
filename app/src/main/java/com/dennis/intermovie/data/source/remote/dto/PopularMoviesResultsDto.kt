package com.dennis.intermovie.data.source.remote.dto

import com.dennis.intermovie.data.source.local.roomdb.entity.PopularMoviesResultsEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PopularMoviesResultsDto(

    @Json(name = "adult")
    val adult: Boolean,

    @Json(name = "backdrop_path")
    val backdropPath: String,

    @Json(name = "genre_ids")
    val genreIds: List<Int>,

    @Json(name = "id")
    val id: Int,

    @Json(name = "original_language")
    val originalLanguage: String,

    @Json(name = "original_title")
    val originalTitle: String,

    @Json(name = "overview")
    val overview: String,

    @Json(name = "popularity")
    val popularity: Double,

    @Json(name = "poster_path")
    val posterPath: String,

    @Json(name = "release_date")
    val releaseDate: String,

    @Json(name = "title")
    val title: String,

    @Json(name = "video")
    val video: Boolean,

    @Json(name = "vote_average")
    val voteAverage: Double,

    @Json(name = "vote_count")
    val voteCount: Int,
) {
    fun toPopularMoviesResultsEntity() : PopularMoviesResultsEntity {
        return PopularMoviesResultsEntity(
            id = id,
            title = title,
            overview = overview,
            posterPath = posterPath,
            releaseDate = releaseDate
        )
    }
}