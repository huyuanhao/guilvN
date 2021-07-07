package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.II丨I  reason: invalid class name and case insensitive filesystem */
public class C5237III extends AbstractC5738Lil {
    public static final LlLI1 o00OoOo = new LlLI1("2.5.29.14").m16384OooO00o();
    public static final LlLI1 o00OoOo0 = new LlLI1("2.5.29.9").m16384OooO00o();
    public static final LlLI1 o00OoOoo = new LlLI1("2.5.29.15").m16384OooO00o();
    public static final LlLI1 o00Ooo0 = new LlLI1("2.5.29.17").m16384OooO00o();
    public static final LlLI1 o00Ooo00 = new LlLI1("2.5.29.16").m16384OooO00o();
    public static final LlLI1 o00Ooo0O = new LlLI1("2.5.29.18").m16384OooO00o();
    public static final LlLI1 o00Ooo0o = new LlLI1("2.5.29.19").m16384OooO00o();
    public static final LlLI1 o00OooO = new LlLI1("2.5.29.21").m16384OooO00o();
    public static final LlLI1 o00OooO0 = new LlLI1("2.5.29.20").m16384OooO00o();
    public static final LlLI1 o00OooOO = new LlLI1("2.5.29.23").m16384OooO00o();
    public static final LlLI1 o00OooOo = new LlLI1("2.5.29.24").m16384OooO00o();
    public static final LlLI1 o00OoooO = new LlLI1("2.5.29.28").m16384OooO00o();
    public static final LlLI1 o00Ooooo = new LlLI1("2.5.29.29").m16384OooO00o();
    public static final LlLI1 o00o0 = new LlLI1("1.3.6.1.5.5.7.1.2").m16384OooO00o();
    public static final LlLI1 o00o00 = new LlLI1("2.5.29.36").m16384OooO00o();
    public static final LlLI1 o00o000 = new LlLI1("2.5.29.31").m16384OooO00o();
    public static final LlLI1 o00o0000 = new LlLI1("2.5.29.30").m16384OooO00o();
    public static final LlLI1 o00o000O = new LlLI1("2.5.29.32").m16384OooO00o();
    public static final LlLI1 o00o000o = new LlLI1("2.5.29.33").m16384OooO00o();
    public static final LlLI1 o00o00O0 = new LlLI1("2.5.29.37").m16384OooO00o();
    public static final LlLI1 o00o00Oo = new LlLI1("2.5.29.46").m16384OooO00o();
    public static final LlLI1 o00o00o = new LlLI1("1.3.6.1.5.5.7.1.1").m16384OooO00o();
    public static final LlLI1 o00o00o0 = new LlLI1("2.5.29.54").m16384OooO00o();
    public static final LlLI1 o00o00oO = new LlLI1("1.3.6.1.5.5.7.1.11").m16384OooO00o();
    public static final LlLI1 o00o00oo = new LlLI1("1.3.6.1.5.5.7.1.12").m16384OooO00o();
    public static final LlLI1 o00o0O0 = new LlLI1("1.3.6.1.5.5.7.1.4").m16384OooO00o();
    public static final LlLI1 o00o0O00 = new LlLI1("1.3.6.1.5.5.7.1.3").m16384OooO00o();
    public static final LlLI1 o00o0O0O = new LlLI1("2.5.29.56").m16384OooO00o();
    public static final LlLI1 o00o0OO = new LlLI1("2.5.29.60").m16384OooO00o();
    public static final LlLI1 o00o0OO0 = new LlLI1("2.5.29.55").m16384OooO00o();
    public static final LlLI1 o0O00o0 = new LlLI1("2.5.29.27").m16384OooO00o();
    public static final LlLI1 oo00oO = new LlLI1("2.5.29.35").m16384OooO00o();
    public AbstractC6804llL1ii OooO00o;
    public boolean OooO0O0;
    public LlLI1 o00OoOOo;

    public C5237III(I11li1 i11li1) {
        AbstractC6854lLi1LL OooO00o2;
        if (i11li1.size() == 2) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.OooO0O0 = false;
            OooO00o2 = i11li1.OooO00o(1);
        } else if (i11li1.size() == 3) {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
            this.OooO0O0 = C5514IL.OooO00o(i11li1.OooO00o(1)).m15792OooO0O0();
            OooO00o2 = i11li1.OooO00o(2);
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2);
    }

    public C5237III(LlLI1 llLI1, C5514IL r2, AbstractC6804llL1ii r3) {
        this(llLI1, r2.m15792OooO0O0(), r3);
    }

    public C5237III(LlLI1 llLI1, boolean z, AbstractC6804llL1ii r3) {
        this.o00OoOOo = llLI1;
        this.OooO0O0 = z;
        this.OooO00o = r3;
    }

    public C5237III(LlLI1 llLI1, boolean z, byte[] bArr) {
        this(llLI1, z, new C6487lIIiIlL(bArr));
    }

    public static C5237III OooO00o(Object obj) {
        if (obj instanceof C5237III) {
            return (C5237III) obj;
        }
        if (obj != null) {
            return new C5237III(I11li1.OooO00o(obj));
        }
        return null;
    }

    public static AbstractC6122iIlLiL OooO00o(C5237III r3) throws IllegalArgumentException {
        try {
            return AbstractC6122iIlLiL.OooO00o(r3.m15433OooO00o().m17938OooO00o());
        } catch (IOException e) {
            throw new IllegalArgumentException("can't convert extension: " + e);
        }
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m15433OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15434OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        if (this.OooO0O0) {
            r0.OooO00o(C5514IL.OooO00o(true));
        }
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m15435OooO0O0() {
        return OooO00o(this);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public boolean equals(Object obj) {
        if (!(obj instanceof C5237III)) {
            return false;
        }
        C5237III r4 = (C5237III) obj;
        return r4.OooO00o().equals(OooO00o()) && r4.m15433OooO00o().equals(m15433OooO00o()) && r4.m15434OooO00o() == m15434OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int hashCode() {
        return m15434OooO00o() ? m15433OooO00o().hashCode() ^ OooO00o().hashCode() : (m15433OooO00o().hashCode() ^ OooO00o().hashCode()) ^ -1;
    }
}
