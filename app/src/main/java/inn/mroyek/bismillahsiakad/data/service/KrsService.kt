package inn.mroyek.bismillahsiakad.data.service

import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest
import inn.mroyek.bismillahsiakad.data.response.AllKrsResponse
import inn.mroyek.bismillahsiakad.data.response.KrsResponse
import inn.mroyek.bismillahsiakad.data.response.MatkulResponse
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.*

interface KrsService {
    //Krs . get krs by username
    @GET("krs/getkrsbyusername/{username}")
    fun getKrsbyUsername(@Path("username") username: String?): Flowable<KrsResponse>

    @Headers("Content-Type: application/json")
    @HTTP(method = "POST", path = "krs/deletesomekrs", hasBody = true)
    fun deleteSomeKrs(@Body deleteSomeKrsRequest: DeleteSomeKrsRequest): Observable<String>

    @GET("krs/getmatkul")
    fun getMatkul(): Flowable<MatkulResponse>

    @HTTP(method = "POST", path = "krs/insertkrs", hasBody = true)
    fun insertKrs(@Body insertKrsRequest: InsertKrsRequest): Observable<String>

    @GET("krs/getkrs")
    fun getAllKrs(): Flowable<AllKrsResponse>

    @FormUrlEncoded
    @HTTP(method = "POST", path = "krs/poststatuskrs", hasBody = true)
    fun postStatusKrs(
        @Field("idkrs") idKrs: String?,
        @Field("status") status: String?
    ): Observable<String>
}