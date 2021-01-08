package inn.mroyek.bismillahsiakad.data.response

import com.google.gson.annotations.SerializedName

data class AllKrsResponse(
    @SerializedName("krs")
    val krs: List<AllKrs>
) {
    data class AllKrs(
        @SerializedName("email")
        val email: String,
        @SerializedName("fk_dosen")
        val fkDosen: Int,
        @SerializedName("fk_kelas")
        val fkKelas: Int,
        @SerializedName("fk_matkul")
        val fkMatkul: Int,
        @SerializedName("fk_user")
        val fkUser: Int,
        @SerializedName("hari")
        val hari: String,
        @SerializedName("id_kelas")
        val idKelas: Int,
        @SerializedName("id_krs")
        val idKrs: Int,
        @SerializedName("id_matkul")
        val idMatkul: Int,
        @SerializedName("id_user")
        val idUser: Int,
        @SerializedName("jam")
        val jam: Int,
        @SerializedName("keterangan")
        val keterangan: String,
        @SerializedName("kode_matkul")
        val kodeMatkul: Any,
        @SerializedName("nama")
        val nama: String,
        @SerializedName("nama_matkul")
        val namaMatkul: String,
        @SerializedName("picture")
        val picture: String,
        @SerializedName("prodi")
        val prodi: String,
        @SerializedName("roles")
        val roles: String,
        @SerializedName("rombel")
        val rombel: String,
        @SerializedName("ruang")
        val ruang: String,
        @SerializedName("semester")
        val semester: Int,
        @SerializedName("tahun")
        val tahun: Int,
        @SerializedName("total_sks")
        val totalSks: Int,
        @SerializedName("username")
        val username: Long
    )
}
