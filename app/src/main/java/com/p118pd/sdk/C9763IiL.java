package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨丨Ii丨L  reason: invalid class name and case insensitive filesystem */
public class C9763IiL extends AbstractC5738Lil {
    public LII OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LLl111 f23395OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final l1LILI1 f23396OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6513lIiI f23397OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f23398OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f23399OooO00o;

    public C9763IiL(I11li1 i11li1) {
        int i = 3;
        if (i11li1.size() < 3 || i11li1.size() > 6) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f23396OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(0));
        this.f23397OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1));
        this.f23395OooO00o = LLl111.OooO00o(i11li1.OooO00o(2));
        if (i11li1.size() > 3 && (i11li1.OooO00o(3).OooO0O0() instanceof C9623il)) {
            this.f23399OooO00o = C9623il.OooO00o(i11li1.OooO00o(3));
            i = 4;
        }
        if (i11li1.size() > i && (i11li1.OooO00o(i).OooO0O0() instanceof AbstractC6804llL1ii)) {
            this.f23398OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(i));
            i++;
        }
        if (i11li1.size() > i && (i11li1.OooO00o(i).OooO0O0() instanceof LII)) {
            this.OooO00o = LII.OooO00o(i11li1.OooO00o(i));
        }
    }

    public C9763IiL(l1LILI1 r1, C6513lIiI r2, LLl111 r3, C9623il r4, AbstractC6804llL1ii r5, LII lii) {
        this.f23396OooO00o = r1;
        this.f23397OooO00o = r2;
        this.f23395OooO00o = r3;
        this.f23399OooO00o = r4;
        this.f23398OooO00o = r5;
        this.OooO00o = lii;
    }

    public static C9763IiL OooO00o(Object obj) {
        if (obj instanceof C9763IiL) {
            return (C9763IiL) obj;
        }
        if (obj != null) {
            return new C9763IiL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LII OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LLl111 m21892OooO00o() {
        return this.f23395OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m21893OooO00o() {
        return this.f23396OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21894OooO00o() {
        return this.f23398OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m21895OooO00o() {
        return this.f23399OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21896OooO00o() {
        return this.f23397OooO00o.m17647OooO0O0();
    }

    public void OooO00o(LII lii) {
        this.OooO00o = lii;
    }

    public void OooO00o(AbstractC6804llL1ii r1) {
        this.f23398OooO00o = r1;
    }

    public void OooO00o(C9623il r1) {
        this.f23399OooO00o = r1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21897OooO00o() {
        AbstractC6804llL1ii r0 = this.f23398OooO00o;
        if (r0 != null) {
            return C9586iIILl.m21630OooO00o(r0.m17938OooO00o());
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23396OooO00o);
        r0.OooO00o(this.f23397OooO00o);
        r0.OooO00o(this.f23395OooO00o);
        C9623il r1 = this.f23399OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        AbstractC6804llL1ii r12 = this.f23398OooO00o;
        if (r12 != null) {
            r0.OooO00o(r12);
        }
        LII lii = this.OooO00o;
        if (lii != null) {
            r0.OooO00o(lii);
        }
        return new C5707LiL1(r0);
    }
}
