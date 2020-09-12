package inn.mroyek.bismillahsiakad.data.response
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import inn.mroyek.bismillahsiakad.presentation.model.Krs
import kotlinx.android.parcel.Parcelize


data class KrsResponse(
    @SerializedName("krs")
    val krs: List<KrsResult>?
) {
    @Parcelize
    data class KrsResult(
        @SerializedName("hari")
        val hari: String?,
        @SerializedName("id_kelas")
        val idKelas: String?,
        @SerializedName("id_krs")
        val idKrs: String?,
        @SerializedName("id_matkul")
        val idMatkul: String?,
        @SerializedName("id_user")
        val idUser: String?,
        @SerializedName("jam")
        val jam: String?,
        @SerializedName("keterangan")
        val keterangan: String?,
        @SerializedName("kode_matkul")
        val kodeMatkul: String?,
        @SerializedName("nama_matkul")
        val namaMatkul: String?,
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
    ) : Parcelable {
        fun transfrom() : Krs {
            return Krs(
                id_user = this.idUser,
                username = this.username,
                id_krs = this.idKrs,
                tahun = this.tahun,
                id_matkul = this.idMatkul,
                kode_matkul = this.kodeMatkul,
                nama_matkul = this.namaMatkul,
                total_sks = this.totalSks,
                semester = this.semester,
                keterangan = this.keterangan,
                id_kelas = this.idKelas,
                rombel = this.rombel,
                ruang = this.ruang,
                hari = this.hari,
                jam = this.jam
            )
        }
    }
}