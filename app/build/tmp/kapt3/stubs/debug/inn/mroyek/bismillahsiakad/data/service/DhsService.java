package inn.mroyek.bismillahsiakad.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Linn/mroyek/bismillahsiakad/data/service/DhsService;", "", "getDhsByUsername", "Lio/reactivex/Flowable;", "Linn/mroyek/bismillahsiakad/data/response/DhsResponse;", "username", "", "app_debug"})
public abstract interface DhsService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "dhs/getdhsbyusername/{username}")
    public abstract io.reactivex.Flowable<inn.mroyek.bismillahsiakad.data.response.DhsResponse> getDhsByUsername(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
}