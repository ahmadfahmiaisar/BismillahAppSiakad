package inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs

import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import inn.mroyek.bismillahsiakad.presentation.base.BaseView

interface ReduceKrsContract : BaseView {
    fun getKrs(listKrs: List<KrsResult?>)
    fun deleteSomeKrs(sukses: String)
}