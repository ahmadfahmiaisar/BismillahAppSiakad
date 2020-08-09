package inn.mroyek.bismillahsiakad.presentation.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.MySiakad.Companion.pref
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.startNewActivity
import inn.mroyek.bismillahsiakad.common.toastLong
import inn.mroyek.bismillahsiakad.presentation.model.User
import inn.mroyek.bismillahsiakad.presentation.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), LoginContract {

    @Inject lateinit var presenter: LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter.bind(this)

        btn_login.setOnClickListener {
            val edtusername = edt_username.text.toString().trim()
            val edtpassword = edt_password.text.toString().trim()
            presenter.doLogin(edtusername, edtpassword)
        }
    }

    override fun hasLogin(message: String) {
        toastLong(message)
        startNewActivity<HomeActivity>()
    }

    override fun hasnotLogin(message: String) {
        toastLong(message)
    }

    override fun setPref(user: User?) {
        pref.user = user!!
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        presenter.destroy()
        finish()
        finishAffinity()
    }
}