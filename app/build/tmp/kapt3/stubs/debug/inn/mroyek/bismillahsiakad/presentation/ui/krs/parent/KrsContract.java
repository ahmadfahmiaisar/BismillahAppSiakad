package inn.mroyek.bismillahsiakad.presentation.ui.krs.parent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/krs/parent/KrsContract;", "Linn/mroyek/bismillahsiakad/presentation/base/BaseView;", "getKrs", "", "listKrs", "", "Linn/mroyek/bismillahsiakad/data/response/KrsResponse$KrsResult;", "loading", "", "app_debug"})
public abstract interface KrsContract extends inn.mroyek.bismillahsiakad.presentation.base.BaseView {
    
    public abstract void getKrs(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult> listKrs);
    
    public abstract void loading(boolean loading);
}