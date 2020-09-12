package inn.mroyek.bismillahsiakad.presentation.ui.dhs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/dhs/DhsContract;", "Linn/mroyek/bismillahsiakad/presentation/base/BaseView;", "getDhs", "", "listdhs", "", "Linn/mroyek/bismillahsiakad/data/response/DhsResponse$ListDhs;", "app_debug"})
public abstract interface DhsContract extends inn.mroyek.bismillahsiakad.presentation.base.BaseView {
    
    public abstract void getDhs(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs> listdhs);
}