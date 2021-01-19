package inn.mroyek.bismillahsiakad.data.repository

import dagger.Reusable
import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest
import inn.mroyek.bismillahsiakad.data.response.AllKrsResponse
import inn.mroyek.bismillahsiakad.data.response.AllKrsResponse.AllKrs
import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import inn.mroyek.bismillahsiakad.data.response.MatkulResponse
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

    //add krs
    fun getMatkul() : Flowable<MutableList<MatkulResponse.ListMatkul>> {
        return service.getMatkul()
            .flatMap { Flowable.fromIterable(it.listMatkul) }
            .toList()
            .toFlowable()
    }

    fun insertKrs(insertKrsRequest: InsertKrsRequest): Observable<String> {
        return service.insertKrs(insertKrsRequest)
            .map { it }
    }

    //delete krs
    fun reduceKrs(deleteSomeKrsRequest: DeleteSomeKrsRequest) : Observable<String>{
        return service.deleteSomeKrs(deleteSomeKrsRequest)
            .map { it }
    }
}