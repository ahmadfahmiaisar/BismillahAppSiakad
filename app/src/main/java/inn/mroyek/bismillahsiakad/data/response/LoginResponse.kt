package inn.mroyek.bismillahsiakad.data.response


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import inn.mroyek.bismillahsiakad.presentation.model.User
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginResponse(
    @SerializedName("email")
    val email: String?,
    @SerializedName("id_user")
    val idUser: String?,
    @SerializedName("nama")
    val nama: String?,
    @SerializedName("password")
    val password: String?,
    @SerializedName("picture")
    val picture: String?,
    @SerializedName("prodi")
    val prodi: String?,
    @SerializedName("roles")
    val roles: String?,
    @SerializedName("username")
    val username: String?
) : Parcelable {
    fun transform(): User {
        return User(
            idUser = this.idUser,
            email = this.email,
            nama = this.nama,
            password = this.password,
            picture = this.picture,
            prodi = this.prodi,
            roles = this.roles,
            username = this.username
        )
    }
}