package inn.mroyek.bismillahsiakad.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Linn/mroyek/bismillahsiakad/di/module/ServiceModule;", "", "()V", "provideApiService", "Linn/mroyek/bismillahsiakad/data/service/UserService;", "retrofit", "Lretrofit2/Retrofit;", "provideDhsService", "Linn/mroyek/bismillahsiakad/data/service/DhsService;", "provideKrsService", "Linn/mroyek/bismillahsiakad/data/service/KrsService;", "app_debug"})
@dagger.Module()
public final class ServiceModule {
    public static final inn.mroyek.bismillahsiakad.di.module.ServiceModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final inn.mroyek.bismillahsiakad.data.service.UserService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final inn.mroyek.bismillahsiakad.data.service.KrsService provideKrsService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final inn.mroyek.bismillahsiakad.data.service.DhsService provideDhsService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private ServiceModule() {
        super();
    }
}