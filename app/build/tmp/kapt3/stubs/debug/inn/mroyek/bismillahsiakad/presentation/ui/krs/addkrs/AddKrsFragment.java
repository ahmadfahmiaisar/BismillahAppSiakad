package inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006&"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsContract;", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsAdapter$ItemMatkulSelectedListener;", "()V", "adapterAddKrs", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "presenter", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsPresenter;", "getPresenter", "()Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsPresenter;", "setPresenter", "(Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsPresenter;)V", "getMatkul", "", "listMatkul", "", "Linn/mroyek/bismillahsiakad/data/response/MatkulResponse$ListMatkul;", "insertKrs", "response", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onItemMatkulSelected", "request", "Linn/mroyek/bismillahsiakad/data/request/InsertKrsRequest;", "onViewCreated", "view", "Companion", "app_debug"})
public final class AddKrsFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsContract, inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsAdapter.ItemMatkulSelectedListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsPresenter presenter;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> adapterAddKrs = null;
    @org.jetbrains.annotations.NotNull()
    private static inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest requested;
    public static final inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsPresenter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void getMatkul(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.MatkulResponse.ListMatkul> listMatkul) {
    }
    
    @java.lang.Override()
    public void insertKrs(@org.jetbrains.annotations.NotNull()
    java.lang.String response) {
    }
    
    @java.lang.Override()
    public void onItemMatkulSelected(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest request) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public AddKrsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsFragment$Companion;", "", "()V", "requested", "Linn/mroyek/bismillahsiakad/data/request/InsertKrsRequest;", "getRequested", "()Linn/mroyek/bismillahsiakad/data/request/InsertKrsRequest;", "setRequested", "(Linn/mroyek/bismillahsiakad/data/request/InsertKrsRequest;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest getRequested() {
            return null;
        }
        
        public final void setRequested(@org.jetbrains.annotations.NotNull()
        inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest p0) {
        }
        
        private Companion() {
            super();
        }
    }
}