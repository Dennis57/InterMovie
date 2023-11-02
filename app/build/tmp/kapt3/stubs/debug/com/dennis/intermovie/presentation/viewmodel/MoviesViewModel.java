package com.dennis.intermovie.presentation.viewmodel;

import java.lang.System;

/**
 * Created by amoljp19 on 4/18/2023.
 * softAai Apps.
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/dennis/intermovie/presentation/viewmodel/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "getPopularMovies", "Lcom/dennis/intermovie/domain/usecase/GetPopularMovies;", "(Lcom/dennis/intermovie/domain/usecase/GetPopularMovies;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/dennis/intermovie/presentation/viewmodel/MovieUiState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getMovies", "", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    private final com.dennis.intermovie.domain.usecase.GetPopularMovies getPopularMovies = null;
    private final androidx.compose.runtime.MutableState<com.dennis.intermovie.presentation.viewmodel.MovieUiState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.dennis.intermovie.presentation.viewmodel.MovieUiState> state = null;
    
    @javax.inject.Inject
    public MoviesViewModel(@org.jetbrains.annotations.NotNull
    com.dennis.intermovie.domain.usecase.GetPopularMovies getPopularMovies) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.dennis.intermovie.presentation.viewmodel.MovieUiState> getState() {
        return null;
    }
    
    public final void getMovies() {
    }
}