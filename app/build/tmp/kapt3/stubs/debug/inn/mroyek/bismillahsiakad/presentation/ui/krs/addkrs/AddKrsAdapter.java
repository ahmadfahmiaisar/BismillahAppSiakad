package inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsAdapter;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "listMatkul", "Linn/mroyek/bismillahsiakad/data/response/MatkulResponse$ListMatkul;", "listener", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsAdapter$ItemMatkulSelectedListener;", "(Linn/mroyek/bismillahsiakad/data/response/MatkulResponse$ListMatkul;Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsAdapter$ItemMatkulSelectedListener;)V", "sharPref", "Linn/mroyek/bismillahsiakad/data/local/sharepref/PrefManager;", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/GroupieViewHolder;", "position", "", "getLayout", "ItemMatkulSelectedListener", "app_debug"})
public final class AddKrsAdapter extends com.xwray.groupie.kotlinandroidextensions.Item {
    private final inn.mroyek.bismillahsiakad.data.local.sharepref.PrefManager sharPref = null;
    private final inn.mroyek.bismillahsiakad.data.response.MatkulResponse.ListMatkul listMatkul = null;
    private final inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsAdapter.ItemMatkulSelectedListener listener = null;
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    public AddKrsAdapter(@org.jetbrains.annotations.Nullable()
    inn.mroyek.bismillahsiakad.data.response.MatkulResponse.ListMatkul listMatkul, @org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsAdapter.ItemMatkulSelectedListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsAdapter$ItemMatkulSelectedListener;", "", "onItemMatkulSelected", "", "request", "Linn/mroyek/bismillahsiakad/data/request/InsertKrsRequest;", "app_debug"})
    public static abstract interface ItemMatkulSelectedListener {
        
        public abstract void onItemMatkulSelected(@org.jetbrains.annotations.NotNull()
        inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest request);
    }
}