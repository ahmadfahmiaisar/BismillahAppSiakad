package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
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

class InputNilaiActivity : AppCompatActivity(), InputNilaiContract {

    @Inject
    lateinit var presenter: InputNilaiPresenter

    private val adapterInputNilai = GroupAdapter<GroupieViewHolder>()

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
            adapterInputNilai.add(InputNilaiAdapter(it))
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

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }
}