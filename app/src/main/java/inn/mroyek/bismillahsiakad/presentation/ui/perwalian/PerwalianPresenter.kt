package inn.mroyek.bismillahsiakad.presentation.ui.perwalian

import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.data.repository.krs.KrsRepository
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class PerwalianPresenter @Inject constructor(private val repository: KrsRepository) :
    BasePresenter<PerwalianContract>() {
    fun getKrsbyUsername(username: String?) {
        view?.loading(true)
        disposable.add(
            repository.getKrsbyUsername(username)
                .observeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe({
                    view?.loading(false)
                    view?.getKrsByUsername(it)
                }, {
                    logD("ISI", it.message.toString())
                })!!
        )
    }

    fun postStatusKrs(idKrs: String?, status: String?) {
        disposable.add(
            repository.postStatusKrs(idKrs, status)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.postStatusKrs(it)
                }, Throwable::printStackTrace)
        )
    }
}