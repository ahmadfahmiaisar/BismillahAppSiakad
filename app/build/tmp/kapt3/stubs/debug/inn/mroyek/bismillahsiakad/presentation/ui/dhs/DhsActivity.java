package inn.mroyek.bismillahsiakad.presentation.ui.dhs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0016J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0014J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/dhs/DhsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Linn/mroyek/bismillahsiakad/presentation/ui/dhs/DhsContract;", "()V", "adapterDhs", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/kotlinandroidextensions/GroupieViewHolder;", "presenter", "Linn/mroyek/bismillahsiakad/presentation/ui/dhs/DhsPresenter;", "getPresenter", "()Linn/mroyek/bismillahsiakad/presentation/ui/dhs/DhsPresenter;", "setPresenter", "(Linn/mroyek/bismillahsiakad/presentation/ui/dhs/DhsPresenter;)V", "sharePref", "Linn/mroyek/bismillahsiakad/data/local/sharepref/PrefManager;", "getDhs", "", "listdhs", "", "Linn/mroyek/bismillahsiakad/data/response/DhsResponse$ListDhs;", "goBack", "view", "Landroid/view/View;", "initRv", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setUiProfile", "user", "Linn/mroyek/bismillahsiakad/presentation/model/User;", "app_debug"})
public final class DhsActivity extends androidx.appcompat.app.AppCompatActivity implements inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsContract {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsPresenter presenter;
    private final inn.mroyek.bismillahsiakad.data.local.sharepref.PrefManager sharePref = null;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder> adapterDhs = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRv() {
    }
    
    private final void setUiProfile(inn.mroyek.bismillahsiakad.presentation.model.User user) {
    }
    
    public final void goBack(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void getDhs(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs> listdhs) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public DhsActivity() {
        super();
    }
}