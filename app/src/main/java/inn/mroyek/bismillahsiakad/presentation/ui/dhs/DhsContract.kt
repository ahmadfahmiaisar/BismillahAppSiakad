package inn.mroyek.bismillahsiakad.presentation.ui.dhs

import inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs
import inn.mroyek.bismillahsiakad.presentation.base.BaseView

interface DhsContract : BaseView{
    fun getDhs(listdhs: List<ListDhs?>)
    fun loading(loading: Boolean)
    fun countIpk(ipk: String)
}