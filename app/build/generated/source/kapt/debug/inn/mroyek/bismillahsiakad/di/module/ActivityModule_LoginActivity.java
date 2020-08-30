package inn.mroyek.bismillahsiakad.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import inn.mroyek.bismillahsiakad.presentation.ui.login.LoginActivity;

@Module(subcomponents = ActivityModule_LoginActivity.LoginActivitySubcomponent.class)
public abstract class ActivityModule_LoginActivity {
  private ActivityModule_LoginActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LoginActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity> {}
  }
}
