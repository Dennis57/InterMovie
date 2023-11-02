package com.dennis.intermovie.di.moviesmodule

import android.app.Application
import com.dennis.intermovie.data.source.local.roomdb.InterMovieDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MoviesDatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(application: Application) = InterMovieDatabase.getDatabase(application)

    @Singleton
    @Provides
    fun providePopularMoviesDao(database: InterMovieDatabase) =
        database.getPopularMoviesDao()

    @Singleton
    @Provides
    fun provideMovieDao(database: InterMovieDatabase) =
        database.getMovieDao()
}