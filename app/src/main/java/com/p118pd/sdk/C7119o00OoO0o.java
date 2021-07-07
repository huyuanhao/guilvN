package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowInsets;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00OoO0o  reason: case insensitive filesystem */
public class C7119o00OoO0o {
    public final Object OooO00o;

    public C7119o00OoO0o(Object obj) {
        this.OooO00o = obj;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18394OooO00o() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.OooO00o).hasInsets();
        }
        return false;
    }

    public int OooO0O0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.OooO00o).getStableInsetLeft();
        }
        return 0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18398OooO0OO() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.OooO00o).hasSystemWindowInsets();
        }
        return false;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m18399OooO0Oo() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.OooO00o).isConsumed();
        }
        return false;
    }

    public int OooO0o() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.OooO00o).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int OooO0o0() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.OooO00o).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int OooO0oO() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.OooO00o).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int OooO0oo() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.OooO00o).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7119o00OoO0o.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.OooO00o;
        Object obj3 = ((C7119o00OoO0o) obj).OooO00o;
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.OooO00o;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C7119o00OoO0o(C7119o00OoO0o o00ooo0o) {
        WindowInsets windowInsets = null;
        if (Build.VERSION.SDK_INT >= 20) {
            this.OooO00o = o00ooo0o != null ? new WindowInsets((WindowInsets) o00ooo0o.OooO00o) : windowInsets;
        } else {
            this.OooO00o = null;
        }
    }

    public C7119o00OoO0o OooO00o(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C7119o00OoO0o(((WindowInsets) this.OooO00o).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18396OooO0O0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.OooO00o).hasStableInsets();
        }
        return false;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public C7119o00OoO0o m18397OooO0OO() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C7119o00OoO0o(((WindowInsets) this.OooO00o).consumeSystemWindowInsets());
        }
        return null;
    }

    public int OooO0Oo() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.OooO00o).getStableInsetTop();
        }
        return 0;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m18400OooO0o0() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.OooO00o).isRound();
        }
        return false;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C7119o00OoO0o m18395OooO0O0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C7119o00OoO0o(((WindowInsets) this.OooO00o).consumeStableInsets());
        }
        return null;
    }

    public int OooO0OO() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.OooO00o).getStableInsetRight();
        }
        return 0;
    }

    public C7119o00OoO0o OooO00o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C7119o00OoO0o(((WindowInsets) this.OooO00o).replaceSystemWindowInsets(rect));
        }
        return null;
    }

    public int OooO00o() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.OooO00o).getStableInsetBottom();
        }
        return 0;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7090o00OO0oo m18392OooO00o() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C7090o00OO0oo.OooO00o(((WindowInsets) this.OooO00o).getDisplayCutout());
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7119o00OoO0o m18393OooO00o() {
        return Build.VERSION.SDK_INT >= 28 ? new C7119o00OoO0o(((WindowInsets) this.OooO00o).consumeDisplayCutout()) : this;
    }

    public static C7119o00OoO0o OooO00o(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C7119o00OoO0o(obj);
    }

    public static Object OooO00o(C7119o00OoO0o o00ooo0o) {
        if (o00ooo0o == null) {
            return null;
        }
        return o00ooo0o.OooO00o;
    }
}
