package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0033R;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5961Oooo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.Oooo0oo  reason: case insensitive filesystem */
public class C5973Oooo0oo implements AbstractC5966Oooo0O0 {
    public static final int OooO0Oo = 48;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f17240OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f17241OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow.OnDismissListener f17242OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5961Oooo.OooO00o f17243OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5965Oooo00o f17244OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5972Oooo0oO f17245OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f17246OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final PopupWindow.OnDismissListener f17247OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17248OooO0O0;
    public int OooO0OO;

    /* renamed from: com.pd.sdk.Oooo0oo$OooO00o */
    public class OooO00o implements PopupWindow.OnDismissListener {
        public OooO00o() {
        }

        public void onDismiss() {
            C5973Oooo0oo.this.m16803OooO00o();
        }
    }

    public C5973Oooo0oo(@NonNull Context context, @NonNull C5965Oooo00o oooo00o) {
        this(context, oooo00o, null, false, C0033R.attr.popupMenuStyle, 0);
    }

    public void OooO00o(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f17242OooO00o = onDismissListener;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m16806OooO0O0() {
        if (!m16807OooO0O0()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5966Oooo0O0
    public void dismiss() {
        if (m16804OooO00o()) {
            this.f17245OooO00o.dismiss();
        }
    }

    public C5973Oooo0oo(@NonNull Context context, @NonNull C5965Oooo00o oooo00o, @NonNull View view) {
        this(context, oooo00o, view, false, C0033R.attr.popupMenuStyle, 0);
    }

    public void OooO00o(@NonNull View view) {
        this.f17241OooO00o = view;
    }

    public C5973Oooo0oo(@NonNull Context context, @NonNull C5965Oooo00o oooo00o, @NonNull View view, boolean z, @AttrRes int i) {
        this(context, oooo00o, view, z, i, 0);
    }

    public void OooO00o(boolean z) {
        this.f17248OooO0O0 = z;
        AbstractC5972Oooo0oO oooo0oO = this.f17245OooO00o;
        if (oooo0oO != null) {
            oooo0oO.OooO0O0(z);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16807OooO0O0() {
        if (m16804OooO00o()) {
            return true;
        }
        if (this.f17241OooO00o == null) {
            return false;
        }
        OooO00o(0, 0, false, false);
        return true;
    }

    public C5973Oooo0oo(@NonNull Context context, @NonNull C5965Oooo00o oooo00o, @NonNull View view, boolean z, @AttrRes int i, @StyleRes int i2) {
        this.OooO0OO = 8388611;
        this.f17247OooO0O0 = new OooO00o();
        this.f17240OooO00o = context;
        this.f17244OooO00o = oooo00o;
        this.f17241OooO00o = view;
        this.f17246OooO00o = z;
        this.OooO00o = i;
        this.OooO0O0 = i2;
    }

    @NonNull
    private AbstractC5972Oooo0oO OooO0O0() {
        AbstractC5972Oooo0oO oooo0oO;
        Display defaultDisplay = ((WindowManager) this.f17240OooO00o.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f17240OooO00o.getResources().getDimensionPixelSize(C0033R.dimen.abc_cascading_menus_min_smallest_width)) {
            oooo0oO = new CascadingMenuPopup(this.f17240OooO00o, this.f17241OooO00o, this.OooO00o, this.OooO0O0, this.f17246OooO00o);
        } else {
            oooo0oO = new View$OnKeyListenerC5978OoooOO0(this.f17240OooO00o, this.f17244OooO00o, this.f17241OooO00o, this.OooO00o, this.OooO0O0, this.f17246OooO00o);
        }
        oooo0oO.m16800OooO00o(this.f17244OooO00o);
        oooo0oO.OooO00o(this.f17247OooO0O0);
        oooo0oO.OooO00o(this.f17241OooO00o);
        oooo0oO.OooO00o(this.f17243OooO00o);
        oooo0oO.OooO0O0(this.f17248OooO0O0);
        oooo0oO.OooO00o(this.OooO0OO);
        return oooo0oO;
    }

    public void OooO00o(int i) {
        this.OooO0OO = i;
    }

    public int OooO00o() {
        return this.OooO0OO;
    }

    public void OooO00o(int i, int i2) {
        if (!m16805OooO00o(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5972Oooo0oO m16802OooO00o() {
        if (this.f17245OooO00o == null) {
            this.f17245OooO00o = OooO0O0();
        }
        return this.f17245OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16805OooO00o(int i, int i2) {
        if (m16804OooO00o()) {
            return true;
        }
        if (this.f17241OooO00o == null) {
            return false;
        }
        OooO00o(i, i2, true, true);
        return true;
    }

    private void OooO00o(int i, int i2, boolean z, boolean z2) {
        AbstractC5972Oooo0oO OooO00o2 = m16802OooO00o();
        OooO00o2.OooO0OO(z2);
        if (z) {
            if ((C7092o00OOO0.OooO00o(this.OooO0OO, ViewCompat.m14593OooO0o(this.f17241OooO00o)) & 7) == 5) {
                i -= this.f17241OooO00o.getWidth();
            }
            OooO00o2.OooO0O0(i);
            OooO00o2.OooO0OO(i2);
            int i3 = (int) ((this.f17240OooO00o.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            OooO00o2.OooO00o(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        OooO00o2.m16808OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16803OooO00o() {
        this.f17245OooO00o = null;
        PopupWindow.OnDismissListener onDismissListener = this.f17242OooO00o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16804OooO00o() {
        AbstractC5972Oooo0oO oooo0oO = this.f17245OooO00o;
        return oooo0oO != null && oooo0oO.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5966Oooo0O0
    public void OooO00o(@Nullable AbstractC5961Oooo.OooO00o oooO00o) {
        this.f17243OooO00o = oooO00o;
        AbstractC5972Oooo0oO oooo0oO = this.f17245OooO00o;
        if (oooo0oO != null) {
            oooo0oO.OooO00o(oooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListView m16801OooO00o() {
        return m16802OooO00o().OooO00o();
    }
}
