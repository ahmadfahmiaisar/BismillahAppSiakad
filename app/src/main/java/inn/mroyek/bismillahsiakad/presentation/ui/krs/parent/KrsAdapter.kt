package inn.mroyek.bismillahsiakad.presentation.ui.krs.parent


import android.annotation.SuppressLint
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import kotlinx.android.synthetic.main.item_krs.view.*

class KrsAdapter (
    private val krs: KrsResult?
) : Item() {
    @SuppressLint("SetTextI18n")
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        val view = viewHolder.itemView
        view.tv_no.text = "${position + 1}"
        view.tv_kode_matkul.text = krs?.kodeMatkul
        view.tv_nama_matkul.text = krs?.namaMatkul
        view.tv_semester.text = krs?.semester
        view.tv_sks.text = krs?.totalSks
        view.tv_rombel.text = krs?.rombel
        view.tv_dosen.text = krs?.namadosen
        view.tv_ruang.text = krs?.ruang
        view.tv_jam.text = krs?.jam
        view.tv_ket.text = krs?.keterangan

    }

    override fun getLayout(): Int = R.layout.item_krs

}