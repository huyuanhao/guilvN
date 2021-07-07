package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: com.pd.sdk.o00OO0oo  reason: case insensitive filesystem */
public final class C7090o00OO0oo {
    public final Object OooO00o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7090o00OO0oo(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? new DisplayCutout(rect, list) : null);
    }

    public int OooO00o() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.OooO00o).getSafeInsetBottom();
        }
        return 0;
    }

    public int OooO0O0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.OooO00o).getSafeInsetLeft();
        }
        return 0;
    }

    public int OooO0OO() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.OooO00o).getSafeInsetRight();
        }
        return 0;
    }

    public int OooO0Oo() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.OooO00o).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7090o00OO0oo.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.OooO00o;
        Object obj3 = ((C7090o00OO0oo) obj).OooO00o;
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

    public String toString() {
        return "DisplayCutoutCompat{" + this.OooO00o + C7522o0Ooo0o.OooO0Oo;
    }

    public C7090o00OO0oo(Object obj) {
        this.OooO00o = obj;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<Rect> m18369OooO00o() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.OooO00o).getBoundingRects();
        }
        return null;
    }

    public static C7090o00OO0oo OooO00o(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C7090o00OO0oo(obj);
    }
}
