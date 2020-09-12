package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai

import inn.mroyek.bismillahsiakad.data.repository.dhs.DhsRepository
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class InputNilaiPresenter @Inject constructor(private val repository: DhsRepository) :
    BasePresenter<InputNilaiContract>() {
    fun getDhsByMatkul(fkmatkul: Int?) {
        disposable.add(
            repository.getDhsByMatkul(fkmatkul)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.getDhsbyMatkul(it)
                }, Throwable::printStackTrace)
        )
    }

    fun getAllMatkul(){
        disposable.add(
            repository.getAllMatkul()
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.getAllMatkul(it)
                }, Throwable::printStackTrace)
        )
    }
}