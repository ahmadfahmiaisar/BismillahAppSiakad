package inn.mroyek.bismillahsiakad.presentation.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\rH\u0014J\b\u0010\u0018\u001a\u00020\rH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/home/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Linn/mroyek/bismillahsiakad/presentation/ui/home/HomeContract;", "()V", "presenter", "Linn/mroyek/bismillahsiakad/presentation/ui/home/HomePresenter;", "getPresenter", "()Linn/mroyek/bismillahsiakad/presentation/ui/home/HomePresenter;", "setPresenter", "(Linn/mroyek/bismillahsiakad/presentation/ui/home/HomePresenter;)V", "sharepref", "Linn/mroyek/bismillahsiakad/data/local/sharepref/PrefManager;", "getUser", "", "user", "Linn/mroyek/bismillahsiakad/presentation/model/User;", "logout", "view", "Landroid/view/View;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity implements inn.mroyek.bismillahsiakad.presentation.ui.home.HomeContract {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public inn.mroyek.bismillahsiakad.presentation.ui.home.HomePresenter presenter;
    private final inn.mroyek.bismillahsiakad.data.local.sharepref.PrefManager sharepref = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final inn.mroyek.bismillahsiakad.presentation.ui.home.HomePresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.presentation.ui.home.HomePresenter p0) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void getUser(@org.jetbrains.annotations.Nullable()
    inn.mroyek.bismillahsiakad.presentation.model.User user) {
    }
    
    public final void logout(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public HomeActivity() {
        super();
    }
}