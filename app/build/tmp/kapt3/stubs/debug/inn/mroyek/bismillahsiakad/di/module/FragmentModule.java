package inn.mroyek.bismillahsiakad.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Linn/mroyek/bismillahsiakad/di/module/FragmentModule;", "", "()V", "addKrsFragment", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsFragment;", "reduceKrsFragment", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/reducekrs/ReduceKrsFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsFragment reduceKrsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsFragment addKrsFragment();
    
    public FragmentModule() {
        super();
    }
}