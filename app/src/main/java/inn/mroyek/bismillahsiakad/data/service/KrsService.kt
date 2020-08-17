package inn.mroyek.bismillahsiakad.data.service

import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.data.response.DefaultResponse
import inn.mroyek.bismillahsiakad.data.response.KrsResponse
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.*

interface KrsService {
    //Krs . get krs by username
    @GET("krs/getkrsbyusername/{username}")
    fun getKrsbyUsername(@Path("username") username: String?) : Flowable<KrsResponse>

    @HTTP(method = "POST", path = "krs/deletesomekrs", hasBody = true)
    fun deleteSomeKrs(@Body deleteSomeKrsRequest: DeleteSomeKrsRequest) : Observable<DefaultResponse>

    @HTTP(method = "POST", path = "", hasBody = true)
    fun insertKrs()
}