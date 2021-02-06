package inn.mroyek.bismillahsiakad.presentation.ui.perwalian

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.toastShort
import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import kotlinx.android.synthetic.main.item_perwalian.view.*

class PerwalianAdapter(
    private val krs: KrsResult?,
    private val listener: PerwalianListener
) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        val view = viewHolder.itemView
        view.tv_kode_matkul.text = krs?.kodeMatkul
        view.tv_nama_matkul.text = krs?.namaMatkul
        view.tv_rombel.text = krs?.rombel
        view.dosen.text = krs?.namadosen
        view.tv_semester.text = krs?.semester
        view.tv_sks.text = krs?.totalSks

        val listAcc = when (krs?.statusKrs) {
            "Accepted" -> mutableListOf("Accepted", "Rejected")
            "Rejected" -> mutableListOf("Rejected", "Accepted")
            else -> mutableListOf("pilih dulu", "Accepted", "Rejected")
        }
        val adapterTindakan = ArrayAdapter(
            view.layout.context,
            R.layout.support_simple_spinner_dropdown_item,
            listAcc
        )

        view.spinnerTindakan.adapter = adapterTindakan
        view.spinnerTindakan.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (listAcc[0].contains("pilih dulu")
                    || listAcc[0].contains("Accepted")
                    || listAcc[0].contains("Rejected")
                ) {
                    if (p2 > 0) {
                        listener.onTindakanPerwalianSelected(krs?.idKrs, listAcc[p2])
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                view.layout.context.toastShort("pilih tindakan")
            }
        }
    }

    override fun getLayout(): Int = R.layout.item_perwalian

    interface PerwalianListener {
        fun onTindakanPerwalianSelected(idkrs: String?, status: String)
    }
}