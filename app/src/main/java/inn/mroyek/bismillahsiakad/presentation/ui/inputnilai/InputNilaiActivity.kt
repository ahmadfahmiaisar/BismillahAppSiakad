package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.toastShort
import inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse.ListMatkul
import inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs
import kotlinx.android.synthetic.main.activity_input.*
import javax.inject.Inject

class InputNilaiActivity : AppCompatActivity(), InputNilaiContract, InputNilaiAdapter.ItemSelected {

    @Inject
    lateinit var presenter: InputNilaiPresenter

    private val adapterInputNilai = GroupAdapter<GroupieViewHolder>()
    private var idMatkul = "0"
    private var tahunAjaran = "2020"
    private var semester = "1"
    private val listNamaMatkul = mutableListOf<String>()
    private val listIdMatkul = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
        presenter.bind(this)

        presenter.getAllMatkul()

        setupRecycleView()
    }

    override fun getDhsByCategories(listDhs: List<ListDhs>) {
        if (listDhs.isEmpty()) tvEmpty.visibility = View.VISIBLE else tvEmpty.visibility = View.GONE
        adapterInputNilai.clear()
        listDhs.forEach {
            adapterInputNilai.add(InputNilaiAdapter(it, this))
        }
        adapterInputNilai.notifyDataSetChanged()
    }

    override fun getAllMatkul(listmatkul: List<ListMatkul>) {
        listmatkul.forEach {
            listNamaMatkul.add(it.namaMatkul)
            listIdMatkul.add(it.id_matkul)
        }
        setupSpinner()
    }

    private fun setupSpinner() {
        val listSemester = listOf("pilih semester", "1", "2", "3", "4", "5", "6", "7", "8")
        val listTahunAjaran = listOf("pilih tahun ajaran", "2019", "2020", "2021")
        listNamaMatkul.add(0, "pilih mata kuliah")
        listIdMatkul.add(0, "defaultvalue")
        val adapterSemester = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listSemester)
        val adapterTahunAjaran = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listTahunAjaran)
        val adapterMatkul = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listNamaMatkul)

        spinnerSemester.adapter = adapterSemester
        spinnerTahunAjaran.adapter = adapterTahunAjaran
        spinnerMatkul.adapter = adapterMatkul

        spinnerTahunAjaran.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2 > 0) tahunAjaran = listTahunAjaran[p2] else toastShort("pilih tahun ajaran")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                toastShort("pilih tahun ajaran dulu")
            }

        }
        spinnerSemester.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2 > 0) semester = listSemester[p2] else toastShort("pilih semester")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                toastShort("pilih semester dulu")
            }

        }
        spinnerMatkul.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2 > 0) {
                    idMatkul = listIdMatkul[p2]
                    presenter.getDhsByCategories(idMatkul, semester, tahunAjaran)
                } else {
                    toastShort("pilih mata kuliah")
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                toastShort("pilih matkulnya dulu")
            }

        }

    }

    override fun postInputNilai(response: String) {
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    override fun hasSelectedItem(idDhs: String) {
        val listNilai = arrayOf("A", "A-", "B+", "B", "B-", "C+", "C", "D", "E", "K")
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Pilih Nilai")
        builder.setSingleChoiceItems(listNilai, -1) { _, i ->
            presenter.postInputNilai(idDhs, listNilai[i])
        }

        builder.setPositiveButton("Submit") { _, _ ->
            presenter.getDhsByCategories(idMatkul, semester, tahunAjaran)
            toastShort("nilai berhasil di inputkan")
        }

        val alertDialog = builder.create()
        alertDialog.show()
    }

    private fun setupRecycleView() {
        rv_inputnilai.apply {
            layoutManager = LinearLayoutManager(this@InputNilaiActivity)
            adapter = adapterInputNilai
        }
    }

    fun goBack(view: View) {
        view.setOnClickListener { finish() }
    }
}