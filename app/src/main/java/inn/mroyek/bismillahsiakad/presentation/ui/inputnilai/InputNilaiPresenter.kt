package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai

import inn.mroyek.bismillahsiakad.data.repository.DhsRepository
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class InputNilaiPresenter @Inject constructor(private val repository: DhsRepository) :
        BasePresenter<InputNilaiContract>() {

    fun getDhsByCategories(fkmatkul: String?, semester: String?, tahun: String) {
        disposable.add(
                repository.getDhsByCategories(fkmatkul, semester, tahun)
                        .observeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe({
                            view?.getDhsByCategories(it)
                        }, Throwable::printStackTrace)
        )
    }

    fun getAllMatkul() {
        disposable.add(
                repository.getAllMatkul()
                        .observeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe({
                            view?.getAllMatkul(it)
                        }, Throwable::printStackTrace)
        )
    }

    fun postInputNilai(idDhs: String, huruf: String) {
        disposable.add(
                repository.postInputNilai(idDhs, huruf)
                        .observeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe({
                            view?.postInputNilai(it)
                        }, Throwable::printStackTrace)
        )
    }
}