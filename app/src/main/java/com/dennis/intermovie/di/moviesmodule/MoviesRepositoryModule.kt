package com.dennis.intermovie.di.moviesmodule

import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesDao
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesItemDao
import com.dennis.intermovie.data.source.remote.InterMovieApiService
import com.dennis.intermovie.domain.repository.PopularMoviesItemRepository
import com.dennis.intermovie.domain.repository.PopularMoviesItemRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MoviesRepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepositoryImpl(
        interMovieApiService: InterMovieApiService,
        popularMoviesDao: PopularMoviesDao,
        popularMoviesItemDao: PopularMoviesItemDao
    ): PopularMoviesItemRepository = PopularMoviesItemRepositoryImpl(interMovieApiService, popularMoviesDao, popularMoviesItemDao)

}