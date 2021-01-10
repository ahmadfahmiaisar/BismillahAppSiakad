package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse.ListMatkul
import inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs
import kotlinx.android.synthetic.main.activity_input.*
import javax.inject.Inject

class InputNilaiActivity : AppCompatActivity(), InputNilaiContract, InputNilaiAdapter.ItemSelected {

    @Inject
    lateinit var presenter: InputNilaiPresenter

    private val adapterInputNilai = GroupAdapter<GroupieViewHolder>()
    private var matkul = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
        presenter.bind(this)

        presenter.getAllMatkul()

        setupRecycleView()
    }

    private fun setupRecycleView() {
        rv_inputnilai.apply {
            layoutManager = LinearLayoutManager(this@InputNilaiActivity)
            adapter = adapterInputNilai
        }
    }

    override fun getDhsbyMatkul(listDhs: List<ListDhs>) {
        adapterInputNilai.clear()
        listDhs.forEach {
            adapterInputNilai.add(InputNilaiAdapter(it, this))
        }
        adapterInputNilai.notifyDataSetChanged()
    }

    override fun getAllMatkul(listmatkul: List<ListMatkul>) {
        logD("ISINYA", "$listmatkul")
        val listMatkulnya = mutableListOf<String>()
        listmatkul.forEach {
            listMatkulnya.add(it.namaMatkul)
        }
        val adapter =
            ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listMatkulnya)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                presenter.getDhsByMatkul(listmatkul[p2].id_matkul.toInt())
                matkul = listmatkul[p2].id_matkul.toInt()
                Toast.makeText(
                    this@InputNilaiActivity,
                    "kepilih nih si ${listMatkulnya[p2]}",
                    Toast.LENGTH_LONG
                ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@InputNilaiActivity, "pilih dulu", Toast.LENGTH_LONG).show()
            }

        }
    }

    override fun postInputNilai(response: String) {
        toassin(response)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    override fun hasSelectedItem(idDhs: String) {
        val listNilai = arrayOf("A+", "A", "A-", "B+","B", "B-", "C+", "C", "C-", "D", "E", "K")
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Pilih Nilai")
        builder.setSingleChoiceItems(listNilai, -1) { _, i ->
            presenter.postInputNilai(idDhs, listNilai[i])
        }

        builder.setPositiveButton("Submit") { _, _ ->
            presenter.getDhsByMatkul(matkul)
        }

        val alertDialog = builder.create()
        alertDialog.show()
    }

    private fun toassin(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun goBack(view: View) {}
}