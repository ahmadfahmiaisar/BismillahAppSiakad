package inn.mroyek.bismillahsiakad.presentation.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00bd\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u00103\u001a\u000204H\u00d6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u000204H\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000204H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014\u00a8\u0006@"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/model/Krs;", "Landroid/os/Parcelable;", "hari", "", "id_kelas", "id_krs", "id_matkul", "id_user", "jam", "keterangan", "kode_matkul", "nama_matkul", "rombel", "ruang", "semester", "tahun", "total_sks", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHari", "()Ljava/lang/String;", "getId_kelas", "getId_krs", "getId_matkul", "getId_user", "getJam", "getKeterangan", "getKode_matkul", "getNama_matkul", "getRombel", "getRuang", "getSemester", "getTahun", "getTotal_sks", "getUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Krs implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hari = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id_kelas = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id_krs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id_matkul = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id_user = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String jam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String keterangan = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String kode_matkul = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nama_matkul = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rombel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ruang = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String semester = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tahun = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String total_sks = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String username = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHari() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId_kelas() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId_krs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId_matkul() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId_user() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKeterangan() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKode_matkul() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNama_matkul() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRombel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRuang() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSemester() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTahun() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal_sks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public Krs(@org.jetbrains.annotations.Nullable()
    java.lang.String hari, @org.jetbrains.annotations.Nullable()
    java.lang.String id_kelas, @org.jetbrains.annotations.Nullable()
    java.lang.String id_krs, @org.jetbrains.annotations.Nullable()
    java.lang.String id_matkul, @org.jetbrains.annotations.Nullable()
    java.lang.String id_user, @org.jetbrains.annotations.Nullable()
    java.lang.String jam, @org.jetbrains.annotations.Nullable()
    java.lang.String keterangan, @org.jetbrains.annotations.Nullable()
    java.lang.String kode_matkul, @org.jetbrains.annotations.Nullable()
    java.lang.String nama_matkul, @org.jetbrains.annotations.Nullable()
    java.lang.String rombel, @org.jetbrains.annotations.Nullable()
    java.lang.String ruang, @org.jetbrains.annotations.Nullable()
    java.lang.String semester, @org.jetbrains.annotations.Nullable()
    java.lang.String tahun, @org.jetbrains.annotations.Nullable()
    java.lang.String total_sks, @org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final inn.mroyek.bismillahsiakad.presentation.model.Krs copy(@org.jetbrains.annotations.Nullable()
    java.lang.String hari, @org.jetbrains.annotations.Nullable()
    java.lang.String id_kelas, @org.jetbrains.annotations.Nullable()
    java.lang.String id_krs, @org.jetbrains.annotations.Nullable()
    java.lang.String id_matkul, @org.jetbrains.annotations.Nullable()
    java.lang.String id_user, @org.jetbrains.annotations.Nullable()
    java.lang.String jam, @org.jetbrains.annotations.Nullable()
    java.lang.String keterangan, @org.jetbrains.annotations.Nullable()
    java.lang.String kode_matkul, @org.jetbrains.annotations.Nullable()
    java.lang.String nama_matkul, @org.jetbrains.annotations.Nullable()
    java.lang.String rombel, @org.jetbrains.annotations.Nullable()
    java.lang.String ruang, @org.jetbrains.annotations.Nullable()
    java.lang.String semester, @org.jetbrains.annotations.Nullable()
    java.lang.String tahun, @org.jetbrains.annotations.Nullable()
    java.lang.String total_sks, @org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}