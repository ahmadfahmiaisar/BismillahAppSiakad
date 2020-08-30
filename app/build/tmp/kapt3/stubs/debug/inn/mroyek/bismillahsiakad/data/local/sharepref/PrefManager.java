package inn.mroyek.bismillahsiakad.data.local.sharepref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Linn/mroyek/bismillahsiakad/data/local/sharepref/PrefManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefEditor", "Landroid/content/SharedPreferences$Editor;", "getPrefEditor", "()Landroid/content/SharedPreferences$Editor;", "prefEditor$delegate", "Lkotlin/Lazy;", "sharePref", "Landroid/content/SharedPreferences;", "getSharePref", "()Landroid/content/SharedPreferences;", "sharePref$delegate", "value", "Linn/mroyek/bismillahsiakad/presentation/model/User;", "user", "getUser", "()Linn/mroyek/bismillahsiakad/presentation/model/User;", "setUser", "(Linn/mroyek/bismillahsiakad/presentation/model/User;)V", "logOut", "", "Companion", "app_debug"})
public final class PrefManager {
    private final kotlin.Lazy sharePref$delegate = null;
    private final kotlin.Lazy prefEditor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String keySharPref = "bismillahsiakad.pref";
    public static final inn.mroyek.bismillahsiakad.data.local.sharepref.PrefManager.Companion Companion = null;
    
    private final android.content.SharedPreferences getSharePref() {
        return null;
    }
    
    private final android.content.SharedPreferences.Editor getPrefEditor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final inn.mroyek.bismillahsiakad.presentation.model.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    inn.mroyek.bismillahsiakad.presentation.model.User value) {
    }
    
    public final void logOut() {
    }
    
    public PrefManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linn/mroyek/bismillahsiakad/data/local/sharepref/PrefManager$Companion;", "", "()V", "keySharPref", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}