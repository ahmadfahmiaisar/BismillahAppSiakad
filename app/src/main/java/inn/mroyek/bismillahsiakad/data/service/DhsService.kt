package inn.mroyek.bismillahsiakad.data.service

import inn.mroyek.bismillahsiakad.data.response.DhsResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface DhsService {

    @GET("dhs/getdhsbyusername/{username}")
    fun getDhsByUsername(@Path("username") username: String?) : Flowable<DhsResponse>
}