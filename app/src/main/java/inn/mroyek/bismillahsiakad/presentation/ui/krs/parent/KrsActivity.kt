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
import inn.mroyek.bismillahsiakad.common.loadImageStr
import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import inn.mroyek.bismillahsiakad.presentation.model.User
import inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsFragment
import inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsFragment
import inn.mroyek.bismillahsiakad.presentation.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_input.*
import kotlinx.android.synthetic.main.activity_krs.*
import kotlinx.android.synthetic.main.activity_krs.tvEmpty
import kotlinx.android.synthetic.main.fragment_add_krs.*
import kotlinx.android.synthetic.main.profile.*
import javax.inject.Inject

class KrsActivity : AppCompatActivity(), ReduceKrsFragment.ShouldRefreshListener, AddKrsFragment.ShouldRefreshListener,
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

        bottomSheetReduceKrsFragment = ReduceKrsFragment(this)
        bottomSheetAddKrsFragment = AddKrsFragment(this)
        swipeRefresh()
    }

    private fun swipeRefresh() {
        swipeRefreshKrs.setOnRefreshListener {
            presenter.getKrsbyUser(sharPref.user.username)
            swipeRefreshKrs.isRefreshing = false
        }
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
        ivPhotoProfile.loadImageStr(user.picture)
    }

    override fun getKrs(listKrs: List<KrsResult?>) {
        if (listKrs.isEmpty()) tvEmpty.visibility = View.VISIBLE else tvEmpty.visibility = View.GONE
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

    private var countClickEdit = 0
    fun editKrs(view: View) {
        view.setOnClickListener {
            if (countClickEdit == 0) {
                reduceKrs.visibility = View.VISIBLE
                addkrs.visibility = View.VISIBLE
                countClickEdit = 1
            } else if (countClickEdit == 1) {
                reduceKrs.visibility = View.GONE
                addkrs.visibility = View.GONE
                countClickEdit = 0
            }
        }
    }

    override fun onRefreshing() {
        presenter.getKrsbyUser(sharPref.user.username)
    }
}
