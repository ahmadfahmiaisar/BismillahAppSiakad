package inn.mroyek.bismillahsiakad.presentation.ui.khs

import inn.mroyek.bismillahsiakad.data.response.KhsResponse.ListKhs
import inn.mroyek.bismillahsiakad.presentation.base.BaseView

interface KhsContract : BaseView{
    fun getKhs(listKhs: List<ListKhs>)
}