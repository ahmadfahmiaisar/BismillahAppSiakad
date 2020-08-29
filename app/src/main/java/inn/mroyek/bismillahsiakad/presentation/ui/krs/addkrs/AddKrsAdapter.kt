package inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs

import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import inn.mroyek.bismillahsiakad.MySiakad
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest
import inn.mroyek.bismillahsiakad.data.request.InsertKrsRequestItem
import inn.mroyek.bismillahsiakad.data.response.MatkulResponse.ListMatkul
import kotlinx.android.synthetic.main.insert_and_reduce_krs.view.*

class AddKrsAdapter (
    private val listMatkul: ListMatkul?,
    private val listener: ItemMatkulSelectedListener
) : Item() {
    private val sharPref = MySiakad.pref
    interface ItemMatkulSelectedListener {
        fun onItemMatkulSelected(request: InsertKrsRequest)
    }

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        val view = viewHolder.itemView
        view.tv_kode_matkul.text = listMatkul?.kodeMatkul
        view.tv_nama_matkul.text = listMatkul?.namaMatkul
        view.tv_semester.text = listMatkul?.semester
        view.tv_sks.text = listMatkul?.totalSks
        view.tv_rombel.text = listMatkul?.rombel
        view.tv_dosen.text = listMatkul?.ruang
        view.tv_jam.text = listMatkul?.jam
        view.tv_ket.text = listMatkul?.keterangan

        val request = AddKrsFragment.requested
        val item = InsertKrsRequestItem(fkMatkul = listMatkul?.idMatkul!!.toInt(), fkUser = sharPref.user.idUser!!.toInt(), tahun = "2020")
        view.cb_itemkrs.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                request.add(item)
                listener.onItemMatkulSelected(request)
            } else {
                request.remove(item)
                listener.onItemMatkulSelected(request)
            }
        }
    }

    override fun getLayout(): Int = R.layout.insert_and_reduce_krs
}