package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityWindowInfo;

/* renamed from: com.pd.sdk.o00OoOo0  reason: case insensitive filesystem */
public class C7128o00OoOo0 {
    public static final int OooO00o = -1;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 5;
    public static final int OooO0o0 = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f19474OooO00o;

    public C7128o00OoOo0(Object obj) {
        this.f19474OooO00o = obj;
    }

    public static C7128o00OoOo0 OooO00o(Object obj) {
        if (obj != null) {
            return new C7128o00OoOo0(obj);
        }
        return null;
    }

    public static String OooO00o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C7120o00OoOO m18476OooO0O0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C7120o00OoOO.OooO00o((Object) ((AccessibilityWindowInfo) this.f19474OooO00o).getRoot());
        }
        return null;
    }

    public int OooO0OO() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f19474OooO00o).getLayer();
        }
        return -1;
    }

    public int OooO0Oo() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f19474OooO00o).getType();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7128o00OoOo0.class != obj.getClass()) {
            return false;
        }
        C7128o00OoOo0 o00oooo0 = (C7128o00OoOo0) obj;
        Object obj2 = this.f19474OooO00o;
        if (obj2 == null) {
            if (o00oooo0.f19474OooO00o != null) {
                return false;
            }
        } else if (!obj2.equals(o00oooo0.f19474OooO00o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.f19474OooO00o;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        OooO00o(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(m18475OooO0O0());
        sb.append(", type=");
        sb.append(OooO00o(OooO0Oo()));
        sb.append(", layer=");
        sb.append(OooO0OO());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(m18478OooO0OO());
        sb.append(", active=");
        sb.append(m18477OooO0O0());
        sb.append(", hasParent=");
        boolean z = true;
        sb.append(m18470OooO00o() != null);
        sb.append(", hasChildren=");
        if (OooO00o() <= 0) {
            z = false;
        }
        sb.append(z);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7128o00OoOo0 m18470OooO00o() {
        if (Build.VERSION.SDK_INT >= 21) {
            return OooO00o(((AccessibilityWindowInfo) this.f19474OooO00o).getParent());
        }
        return null;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18478OooO0OO() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f19474OooO00o).isFocused();
        }
        return true;
    }

    public void OooO00o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((AccessibilityWindowInfo) this.f19474OooO00o).getBoundsInScreen(rect);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m18475OooO0O0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f19474OooO00o).getId();
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18474OooO00o() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f19474OooO00o).isAccessibilityFocused();
        }
        return true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18477OooO0O0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f19474OooO00o).isActive();
        }
        return true;
    }

    public int OooO00o() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f19474OooO00o).getChildCount();
        }
        return 0;
    }

    public static C7128o00OoOo0 OooO0O0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return OooO00o(AccessibilityWindowInfo.obtain());
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7128o00OoOo0 m18471OooO00o(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return OooO00o(((AccessibilityWindowInfo) this.f19474OooO00o).getChild(i));
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18472OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((AccessibilityWindowInfo) this.f19474OooO00o).getTitle();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7120o00OoOO m18469OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C7120o00OoOO.OooO00o((Object) ((AccessibilityWindowInfo) this.f19474OooO00o).getAnchor());
        }
        return null;
    }

    public static C7128o00OoOo0 OooO00o(C7128o00OoOo0 o00oooo0) {
        if (Build.VERSION.SDK_INT < 21 || o00oooo0 == null) {
            return null;
        }
        return OooO00o(AccessibilityWindowInfo.obtain((AccessibilityWindowInfo) o00oooo0.f19474OooO00o));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18473OooO00o() {
        if (Build.VERSION.SDK_INT >= 21) {
            ((AccessibilityWindowInfo) this.f19474OooO00o).recycle();
        }
    }
}
