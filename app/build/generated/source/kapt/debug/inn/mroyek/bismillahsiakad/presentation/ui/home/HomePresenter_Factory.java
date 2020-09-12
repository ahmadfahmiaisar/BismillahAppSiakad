// Generated by Dagger (https://google.github.io/dagger).
package inn.mroyek.bismillahsiakad.presentation.ui.home;

import dagger.internal.Factory;
import inn.mroyek.bismillahsiakad.data.repository.HomeRepository;
import javax.inject.Provider;

public final class HomePresenter_Factory implements Factory<HomePresenter> {
  private final Provider<HomeRepository> repositoryProvider;

  public HomePresenter_Factory(Provider<HomeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HomePresenter get() {
    return provideInstance(repositoryProvider);
  }

  public static HomePresenter provideInstance(Provider<HomeRepository> repositoryProvider) {
    return new HomePresenter(repositoryProvider.get());
  }

  public static HomePresenter_Factory create(Provider<HomeRepository> repositoryProvider) {
    return new HomePresenter_Factory(repositoryProvider);
  }

  public static HomePresenter newHomePresenter(HomeRepository repository) {
    return new HomePresenter(repository);
  }
}
