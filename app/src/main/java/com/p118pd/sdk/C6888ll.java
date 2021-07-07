package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.l丨l丨  reason: invalid class name and case insensitive filesystem */
public class C6888ll extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18979OooO00o;

    public C6888ll(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            this.f18979OooO00o = C6456l1ilL.OooO00o(OooO00o2.nextElement());
            this.OooO00o = iIilII1.OooO00o(OooO00o2.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C6888ll(C6456l1ilL r2, AbstractC6854lLi1LL r3) throws IOException {
        this.OooO00o = new iIilII1(r3);
        this.f18979OooO00o = r2;
    }

    public C6888ll(C6456l1ilL r2, byte[] bArr) {
        this.OooO00o = new iIilII1(bArr);
        this.f18979OooO00o = r2;
    }

    public static C6888ll OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6888ll OooO00o(Object obj) {
        if (obj instanceof C6888ll) {
            return (C6888ll) obj;
        }
        if (obj != null) {
            return new C6888ll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m18041OooO00o() {
        return this.f18979OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18979OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m18042OooO0O0() {
        return this.f18979OooO00o;
    }

    public AbstractC6122iIlLiL OooO0Oo() throws IOException {
        return AbstractC6122iIlLiL.OooO00o(this.OooO00o.OooO0O0());
    }

    public AbstractC6122iIlLiL OooO0o0() throws IOException {
        return AbstractC6122iIlLiL.OooO00o(this.OooO00o.OooO0O0());
    }
}
