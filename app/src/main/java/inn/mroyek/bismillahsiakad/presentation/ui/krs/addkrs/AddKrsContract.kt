package inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs

import inn.mroyek.bismillahsiakad.data.response.MatkulResponse.ListMatkul
import inn.mroyek.bismillahsiakad.presentation.base.BaseView

interface AddKrsContract : BaseView {
    fun getMatkul(listMatkul: List<ListMatkul?>)
    fun insertKrs(response: String)
}