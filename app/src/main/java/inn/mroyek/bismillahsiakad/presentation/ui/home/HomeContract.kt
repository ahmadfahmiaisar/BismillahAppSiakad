package inn.mroyek.bismillahsiakad.presentation.ui.home

import inn.mroyek.bismillahsiakad.presentation.base.BaseView
import inn.mroyek.bismillahsiakad.presentation.model.User

interface HomeContract : BaseView {
    fun getUser(user: User?)
}