package inn.mroyek.bismillahsiakad.presentation.ui.krs.parent

import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.data.repository.KrsRepository
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class KrsPresenter @Inject constructor(private val repository: KrsRepository) :
    BasePresenter<KrsContract>() {

    fun getKrsbyUser(username: String?){
        view?.loading(true)
        disposable.add(
            repository.getKrsbyUsername(username)
                .observeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe({
                    view?.loading(false)
                    view?.getKrs(it)
                }, {
                    logD("ISI", it.message.toString())
                })!!
        )
    }
}