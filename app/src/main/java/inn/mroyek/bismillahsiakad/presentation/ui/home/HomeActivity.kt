package inn.mroyek.bismillahsiakad.presentation.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.MySiakad.Companion.pref
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.presentation.model.User
import inn.mroyek.bismillahsiakad.presentation.ui.krs.KrsActivity
import inn.mroyek.bismillahsiakad.presentation.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.profile.*
import javax.inject.Inject

class HomeActivity : AppCompatActivity(), HomeContract {

    @Inject
    lateinit var presenter: HomePresenter

    private val sharepref = pref
    override fun onResume() {
        super.onResume()
        if (sharepref.user.username.isNullOrEmpty()) {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        presenter.bind(this)
        presenter.getUserbyUsername(username = sharepref.user.username)

        iv_krs.setOnClickListener {
            startActivity(Intent(this, KrsActivity::class.java))
        }
    }

    override fun getUser(user: User?) {
        tv_nama.text = user?.nama
        tv_nim.text = user?.username
        tv_prodi.text = user?.prodi
        tv_email.text = user?.email
    }

    fun logout(view: View) {
        view.setOnClickListener {
            pref.logOut()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        finishAffinity()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

}