package inn.mroyek.bismillahsiakad.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsFragment

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun reduceKrsFragment() : ReduceKrsFragment
}