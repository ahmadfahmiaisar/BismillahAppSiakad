package inn.mroyek.bismillahsiakad.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val idUser: String?,
    val email: String?,
    val nama: String?,
    val username: String?,
    val password: String?,
    val picture: String?,
    val prodi: String?,
    val roles: String?
) : Parcelable {
    companion object {
        const val ID = "id"
        const val NAMA = "nama"
        const val USERNAME = "username"
        const val PRODI = "prodi"
        const val EMAIL = "email"
        const val ROLES = "roles"
        const val PASSWORD = "password"
        const val PICTURE = "picture"
    }
}

