package com.dennis.intermovie.di.moviesmodule;

import android.app.Application;
import com.dennis.intermovie.data.source.local.roomdb.InterMovieDatabase;
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
public final class MoviesDatabaseModule_ProvideDatabaseFactory implements Factory<InterMovieDatabase> {
  private final MoviesDatabaseModule module;

  private final Provider<Application> applicationProvider;

  public MoviesDatabaseModule_ProvideDatabaseFactory(MoviesDatabaseModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public InterMovieDatabase get() {
    return provideDatabase(module, applicationProvider.get());
  }

  public static MoviesDatabaseModule_ProvideDatabaseFactory create(MoviesDatabaseModule module,
      Provider<Application> applicationProvider) {
    return new MoviesDatabaseModule_ProvideDatabaseFactory(module, applicationProvider);
  }

  public static InterMovieDatabase provideDatabase(MoviesDatabaseModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideDatabase(application));
  }
}
