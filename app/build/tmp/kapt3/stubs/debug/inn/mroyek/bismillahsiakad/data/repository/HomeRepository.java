package inn.mroyek.bismillahsiakad.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Linn/mroyek/bismillahsiakad/data/repository/HomeRepository;", "", "service", "Linn/mroyek/bismillahsiakad/data/service/UserService;", "(Linn/mroyek/bismillahsiakad/data/service/UserService;)V", "getUserbyUsername", "Lio/reactivex/Observable;", "Linn/mroyek/bismillahsiakad/presentation/model/User;", "username", "", "app_debug"})
@dagger.Reusable()
public final class HomeRepository {
    private final inn.mroyek.bismillahsiakad.data.service.UserService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<inn.mroyek.bismillahsiakad.presentation.model.User> getUserbyUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeRepository(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.service.UserService service) {
        super();
    }
}