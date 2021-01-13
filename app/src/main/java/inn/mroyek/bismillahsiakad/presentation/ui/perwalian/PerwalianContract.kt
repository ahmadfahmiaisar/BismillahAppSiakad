package inn.mroyek.bismillahsiakad.presentation.ui.perwalian

import inn.mroyek.bismillahsiakad.data.response.KrsResponse
import inn.mroyek.bismillahsiakad.presentation.base.BaseView

interface PerwalianContract : BaseView {
    fun getKrsByUsername(listKrs: List<KrsResponse.KrsResult?>)
    fun postStatusKrs(response: String)
    fun loading(loading: Boolean)
}