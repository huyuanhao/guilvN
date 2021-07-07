package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0033R;

/* renamed from: com.pd.sdk.o00Oo0  reason: case insensitive filesystem */
public class C7105o00Oo0 extends PopupWindow {
    public static final boolean OooO0O0 = (Build.VERSION.SDK_INT < 21);
    public boolean OooO00o;

    public C7105o00Oo0(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        OooO00o(context, attributeSet, i, 0);
    }

    private void OooO00o(Context context, AttributeSet attributeSet, int i, int i2) {
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, attributeSet, C0033R.styleable.Oooo000, i, i2);
        if (OooO00o2.m18168OooO00o(C0033R.styleable.PopupWindow_overlapAnchor)) {
            OooO00o(OooO00o2.OooO00o(C0033R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(OooO00o2.m18162OooO00o(C0033R.styleable.PopupWindow_android_popupBackground));
        OooO00o2.m18167OooO00o();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (OooO0O0 && this.OooO00o) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (OooO0O0 && this.OooO00o) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public C7105o00Oo0(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        OooO00o(context, attributeSet, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (OooO0O0 && this.OooO00o) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    private void OooO00o(boolean z) {
        if (OooO0O0) {
            this.OooO00o = z;
        } else {
            C7147o00o000O.OooO00o(this, z);
        }
    }
}
