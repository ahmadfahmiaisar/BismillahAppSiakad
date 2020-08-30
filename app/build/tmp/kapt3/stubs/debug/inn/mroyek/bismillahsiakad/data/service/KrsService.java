package inn.mroyek.bismillahsiakad.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Linn/mroyek/bismillahsiakad/data/service/KrsService;", "", "deleteSomeKrs", "Lio/reactivex/Observable;", "", "deleteSomeKrsRequest", "Linn/mroyek/bismillahsiakad/data/request/DeleteSomeKrsRequest;", "getKrsbyUsername", "Lio/reactivex/Flowable;", "Linn/mroyek/bismillahsiakad/data/response/KrsResponse;", "username", "getMatkul", "Linn/mroyek/bismillahsiakad/data/response/MatkulResponse;", "insertKrs", "insertKrsRequest", "Linn/mroyek/bismillahsiakad/data/request/InsertKrsRequest;", "app_debug"})
public abstract interface KrsService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "krs/getkrsbyusername/{username}")
    public abstract io.reactivex.Flowable<inn.mroyek.bismillahsiakad.data.response.KrsResponse> getKrsbyUsername(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HTTP(method = "POST", path = "krs/deletesomekrs", hasBody = true)
    public abstract io.reactivex.Observable<java.lang.String> deleteSomeKrs(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest deleteSomeKrsRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "krs/getmatkul")
    public abstract io.reactivex.Flowable<inn.mroyek.bismillahsiakad.data.response.MatkulResponse> getMatkul();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HTTP(method = "POST", path = "krs/insertkrs", hasBody = true)
    public abstract io.reactivex.Observable<java.lang.String> insertKrs(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest insertKrsRequest);
}