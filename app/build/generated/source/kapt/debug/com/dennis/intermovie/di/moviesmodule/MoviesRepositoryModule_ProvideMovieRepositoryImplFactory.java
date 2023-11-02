package com.dennis.intermovie.di.moviesmodule;

import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesDao;
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesItemDao;
import com.dennis.intermovie.data.source.remote.InterMovieApiService;
import com.dennis.intermovie.domain.repository.PopularMoviesItemRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class MoviesRepositoryModule_ProvideMovieRepositoryImplFactory implements Factory<PopularMoviesItemRepository> {
  private final MoviesRepositoryModule module;

  private final Provider<InterMovieApiService> interMovieApiServiceProvider;

  private final Provider<PopularMoviesDao> popularMoviesDaoProvider;

  private final Provider<PopularMoviesItemDao> popularMoviesItemDaoProvider;

  public MoviesRepositoryModule_ProvideMovieRepositoryImplFactory(MoviesRepositoryModule module,
      Provider<InterMovieApiService> interMovieApiServiceProvider,
      Provider<PopularMoviesDao> popularMoviesDaoProvider,
      Provider<PopularMoviesItemDao> popularMoviesItemDaoProvider) {
    this.module = module;
    this.interMovieApiServiceProvider = interMovieApiServiceProvider;
    this.popularMoviesDaoProvider = popularMoviesDaoProvider;
    this.popularMoviesItemDaoProvider = popularMoviesItemDaoProvider;
  }

  @Override
  public PopularMoviesItemRepository get() {
    return provideMovieRepositoryImpl(module, interMovieApiServiceProvider.get(), popularMoviesDaoProvider.get(), popularMoviesItemDaoProvider.get());
  }

  public static MoviesRepositoryModule_ProvideMovieRepositoryImplFactory create(
      MoviesRepositoryModule module, Provider<InterMovieApiService> interMovieApiServiceProvider,
      Provider<PopularMoviesDao> popularMoviesDaoProvider,
      Provider<PopularMoviesItemDao> popularMoviesItemDaoProvider) {
    return new MoviesRepositoryModule_ProvideMovieRepositoryImplFactory(module, interMovieApiServiceProvider, popularMoviesDaoProvider, popularMoviesItemDaoProvider);
  }

  public static PopularMoviesItemRepository provideMovieRepositoryImpl(
      MoviesRepositoryModule instance, InterMovieApiService interMovieApiService,
      PopularMoviesDao popularMoviesDao, PopularMoviesItemDao popularMoviesItemDao) {
    return Preconditions.checkNotNullFromProvides(instance.provideMovieRepositoryImpl(interMovieApiService, popularMoviesDao, popularMoviesItemDao));
  }
}
