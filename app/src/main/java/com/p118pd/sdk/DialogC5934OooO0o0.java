package com.p118pd.sdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegate;
import com.p118pd.sdk.AbstractC5951OooOo00;
import com.p118pd.sdk.C7600o0o0Oo;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.OooO0o0  reason: case insensitive filesystem */
public class DialogC5934OooO0o0 extends Dialog implements AbstractC5932OooO0Oo {
    public AppCompatDelegate OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7600o0o0Oo.OooO00o f17025OooO00o;

    /* renamed from: com.pd.sdk.OooO0o0$OooO00o */
    public class OooO00o implements C7600o0o0Oo.OooO00o {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C7600o0o0Oo.OooO00o
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return DialogC5934OooO0o0.this.OooO00o(keyEvent);
        }
    }

    static {
        C.i(20);
    }

    public DialogC5934OooO0o0(Context context) {
        this(context, 0);
    }

    public static native int OooO00o(Context context, int i);

    public native ActionBar OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public native AppCompatDelegate m16671OooO00o();

    public native boolean OooO00o(int i);

    public native boolean OooO00o(KeyEvent keyEvent);

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m16671OooO00o().OooO00o(view, layoutParams);
    }

    public native boolean dispatchKeyEvent(KeyEvent keyEvent);

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) m16671OooO00o().OooO00o(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void invalidateOptionsMenu() {
        m16671OooO00o().OooO0O0();
    }

    public native void onCreate(Bundle bundle);

    public native void onStop();

    @Override // com.p118pd.sdk.AbstractC5932OooO0Oo
    public native void onSupportActionModeFinished(AbstractC5951OooOo00 oooOo00);

    @Override // com.p118pd.sdk.AbstractC5932OooO0Oo
    public native void onSupportActionModeStarted(AbstractC5951OooOo00 oooOo00);

    @Override // com.p118pd.sdk.AbstractC5932OooO0Oo
    @Nullable
    public AbstractC5951OooOo00 onWindowStartingSupportActionMode(AbstractC5951OooOo00.OooO00o oooO00o) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        m16671OooO00o().m14353OooO00o(i);
    }

    @Override // android.app.Dialog
    public native void setContentView(View view);

    @Override // android.app.Dialog
    public native void setTitle(int i);

    @Override // android.app.Dialog
    public native void setTitle(CharSequence charSequence);

    public DialogC5934OooO0o0(Context context, int i) {
        super(context, OooO00o(context, i));
        this.f17025OooO00o = new OooO00o();
        m16671OooO00o().OooO00o((Bundle) null);
        m16671OooO00o().m14354OooO00o();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m16671OooO00o().OooO0O0(view, layoutParams);
    }

    public DialogC5934OooO0o0(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.f17025OooO00o = new OooO00o();
    }
}
