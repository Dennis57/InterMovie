package com.dennis.intermovie.domain.repository

import com.dennis.intermovie.data.source.remote.Resource
import com.dennis.intermovie.domain.model.PopularMoviesItem
import kotlinx.coroutines.flow.Flow

interface PopularMoviesItemRepository {
    fun getPopularMovies(): Flow<Resource<List<PopularMoviesItem>>>
}