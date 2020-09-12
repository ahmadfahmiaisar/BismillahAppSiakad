package inn.mroyek.bismillahsiakad.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u0010H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Linn/mroyek/bismillahsiakad/presentation/base/BasePresenter;", "T", "Linn/mroyek/bismillahsiakad/presentation/base/BaseView;", "", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "view", "getView", "()Linn/mroyek/bismillahsiakad/presentation/base/BaseView;", "setView", "(Linn/mroyek/bismillahsiakad/presentation/base/BaseView;)V", "Linn/mroyek/bismillahsiakad/presentation/base/BaseView;", "bind", "", "destroy", "unbind", "app_debug"})
public class BasePresenter<T extends inn.mroyek.bismillahsiakad.presentation.base.BaseView> {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.Nullable()
    private T view;
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final T getView() {
        return null;
    }
    
    protected final void setView(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    T view) {
    }
    
    public final void destroy() {
    }
    
    private final void unbind() {
    }
    
    public BasePresenter() {
        super();
    }
}