// Generated by Dagger (https://google.github.io/dagger).
package inn.mroyek.bismillahsiakad.data.repository;

import dagger.internal.Factory;
import inn.mroyek.bismillahsiakad.data.service.UserService;
import javax.inject.Provider;

public final class HomeRepository_Factory implements Factory<HomeRepository> {
  private final Provider<UserService> serviceProvider;

  public HomeRepository_Factory(Provider<UserService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public HomeRepository get() {
    return provideInstance(serviceProvider);
  }

  public static HomeRepository provideInstance(Provider<UserService> serviceProvider) {
    return new HomeRepository(serviceProvider.get());
  }

  public static HomeRepository_Factory create(Provider<UserService> serviceProvider) {
    return new HomeRepository_Factory(serviceProvider);
  }

  public static HomeRepository newHomeRepository(UserService service) {
    return new HomeRepository(service);
  }
}