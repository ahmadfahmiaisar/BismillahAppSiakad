package inn.mroyek.bismillahsiakad.presentation.ui.login

import inn.mroyek.bismillahsiakad.data.repository.LoginRepository
import inn.mroyek.bismillahsiakad.presentation.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class LoginPresenter @Inject constructor(private val repository: LoginRepository) :
    BasePresenter<LoginContract>() {
    fun doLogin(douser: String, dopass: String) {
        disposable.add(
            repository.getUser(douser, dopass)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view?.hasLogin("selamat datang ${it.nama} semoga kamu selalu dalam keselamatan dan kesehatan")
                    view?.setPref(it)
                }, {
                    view?.hasnotLogin("terdapat kesalahan atau username dan password tidak ditemukan")
                }
                )
        )
    }

}