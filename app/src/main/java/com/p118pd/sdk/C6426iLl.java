package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.i丨丨Ll  reason: invalid class name and case insensitive filesystem */
public class C6426iLl extends AbstractC5738Lil {
    public static final C6513lIiI OooO00o = new C6513lIiI(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final iIilII1 f18237OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f18238OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f18239OooO00o;

    /* renamed from: com.pd.sdk.i丨丨Ll$OooO0O0 */
    public class OooO0O0 extends AbstractC5738Lil {
        public final I11L OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final I11li1 f18240OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final l1LILI1 f18242OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6513lIiI f18243OooO00o;

        public OooO0O0(I11li1 i11li1) {
            if (i11li1.size() == 4) {
                this.f18243OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
                this.f18242OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(1));
                I11li1 OooO00o2 = I11li1.OooO00o(i11li1.OooO00o(2));
                this.f18240OooO00o = OooO00o2;
                if (OooO00o2.size() == 2) {
                    AbstractC5903LlLLL r4 = (AbstractC5903LlLLL) i11li1.OooO00o(3);
                    if (r4.OooO00o() == 0) {
                        this.OooO00o = I11L.OooO00o(r4, false);
                        return;
                    }
                    throw new IllegalArgumentException("incorrect tag number on attributes for CertificationRequestInfo");
                }
                throw new IllegalArgumentException("incorrect subjectPublicKeyInfo size for CertificationRequestInfo");
            }
            throw new IllegalArgumentException("incorrect sequence size for CertificationRequestInfo");
        }

        public OooO0O0(l1LILI1 r3, C6456l1ilL r4, iIilII1 iiilii1, I11L i11l) {
            this.f18243OooO00o = C6426iLl.OooO00o;
            this.f18242OooO00o = r3;
            this.f18240OooO00o = new C5707LiL1(new AbstractC6854lLi1LL[]{r4, iiilii1});
            this.OooO00o = i11l;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private I11L OooO00o() {
            return this.OooO00o;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: OooO00o  reason: collision with other method in class */
        private I11li1 m17544OooO00o() {
            return this.f18240OooO00o;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: OooO00o  reason: collision with other method in class */
        private l1LILI1 m17545OooO00o() {
            return this.f18242OooO00o;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: OooO00o  reason: collision with other method in class */
        private C6513lIiI m17546OooO00o() {
            return this.f18243OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
        public AbstractC6122iIlLiL OooO0O0() {
            iILLL1 r0 = new iILLL1();
            r0.OooO00o(this.f18243OooO00o);
            r0.OooO00o(this.f18242OooO00o);
            r0.OooO00o(this.f18240OooO00o);
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
            return new C5707LiL1(r0);
        }
    }

    public C6426iLl(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.f18238OooO00o = new OooO0O0(I11li1.OooO00o(i11li1.OooO00o(0)));
            this.f18239OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            this.f18237OooO00o = iIilII1.OooO00o(i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C6426iLl(l1LILI1 r9, C6456l1ilL r10, iIilII1 iiilii1, I11L i11l, C6456l1ilL r13, iIilII1 iiilii12) {
        this.f18238OooO00o = new OooO0O0(r9, r10, iiilii1, i11l);
        this.f18239OooO00o = r13;
        this.f18237OooO00o = iiilii12;
    }

    public static C6426iLl OooO00o(Object obj) {
        if (obj instanceof C6426iLl) {
            return (C6426iLl) obj;
        }
        if (obj != null) {
            return new C6426iLl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.f18238OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m17538OooO00o() {
        return this.f18237OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m17539OooO00o() {
        return this.f18238OooO00o.m17545OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17540OooO00o() {
        return this.f18239OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17541OooO00o() {
        return this.f18238OooO00o.m17546OooO00o().m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public iIilII1 OooO0O0() {
        return iIilII1.OooO00o(this.f18238OooO00o.m17544OooO00o().OooO00o(1));
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17542OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18238OooO00o);
        r0.OooO00o(this.f18239OooO00o);
        r0.OooO00o(this.f18237OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17543OooO0O0() {
        return C6456l1ilL.OooO00o(this.f18238OooO00o.m17544OooO00o().OooO00o(0));
    }

    public AbstractC6122iIlLiL OooO0Oo() throws IOException {
        return AbstractC6122iIlLiL.OooO00o(OooO0O0().OooO0O0());
    }
}
