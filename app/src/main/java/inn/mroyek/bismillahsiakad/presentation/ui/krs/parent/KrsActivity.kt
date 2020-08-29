package inn.mroyek.bismillahsiakad.presentation.ui.krs.parent

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.MySiakad.Companion.pref
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import inn.mroyek.bismillahsiakad.presentation.model.User
import inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsFragment
import inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsFragment
import inn.mroyek.bismillahsiakad.presentation.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_krs.*
import kotlinx.android.synthetic.main.profile.*
import javax.inject.Inject

class KrsActivity : AppCompatActivity(),
    KrsContract {

    @Inject
    lateinit var presenter: KrsPresenter

    private val sharPref = pref

    private val adapterKrs = GroupAdapter<GroupieViewHolder>()

    private lateinit var bottomSheetReduceKrsFragment: ReduceKrsFragment
    private lateinit var bottomSheetAddKrsFragment: AddKrsFragment

    override fun onResume() {
        super.onResume()
        if (sharPref.user.username.isNullOrEmpty()) {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_krs)

        presenter.bind(this)
        presenter.getKrsbyUser(sharPref.user.username)
//        presenter.getKrsbyUser("12345")
        setUiProfile(sharPref.user)
        initRv()

        bottomSheetReduceKrsFragment = ReduceKrsFragment()
        bottomSheetAddKrsFragment = AddKrsFragment()
    }

    private fun initRv() {
        rv_krs.apply {
            layoutManager = LinearLayoutManager(this@KrsActivity)
            adapter = adapterKrs
        }
    }

    private fun setUiProfile(user: User) {
        tv_nama.text = user.nama
        tv_nim.text = user.username
        tv_prodi.text = user.prodi
        tv_email.text = user.email
    }

    override fun getKrs(listKrs: List<KrsResult?>) {
        logD("ISIKRS", Gson().toJson(listKrs))
        adapterKrs.clear()
        listKrs.forEach {
            adapterKrs.add(
                KrsAdapter(it)
            )
        }
        adapterKrs.notifyDataSetChanged()
    }

    override fun loading(loading: Boolean) {
        pg_loading.visibility = if (loading) View.VISIBLE else View.GONE
    }

    fun goBack(view: View) {
        view.setOnClickListener { finish() }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    fun addKrs(view: View) {
        view.setOnClickListener {
            bottomSheetAddKrsFragment.show(
                supportFragmentManager,
                bottomSheetAddKrsFragment.tag
            )
        }
    }

    fun reduceKrs(view: View) {
        view.setOnClickListener {
            bottomSheetReduceKrsFragment.show(
                supportFragmentManager,
                bottomSheetReduceKrsFragment.tag
            )
        }
    }

}
