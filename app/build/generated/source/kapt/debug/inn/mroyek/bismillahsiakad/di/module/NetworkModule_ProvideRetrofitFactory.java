// Generated by Dagger (https://google.github.io/dagger).
package inn.mroyek.bismillahsiakad.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvideRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideInstance(okHttpClientProvider);
  }

  public static Retrofit provideInstance(Provider<OkHttpClient> okHttpClientProvider) {
    return proxyProvideRetrofit(okHttpClientProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvideRetrofitFactory(okHttpClientProvider);
  }

  public static Retrofit proxyProvideRetrofit(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(
        NetworkModule.provideRetrofit(okHttpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
