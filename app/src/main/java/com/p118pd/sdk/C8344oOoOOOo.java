package com.p118pd.sdk;

import com.facebook.react.views.text.FontMetricsUtil;
import com.p118pd.sdk.C8348oOoOOo0;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOOo  reason: case insensitive filesystem */
public final class C8344oOoOOOo extends C8348oOoOOo0.OooO00o {
    public static C8348oOoOOo0<C8344oOoOOOo> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f21450OooO00o;
    public float OooO0O0;

    static {
        C8348oOoOOo0<C8344oOoOOOo> OooO00o2 = C8348oOoOOo0.OooO00o(256, new C8344oOoOOOo(0.0f, 0.0f));
        OooO00o = OooO00o2;
        OooO00o2.OooO00o(0.5f);
    }

    public C8344oOoOOOo() {
    }

    @Override // com.p118pd.sdk.C8348oOoOOo0.OooO00o
    public C8348oOoOOo0.OooO00o OooO00o() {
        return new C8344oOoOOOo(0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8344oOoOOOo)) {
            return false;
        }
        C8344oOoOOOo ooooooo = (C8344oOoOOOo) obj;
        if (this.f21450OooO00o == ooooooo.f21450OooO00o && this.OooO0O0 == ooooooo.OooO0O0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f21450OooO00o) ^ Float.floatToIntBits(this.OooO0O0);
    }

    public String toString() {
        return this.f21450OooO00o + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + this.OooO0O0;
    }

    public C8344oOoOOOo(float f, float f2) {
        this.f21450OooO00o = f;
        this.OooO0O0 = f2;
    }

    public static C8344oOoOOOo OooO00o(float f, float f2) {
        C8344oOoOOOo OooO00o2 = OooO00o.m20014OooO00o();
        OooO00o2.f21450OooO00o = f;
        OooO00o2.OooO0O0 = f2;
        return OooO00o2;
    }

    public static void OooO00o(C8344oOoOOOo ooooooo) {
        OooO00o.OooO00o(ooooooo);
    }

    public static void OooO00o(List<C8344oOoOOOo> list) {
        OooO00o.OooO00o(list);
    }
}
