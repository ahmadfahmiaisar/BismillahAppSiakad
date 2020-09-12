package inn.mroyek.bismillahsiakad.presentation.ui.inputnilai;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/ui/inputnilai/InputNilaiActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Linn/mroyek/bismillahsiakad/presentation/ui/inputnilai/InputNilaiContract;", "()V", "presenter", "Linn/mroyek/bismillahsiakad/presentation/ui/inputnilai/InputNilaiPresenter;", "getPresenter", "()Linn/mroyek/bismillahsiakad/presentation/ui/inputnilai/InputNilaiPresenter;", "setPresenter", "(Linn/mroyek/bismillahsiakad/presentation/ui/inputnilai/InputNilaiPresenter;)V", "getAllMatkul", "", "listmatkul", "", "Linn/mroyek/bismillahsiakad/data/response/AllMatkulResponse$ListMatkul;", "getDhsbyMatkul", "listDhs", "Linn/mroyek/bismillahsiakad/data/response/DhsResponse$ListDhs;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public final class InputNilaiActivity extends androidx.appcompat.app.AppCompatActivity implements inn.mroyek.bismillahsiakad.presentation.ui.inputnilai.InputNilaiContract {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public inn.mroyek.bismillahsiakad.presentation.ui.inputnilai.InputNilaiPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final inn.mroyek.bismillahsiakad.presentation.ui.inputnilai.InputNilaiPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.presentation.ui.inputnilai.InputNilaiPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void getDhsbyMatkul(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.DhsResponse.ListDhs> listDhs) {
    }
    
    @java.lang.Override()
    public void getAllMatkul(@org.jetbrains.annotations.NotNull()
    java.util.List<inn.mroyek.bismillahsiakad.data.response.AllMatkulResponse.ListMatkul> listmatkul) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public InputNilaiActivity() {
        super();
    }
}