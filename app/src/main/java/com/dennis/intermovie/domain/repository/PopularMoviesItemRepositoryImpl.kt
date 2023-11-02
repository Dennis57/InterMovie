package com.dennis.intermovie.domain.repository

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesDao
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesItemDao
import com.dennis.intermovie.data.source.remote.InterMovieApiService
import com.dennis.intermovie.data.source.remote.Resource
import com.dennis.intermovie.domain.model.PopularMoviesItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class PopularMoviesItemRepositoryImpl @Inject constructor(
    private val interMovieApiService: InterMovieApiService,
    private val popularMoviesDao: PopularMoviesDao,
    private val popularMoviesItemDao: PopularMoviesItemDao
) : PopularMoviesItemRepository {

    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun getPopularMovies(): Flow<Resource<List<PopularMoviesItem>>> = flow {
        emit(Resource.Loading())
        try {
            fetchAndInsertPopularMovies(interMovieApiService, popularMoviesDao, popularMoviesItemDao)
        } catch (e: HttpException) {
            emit(
                Resource.Error(
                    message = "Oops, something went wrong!"
                )
            )
        } catch (e: IOException) {
            emit(
                Resource.Error(
                    message = "Couldn't reach server, check your internet connection."
                )
            )
        }
        emit(Resource.Success(getPopularMoviesFromDb(popularMoviesItemDao)))
    }

    private suspend fun fetchAndInsertPopularMovies(
        interMovieApiService: InterMovieApiService,
        popularMoviesDao: PopularMoviesDao,
        popularMoviesItemDao: PopularMoviesItemDao
    ) {

        val remotePopularMovies = interMovieApiService.getPopularMovies()
        popularMoviesDao.insertPopularMovieList(remotePopularMovies.toPopularMoviesEntity())
        popularMoviesItemDao.insertPopularMovieItemList(remotePopularMovies.results.map { it.toPopularMoviesItemEntity() })

    }

    private suspend fun getPopularMoviesFromDb(popularMoviesItemDao: PopularMoviesItemDao): List<PopularMoviesItem> {
        return popularMoviesItemDao.getPopularMovieList().map { it.toPopularMoviesItem() }
    }


}