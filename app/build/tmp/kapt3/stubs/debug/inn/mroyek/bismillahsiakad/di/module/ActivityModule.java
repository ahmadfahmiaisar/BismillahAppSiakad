package inn.mroyek.bismillahsiakad.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Linn/mroyek/bismillahsiakad/di/module/ActivityModule;", "", "()V", "dhsActivity", "Linn/mroyek/bismillahsiakad/presentation/ui/dhs/DhsActivity;", "homeActivity", "Linn/mroyek/bismillahsiakad/presentation/ui/home/HomeActivity;", "krsActivity", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/parent/KrsActivity;", "loginActivity", "Linn/mroyek/bismillahsiakad/presentation/ui/login/LoginActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract inn.mroyek.bismillahsiakad.presentation.ui.login.LoginActivity loginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract inn.mroyek.bismillahsiakad.presentation.ui.home.HomeActivity homeActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsActivity krsActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsActivity dhsActivity();
    
    public ActivityModule() {
        super();
    }
}