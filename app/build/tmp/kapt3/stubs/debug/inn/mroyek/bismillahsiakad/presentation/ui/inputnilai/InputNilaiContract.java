package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&\u00a8\u0006\n"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/inputnilai/InputNilaiContract;", "Linn/mroyek/bismillahsiakad/presentation/base/BaseView;", "getAllMatkul", "", "listmatkul", "", "Linn/mroyek/bismillahsiakad/data/response/AllMatkulResponse$ListMatkul;", "getDhsbyMatkul", "listDhs", "Linn/mroyek/bismillahsiakad/data/response/DhsResponse$ListDhs;", "app_debug"})
public abstract interface InputNilaiContract extends inn.mroyek.bismillahsiakad.presentation.base.BaseView {
    
    public abstract void getDhsbyMatkul(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs> listDhs);
    
    public abstract void getAllMatkul(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse.ListMatkul> listmatkul);
}