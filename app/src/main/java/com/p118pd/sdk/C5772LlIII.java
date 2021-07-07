package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.LlIII  reason: case insensitive filesystem */
public class C5772LlIII extends AbstractC5738Lil {
    public static final C6456l1ilL OooO0O0 = new C6456l1ilL(AbstractC5711LiLli.Oooooo, C6452l1Lll.OooO00o);
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6513lIiI f16690OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6804llL1ii f16691OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final C6513lIiI f16692OooO0O0;

    public C5772LlIII(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.f16691OooO00o = (AbstractC6804llL1ii) OooO00o2.nextElement();
        this.f16690OooO00o = (C6513lIiI) OooO00o2.nextElement();
        if (OooO00o2.hasMoreElements()) {
            Object nextElement = OooO00o2.nextElement();
            if (nextElement instanceof C6513lIiI) {
                this.f16692OooO0O0 = C6513lIiI.OooO00o(nextElement);
                nextElement = OooO00o2.hasMoreElements() ? OooO00o2.nextElement() : null;
            } else {
                this.f16692OooO0O0 = null;
            }
            if (nextElement != null) {
                this.OooO00o = C6456l1ilL.OooO00o(nextElement);
                return;
            }
        } else {
            this.f16692OooO0O0 = null;
        }
        this.OooO00o = null;
    }

    public C5772LlIII(byte[] bArr, int i) {
        this(bArr, i, 0);
    }

    public C5772LlIII(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, null);
    }

    public C5772LlIII(byte[] bArr, int i, int i2, C6456l1ilL r6) {
        this.f16691OooO00o = new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
        this.f16690OooO00o = new C6513lIiI((long) i);
        this.f16692OooO0O0 = i2 > 0 ? new C6513lIiI((long) i2) : null;
        this.OooO00o = r6;
    }

    public C5772LlIII(byte[] bArr, int i, C6456l1ilL r4) {
        this(bArr, i, 0, r4);
    }

    public static C5772LlIII OooO00o(Object obj) {
        if (obj instanceof C5772LlIII) {
            return (C5772LlIII) obj;
        }
        if (obj != null) {
            return new C5772LlIII(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        C6456l1ilL r0 = this.OooO00o;
        return r0 != null ? r0 : OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16365OooO00o() {
        return this.f16690OooO00o.m17647OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16366OooO00o() {
        C6456l1ilL r0 = this.OooO00o;
        return r0 == null || r0.equals(OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16367OooO00o() {
        return this.f16691OooO00o.m17938OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16691OooO00o);
        r0.OooO00o(this.f16690OooO00o);
        C6513lIiI r1 = this.f16692OooO0O0;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        C6456l1ilL r12 = this.OooO00o;
        if (r12 != null && !r12.equals(OooO0O0)) {
            r0.OooO00o(this.OooO00o);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16368OooO0O0() {
        C6513lIiI r0 = this.f16692OooO0O0;
        if (r0 != null) {
            return r0.m17647OooO0O0();
        }
        return null;
    }
}
