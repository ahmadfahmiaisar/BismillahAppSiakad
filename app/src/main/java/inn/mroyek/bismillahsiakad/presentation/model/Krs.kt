package inn.mroyek.bismillahsiakad.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Krs(
    val hari: String?,
    val id_kelas: String?,
    val id_krs: String?,
    val id_matkul: String?,
    val id_user: String?,
    val jam: String?,
    val keterangan: String?,
    val kode_matkul: String?,
    val nama_matkul: String?,
    val rombel: String?,
    val ruang: String?,
    val semester: String?,
    val tahun: String?,
    val total_sks: String?,
    val username: String?
) : Parcelable
/*
@Parcelize
data class Krs(
    val hari: String?,
    val id_kelas: String?,
    val id_krs: String?,
    val id_matkul: String?,
    val id_user: String?,
    val jam: String?,
    val keterangan: String?,
    val kode_matkul: String?,
    val nama_matkul: String?,
    val rombel: String?,
    val ruang: String?,
    val semester: String?,
    val tahun: String?,
    val total_sks: String?,
    val username: String?
) : Parcelable*/
