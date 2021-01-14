package inn.mroyek.bismillahsiakad.data.response

import com.google.gson.annotations.SerializedName


data class KrsResponse(
    @SerializedName("krs")
    val krs: List<KrsResult>?
) {
    data class KrsResult(
        @SerializedName("hari")
        val hari: String?,
        @SerializedName("id_krs")
        val idKrs: String?,
        @SerializedName("jam")
        val jam: String?,
        @SerializedName("keterangan")
        val keterangan: String?,
        @SerializedName("kode_matkul")
        val kodeMatkul: String?,
        @SerializedName("nama_matkul")
        val namaMatkul: String?,
        @SerializedName("namadosen")
        val namadosen: String?,
        @SerializedName("nama")
        val namaMahasiswa: String?,
        @SerializedName("prodi")
        val prodi: String?,
        @SerializedName("email")
        val email: String?,
        @SerializedName("picture")
        val picture: String?,
        @SerializedName("rombel")
        val rombel: String?,
        @SerializedName("ruang")
        val ruang: String?,
        @SerializedName("semester")
        val semester: String?,
        @SerializedName("tahun")
        val tahun: String?,
        @SerializedName("total_sks")
        val totalSks: String?,
        @SerializedName("username")
        val username: String?
    )
}