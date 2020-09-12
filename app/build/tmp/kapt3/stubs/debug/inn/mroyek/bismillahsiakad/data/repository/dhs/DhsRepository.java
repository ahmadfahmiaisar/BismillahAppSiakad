package inn.mroyek.bismillahsiakad.data.repository.dhs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J!\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Linn/mroyek/bismillahsiakad/data/repository/dhs/DhsRepository;", "", "service", "Linn/mroyek/bismillahsiakad/data/service/DhsService;", "(Linn/mroyek/bismillahsiakad/data/service/DhsService;)V", "getAllMatkul", "Lio/reactivex/Flowable;", "", "Linn/mroyek/bismillahsiakad/data/response/AllMatkulResponse$ListMatkul;", "getDhsByMatkul", "Linn/mroyek/bismillahsiakad/data/response/DhsResponse$ListDhs;", "fkmatkul", "", "(Ljava/lang/Integer;)Lio/reactivex/Flowable;", "getDhsByUsername", "username", "", "app_debug"})
@dagger.Reusable()
public final class DhsRepository {
    private final inn.mroyek.bismillahsiakad.data.service.DhsService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs>> getDhsByUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs>> getDhsByMatkul(@org.jetbrains.annotations.Nullable()
    java.lang.Integer fkmatkul) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse.ListMatkul>> getAllMatkul() {
        return null;
    }
    
    @javax.inject.Inject()
    public DhsRepository(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.service.DhsService service) {
        super();
    }
}