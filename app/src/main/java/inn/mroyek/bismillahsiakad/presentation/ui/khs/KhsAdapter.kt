package inn.mroyek.bismillahsiakad.presentation.ui.khs

import android.annotation.SuppressLint
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.response.KhsResponse.ListKhs
import kotlinx.android.synthetic.main.item_khs.view.*

class KhsAdapter(
    private val khs: ListKhs?
) : Item() {
    @SuppressLint("SetTextI18n")
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        val view = viewHolder.itemView
        view.tv_no.text = "${position + 1}"
        view.tv_kode_matkul.text = khs?.kodeMatkul
        view.tv_nama_matkul.text = khs?.namaMatkul
        view.tv_sks.text = khs?.totalSks
        view.tv_nilai.text = khs?.bobotNilai
    }

    override fun getLayout(): Int = R.layout.item_khs

}