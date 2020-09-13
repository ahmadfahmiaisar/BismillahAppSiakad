// Generated by Dagger (https://google.github.io/dagger).
package inn.mroyek.bismillahsiakad.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import inn.mroyek.bismillahsiakad.data.service.UserService;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class ServiceModule_ProvideApiServiceFactory implements Factory<UserService> {
  private final Provider<Retrofit> retrofitProvider;

  public ServiceModule_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UserService get() {
    return provideInstance(retrofitProvider);
  }

  public static UserService provideInstance(Provider<Retrofit> retrofitProvider) {
    return proxyProvideApiService(retrofitProvider.get());
  }

  public static ServiceModule_ProvideApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new ServiceModule_ProvideApiServiceFactory(retrofitProvider);
  }

  public static UserService proxyProvideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNull(
        ServiceModule.provideApiService(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}