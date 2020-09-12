package inn.mroyek.bismillahsiakad.data.local.sharepref

import android.content.Context
import android.content.SharedPreferences
import inn.mroyek.bismillahsiakad.presentation.model.User

class PrefManager (context: Context) {
    companion object {
        const val keySharPref = "bismillahsiakad.pref"
    }

    private val sharePref: SharedPreferences by lazy {
        context.getSharedPreferences(keySharPref, Context.MODE_PRIVATE)
    }
    private val prefEditor: SharedPreferences.Editor by lazy {
        sharePref.edit()
    }

    var user: User
        set(value) {
            prefEditor.putString(User.ID, value.idUser)
            prefEditor.putString(User.NAMA, value.nama)
            prefEditor.putString(User.USERNAME, value.username)
            prefEditor.putString(User.PRODI, value.prodi)
            prefEditor.putString(User.EMAIL, value.email)
            prefEditor.putString(User.ROLES, value.roles)
            prefEditor.putString(User.PICTURE, value.picture)
            prefEditor.putString(User.PASSWORD, "di bagian prefmanager")
            prefEditor.apply()
        }
    get() {
        return User(
            idUser = sharePref.getString(
                User.ID,
                null
            ),
            nama = sharePref.getString(
                User.NAMA,
                null
            ),
            username = sharePref.getString(
                User.USERNAME,
                null
            ),
            prodi = sharePref.getString(
                User.PRODI,
                null
            ),
            email = sharePref.getString(
                User.EMAIL,
                null
            ),
            roles = sharePref.getString(
                User.ROLES,
                null
            ),
            picture = sharePref.getString(
                User.PICTURE,
                null
            ),
            password = sharePref.getString(
                User.PASSWORD,
                null
            )
        )
    }

    fun logOut(){
        prefEditor.clear().apply()
    }
}