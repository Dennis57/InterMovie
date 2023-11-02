package com.dennis.intermovie.di.moviesmodule;

import com.dennis.intermovie.data.source.local.roomdb.InterMovieDatabase;
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesItemDao;
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
public final class MoviesDatabaseModule_ProvideMovieDaoFactory implements Factory<PopularMoviesItemDao> {
  private final MoviesDatabaseModule module;

  private final Provider<InterMovieDatabase> databaseProvider;

  public MoviesDatabaseModule_ProvideMovieDaoFactory(MoviesDatabaseModule module,
      Provider<InterMovieDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public PopularMoviesItemDao get() {
    return provideMovieDao(module, databaseProvider.get());
  }

  public static MoviesDatabaseModule_ProvideMovieDaoFactory create(MoviesDatabaseModule module,
      Provider<InterMovieDatabase> databaseProvider) {
    return new MoviesDatabaseModule_ProvideMovieDaoFactory(module, databaseProvider);
  }

  public static PopularMoviesItemDao provideMovieDao(MoviesDatabaseModule instance,
      InterMovieDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.provideMovieDao(database));
  }
}
