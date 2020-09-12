package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai

import inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse.ListMatkul
import inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs
import inn.mroyek.bismillahsiakad.presentation.base.BaseView

interface InputNilaiContract : BaseView {
    fun getDhsbyMatkul(listDhs: List<ListDhs>)
    fun getAllMatkul(listmatkul: List<ListMatkul>)
}