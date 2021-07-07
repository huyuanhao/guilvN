package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LlIlI丨1L  reason: invalid class name */
public class LlIlI1L extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16706OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[][] f16707OooO00o;
    public C6513lIiI OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[][] f16708OooO0O0;
    public LlLI1 o00OoOOo;

    public LlIlI1L(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.OooO00o = new C6513lIiI(0);
        this.OooO0O0 = new C6513lIiI((long) i);
        this.f16707OooO00o = C5601L1i.OooO00o(sArr);
        this.f16708OooO0O0 = C5601L1i.OooO00o(sArr2);
        this.f16706OooO00o = C5601L1i.OooO00o(sArr3);
    }

    public LlIlI1L(I11li1 i11li1) {
        if (i11li1.OooO00o(0) instanceof C6513lIiI) {
            this.OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        } else {
            this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
        }
        this.OooO0O0 = C6513lIiI.OooO00o(i11li1.OooO00o(1));
        I11li1 OooO00o2 = I11li1.OooO00o(i11li1.OooO00o(2));
        this.f16707OooO00o = new byte[OooO00o2.size()][];
        for (int i = 0; i < OooO00o2.size(); i++) {
            this.f16707OooO00o[i] = AbstractC6804llL1ii.OooO00o(OooO00o2.OooO00o(i)).m17938OooO00o();
        }
        I11li1 i11li12 = (I11li1) i11li1.OooO00o(3);
        this.f16708OooO0O0 = new byte[i11li12.size()][];
        for (int i2 = 0; i2 < i11li12.size(); i2++) {
            this.f16708OooO0O0[i2] = AbstractC6804llL1ii.OooO00o(i11li12.OooO00o(i2)).m17938OooO00o();
        }
        this.f16706OooO00o = AbstractC6804llL1ii.OooO00o(((I11li1) i11li1.OooO00o(4)).OooO00o(0)).m17938OooO00o();
    }

    public static LlIlI1L OooO00o(Object obj) {
        if (obj instanceof LlIlI1L) {
            return (LlIlI1L) obj;
        }
        if (obj != null) {
            return new LlIlI1L(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6513lIiI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[] m16375OooO00o() {
        return C5601L1i.m16006OooO00o(this.f16706OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[][] m16376OooO00o() {
        return C5601L1i.OooO00o(this.f16707OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.OooO0O0.m17647OooO0O0().intValue();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16377OooO0O0() {
        iILLL1 r0 = new iILLL1();
        AbstractC6854lLi1LL r1 = this.OooO00o;
        if (r1 == null) {
            r1 = this.o00OoOOo;
        }
        r0.OooO00o(r1);
        r0.OooO00o(this.OooO0O0);
        iILLL1 r12 = new iILLL1();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.f16707OooO00o;
            if (i2 >= bArr.length) {
                break;
            }
            r12.OooO00o(new C6487lIIiIlL(bArr[i2]));
            i2++;
        }
        r0.OooO00o(new C5707LiL1(r12));
        iILLL1 r13 = new iILLL1();
        while (true) {
            byte[][] bArr2 = this.f16708OooO0O0;
            if (i < bArr2.length) {
                r13.OooO00o(new C6487lIIiIlL(bArr2[i]));
                i++;
            } else {
                r0.OooO00o(new C5707LiL1(r13));
                iILLL1 r14 = new iILLL1();
                r14.OooO00o(new C6487lIIiIlL(this.f16706OooO00o));
                r0.OooO00o(new C5707LiL1(r14));
                return new C5707LiL1(r0);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public short[][] m16378OooO0O0() {
        return C5601L1i.OooO00o(this.f16708OooO0O0);
    }
}
