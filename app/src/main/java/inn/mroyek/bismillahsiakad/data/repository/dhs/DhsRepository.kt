package inn.mroyek.bismillahsiakad.data.repository.dhs

import dagger.Reusable
import inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse.ListMatkul
import inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs
import inn.mroyek.bismillahsiakad.data.service.DhsService
import io.reactivex.Flowable
import javax.inject.Inject

@Reusable
class DhsRepository @Inject constructor(private val service: DhsService) {
    fun getDhsByUsername(username: String?): Flowable<MutableList<ListDhs>> {
        return service.getDhsByUsername(username)
            .flatMap { Flowable.fromIterable(it.listDhs) }
            .toList()
            .toFlowable()
    }

    fun getDhsByMatkul(fkmatkul: Int?): Flowable<MutableList<ListDhs>>{
        return service.getDhsByMatkul(fkmatkul)
            .flatMap { Flowable.fromIterable(it.listDhs) }
            .toList()
            .toFlowable()
    }

    fun getAllMatkul(): Flowable<MutableList<ListMatkul>> {
        return service.getAllMatkul()
            .flatMap { Flowable.fromIterable(it.listMatkul) }
            .toList()
            .toFlowable()
    }
}