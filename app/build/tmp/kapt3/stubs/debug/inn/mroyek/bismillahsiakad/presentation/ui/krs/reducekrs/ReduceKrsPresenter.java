package inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/krs/reducekrs/ReduceKrsPresenter;", "Linn/mroyek/bismillahsiakad/presentation/base/BasePresenter;", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/reducekrs/ReduceKrsContract;", "repository", "Linn/mroyek/bismillahsiakad/data/repository/krs/DeleteSomeKrsRepository;", "krsRepository", "Linn/mroyek/bismillahsiakad/data/repository/krs/KrsRepository;", "(Linn/mroyek/bismillahsiakad/data/repository/krs/DeleteSomeKrsRepository;Linn/mroyek/bismillahsiakad/data/repository/krs/KrsRepository;)V", "getKrsbyUser", "", "username", "", "reduceSomeKrs", "deleteSomeKrsRequest", "Linn/mroyek/bismillahsiakad/data/request/DeleteSomeKrsRequest;", "app_debug"})
public final class ReduceKrsPresenter extends inn.mroyek.bismillahsiakad.presentation.base.BasePresenter<inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsContract> {
    private final inn.mroyek.bismillahsiakad.data.repository.krs.DeleteSomeKrsRepository repository = null;
    private final inn.mroyek.bismillahsiakad.data.repository.krs.KrsRepository krsRepository = null;
    
    public final void reduceSomeKrs(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest deleteSomeKrsRequest) {
    }
    
    public final void getKrsbyUser(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
    }
    
    @javax.inject.Inject()
    public ReduceKrsPresenter(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.repository.krs.DeleteSomeKrsRepository repository, @org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.repository.krs.KrsRepository krsRepository) {
        super();
    }
}