package inn.mroyek.bismillahsiakad.presentation.ui.perwalian

import android.content.Context
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.common.toastShort
import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import kotlinx.android.synthetic.main.item_perwalian.view.*

class PerwalianAdapter(
    private val krs: KrsResult?,
    private val context: Context,
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

        val listAcc: MutableList<String> = when (krs?.statusKrs) {
            "Accepted" -> mutableListOf("Accepted", "Rejected")
            "Rejected" -> mutableListOf("Rejected", "Accepted")
            else -> mutableListOf("pilih dulu", "Accepted", "Rejected")
        }

        logD("ISINYA", "${krs?.namaMatkul} okeh ${krs?.statusKrs}")
        val adapterTindakan = ArrayAdapter(context, R.layout.support_simple_spinner_dropdown_item, listAcc)
        view.spinnerTindakan.adapter = adapterTindakan
        view.spinnerTindakan.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2 > 0) {
                    listener.onTindakanPerwalianSelected(listAcc[p2])
                } else {
                    context.toastShort("pilih tindakan")
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                context.toastShort("pilih tindakan")
            }

        }
    }

    override fun getLayout(): Int = R.layout.item_perwalian

    interface PerwalianListener {
        fun onTindakanPerwalianSelected(status: String)
    }
}