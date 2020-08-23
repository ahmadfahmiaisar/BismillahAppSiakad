package inn.mroyek.bismillahsiakad.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import inn.mroyek.bismillahsiakad.presentation.ui.home.HomeActivity
import inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsActivity
import inn.mroyek.bismillahsiakad.presentation.ui.login.LoginActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun loginActivity() : LoginActivity

    @ContributesAndroidInjector
    abstract fun homeActivity() : HomeActivity

    @ContributesAndroidInjector
    abstract fun krsActivity() : KrsActivity
}