package inn.mroyek.bismillahsiakad.presentation.ui.krs.parent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u001a\u001a\u00020\u00162\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0016J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u0016H\u0014J\b\u0010&\u001a\u00020\u0016H\u0014J\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/krs/parent/KrsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/parent/KrsContract;", "()V", "adapterKrs", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "bottomSheetAddKrsFragment", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/addkrs/AddKrsFragment;", "bottomSheetReduceKrsFragment", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/reducekrs/ReduceKrsFragment;", "countClickEdit", "", "presenter", "Linn/mroyek/bismillahsiakad/presentation/ui/krs/parent/KrsPresenter;", "getPresenter", "()Linn/mroyek/bismillahsiakad/presentation/ui/krs/parent/KrsPresenter;", "setPresenter", "(Linn/mroyek/bismillahsiakad/presentation/ui/krs/parent/KrsPresenter;)V", "sharPref", "Linn/mroyek/bismillahsiakad/data/local/sharepref/PrefManager;", "addKrs", "", "view", "Landroid/view/View;", "editKrs", "getKrs", "listKrs", "", "Linn/mroyek/bismillahsiakad/data/response/KrsResponse$KrsResult;", "goBack", "initRv", "loading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "reduceKrs", "setUiProfile", "user", "Linn/mroyek/bismillahsiakad/presentation/model/User;", "app_debug"})
public final class KrsActivity extends androidx.appcompat.app.AppCompatActivity implements inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsContract {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsPresenter presenter;
    private final inn.mroyek.bismillahsiakad.data.local.sharepref.PrefManager sharPref = null;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> adapterKrs = null;
    private inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsFragment bottomSheetReduceKrsFragment;
    private inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsFragment bottomSheetAddKrsFragment;
    private int countClickEdit = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRv() {
    }
    
    private final void setUiProfile(inn.mroyek.bismillahsiakad.presentation.model.User user) {
    }
    
    @java.lang.Override()
    public void getKrs(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult> listKrs) {
    }
    
    @java.lang.Override()
    public void loading(boolean loading) {
    }
    
    public final void goBack(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void addKrs(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void reduceKrs(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void editKrs(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public KrsActivity() {
        super();
    }
}