package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.lli11  reason: case insensitive filesystem */
public class C6782lli11 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5432IlIlIlL f18811OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f18812OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f18813OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18814OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18815OooO00o;
    public C5432IlIlIlL OooO0O0;

    /* renamed from: com.pd.sdk.lli11$OooO0O0 */
    public static class OooO0O0 extends AbstractC5738Lil {
        public I11li1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public iI11IL f18816OooO00o;

        public OooO0O0(I11li1 i11li1) {
            if (i11li1.size() < 2 || i11li1.size() > 3) {
                throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
            }
            this.OooO00o = i11li1;
        }

        public static OooO0O0 OooO00o(Object obj) {
            if (obj instanceof OooO0O0) {
                return (OooO0O0) obj;
            }
            if (obj != null) {
                return new OooO0O0(I11li1.OooO00o(obj));
            }
            return null;
        }

        public C5432IlIlIlL OooO00o() {
            return C5432IlIlIlL.OooO00o(this.OooO00o.OooO00o(1));
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public iI11IL m17909OooO00o() {
            if (this.f18816OooO00o == null && this.OooO00o.size() == 3) {
                this.f18816OooO00o = iI11IL.OooO00o(this.OooO00o.OooO00o(2));
            }
            return this.f18816OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6513lIiI m17910OooO00o() {
            return C6513lIiI.OooO00o(this.OooO00o.OooO00o(0));
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m17911OooO00o() {
            return this.OooO00o.size() == 3;
        }

        @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
        public AbstractC6122iIlLiL OooO0O0() {
            return this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.lli11$OooO0OO */
    public class OooO0OO implements Enumeration {
        public OooO0OO() {
        }

        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }
    }

    /* renamed from: com.pd.sdk.lli11$OooO0Oo  reason: case insensitive filesystem */
    public class C6783OooO0Oo implements Enumeration {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Enumeration f18817OooO00o;

        public C6783OooO0Oo(Enumeration enumeration) {
            this.f18817OooO00o = enumeration;
        }

        public boolean hasMoreElements() {
            return this.f18817OooO00o.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return OooO0O0.OooO00o(this.f18817OooO00o.nextElement());
        }
    }

    public C6782lli11(I11li1 i11li1) {
        if (i11li1.size() < 3 || i11li1.size() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        int i = 0;
        if (i11li1.OooO00o(0) instanceof C6513lIiI) {
            this.f18815OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
            i = 1;
        } else {
            this.f18815OooO00o = null;
        }
        int i2 = i + 1;
        this.f18814OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(i));
        int i3 = i2 + 1;
        this.f18813OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(i2));
        int i4 = i3 + 1;
        this.f18811OooO00o = C5432IlIlIlL.OooO00o(i11li1.OooO00o(i3));
        if (i4 < i11li1.size() && ((i11li1.OooO00o(i4) instanceof LL1IL) || (i11li1.OooO00o(i4) instanceof C9623il) || (i11li1.OooO00o(i4) instanceof C5432IlIlIlL))) {
            this.OooO0O0 = C5432IlIlIlL.OooO00o(i11li1.OooO00o(i4));
            i4++;
        }
        if (i4 < i11li1.size() && !(i11li1.OooO00o(i4) instanceof AbstractC5903LlLLL)) {
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(i4));
            i4++;
        }
        if (i4 < i11li1.size() && (i11li1.OooO00o(i4) instanceof AbstractC5903LlLLL)) {
            this.f18812OooO00o = iI11IL.OooO00o(I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(i4), true));
        }
    }

    public static C6782lli11 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6782lli11 OooO00o(Object obj) {
        if (obj instanceof C6782lli11) {
            return (C6782lli11) obj;
        }
        if (obj != null) {
            return new C6782lli11(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5432IlIlIlL OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m17901OooO00o() {
        return this.f18812OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m17902OooO00o() {
        return this.f18813OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17903OooO00o() {
        return this.f18814OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17904OooO00o() {
        return this.f18815OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Enumeration m17905OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        return i11li1 == null ? new OooO0OO() : new C6783OooO0Oo(i11li1.m15236OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0O0[] m17906OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return new OooO0O0[0];
        }
        int size = i11li1.size();
        OooO0O0[] oooO0O0Arr = new OooO0O0[size];
        for (int i = 0; i < size; i++) {
            oooO0O0Arr[i] = OooO0O0.OooO00o(this.OooO00o.OooO00o(i));
        }
        return oooO0O0Arr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        C6513lIiI r0 = this.f18815OooO00o;
        if (r0 == null) {
            return 1;
        }
        return r0.m17647OooO0O0().intValue() + 1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5432IlIlIlL m17907OooO0O0() {
        return this.f18811OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17908OooO0O0() {
        iILLL1 r0 = new iILLL1();
        C6513lIiI r1 = this.f18815OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        r0.OooO00o(this.f18814OooO00o);
        r0.OooO00o(this.f18813OooO00o);
        r0.OooO00o(this.f18811OooO00o);
        C5432IlIlIlL r12 = this.OooO0O0;
        if (r12 != null) {
            r0.OooO00o(r12);
        }
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        if (this.f18812OooO00o != null) {
            r0.OooO00o(new ILI1Ll(0, this.f18812OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
