package inn.mroyek.bismillahsiakad.presentation.ui.krs.parent

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.MySiakad.Companion.pref
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.loadImageStr
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

class KrsActivity : AppCompatActivity(), ReduceKrsFragment.ShouldRefreshListener,
    AddKrsFragment.ShouldRefreshListener,
    KrsContract, View.OnClickListener {

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
        setupClickListener()
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
        val statusKrs = mutableListOf<String?>()
        listKrs.forEach {
            adapterKrs.add(
                KrsAdapter(it)
            )
            statusKrs.add(it?.statusKrs)
        }
        statusKrs(statusKrs)
        adapterKrs.notifyDataSetChanged()
    }

    private fun statusKrs(statusKrs: MutableList<String?>) {
        val statusRejected = statusKrs.any { it == "Rejected" }
        val statusAccepted = statusKrs.any { it == "Accepted" }
        when {
            statusRejected && statusAccepted -> {
                tvStatusKrs.text =
                    "beberapa mata kuliah anda belum disetujui oleh pembimbing akademik"
            }
            statusRejected -> {
                tvStatusKrs.text = "KRS Anda belum disetujui oleh pembimbing akademik"
            }
            statusAccepted -> {
                tvStatusKrs.text = "KRS Anda sudah disetujui oleh pembimbing akademik"
            }
            else -> {
                tvStatusKrs.text = "KRS Anda belum disetujui oleh pembimbing akademik"
            }
        }
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

    override fun onRefreshing() {
        presenter.getKrsbyUser(sharPref.user.username)
    }

    private fun setupClickListener() {
        addkrs.setOnClickListener(this)
        reduceKrs.setOnClickListener(this)
        editkrs.setOnClickListener(this)
    }

    private var countClickEdit = 0
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.editkrs -> {
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
            R.id.addkrs -> {
                bottomSheetAddKrsFragment.show(
                    supportFragmentManager,
                    bottomSheetAddKrsFragment.tag
                )
            }
            R.id.reduceKrs -> {
                bottomSheetReduceKrsFragment.show(
                    supportFragmentManager,
                    bottomSheetReduceKrsFragment.tag
                )
            }
        }
    }
}
