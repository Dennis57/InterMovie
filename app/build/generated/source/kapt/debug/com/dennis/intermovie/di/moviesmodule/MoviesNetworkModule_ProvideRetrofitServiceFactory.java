package com.dennis.intermovie.di.moviesmodule;

import com.dennis.intermovie.data.source.remote.InterMovieApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class MoviesNetworkModule_ProvideRetrofitServiceFactory implements Factory<InterMovieApiService> {
  private final MoviesNetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public MoviesNetworkModule_ProvideRetrofitServiceFactory(MoviesNetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public InterMovieApiService get() {
    return provideRetrofitService(module, okHttpClientProvider.get());
  }

  public static MoviesNetworkModule_ProvideRetrofitServiceFactory create(MoviesNetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new MoviesNetworkModule_ProvideRetrofitServiceFactory(module, okHttpClientProvider);
  }

  public static InterMovieApiService provideRetrofitService(MoviesNetworkModule instance,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofitService(okHttpClient));
  }
}
