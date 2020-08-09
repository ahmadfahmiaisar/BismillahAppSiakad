package inn.mroyek.bismillahsiakad.presentation.ui.login

import inn.mroyek.bismillahsiakad.presentation.base.BaseView
import inn.mroyek.bismillahsiakad.presentation.model.User

interface LoginContract : BaseView {
    fun hasLogin(message: String)
    fun hasnotLogin(message: String)
    fun setPref(user: User?)
}