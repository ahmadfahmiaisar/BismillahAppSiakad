package inn.mroyek.bismillahsiakad.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {

    @JvmStatic
    @Singleton
    @Provides
    fun provideAppContext(app: Application): Context = app.applicationContext
}