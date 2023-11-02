package com.dennis.intermovie.di.moviesmodule;

import com.dennis.intermovie.data.source.local.roomdb.InterMovieDatabase;
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesDao;
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
public final class MoviesDatabaseModule_ProvidePopularMoviesDaoFactory implements Factory<PopularMoviesDao> {
  private final MoviesDatabaseModule module;

  private final Provider<InterMovieDatabase> databaseProvider;

  public MoviesDatabaseModule_ProvidePopularMoviesDaoFactory(MoviesDatabaseModule module,
      Provider<InterMovieDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public PopularMoviesDao get() {
    return providePopularMoviesDao(module, databaseProvider.get());
  }

  public static MoviesDatabaseModule_ProvidePopularMoviesDaoFactory create(
      MoviesDatabaseModule module, Provider<InterMovieDatabase> databaseProvider) {
    return new MoviesDatabaseModule_ProvidePopularMoviesDaoFactory(module, databaseProvider);
  }

  public static PopularMoviesDao providePopularMoviesDao(MoviesDatabaseModule instance,
      InterMovieDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.providePopularMoviesDao(database));
  }
}
