package inn.mroyek.bismillahsiakad.presentation.ui.dhs

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.MySiakad.Companion.pref
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.loadImageStr
import inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs
import inn.mroyek.bismillahsiakad.presentation.model.User
import kotlinx.android.synthetic.main.activity_dhs.*
import kotlinx.android.synthetic.main.activity_dhs.pg_loading
import kotlinx.android.synthetic.main.activity_krs.*
import kotlinx.android.synthetic.main.profile.*
import javax.inject.Inject

class DhsActivity : AppCompatActivity(), DhsContract {

    @Inject
    lateinit var presenter: DhsPresenter

    private val sharePref = pref

    private val adapterDhs = GroupAdapter<GroupieViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dhs)

        presenter.bind(this)
        presenter.getDhsByUsername(sharePref.user.username)
        setUiProfile(sharePref.user)
        initRv()
    }

    private fun initRv() {
        rv_dhs.apply {
            layoutManager = LinearLayoutManager(this@DhsActivity)
            adapter = adapterDhs
        }
    }

    private fun setUiProfile(user: User) {
        tv_nama.text = user.nama
        tv_nim.text = user.username
        tv_prodi.text = user.prodi
        tv_email.text = user.email
        ivPhotoProfile.loadImageStr(user.picture)
    }

    fun goBack(view: View) { view.setOnClickListener { finish() }}

    override fun getDhs(listdhs: List<ListDhs?>) {
        adapterDhs.clear()
        listdhs.forEach {
            adapterDhs.add(DhsAdapter(it))
        }
        adapterDhs.notifyDataSetChanged()
    }

    override fun loading(loading: Boolean) {
        pg_loading.visibility = if (loading) View.VISIBLE else View.GONE
    }

    override fun countIpk(ipk: String) {
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }
}