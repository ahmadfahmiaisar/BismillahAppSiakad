package inn.mroyek.bismillahsiakad.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsActivity;

@Module(subcomponents = ActivityModule_DhsActivity.DhsActivitySubcomponent.class)
public abstract class ActivityModule_DhsActivity {
  private ActivityModule_DhsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(DhsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DhsActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface DhsActivitySubcomponent extends AndroidInjector<DhsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DhsActivity> {}
  }
}
