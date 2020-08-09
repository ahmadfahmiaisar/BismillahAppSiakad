package inn.mroyek.bismillahsiakad.data.service

import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.data.response.KrsResponse
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.*

interface KrsService {
    //Krs . get krs by username
    @GET("krs/getkrsbyusername/{username}")
    fun getKrsbyUsername(@Path("username") username: String?) : Flowable<KrsResponse>

    @Headers("Content-Type: text/html")
    @HTTP(method = "DELETE", path = "krs/getkrs/deletesomekrs", hasBody = true)
//    @DELETE("krs/getkrs/deletesomekrs")
    fun deleteSomeKrs(@Body deleteSomeKrsRequest: DeleteSomeKrsRequest) : Observable<String>
}