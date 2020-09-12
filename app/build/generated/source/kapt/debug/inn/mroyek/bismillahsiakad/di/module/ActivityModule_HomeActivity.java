package inn.mroyek.bismillahsiakad.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import inn.mroyek.bismillahsiakad.presentation.ui.home.HomeActivity;

@Module(subcomponents = ActivityModule_HomeActivity.HomeActivitySubcomponent.class)
public abstract class ActivityModule_HomeActivity {
  private ActivityModule_HomeActivity() {}

  @Binds
  @IntoMap
  @ClassKey(HomeActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {}
  }
}
