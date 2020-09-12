package inn.mroyek.bismillahsiakad.data.response
import com.google.gson.annotations.SerializedName


data class AllMatkulResponse(
    @SerializedName("matkul")
    val listMatkul: List<ListMatkul>
) {
    data class ListMatkul(
        @SerializedName("id_matkul")
        val id_matkul: String,
        @SerializedName("kode_matkul")
        val kodeMatkul: String,
        @SerializedName("nama_matkul")
        val namaMatkul: String
    )
}