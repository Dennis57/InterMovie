package com.dennis.intermovie.presentation.compose

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.dennis.intermovie.presentation.viewmodel.MoviesViewModel

@Composable
fun PopularMoviesListScreen(moviesViewModel: MoviesViewModel = hiltViewModel()) {

    val state = moviesViewModel.state.value

    LazyColumn(
        Modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        items(state.popularMoviesItemList.size) { i ->
            PopularMoviesItem(movie = state.popularMoviesItemList[i], onItemClick = {})
        }
    }
}