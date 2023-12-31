package com.dennis.intermovie.di.moviesmodule;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/dennis/intermovie/di/moviesmodule/MoviesRepositoryModule;", "", "()V", "provideMovieRepositoryImpl", "Lcom/dennis/intermovie/domain/repository/PopularMoviesItemRepository;", "interMovieApiService", "Lcom/dennis/intermovie/data/source/remote/InterMovieApiService;", "popularMoviesDao", "Lcom/dennis/intermovie/data/source/local/roomdb/dao/PopularMoviesDao;", "popularMoviesItemDao", "Lcom/dennis/intermovie/data/source/local/roomdb/dao/PopularMoviesItemDao;", "app_debug"})
@dagger.Module
public final class MoviesRepositoryModule {
    
    public MoviesRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.dennis.intermovie.domain.repository.PopularMoviesItemRepository provideMovieRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.dennis.intermovie.data.source.remote.InterMovieApiService interMovieApiService, @org.jetbrains.annotations.NotNull
    com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesDao popularMoviesDao, @org.jetbrains.annotations.NotNull
    com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesItemDao popularMoviesItemDao) {
        return null;
    }
}