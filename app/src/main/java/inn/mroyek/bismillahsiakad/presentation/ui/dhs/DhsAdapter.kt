package inn.mroyek.bismillahsiakad.presentation.ui.dhs

import android.annotation.SuppressLint
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs
import kotlinx.android.synthetic.main.item_dhs.view.*

class DhsAdapter (
    private val dhs: ListDhs?
) : Item() {
    @SuppressLint("SetTextI18n")
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        val view = viewHolder.itemView
        view.tv_no.text = "$position + 1"
        view.kode_matkul.text = dhs?.kodeMatkul
        view.nama_matkul.text = dhs?.namaMatkul
        view.sks.text = dhs?.totalSks
        view.huruf.text = dhs?.huruf
        view.bobotnilai.text = dhs?.bobotNilai
        view.semester.text = dhs?.semester
        view.tahun.text = dhs?.tahun
    }

    override fun getLayout(): Int = R.layout.item_dhs

}