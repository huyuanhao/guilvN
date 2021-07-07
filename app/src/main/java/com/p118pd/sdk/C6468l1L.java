package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1丨L  reason: invalid class name and case insensitive filesystem */
public class C6468l1L {
    public static final C6468l1L OooO00o = new C6468l1L(33023);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18308OooO00o;

    public C6468l1L() {
        this(0);
    }

    public C6468l1L(int i) {
        this.f18308OooO00o = i;
    }

    public C6468l1L(LILIIiLl lILIIiLl) {
        this.f18308OooO00o = lILIIiLl.OooO0Oo();
    }

    public int OooO00o() {
        return this.f18308OooO00o;
    }

    public C6468l1L OooO00o(C6468l1L r4) {
        C6468l1L r0 = new C6468l1L();
        r0.m17604OooO00o(new C6468l1L(r4.OooO00o() & this.f18308OooO00o));
        return r0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17604OooO00o(C6468l1L r2) {
        this.f18308OooO00o = r2.OooO00o() | this.f18308OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17605OooO00o() {
        return this.f18308OooO00o == OooO00o.f18308OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17606OooO00o(C6468l1L r3) {
        return ((r3.OooO00o() ^ this.f18308OooO00o) | this.f18308OooO00o) != 0;
    }
}
