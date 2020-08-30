package inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH&\u00a8\u0006\n"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/krs/reducekrs/ReduceKrsContract;", "Linn/mroyek/bismillahsiakad/presentation/base/BaseView;", "deleteSomeKrs", "", "response", "", "getKrs", "listKrs", "", "Linn/mroyek/bismillahsiakad/data/response/KrsResponse$KrsResult;", "app_debug"})
public abstract interface ReduceKrsContract extends inn.mroyek.bismillahsiakad.presentation.base.BaseView {
    
    public abstract void getKrs(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult> listKrs);
    
    public abstract void deleteSomeKrs(@org.jetbrains.annotations.NotNull()
    java.lang.String response);
}