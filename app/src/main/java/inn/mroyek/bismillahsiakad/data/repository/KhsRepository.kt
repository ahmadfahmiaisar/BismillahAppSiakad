package inn.mroyek.bismillahsiakad.data.repository

import dagger.Reusable
import inn.mroyek.bismillahsiakad.data.response.KhsResponse.ListKhs
import inn.mroyek.bismillahsiakad.data.service.KhsService
import io.reactivex.Flowable
import javax.inject.Inject

@Reusable
class KhsRepository @Inject constructor(private val service: KhsService) {
    fun getkhs(username: String?, semester: String?): Flowable<MutableList<ListKhs>> {
        return service.getkhs(username, semester)
            .flatMap { Flowable.fromIterable(it.listKhs) }
            .toList()
            .toFlowable()
    }
}