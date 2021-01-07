package inn.mroyek.bismillahsiakad.data.service

import inn.mroyek.bismillahsiakad.data.response.KhsResponse
import io.reactivex.Flowable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface KhsService {
    @FormUrlEncoded
    @POST("khs/getkhsbyuserandsemester")
    fun getkhs(
        @Field("username") username: String?,
        @Field("semester") semester: String?
    ): Flowable<KhsResponse>
}