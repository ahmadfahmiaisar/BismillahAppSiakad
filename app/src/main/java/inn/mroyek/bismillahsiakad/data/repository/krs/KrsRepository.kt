package inn.mroyek.bismillahsiakad.data.repository.krs

import dagger.Reusable
import inn.mroyek.bismillahsiakad.data.response.AllKrsResponse
import inn.mroyek.bismillahsiakad.data.response.AllKrsResponse.AllKrs
import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import inn.mroyek.bismillahsiakad.data.service.KrsService
import io.reactivex.Flowable
import io.reactivex.Observable
import javax.inject.Inject

@Reusable
class KrsRepository @Inject constructor(private val service: KrsService) {
    fun getKrsbyUsername(username: String?): Flowable<MutableList<KrsResult>> {
        return service.getKrsbyUsername(username)
            .flatMap { Flowable.fromIterable(it.krs) }
            .toList()
            .toFlowable()
    }

    fun getAllKrs(): Flowable<MutableList<AllKrs>> {
        return service.getAllKrs()
            .flatMap { Flowable.fromIterable(it.krs) }
            .toList()
            .toFlowable()
    }

    fun postStatusKrs(idKrs: String?, status: String?): Observable<String> {
        return service.postStatusKrs(idKrs, status).map { it }
    }
}