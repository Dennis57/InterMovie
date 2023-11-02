package com.dennis.intermovie.domain.repository;

import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesDao;
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesItemDao;
import com.dennis.intermovie.data.source.remote.InterMovieApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class PopularMoviesItemRepositoryImpl_Factory implements Factory<PopularMoviesItemRepositoryImpl> {
  private final Provider<InterMovieApiService> interMovieApiServiceProvider;

  private final Provider<PopularMoviesDao> popularMoviesDaoProvider;

  private final Provider<PopularMoviesItemDao> popularMoviesItemDaoProvider;

  public PopularMoviesItemRepositoryImpl_Factory(
      Provider<InterMovieApiService> interMovieApiServiceProvider,
      Provider<PopularMoviesDao> popularMoviesDaoProvider,
      Provider<PopularMoviesItemDao> popularMoviesItemDaoProvider) {
    this.interMovieApiServiceProvider = interMovieApiServiceProvider;
    this.popularMoviesDaoProvider = popularMoviesDaoProvider;
    this.popularMoviesItemDaoProvider = popularMoviesItemDaoProvider;
  }

  @Override
  public PopularMoviesItemRepositoryImpl get() {
    return newInstance(interMovieApiServiceProvider.get(), popularMoviesDaoProvider.get(), popularMoviesItemDaoProvider.get());
  }

  public static PopularMoviesItemRepositoryImpl_Factory create(
      Provider<InterMovieApiService> interMovieApiServiceProvider,
      Provider<PopularMoviesDao> popularMoviesDaoProvider,
      Provider<PopularMoviesItemDao> popularMoviesItemDaoProvider) {
    return new PopularMoviesItemRepositoryImpl_Factory(interMovieApiServiceProvider, popularMoviesDaoProvider, popularMoviesItemDaoProvider);
  }

  public static PopularMoviesItemRepositoryImpl newInstance(
      InterMovieApiService interMovieApiService, PopularMoviesDao popularMoviesDao,
      PopularMoviesItemDao popularMoviesItemDao) {
    return new PopularMoviesItemRepositoryImpl(interMovieApiService, popularMoviesDao, popularMoviesItemDao);
  }
}
