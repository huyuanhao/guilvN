package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import com.p118pd.sdk.AbstractC7202o00oOo00;
import com.p118pd.sdk.C6987o000O0o;
import com.p118pd.sdk.C7211o00oOooO;
import com.p118pd.sdk.C7600o0o0Oo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ComponentActivity extends Activity implements AbstractC7202o00oOo00, C7600o0o0Oo.OooO00o {
    public C6987o000O0o<Class<? extends OooO00o>, OooO00o> mExtraDataMap = new C6987o000O0o<>();
    public C7211o00oOooO mLifecycleRegistry = new C7211o00oOooO(this);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO00o {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C7600o0o0Oo.OooO00o(decorView, keyEvent)) {
            return C7600o0o0Oo.OooO00o(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C7600o0o0Oo.OooO00o(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public <T extends OooO00o> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    @Override // com.p118pd.sdk.AbstractC7202o00oOo00
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.m14674OooO00o((Activity) this);
    }

    @CallSuper
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.m18704OooO00o(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.o000O0o<java.lang.Class<? extends androidx.core.app.ComponentActivity$OooO00o>, androidx.core.app.ComponentActivity$OooO00o> */
    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void putExtraData(OooO00o oooO00o) {
        this.mExtraDataMap.put(oooO00o.getClass(), oooO00o);
    }

    @Override // com.p118pd.sdk.C7600o0o0Oo.OooO00o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
