package inn.mroyek.bismillahsiakad.data.repository.dhs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Linn/mroyek/bismillahsiakad/data/repository/dhs/DhsRepository;", "", "service", "Linn/mroyek/bismillahsiakad/data/service/DhsService;", "(Linn/mroyek/bismillahsiakad/data/service/DhsService;)V", "getDhsByUsername", "Lio/reactivex/Flowable;", "", "Linn/mroyek/bismillahsiakad/data/response/DhsResponse$ListDhs;", "username", "", "app_debug"})
@dagger.Reusable()
public final class DhsRepository {
    private final inn.mroyek.bismillahsiakad.data.service.DhsService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs>> getDhsByUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    @javax.inject.Inject()
    public DhsRepository(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.service.DhsService service) {
        super();
    }
}