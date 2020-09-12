// Generated by Dagger (https://google.github.io/dagger).
package inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs;

import dagger.internal.Factory;
import inn.mroyek.bismillahsiakad.data.repository.krs.DeleteSomeKrsRepository;
import inn.mroyek.bismillahsiakad.data.repository.krs.KrsRepository;
import javax.inject.Provider;

public final class ReduceKrsPresenter_Factory implements Factory<ReduceKrsPresenter> {
  private final Provider<DeleteSomeKrsRepository> repositoryProvider;

  private final Provider<KrsRepository> krsRepositoryProvider;

  public ReduceKrsPresenter_Factory(
      Provider<DeleteSomeKrsRepository> repositoryProvider,
      Provider<KrsRepository> krsRepositoryProvider) {
    this.repositoryProvider = repositoryProvider;
    this.krsRepositoryProvider = krsRepositoryProvider;
  }

  @Override
  public ReduceKrsPresenter get() {
    return provideInstance(repositoryProvider, krsRepositoryProvider);
  }

  public static ReduceKrsPresenter provideInstance(
      Provider<DeleteSomeKrsRepository> repositoryProvider,
      Provider<KrsRepository> krsRepositoryProvider) {
    return new ReduceKrsPresenter(repositoryProvider.get(), krsRepositoryProvider.get());
  }

  public static ReduceKrsPresenter_Factory create(
      Provider<DeleteSomeKrsRepository> repositoryProvider,
      Provider<KrsRepository> krsRepositoryProvider) {
    return new ReduceKrsPresenter_Factory(repositoryProvider, krsRepositoryProvider);
  }

  public static ReduceKrsPresenter newReduceKrsPresenter(
      DeleteSomeKrsRepository repository, KrsRepository krsRepository) {
    return new ReduceKrsPresenter(repository, krsRepository);
  }
}
