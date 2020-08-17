package inn.mroyek.bismillahsiakad.data.request

import com.google.gson.annotations.SerializedName

class DeleteSomeKrsRequest : ArrayList<DeleteSomeKrsRequestItem>()

data class DeleteSomeKrsRequestItem(
    @SerializedName("id_krs")
    val idKrs: Int?
)
