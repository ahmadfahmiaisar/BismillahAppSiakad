package inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs

import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.data.repository.krs.DeleteSomeKrsRepository
import inn.mroyek.bismillahsiakad.data.repository.krs.KrsRepository
import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ReduceKrsPresenter @Inject constructor(private val repository: DeleteSomeKrsRepository, private val krsRepository: KrsRepository) : BasePresenter<ReduceKrsContract>() {
    fun reduceSomeKrs(deleteSomeKrsRequest: DeleteSomeKrsRequest) {
        disposable.add(
            repository.reduceKrs(deleteSomeKrsRequest)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.deleteSomeKrs(it)
                }, Throwable::printStackTrace)
        )
    }

    fun getKrsbyUser(username: String?){
        disposable.add(
            krsRepository.getKrsbyUsername(username)
                ?.observeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe({
                    view?.getKrs( it)
                }, {
                    logD("ISI", it.message.toString())
                })!!
        )
    }
}