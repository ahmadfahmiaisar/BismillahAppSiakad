package inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs

import inn.mroyek.bismillahsiakad.data.repository.krs.AddKrsRepository
import inn.mroyek.bismillahsiakad.data.repository.krs.KrsRepository
import inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AddKrsPresenter @Inject constructor(private val repository: AddKrsRepository, private val krsRepository: KrsRepository) :
    BasePresenter<AddKrsContract>() {

    fun getMatkul(){
        disposable.add(
            repository.getMatkul()
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.getMatkul(it)
                }, Throwable::printStackTrace)
        )
    }

    fun insertKrs(insertKrsRequest: InsertKrsRequest) {
        disposable.add(
            repository.insertKrs(insertKrsRequest)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.insertKrs(it)
                }, Throwable::printStackTrace)
        )
    }

    fun getAllKrs() {
        disposable.add(
            krsRepository.getAllKrs()
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.getAllKrs(it)
                }, Throwable::printStackTrace)
        )
    }
}