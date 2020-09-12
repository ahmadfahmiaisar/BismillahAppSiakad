package inn.mroyek.bismillahsiakad.di.module

import dagger.Module
import dagger.Provides
import inn.mroyek.bismillahsiakad.data.service.DhsService
import inn.mroyek.bismillahsiakad.data.service.KrsService
import inn.mroyek.bismillahsiakad.data.service.UserService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
object ServiceModule {
    @JvmStatic
    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): UserService = retrofit.create(
        UserService::class.java
    )

    @JvmStatic
    @Provides
    @Singleton
    fun provideKrsService(retrofit: Retrofit): KrsService = retrofit.create(
        KrsService::class.java
    )

    @JvmStatic
    @Provides
    @Singleton
    fun provideDhsService(retrofit: Retrofit): DhsService = retrofit.create(
        DhsService::class.java
    )
}