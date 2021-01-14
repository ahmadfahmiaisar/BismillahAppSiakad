package inn.mroyek.bismillahsiakad.presentation.ui.perwalian

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.loadImageStr
import inn.mroyek.bismillahsiakad.common.toastShort
import inn.mroyek.bismillahsiakad.data.response.KrsResponse
import kotlinx.android.synthetic.main.activity_perwalian.*
import kotlinx.android.synthetic.main.profile.*
import javax.inject.Inject

class PerwalianActivity : AppCompatActivity(), PerwalianContract,
    PerwalianAdapter.PerwalianListener {

    @Inject
    lateinit var presenter: PerwalianPresenter
    private val adapterPerwalian = GroupAdapter<GroupieViewHolder>()

    private var idkrs = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perwalian)
        presenter.bind(this)
        initRecycleView()
        pg_loading.visibility = View.GONE
        tvEmpty.visibility = View.VISIBLE
        tvInputNim.visibility = View.VISIBLE
        groupPerwalian.visibility = View.GONE
        searchUsername.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                presenter.getKrsbyUsername(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                tvInputNim.visibility = View.INVISIBLE
                return false
            }

        })
    }

    override fun getKrsByUsername(listKrs: List<KrsResponse.KrsResult?>) {
        groupPerwalian.visibility = View.VISIBLE
        if (listKrs.isEmpty()) tvEmpty.visibility = View.VISIBLE else tvEmpty.visibility = View.GONE
        adapterPerwalian.clear()
        listKrs.forEach {
            adapterPerwalian.add(PerwalianAdapter(it, this, this))
            idkrs = it?.idKrs ?: ""
            setupUiProfile(it?.namaMahasiswa, it?.username, it?.prodi, it?.email, it?.picture)
        }
    }

    private fun setupUiProfile(
        namaMahasiswa: String?,
        username: String?,
        prodi: String?,
        email: String?,
        picture: String?
    ) {
        tv_nama.text = namaMahasiswa
        tv_nim.text = username
        tv_prodi.text = prodi
        tv_email.text = email
        ivPhotoProfile.loadImageStr(picture)
    }

    override fun postStatusKrs(response: String) {
        toastShort("status submitted")
    }

    private fun initRecycleView() {
        rv_perwalian.apply {
            layoutManager = LinearLayoutManager(this@PerwalianActivity)
            adapter = adapterPerwalian
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

    override fun onTindakanPerwalianSelected(status: String) {
        presenter.postStatusKrs(idkrs, status)
    }
}