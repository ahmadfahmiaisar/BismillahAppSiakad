package inn.mroyek.bismillahsiakad.data.repository

import dagger.Reusable
import inn.mroyek.bismillahsiakad.data.service.UserService
import inn.mroyek.bismillahsiakad.presentation.model.User
import io.reactivex.Observable
import javax.inject.Inject

@Reusable
class HomeRepository @Inject constructor(private val service: UserService) {
    fun getUserbyUsername(username: String?): Observable<User> {
        return service.getUserbyUsername(username)
            .map { it.transform() }
    }
}