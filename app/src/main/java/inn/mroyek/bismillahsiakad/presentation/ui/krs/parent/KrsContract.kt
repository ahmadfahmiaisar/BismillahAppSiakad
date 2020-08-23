package inn.mroyek.bismillahsiakad.presentation.ui.krs.parent

import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import inn.mroyek.bismillahsiakad.presentation.base.BaseView

interface KrsContract : BaseView {
    fun getKrs(listKrs: List<KrsResult?>)
    fun loading(loading: Boolean)
}