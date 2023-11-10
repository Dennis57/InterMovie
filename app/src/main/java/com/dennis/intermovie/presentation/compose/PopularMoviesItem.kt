package com.dennis.intermovie.presentation.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dennis.intermovie.domain.model.PopularMoviesItem

@Composable
fun PopularMoviesItem(
    movie: PopularMoviesItem,
    onItemClick: (PopularMoviesItem) -> Unit
) {
    Row(
        modifier = Modifier
            .clickable { onItemClick(movie) }
            .padding(vertical = 16.dp, horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        movie.posterPath?.let { CoilImage(imageUrl = it) }

        Spacer(modifier = Modifier.width(16.dp))
        Column {
            movie.title?.let {
                Text(
                    text = it,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            movie.releaseDate?.let {
                Text(
                    text = it,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}