package inn.mroyek.bismillahsiakad.presentation.ui.home

import inn.mroyek.bismillahsiakad.data.repository.HomeRepository
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class HomePresenter @Inject constructor(private val repository: HomeRepository) :
    BasePresenter<HomeContract>() {
    fun getUserbyUsername(username: String?){
        disposable.add(
            repository.getUserbyUsername(username)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.getUser(it)
                }, Throwable::printStackTrace)
        )
    }
}