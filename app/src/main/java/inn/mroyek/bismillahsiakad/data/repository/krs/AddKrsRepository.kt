package inn.mroyek.bismillahsiakad.data.repository.krs

import dagger.Reusable
import inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest
import inn.mroyek.bismillahsiakad.data.response.MatkulResponse.ListMatkul
import inn.mroyek.bismillahsiakad.data.service.KrsService
import io.reactivex.Flowable
import io.reactivex.Observable
import javax.inject.Inject

@Reusable
class AddKrsRepository @Inject constructor(private val service: KrsService) {
    fun getMatkul() : Flowable<MutableList<ListMatkul>> {
        return service.getMatkul()
            .flatMap { Flowable.fromIterable(it.listMatkul) }
            .toList()
            .toFlowable()
    }

    fun insertKrs(insertKrsRequest: InsertKrsRequest): Observable<String> {
        return service.insertKrs(insertKrsRequest)
            .map { it }
    }
}