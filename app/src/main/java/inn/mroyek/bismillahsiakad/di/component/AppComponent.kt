package inn.mroyek.bismillahsiakad.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import inn.mroyek.bismillahsiakad.MySiakad
import inn.mroyek.bismillahsiakad.di.module.*
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,
    AppModule::class,
    NetworkModule::class,
    ActivityModule::class,
    FragmentModule::class,
    ServiceModule::class]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application) : Builder

        fun build() : AppComponent
    }
    fun inject(app: MySiakad)
}