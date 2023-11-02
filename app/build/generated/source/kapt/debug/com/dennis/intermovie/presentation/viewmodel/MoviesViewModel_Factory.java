package com.dennis.intermovie.presentation.viewmodel;

import com.dennis.intermovie.domain.usecase.GetPopularMovies;
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
public final class MoviesViewModel_Factory implements Factory<MoviesViewModel> {
  private final Provider<GetPopularMovies> getPopularMoviesProvider;

  public MoviesViewModel_Factory(Provider<GetPopularMovies> getPopularMoviesProvider) {
    this.getPopularMoviesProvider = getPopularMoviesProvider;
  }

  @Override
  public MoviesViewModel get() {
    return newInstance(getPopularMoviesProvider.get());
  }

  public static MoviesViewModel_Factory create(
      Provider<GetPopularMovies> getPopularMoviesProvider) {
    return new MoviesViewModel_Factory(getPopularMoviesProvider);
  }

  public static MoviesViewModel newInstance(GetPopularMovies getPopularMovies) {
    return new MoviesViewModel(getPopularMovies);
  }
}
