// Generated by Dagger (https://google.github.io/dagger).
package inn.mroyek.bismillahsiakad.di.module;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideAppContextFactory implements Factory<Context> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideAppContextFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public Context get() {
    return provideInstance(appProvider);
  }

  public static Context provideInstance(Provider<Application> appProvider) {
    return proxyProvideAppContext(appProvider.get());
  }

  public static AppModule_ProvideAppContextFactory create(Provider<Application> appProvider) {
    return new AppModule_ProvideAppContextFactory(appProvider);
  }

  public static Context proxyProvideAppContext(Application app) {
    return Preconditions.checkNotNull(
        AppModule.provideAppContext(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}