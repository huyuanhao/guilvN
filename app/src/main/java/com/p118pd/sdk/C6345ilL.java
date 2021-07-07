package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.il丨L  reason: invalid class name and case insensitive filesystem */
public class C6345ilL extends AbstractC5738Lil {
    public ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6310ilIL f18103OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C93041iI1l f18104OooO00o;
    public String o0ooOOo;

    public C6345ilL(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2.nextElement());
            int OooO00o4 = OooO00o3.OooO00o();
            if (OooO00o4 == 1) {
                this.o0ooOOo = LI11.OooO00o(OooO00o3, true).OooO00o();
            } else if (OooO00o4 == 2) {
                this.f18103OooO00o = C6310ilIL.OooO00o(OooO00o3, true);
            } else if (OooO00o4 == 3) {
                AbstractC6122iIlLiL OooO0o = OooO00o3.OooO0o();
                if (OooO0o instanceof AbstractC5903LlLLL) {
                    this.OooO00o = ILI.OooO00o(OooO0o);
                } else {
                    this.f18104OooO00o = C93041iI1l.OooO00o(OooO0o);
                }
            } else {
                throw new IllegalArgumentException("Bad tag number: " + OooO00o3.OooO00o());
            }
        }
    }

    public C6345ilL(String str, C6310ilIL r2, ILI ili) {
        this.o0ooOOo = str;
        this.f18103OooO00o = r2;
        this.OooO00o = ili;
        this.f18104OooO00o = null;
    }

    public C6345ilL(String str, C6310ilIL r2, C93041iI1l r3) {
        this.o0ooOOo = str;
        this.f18103OooO00o = r2;
        this.OooO00o = null;
        this.f18104OooO00o = r3;
    }

    public static C6345ilL OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6345ilL)) {
            return (C6345ilL) obj;
        }
        if (obj instanceof I11li1) {
            return new C6345ilL((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public ILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6310ilIL m17408OooO00o() {
        return this.f18103OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C93041iI1l m17409OooO00o() {
        return this.f18104OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.o0ooOOo != null) {
            r0.OooO00o(new ILI1Ll(true, 1, new LI11(this.o0ooOOo, true)));
        }
        if (this.f18103OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 2, this.f18103OooO00o));
        }
        r0.OooO00o(this.OooO00o != null ? new ILI1Ll(true, 3, this.OooO00o) : new ILI1Ll(true, 3, this.f18104OooO00o));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m17410OooO0O0() {
        return this.o0ooOOo;
    }
}
