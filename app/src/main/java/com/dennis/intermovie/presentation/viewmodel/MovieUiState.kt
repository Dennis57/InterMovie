package com.dennis.intermovie.presentation.viewmodel

import com.dennis.intermovie.domain.model.PopularMoviesItem

data class MovieUiState(
    val popularMoviesItemList: List<PopularMoviesItem> = emptyList(),
    val isLoading: Boolean = false
)