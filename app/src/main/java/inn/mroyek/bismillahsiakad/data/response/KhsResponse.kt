package inn.mroyek.bismillahsiakad.data.response

import com.google.gson.annotations.SerializedName


data class KhsResponse(
    @SerializedName("khs")
    val listKhs: List<ListKhs>
) {
    data class ListKhs(
        @SerializedName("bobot_nilai")
        val bobotNilai: String,
        @SerializedName("huruf")
        val huruf: String,
        @SerializedName("kode_matkul")
        val kodeMatkul: String,
        @SerializedName("nama")
        val nama: String,
        @SerializedName("nama_matkul")
        val namaMatkul: String,
        @SerializedName("prodi")
        val prodi: String,
        @SerializedName("semester")
        val semester: String,
        @SerializedName("total_sks")
        val totalSks: String,
        @SerializedName("username")
        val username: String
    )
}