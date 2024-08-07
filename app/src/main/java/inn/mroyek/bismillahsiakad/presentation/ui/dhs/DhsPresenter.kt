package inn.mroyek.bismillahsiakad.presentation.ui.dhs

import inn.mroyek.bismillahsiakad.data.repository.DhsRepository
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class DhsPresenter @Inject constructor(private val repository: DhsRepository) :
    BasePresenter<DhsContract>() {

    fun getDhsByUsername(username: String?) {
        view?.loading(true)
        disposable.add(
            repository.getDhsByUsername(username)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.loading(false)
                    view?.getDhs(it)
                }, Throwable::printStackTrace)
        )
    }

    fun countIpk(totalNilai: Float, totalSks: Int) {
        val ip = totalNilai / totalSks
        
    }
}