package inn.mroyek.bismillahsiakad.presentation.ui.khs

import inn.mroyek.bismillahsiakad.data.repository.KhsRepository
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class KhsPresenter @Inject constructor(private val repository: KhsRepository) :
    BasePresenter<KhsContract>() {
    fun getKhs(username: String?, semester: String?) {
        disposable.add(
            repository.getkhs(username, semester)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.getKhs(it)
                }, Throwable::printStackTrace)
        )
    }
}