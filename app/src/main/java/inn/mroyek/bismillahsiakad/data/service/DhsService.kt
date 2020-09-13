package inn.mroyek.bismillahsiakad.data.service

import inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse
import inn.mroyek.bismillahsiakad.data.response.DhsResponse
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.*

interface DhsService {

    @GET("dhs/getdhsbyusername/{username}")
    fun getDhsByUsername(@Path("username") username: String?) : Flowable<DhsResponse>

    @GET("dhs/getdhsbymatkul/{fkmatkul}")
    fun getDhsByMatkul(@Path("fkmatkul") fkmatkul: Int?) : Flowable<DhsResponse>

    @GET("dhs/getallmatkul")
    fun getAllMatkul() : Flowable<AllMatkulResponse>

    @FormUrlEncoded
    @HTTP(method = "POST", path = "dhs/insertnilai/{idDhs}", hasBody = true)
    fun postInputNilai(@Path("idDhs") idDhs: String?, @Field("huruf") huruf: String): Observable<String>
}