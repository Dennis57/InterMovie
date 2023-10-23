package com.dennis.intermovie.data.source.local.roomdb.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dennis.intermovie.domain.model.PopularMovies
import com.dennis.intermovie.domain.model.PopularMoviesResults

@Entity(tableName = PopularMoviesEntity.TABLE_NAME)
data class PopularMoviesEntity(
    @PrimaryKey(autoGenerate = true)
    val primaryKeyId: Int? = null,

    val page: Int?,

    val results: List<PopularMoviesResultsEntity>?
) {

    fun toPopularMovies() : PopularMovies {
        return PopularMovies(
            page = page,
            results = results?.map {
                it.toPopularMoviesResults()
            }
        )
    }
    companion object {
        const val TABLE_NAME = "popular_movies"
    }
}
