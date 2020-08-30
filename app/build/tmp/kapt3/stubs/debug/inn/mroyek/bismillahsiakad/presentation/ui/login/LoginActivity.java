package inn.mroyek.bismillahsiakad.presentation.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000bH\u0014J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Linn/mroyek/bismillahsiakad/presentation/ui/login/LoginContract;", "()V", "presenter", "Linn/mroyek/bismillahsiakad/presentation/ui/login/LoginPresenter;", "getPresenter", "()Linn/mroyek/bismillahsiakad/presentation/ui/login/LoginPresenter;", "setPresenter", "(Linn/mroyek/bismillahsiakad/presentation/ui/login/LoginPresenter;)V", "hasLogin", "", "message", "", "hasnotLogin", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setPref", "user", "Linn/mroyek/bismillahsiakad/presentation/model/User;", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity implements inn.mroyek.bismillahsiakad.presentation.ui.login.LoginContract {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public inn.mroyek.bismillahsiakad.presentation.ui.login.LoginPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final inn.mroyek.bismillahsiakad.presentation.ui.login.LoginPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.presentation.ui.login.LoginPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void hasLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void hasnotLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void setPref(@org.jetbrains.annotations.Nullable()
    inn.mroyek.bismillahsiakad.presentation.model.User user) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public LoginActivity() {
        super();
    }
}