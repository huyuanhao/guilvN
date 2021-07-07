package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.li丨lI丨1  reason: invalid class name and case insensitive filesystem */
public class C6720lilI1 extends AbstractC5738Lil {
    public static final C6720lilI1 OooO00o = new C6720lilI1(0);
    public static final C6720lilI1 OooO0O0 = new C6720lilI1(1);
    public static final C6720lilI1 OooO0OO = new C6720lilI1(2);
    public static final C6720lilI1 OooO0Oo = new C6720lilI1(3);
    public static final C6720lilI1 OooO0o = new C6720lilI1(5);
    public static final C6720lilI1 OooO0o0 = new C6720lilI1(4);
    public static final C6720lilI1 OooO0oO = new C6720lilI1(6);
    public static final int o00oO0O = 0;
    public static final int o0OO00O = 6;
    public static final int o0OOO0o = 4;
    public static final int o0Oo0oo = 5;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18675OooO00o;

    public C6720lilI1(int i) {
        this(new C6513lIiI((long) i));
    }

    public C6720lilI1(C6513lIiI r1) {
        this.f18675OooO00o = r1;
    }

    public static C6720lilI1 OooO00o(Object obj) {
        if (obj instanceof C6720lilI1) {
            return (C6720lilI1) obj;
        }
        if (obj != null) {
            return new C6720lilI1(C6513lIiI.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.f18675OooO00o.m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.f18675OooO00o;
    }
}
