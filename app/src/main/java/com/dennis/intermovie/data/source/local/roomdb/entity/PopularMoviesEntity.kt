package com.dennis.intermovie.data.source.local.roomdb.entity

data class PopularMoviesEntity(
    val page: Int?,
    val results: List<PopularMoviesResultsEntity>?
)
