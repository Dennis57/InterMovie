package com.dennis.intermovie.di.moviesmodule;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/dennis/intermovie/di/moviesmodule/MoviesUsecaseModule;", "", "()V", "provideGetPopularMoviesUseCase", "Lcom/dennis/intermovie/domain/usecase/GetPopularMovies;", "repository", "Lcom/dennis/intermovie/domain/repository/PopularMoviesItemRepository;", "app_debug"})
@dagger.Module
public final class MoviesUsecaseModule {
    
    public MoviesUsecaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.dennis.intermovie.domain.usecase.GetPopularMovies provideGetPopularMoviesUseCase(@org.jetbrains.annotations.NotNull
    com.dennis.intermovie.domain.repository.PopularMoviesItemRepository repository) {
        return null;
    }
}