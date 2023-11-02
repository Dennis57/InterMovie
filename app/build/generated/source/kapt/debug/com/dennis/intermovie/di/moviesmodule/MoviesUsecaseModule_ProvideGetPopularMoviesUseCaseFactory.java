package com.dennis.intermovie.di.moviesmodule;

import com.dennis.intermovie.domain.repository.PopularMoviesItemRepository;
import com.dennis.intermovie.domain.usecase.GetPopularMovies;
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
public final class MoviesUsecaseModule_ProvideGetPopularMoviesUseCaseFactory implements Factory<GetPopularMovies> {
  private final MoviesUsecaseModule module;

  private final Provider<PopularMoviesItemRepository> repositoryProvider;

  public MoviesUsecaseModule_ProvideGetPopularMoviesUseCaseFactory(MoviesUsecaseModule module,
      Provider<PopularMoviesItemRepository> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetPopularMovies get() {
    return provideGetPopularMoviesUseCase(module, repositoryProvider.get());
  }

  public static MoviesUsecaseModule_ProvideGetPopularMoviesUseCaseFactory create(
      MoviesUsecaseModule module, Provider<PopularMoviesItemRepository> repositoryProvider) {
    return new MoviesUsecaseModule_ProvideGetPopularMoviesUseCaseFactory(module, repositoryProvider);
  }

  public static GetPopularMovies provideGetPopularMoviesUseCase(MoviesUsecaseModule instance,
      PopularMoviesItemRepository repository) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetPopularMoviesUseCase(repository));
  }
}
