package com.dennis.intermovie.domain.model

data class PopularMovies(
    val page: Int?,
    val results: List<PopularMoviesItem>?
)