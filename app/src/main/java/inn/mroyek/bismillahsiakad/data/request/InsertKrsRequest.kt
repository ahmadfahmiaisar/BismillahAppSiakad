package inn.mroyek.bismillahsiakad.data.request
import com.google.gson.annotations.SerializedName


class InsertKrsRequest : ArrayList<InsertKrsRequestItem>()

data class InsertKrsRequestItem(
    @SerializedName("fk_matkul")
    val fkMatkul: Int,
    @SerializedName("fk_user")
    val fkUser: Int,
    @SerializedName("tahun")
    val tahun: String
)