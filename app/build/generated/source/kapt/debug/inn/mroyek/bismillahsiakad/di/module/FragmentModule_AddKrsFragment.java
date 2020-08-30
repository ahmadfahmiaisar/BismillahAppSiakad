package inn.mroyek.bismillahsiakad.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsFragment;

@Module(subcomponents = FragmentModule_AddKrsFragment.AddKrsFragmentSubcomponent.class)
public abstract class FragmentModule_AddKrsFragment {
  private FragmentModule_AddKrsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AddKrsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AddKrsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface AddKrsFragmentSubcomponent extends AndroidInjector<AddKrsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AddKrsFragment> {}
  }
}
