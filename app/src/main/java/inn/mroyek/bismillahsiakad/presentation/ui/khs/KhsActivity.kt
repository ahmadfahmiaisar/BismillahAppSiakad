package inn.mroyek.bismillahsiakad.presentation.ui.khs

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.MySiakad.Companion.pref
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.response.KhsResponse
import inn.mroyek.bismillahsiakad.presentation.model.User
import kotlinx.android.synthetic.main.activity_khs.*
import kotlinx.android.synthetic.main.activity_khs.pg_loading
import kotlinx.android.synthetic.main.activity_krs.*
import kotlinx.android.synthetic.main.profile.*
import javax.inject.Inject

class KhsActivity : AppCompatActivity(), KhsContract {
    @Inject
    lateinit var presenter: KhsPresenter

    private val sharPref = pref
    private val adapterKhs = GroupAdapter<GroupieViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khs)
        presenter.bind(this)
        setUiProfile(sharPref.user)
        iniRv()
        presenter.getKhs(sharPref.user.username, "4")
    }


    override fun getKhs(listKhs: List<KhsResponse.ListKhs>) {
        adapterKhs.clear()
        listKhs.forEach {
            adapterKhs.add(
                KhsAdapter(it)
            )
        }
        adapterKhs.notifyDataSetChanged()
    }

    private fun setUiProfile(user: User) {
        tv_nama.text = user.nama
        tv_nim.text = user.username
        tv_prodi.text = user.prodi
        tv_email.text = user.email
    }

    private fun iniRv() {
        rv_khs.apply {
            layoutManager = LinearLayoutManager(this@KhsActivity)
            adapter = adapterKhs
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    override fun loading(loading: Boolean) {
        pg_loading.visibility = if (loading) View.VISIBLE else View.GONE
    }

    fun goBack(view: View) {
        view.setOnClickListener { finish() }
    }
}