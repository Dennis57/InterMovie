package com.dennis.intermovie.data.source.local

data class PopularMoviesEntity(
    val page: Int?,
    val results: List<PopularMoviesResultsEntity>?
)
