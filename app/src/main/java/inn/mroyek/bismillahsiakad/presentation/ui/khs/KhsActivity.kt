package inn.mroyek.bismillahsiakad.presentation.ui.khs

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.MySiakad.Companion.pref
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.loadImageStr
import inn.mroyek.bismillahsiakad.common.toastShort
import inn.mroyek.bismillahsiakad.data.response.KhsResponse
import inn.mroyek.bismillahsiakad.presentation.model.User
import kotlinx.android.synthetic.main.activity_khs.*
import kotlinx.android.synthetic.main.profile.*
import javax.inject.Inject
import kotlin.math.roundToLong

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
        setupSpinner()
        initRecycleView()

    }

    private fun setupSpinner() {
        val listSemester = listOf("pilih semester", "1", "2", "3", "4", "5", "6", "7", "8")
        val adapterSpinner =
            ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listSemester)
        spinner.adapter = adapterSpinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2 > 0) {
                    presenter.getKhs(sharPref.user.username, listSemester[p2])
                } else {
                    toastShort("pilih semester")
                    pg_loading.visibility = View.GONE
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                toastShort("pilih semester dulu")
            }
        }

    }


    override fun getKhs(listKhs: List<KhsResponse.ListKhs>) {
        if (listKhs.isEmpty()) tvEmpty.visibility = View.VISIBLE else tvEmpty.visibility = View.GONE
        adapterKhs.clear()
        listKhs.forEach {
            adapterKhs.add(
                KhsAdapter(it)
            )
        }
        countingIP(listKhs)
        adapterKhs.notifyDataSetChanged()
    }

    private fun setUiProfile(user: User) {
        tv_nama.text = user.nama
        tv_nim.text = user.username
        tv_prodi.text = user.prodi
        tv_email.text = user.email
        ivPhotoProfile.loadImageStr(user.picture)
    }

    private fun initRecycleView() {
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

    @SuppressLint("SetTextI18n")
    private fun countingIP(khs: List<KhsResponse.ListKhs>) {
        var countSks = 0
        var countNilai = 0f
        var countIpk = 0f
        val semester = mutableListOf<Int>()
        khs.forEach {
            countSks += it.totalSks
            countNilai += it.bobotNilai
            semester.add(it.semester)
        }
        val countSemester = semester.max() ?: 0
        val ip = countNilai / countSks
        countIpk += ip
        val ipk = countIpk / countSemester

        tvIP.text = "IP Semester : ${ip.roundToLong()}"
        tvIPK.text = "IPK : ${ipk.roundToLong()}"
    }
}