package inn.mroyek.bismillahsiakad.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsActivity;

@Module(subcomponents = ActivityModule_KrsActivity.KrsActivitySubcomponent.class)
public abstract class ActivityModule_KrsActivity {
  private ActivityModule_KrsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(KrsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      KrsActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface KrsActivitySubcomponent extends AndroidInjector<KrsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<KrsActivity> {}
  }
}
