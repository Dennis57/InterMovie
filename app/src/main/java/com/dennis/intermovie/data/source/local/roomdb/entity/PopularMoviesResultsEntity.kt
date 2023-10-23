package com.dennis.intermovie.data.source.local.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dennis.intermovie.domain.model.PopularMoviesResults

@Entity(tableName = PopularMoviesResultsEntity.TABLE_NAME)
data class PopularMoviesResultsEntity(
    @PrimaryKey val id: Int?,
    val title: String?,
    val overview: String?,
    @ColumnInfo(name = "poster_path") val posterPath: String?,
    @ColumnInfo(name = "release_date") val releaseDate: String?
) {
    fun toPopularMoviesResults(): PopularMoviesResults {
        return PopularMoviesResults(
            title = title,
            overview = overview,
            posterPath = posterPath,
            releaseDate = releaseDate
        )
    }
    companion object {
        const val TABLE_NAME = "popular_movies_results"
    }
}
