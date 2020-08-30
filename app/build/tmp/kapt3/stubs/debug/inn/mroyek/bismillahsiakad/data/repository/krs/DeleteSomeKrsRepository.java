package inn.mroyek.bismillahsiakad.data.repository.krs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Linn/mroyek/bismillahsiakad/data/repository/krs/DeleteSomeKrsRepository;", "", "service", "Linn/mroyek/bismillahsiakad/data/service/KrsService;", "(Linn/mroyek/bismillahsiakad/data/service/KrsService;)V", "reduceKrs", "Lio/reactivex/Observable;", "", "deleteSomeKrsRequest", "Linn/mroyek/bismillahsiakad/data/request/DeleteSomeKrsRequest;", "app_debug"})
@dagger.Reusable()
public final class DeleteSomeKrsRepository {
    private final inn.mroyek.bismillahsiakad.data.service.KrsService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.String> reduceKrs(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest deleteSomeKrsRequest) {
        return null;
    }
    
    @javax.inject.Inject()
    public DeleteSomeKrsRepository(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.service.KrsService service) {
        super();
    }
}