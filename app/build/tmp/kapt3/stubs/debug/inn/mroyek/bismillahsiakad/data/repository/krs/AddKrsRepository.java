package inn.mroyek.bismillahsiakad.data.repository.krs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Linn/mroyek/bismillahsiakad/data/repository/krs/AddKrsRepository;", "", "service", "Linn/mroyek/bismillahsiakad/data/service/KrsService;", "(Linn/mroyek/bismillahsiakad/data/service/KrsService;)V", "getMatkul", "Lio/reactivex/Flowable;", "", "Linn/mroyek/bismillahsiakad/data/response/MatkulResponse$ListMatkul;", "insertKrs", "Lio/reactivex/Observable;", "", "insertKrsRequest", "Linn/mroyek/bismillahsiakad/data/request/InsertKrsRequest;", "app_debug"})
@dagger.Reusable()
public final class AddKrsRepository {
    private final inn.mroyek.bismillahsiakad.data.service.KrsService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<inn.mroyek.bismillahsiakad.data.response.MatkulResponse.ListMatkul>> getMatkul() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.String> insertKrs(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest insertKrsRequest) {
        return null;
    }
    
    @javax.inject.Inject()
    public AddKrsRepository(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.service.KrsService service) {
        super();
    }
}