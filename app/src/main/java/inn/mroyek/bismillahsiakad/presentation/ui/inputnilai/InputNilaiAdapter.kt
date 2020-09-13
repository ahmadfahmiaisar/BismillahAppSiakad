package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai

import android.annotation.SuppressLint
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs
import kotlinx.android.synthetic.main.input_nilai.view.*

class InputNilaiAdapter (private val list: ListDhs?, private val listener: ItemSelected) : Item(){
    @SuppressLint("SetTextI18n")
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        val view = viewHolder.itemView
        view.no.text = "${position + 1}"
        view.nim_mahasiswa.text = list?.username
        view.nama_mahasiswa.text = list?.nama
        view.nilai.text = list?.huruf

        view.nilai.setOnClickListener {
            listener.hasSelectedItem(list?.idDhs.toString())
        }
    }

    override fun getLayout(): Int = R.layout.input_nilai

    interface ItemSelected {
        fun hasSelectedItem(idDhs: String)
    }
}