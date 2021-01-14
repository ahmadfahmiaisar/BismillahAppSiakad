package inn.mroyek.bismillahsiakad.data.response

import com.google.gson.annotations.SerializedName


data class KhsResponse(
    @SerializedName("khs")
    val listKhs: List<ListKhs>
) {
    data class ListKhs(
        @SerializedName("bobot_nilai")
        val bobotNilai: Float,
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
        val semester: Int,
        @SerializedName("total_sks")
        val totalSks: Int,
        @SerializedName("username")
        val username: String
    )
}