package inn.mroyek.bismillahsiakad.data.response

import com.google.gson.annotations.SerializedName


data class DhsResponse(
    @SerializedName("dhs")
    val listDhs: List<ListDhs>
) {
    data class ListDhs(
        @SerializedName("bobot_nilai")
        val bobotNilai: Float,
        @SerializedName("email")
        val email: String,
        @SerializedName("fk_dosen")
        val fkDosen: String,
        @SerializedName("fk_kelas")
        val fkKelas: String,
        @SerializedName("fk_krs")
        val fkKrs: String,
        @SerializedName("fk_matkul")
        val fkMatkul: String,
        @SerializedName("fk_user")
        val fkUser: String,
        @SerializedName("huruf")
        val huruf: String,
        @SerializedName("id_dhs")
        val idDhs: String,
        @SerializedName("id_krs")
        val idKrs: String,
        @SerializedName("id_matkul")
        val idMatkul: String,
        @SerializedName("id_user")
        val idUser: String,
        @SerializedName("keterangan")
        val keterangan: String,
        @SerializedName("kode_matkul")
        val kodeMatkul: String,
        @SerializedName("nama")
        val nama: String,
        @SerializedName("nama_matkul")
        val namaMatkul: String,
        @SerializedName("password")
        val password: String,
        @SerializedName("picture")
        val picture: String,
        @SerializedName("prodi")
        val prodi: String,
        @SerializedName("roles")
        val roles: String,
        @SerializedName("semester")
        val semester: String,
        @SerializedName("tahun")
        val tahun: String,
        @SerializedName("total_sks")
        val totalSks: String,
        @SerializedName("username")
        val username: String
    )
}