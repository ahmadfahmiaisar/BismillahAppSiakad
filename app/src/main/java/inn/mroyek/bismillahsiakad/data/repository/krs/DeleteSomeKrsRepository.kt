package inn.mroyek.bismillahsiakad.data.repository.krs

import dagger.Reusable
import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.data.response.DefaultStringResponse
import inn.mroyek.bismillahsiakad.data.service.KrsService
import io.reactivex.Observable
import javax.inject.Inject

@Reusable
class DeleteSomeKrsRepository @Inject constructor(private val service: KrsService) {
    fun reduceKrs(deleteSomeKrsRequest: DeleteSomeKrsRequest) : Observable<DefaultStringResponse>{
        return service.deleteSomeKrs(deleteSomeKrsRequest)
            .map { it }
    }
}