package inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs

import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequestItem
import inn.mroyek.bismillahsiakad.data.response.KrsResponse
import kotlinx.android.synthetic.main.insert_and_reduce_krs.view.*

class ReduceKrsAdapter(
    private val krs: KrsResponse.KrsResult?,
    private val listener: ItemKrsSelectedListener
) : Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        val view = viewHolder.itemView
        view.tv_kode_matkul.text = krs?.kodeMatkul
        view.tv_nama_matkul.text = krs?.namaMatkul
        view.tv_semester.text = krs?.semester
        view.tv_sks.text = krs?.totalSks
        view.tv_rombel.text = krs?.rombel
        view.tv_dosen.text = krs?.ruang
        view.tv_jam.text = krs?.jam
        view.tv_ket.text = krs?.keterangan

        val request = ReduceKrsFragment.requested
        val item = DeleteSomeKrsRequestItem(krs?.idKrs?.toInt())
        view.cb_itemkrs.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                request.add(item)
                listener.onItemKrsSelected(request)
            } else {
                request.remove(item)
                listener.onItemKrsSelected(request)
            }

        }

    }

    override fun getLayout(): Int = R.layout.insert_and_reduce_krs

    interface ItemKrsSelectedListener {
        fun onItemKrsSelected(request: DeleteSomeKrsRequest)
    }
}