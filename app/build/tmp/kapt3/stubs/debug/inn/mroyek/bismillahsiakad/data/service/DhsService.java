package inn.mroyek.bismillahsiakad.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\fH\'\u00a8\u0006\r"}, d2 = {"Linn/mroyek/bismillahsiakad/data/service/DhsService;", "", "getAllMatkul", "Lio/reactivex/Flowable;", "Linn/mroyek/bismillahsiakad/data/response/AllMatkulResponse;", "getDhsByMatkul", "Linn/mroyek/bismillahsiakad/data/response/DhsResponse;", "fkmatkul", "", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;", "getDhsByUsername", "username", "", "app_debug"})
public abstract interface DhsService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "dhs/getdhsbyusername/{username}")
    public abstract io.reactivex.Flowable<inn.mroyek.bismillahsiakad.data.response.DhsResponse> getDhsByUsername(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "dhs/getdhsbymatkul/{fkmatkul}")
    public abstract io.reactivex.Flowable<inn.mroyek.bismillahsiakad.data.response.DhsResponse> getDhsByMatkul(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "fkmatkul")
    java.lang.Integer fkmatkul);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "dhs/getallmatkul")
    public abstract io.reactivex.Flowable<inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse> getAllMatkul();
}