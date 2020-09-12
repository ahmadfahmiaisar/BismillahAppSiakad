package inn.mroyek.bismillahsiakad.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import inn.mroyek.bismillahsiakad.presentation.ui.inputnilai.InputNilaiActivity;

@Module(subcomponents = ActivityModule_InputActivity.InputNilaiActivitySubcomponent.class)
public abstract class ActivityModule_InputActivity {
  private ActivityModule_InputActivity() {}

  @Binds
  @IntoMap
  @ClassKey(InputNilaiActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputNilaiActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface InputNilaiActivitySubcomponent extends AndroidInjector<InputNilaiActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<InputNilaiActivity> {}
  }
}
