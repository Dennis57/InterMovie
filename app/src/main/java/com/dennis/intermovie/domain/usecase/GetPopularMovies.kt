package com.dennis.intermovie.domain.usecase

import com.dennis.intermovie.data.source.remote.Resource
import com.dennis.intermovie.domain.model.PopularMoviesItem
import com.dennis.intermovie.domain.repository.PopularMoviesItemRepository
import kotlinx.coroutines.flow.Flow

class GetPopularMovies(
    private val popularMoviesItemRepository: PopularMoviesItemRepository
) {
    operator fun invoke(): Flow<Resource<List<PopularMoviesItem>>> {
        return popularMoviesItemRepository.getPopularMovies()
    }
}