package com.dennis.intermovie.di.moviesmodule

import com.dennis.intermovie.domain.repository.PopularMoviesItemRepository
import com.dennis.intermovie.domain.usecase.GetPopularMovies
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MoviesUseCaseModule {

    @Provides
    @Singleton
    fun provideGetPopularMoviesUseCase(repository: PopularMoviesItemRepository): GetPopularMovies =
        GetPopularMovies(repository)
}