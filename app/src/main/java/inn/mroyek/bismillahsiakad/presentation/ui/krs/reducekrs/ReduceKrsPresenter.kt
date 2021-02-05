package inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs

import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.data.repository.KrsRepository
import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ReduceKrsPresenter @Inject constructor(
    private val repository: KrsRepository
) : BasePresenter<ReduceKrsContract>() {
    fun reduceSomeKrs(deleteSomeKrsRequest: DeleteSomeKrsRequest) {
        disposable.add(
            repository.reduceKrs(deleteSomeKrsRequest)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view!!.deleteSomeKrs(it)
                }, {
                    logD("ISINYAERROR", "$it")
                })
        )
    }

    fun getKrsbyUser(username: String?) {
        disposable.add(
            repository.getKrsbyUsername(username)
                ?.observeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe({
                    view?.getKrs(it)
                }, {
                    logD("ISI", it.message.toString())
                })!!
        )
    }
}