package inn.mroyek.bismillahsiakad.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsFragment;

@Module(subcomponents = FragmentModule_ReduceKrsFragment.ReduceKrsFragmentSubcomponent.class)
public abstract class FragmentModule_ReduceKrsFragment {
  private FragmentModule_ReduceKrsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ReduceKrsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ReduceKrsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ReduceKrsFragmentSubcomponent extends AndroidInjector<ReduceKrsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ReduceKrsFragment> {}
  }
}
