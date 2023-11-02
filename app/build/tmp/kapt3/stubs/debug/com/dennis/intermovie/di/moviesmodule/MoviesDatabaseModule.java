package com.dennis.intermovie.di.moviesmodule;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/dennis/intermovie/di/moviesmodule/MoviesDatabaseModule;", "", "()V", "provideDatabase", "Lcom/dennis/intermovie/data/source/local/roomdb/InterMovieDatabase;", "application", "Landroid/app/Application;", "provideMovieDao", "Lcom/dennis/intermovie/data/source/local/roomdb/dao/PopularMoviesItemDao;", "database", "providePopularMoviesDao", "Lcom/dennis/intermovie/data/source/local/roomdb/dao/PopularMoviesDao;", "app_debug"})
@dagger.Module
public final class MoviesDatabaseModule {
    
    public MoviesDatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.dennis.intermovie.data.source.local.roomdb.InterMovieDatabase provideDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesDao providePopularMoviesDao(@org.jetbrains.annotations.NotNull
    com.dennis.intermovie.data.source.local.roomdb.InterMovieDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesItemDao provideMovieDao(@org.jetbrains.annotations.NotNull
    com.dennis.intermovie.data.source.local.roomdb.InterMovieDatabase database) {
        return null;
    }
}