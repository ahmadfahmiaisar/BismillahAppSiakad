package inn.mroyek.bismillahsiakad.data.service

import inn.mroyek.bismillahsiakad.data.response.LoginResponse
import io.reactivex.Observable
import retrofit2.http.*

interface UserService {
    //User . login siakad
    @FormUrlEncoded
    @POST("user/loginsiakad")
    fun postLogin(
        @Field("username") username: String,
        @Field("password") password: String
    ): Observable<LoginResponse>

    @GET("user/getuserbyusername/{username}")
    fun getUserbyUsername(@Path("username") username: String?) : Observable<LoginResponse>

}