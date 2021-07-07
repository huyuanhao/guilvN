package com.p118pd.sdk;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* renamed from: com.pd.sdk.o00OOoo  reason: case insensitive filesystem */
public class C7101o00OOoo {
    public final View OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewParent f19438OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19439OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f19440OooO00o;
    public ViewParent OooO0O0;

    public C7101o00OOoo(@NonNull View view) {
        this.OooO00o = view;
    }

    public void OooO00o(boolean z) {
        if (this.f19439OooO00o) {
            ViewCompat.m14600OooO0oO(this.OooO00o);
        }
        this.f19439OooO00o = z;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18379OooO0O0() {
        return this.f19439OooO00o;
    }

    public boolean OooO0O0(int i) {
        return OooO00o(i, 0);
    }

    public void OooO0O0() {
        m18376OooO00o(0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18377OooO00o() {
        return m18378OooO00o(0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18378OooO00o(int i) {
        return OooO00o(i) != null;
    }

    public boolean OooO00o(int i, int i2) {
        if (m18378OooO00o(i2)) {
            return true;
        }
        if (!m18379OooO0O0()) {
            return false;
        }
        View view = this.OooO00o;
        for (ViewParent parent = this.OooO00o.getParent(); parent != null; parent = parent.getParent()) {
            if (C7114o00Oo0oO.m18385OooO00o(parent, view, this.OooO00o, i, i2)) {
                OooO00o(i2, parent);
                C7114o00Oo0oO.OooO00o(parent, view, this.OooO00o, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18376OooO00o(int i) {
        ViewParent OooO00o2 = OooO00o(i);
        if (OooO00o2 != null) {
            C7114o00Oo0oO.OooO00o(OooO00o2, this.OooO00o, i);
            OooO00o(i, (ViewParent) null);
        }
    }

    public boolean OooO00o(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return OooO00o(i, i2, i3, i4, iArr, 0);
    }

    public boolean OooO00o(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        ViewParent OooO00o2;
        int i6;
        int i7;
        if (!m18379OooO0O0() || (OooO00o2 = OooO00o(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.OooO00o.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        C7114o00Oo0oO.OooO00o(OooO00o2, this.OooO00o, i, i2, i3, i4, i5);
        if (iArr != null) {
            this.OooO00o.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    public boolean OooO00o(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return OooO00o(i, i2, iArr, iArr2, 0);
    }

    public boolean OooO00o(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent OooO00o2;
        int i4;
        int i5;
        if (!m18379OooO0O0() || (OooO00o2 = OooO00o(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.OooO00o.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.f19440OooO00o == null) {
                    this.f19440OooO00o = new int[2];
                }
                iArr = this.f19440OooO00o;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C7114o00Oo0oO.OooO00o(OooO00o2, this.OooO00o, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.OooO00o.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public boolean OooO00o(float f, float f2, boolean z) {
        ViewParent OooO00o2;
        if (!m18379OooO0O0() || (OooO00o2 = OooO00o(0)) == null) {
            return false;
        }
        return C7114o00Oo0oO.OooO00o(OooO00o2, this.OooO00o, f, f2, z);
    }

    public boolean OooO00o(float f, float f2) {
        ViewParent OooO00o2;
        if (!m18379OooO0O0() || (OooO00o2 = OooO00o(0)) == null) {
            return false;
        }
        return C7114o00Oo0oO.OooO00o(OooO00o2, this.OooO00o, f, f2);
    }

    public void OooO00o() {
        ViewCompat.m14600OooO0oO(this.OooO00o);
    }

    public void OooO00o(@NonNull View view) {
        ViewCompat.m14600OooO0oO(this.OooO00o);
    }

    private ViewParent OooO00o(int i) {
        if (i == 0) {
            return this.f19438OooO00o;
        }
        if (i != 1) {
            return null;
        }
        return this.OooO0O0;
    }

    private void OooO00o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f19438OooO00o = viewParent;
        } else if (i == 1) {
            this.OooO0O0 = viewParent;
        }
    }
}
