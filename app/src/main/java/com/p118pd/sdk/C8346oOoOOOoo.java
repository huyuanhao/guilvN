package com.p118pd.sdk;

import com.p118pd.sdk.C8348oOoOOo0;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOOoo  reason: case insensitive filesystem */
public class C8346oOoOOOoo extends C8348oOoOOo0.OooO00o {
    public static C8348oOoOOo0<C8346oOoOOOoo> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public double f21451OooO00o;
    public double OooO0O0;

    static {
        C8348oOoOOo0<C8346oOoOOOoo> OooO00o2 = C8348oOoOOo0.OooO00o(64, new C8346oOoOOOoo(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0));
        OooO00o = OooO00o2;
        OooO00o2.OooO00o(0.5f);
    }

    public C8346oOoOOOoo(double d, double d2) {
        this.f21451OooO00o = d;
        this.OooO0O0 = d2;
    }

    public static C8346oOoOOOoo OooO00o(double d, double d2) {
        C8346oOoOOOoo OooO00o2 = OooO00o.m20014OooO00o();
        OooO00o2.f21451OooO00o = d;
        OooO00o2.OooO0O0 = d2;
        return OooO00o2;
    }

    public String toString() {
        return "MPPointD, x: " + this.f21451OooO00o + ", y: " + this.OooO0O0;
    }

    public static void OooO00o(C8346oOoOOOoo oooooooo) {
        OooO00o.OooO00o(oooooooo);
    }

    public static void OooO00o(List<C8346oOoOOOoo> list) {
        OooO00o.OooO00o(list);
    }

    @Override // com.p118pd.sdk.C8348oOoOOo0.OooO00o
    public C8348oOoOOo0.OooO00o OooO00o() {
        return new C8346oOoOOOoo(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
    }
}
