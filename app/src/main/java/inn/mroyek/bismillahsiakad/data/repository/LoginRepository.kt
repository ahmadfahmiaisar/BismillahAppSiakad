package inn.mroyek.bismillahsiakad.data.repository

import dagger.Reusable
import inn.mroyek.bismillahsiakad.data.service.UserService
import inn.mroyek.bismillahsiakad.presentation.model.User
import io.reactivex.Observable
import javax.inject.Inject

@Reusable
class LoginRepository @Inject constructor(private val service: UserService) {
    fun getUser(username: String, password: String): Observable<User> {
        return service.postLogin(username, password)
            .map { it.transform() }
    }
}
