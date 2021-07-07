package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iLLlI  reason: case insensitive filesystem */
public class C6172iLLlI extends AbstractC5738Lil {
    public static final C6456l1ilL OooO0O0 = new C6456l1ilL(AbstractC5905LllI.OooO0OO);
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C93041iI1l f17740OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17741OooO00o;

    public C6172iLLlI(I11li1 i11li1) {
        if (i11li1.size() <= 3) {
            int i = 0;
            if (i11li1.OooO00o(0) instanceof AbstractC6804llL1ii) {
                this.OooO00o = OooO0O0;
            } else {
                this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0).OooO0O0());
                i = 1;
            }
            int i2 = i + 1;
            this.f17741OooO00o = AbstractC6804llL1ii.OooO00o((Object) i11li1.OooO00o(i).OooO0O0()).m17938OooO00o();
            if (i11li1.size() > i2) {
                this.f17740OooO00o = C93041iI1l.OooO00o(i11li1.OooO00o(i2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C6172iLLlI(C6456l1ilL r2, byte[] bArr) {
        this(r2, bArr, null);
    }

    public C6172iLLlI(C6456l1ilL r1, byte[] bArr, C93041iI1l r3) {
        this.OooO00o = r1 == null ? OooO0O0 : r1;
        this.f17741OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.f17740OooO00o = r3;
    }

    public C6172iLLlI(byte[] bArr) {
        this(null, bArr, null);
    }

    public C6172iLLlI(byte[] bArr, C93041iI1l r3) {
        this(null, bArr, r3);
    }

    public static C6172iLLlI OooO00o(Object obj) {
        if (obj instanceof C6172iLLlI) {
            return (C6172iLLlI) obj;
        }
        if (obj != null) {
            return new C6172iLLlI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C93041iI1l m17124OooO00o() {
        return this.f17740OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17125OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17741OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (!this.OooO00o.equals(OooO0O0)) {
            r0.OooO00o(this.OooO00o);
        }
        r0.OooO00o(new C6487lIIiIlL(this.f17741OooO00o).m17017OooO0O0());
        C93041iI1l r1 = this.f17740OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
