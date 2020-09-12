package inn.mroyek.bismillahsiakad.data.response
import com.google.gson.annotations.SerializedName


data class MatkulResponse(
    @SerializedName("matkul")
    val listMatkul: List<ListMatkul>?
) {
    data class ListMatkul(
        @SerializedName("fk_dosen")
        val fkDosen: String?,
        @SerializedName("fk_kelas")
        val fkKelas: String?,
        @SerializedName("hari")
        val hari: String?,
        @SerializedName("id_dosen")
        val idDosen: String?,
        @SerializedName("id_kelas")
        val idKelas: String?,
        @SerializedName("id_matkul")
        val idMatkul: String?,
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
        @SerializedName("prodi")
        val prodi: String?,
        @SerializedName("rombel")
        val rombel: String?,
        @SerializedName("ruang")
        val ruang: String?,
        @SerializedName("semester")
        val semester: String?,
        @SerializedName("total_sks")
        val totalSks: String?
    )
}