package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Li11L1 */
public class Li11L1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9726llL[] f16548OooO00o;

    public Li11L1(int i) {
        this.OooO00o = i;
        this.f16548OooO00o = new AbstractC9726llL[i];
    }

    public Li11L1(int i, AbstractC9726llL r4) {
        this.OooO00o = i;
        this.f16548OooO00o = new AbstractC9726llL[i];
        for (int i2 = 0; i2 < this.OooO00o; i2++) {
            this.f16548OooO00o[i2] = (AbstractC9726llL) r4.clone();
        }
    }

    public Li11L1(Li11L1 li11L1) {
        int i = li11L1.OooO00o;
        this.f16548OooO00o = new AbstractC9726llL[i];
        this.OooO00o = i;
        for (int i2 = 0; i2 < this.OooO00o; i2++) {
            this.f16548OooO00o[i2] = (AbstractC9726llL) li11L1.f16548OooO00o[i2].clone();
        }
    }

    public Li11L1(C1IilLL r4, lLiLLl1 r5) {
        int OooO00o2 = r5.OooO00o() + 1;
        this.OooO00o = OooO00o2;
        this.f16548OooO00o = new AbstractC9726llL[OooO00o2];
        int i = 0;
        if (r5 instanceof LIilll) {
            while (i < this.OooO00o) {
                if (r4.m21281OooO00o(i)) {
                    this.f16548OooO00o[i] = C5160I11L.OooO00o((LIilll) r5);
                } else {
                    this.f16548OooO00o[i] = C5160I11L.OooO0O0((LIilll) r5);
                }
                i++;
            }
        } else if (r5 instanceof C6865lil11) {
            while (i < this.OooO00o) {
                if (r4.m21281OooO00o(i)) {
                    this.f16548OooO00o[i] = i1IIiLL.OooO00o((C6865lil11) r5);
                } else {
                    this.f16548OooO00o[i] = i1IIiLL.OooO0O0((C6865lil11) r5);
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("PolynomialGF2n(Bitstring, GF2nField): B1 must be an instance of GF2nONBField or GF2nPolynomialField!");
        }
    }

    public final int OooO00o() {
        for (int i = this.OooO00o - 1; i >= 0; i--) {
            if (!this.f16548OooO00o[i].m21441OooO00o()) {
                return i;
            }
        }
        return -1;
    }

    public final Li11L1 OooO00o(int i) {
        if (i <= 0) {
            return new Li11L1(this);
        }
        Li11L1 li11L1 = new Li11L1(this.OooO00o + i, this.f16548OooO00o[0]);
        li11L1.m16275OooO00o();
        for (int i2 = 0; i2 < this.OooO00o; i2++) {
            li11L1.f16548OooO00o[i2 + i] = this.f16548OooO00o[i2];
        }
        return li11L1;
    }

    public final Li11L1 OooO00o(Li11L1 li11L1) {
        Li11L1 li11L12;
        int i = 0;
        if (OooO0O0() >= li11L1.OooO0O0()) {
            li11L12 = new Li11L1(OooO0O0());
            while (i < li11L1.OooO0O0()) {
                li11L12.f16548OooO00o[i] = (AbstractC9726llL) this.f16548OooO00o[i].OooO00o((AbstractC9371Ii11) li11L1.f16548OooO00o[i]);
                i++;
            }
            while (i < OooO0O0()) {
                li11L12.f16548OooO00o[i] = this.f16548OooO00o[i];
                i++;
            }
        } else {
            li11L12 = new Li11L1(li11L1.OooO0O0());
            while (i < OooO0O0()) {
                li11L12.f16548OooO00o[i] = (AbstractC9726llL) this.f16548OooO00o[i].OooO00o((AbstractC9371Ii11) li11L1.f16548OooO00o[i]);
                i++;
            }
            while (i < li11L1.OooO0O0()) {
                li11L12.f16548OooO00o[i] = li11L1.f16548OooO00o[i];
                i++;
            }
        }
        return li11L12;
    }

    public final Li11L1 OooO00o(Li11L1 li11L1, Li11L1 li11L12) {
        return OooO0OO(li11L1).OooO0o0(li11L12);
    }

    public final Li11L1 OooO00o(AbstractC9726llL r5) {
        Li11L1 li11L1 = new Li11L1(OooO0O0());
        for (int i = 0; i < OooO0O0(); i++) {
            li11L1.f16548OooO00o[i] = (AbstractC9726llL) this.f16548OooO00o[i].OooO0OO((AbstractC9371Ii11) r5);
        }
        return li11L1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AbstractC9726llL m16274OooO00o(int i) {
        return this.f16548OooO00o[i];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m16275OooO00o() {
        for (int i = 0; i < this.OooO00o; i++) {
            this.f16548OooO00o[i].m21774OooO0O0();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m16276OooO00o(int i) {
        int i2 = this.OooO00o;
        if (i > i2) {
            AbstractC9726llL[] r1 = new AbstractC9726llL[i];
            System.arraycopy(this.f16548OooO00o, 0, r1, 0, i2);
            lLiLLl1 OooO00o2 = this.f16548OooO00o[0].m21771OooO00o();
            AbstractC9726llL[] r2 = this.f16548OooO00o;
            if (r2[0] instanceof i1IIiLL) {
                for (int i3 = this.OooO00o; i3 < i; i3++) {
                    r1[i3] = i1IIiLL.OooO0O0((C6865lil11) OooO00o2);
                }
            } else if (r2[0] instanceof C5160I11L) {
                for (int i4 = this.OooO00o; i4 < i; i4++) {
                    r1[i4] = C5160I11L.OooO0O0((LIilll) OooO00o2);
                }
            }
            this.OooO00o = i;
            this.f16548OooO00o = r1;
        }
    }

    public final void OooO00o(int i, AbstractC9726llL r3) {
        if ((r3 instanceof i1IIiLL) || (r3 instanceof C5160I11L)) {
            this.f16548OooO00o[i] = (AbstractC9726llL) r3.clone();
            return;
        }
        throw new IllegalArgumentException("PolynomialGF2n.set f must be an instance of either GF2nPolynomialElement or GF2nONBElement!");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m16277OooO00o() {
        for (int i = 0; i < this.OooO00o; i++) {
            AbstractC9726llL[] r2 = this.f16548OooO00o;
            if (!(r2[i] == null || r2[i].m21441OooO00o())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Li11L1[] m16278OooO00o(Li11L1 li11L1) {
        Li11L1 li11L12;
        Li11L1[] li11L1Arr = new Li11L1[2];
        Li11L1 li11L13 = new Li11L1(this);
        li11L13.m16279OooO0O0();
        int OooO00o2 = li11L1.OooO00o();
        AbstractC9726llL r3 = (AbstractC9726llL) li11L1.f16548OooO00o[OooO00o2].OooO00o();
        if (li11L13.OooO00o() < OooO00o2) {
            li11L1Arr[0] = new Li11L1(this);
            li11L1Arr[0].m16275OooO00o();
            li11L1Arr[0].m16279OooO0O0();
            li11L1Arr[1] = new Li11L1(this);
            li11L12 = li11L1Arr[1];
        } else {
            li11L1Arr[0] = new Li11L1(this);
            li11L1Arr[0].m16275OooO00o();
            while (true) {
                int OooO00o3 = li11L13.OooO00o() - OooO00o2;
                if (OooO00o3 < 0) {
                    break;
                }
                AbstractC9726llL r7 = (AbstractC9726llL) li11L13.f16548OooO00o[li11L13.OooO00o()].OooO0OO((AbstractC9371Ii11) r3);
                Li11L1 OooO00o4 = li11L1.OooO00o(r7);
                OooO00o4.OooO0O0(OooO00o3);
                li11L13 = li11L13.OooO00o(OooO00o4);
                li11L13.m16279OooO0O0();
                li11L1Arr[0].f16548OooO00o[OooO00o3] = (AbstractC9726llL) r7.clone();
            }
            li11L1Arr[1] = li11L13;
            li11L12 = li11L1Arr[0];
        }
        li11L12.m16279OooO0O0();
        return li11L1Arr;
    }

    public final int OooO0O0() {
        return this.OooO00o;
    }

    public final Li11L1 OooO0O0(Li11L1 li11L1) {
        Li11L1 li11L12 = new Li11L1(this);
        Li11L1 li11L13 = new Li11L1(li11L1);
        li11L12.m16279OooO0O0();
        li11L13.m16279OooO0O0();
        Li11L1 li11L14 = li11L12;
        Li11L1 li11L15 = li11L13;
        while (!li11L15.m16277OooO00o()) {
            li11L15 = li11L14.OooO0o(li11L15);
            li11L14 = li11L15;
        }
        return li11L14.OooO00o((AbstractC9726llL) li11L14.f16548OooO00o[li11L14.OooO00o()].OooO00o());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final void m16279OooO0O0() {
        int i = this.OooO00o;
        while (true) {
            i--;
            if (!this.f16548OooO00o[i].m21441OooO00o() || i <= 0) {
                int i2 = i + 1;
            }
        }
        int i22 = i + 1;
        if (i22 < this.OooO00o) {
            AbstractC9726llL[] r1 = new AbstractC9726llL[i22];
            System.arraycopy(this.f16548OooO00o, 0, r1, 0, i22);
            this.f16548OooO00o = r1;
            this.OooO00o = i22;
        }
    }

    public final void OooO0O0(int i) {
        if (i > 0) {
            int i2 = this.OooO00o;
            lLiLLl1 OooO00o2 = this.f16548OooO00o[0].m21771OooO00o();
            m16276OooO00o(this.OooO00o + i);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                AbstractC9726llL[] r3 = this.f16548OooO00o;
                r3[i3 + i] = r3[i3];
            }
            AbstractC9726llL[] r0 = this.f16548OooO00o;
            if (r0[0] instanceof i1IIiLL) {
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    this.f16548OooO00o[i4] = i1IIiLL.OooO0O0((C6865lil11) OooO00o2);
                }
            } else if (r0[0] instanceof C5160I11L) {
                for (int i5 = i - 1; i5 >= 0; i5--) {
                    this.f16548OooO00o[i5] = C5160I11L.OooO0O0((LIilll) OooO00o2);
                }
            }
        }
    }

    public final Li11L1 OooO0OO(Li11L1 li11L1) {
        int OooO0O0 = OooO0O0();
        if (OooO0O0 == li11L1.OooO0O0()) {
            Li11L1 li11L12 = new Li11L1((OooO0O0 << 1) - 1);
            for (int i = 0; i < OooO0O0(); i++) {
                for (int i2 = 0; i2 < li11L1.OooO0O0(); i2++) {
                    AbstractC9726llL[] r4 = li11L12.f16548OooO00o;
                    int i3 = i + i2;
                    if (r4[i3] == null) {
                        r4[i3] = (AbstractC9726llL) this.f16548OooO00o[i].OooO0OO((AbstractC9371Ii11) li11L1.f16548OooO00o[i2]);
                    } else {
                        r4[i3] = (AbstractC9726llL) r4[i3].OooO00o(this.f16548OooO00o[i].OooO0OO((AbstractC9371Ii11) li11L1.f16548OooO00o[i2]));
                    }
                }
            }
            return li11L12;
        }
        throw new IllegalArgumentException("PolynomialGF2n.multiply: this and b must have the same size!");
    }

    public final Li11L1 OooO0Oo(Li11L1 li11L1) throws RuntimeException, ArithmeticException {
        return m16278OooO00o(li11L1)[0];
    }

    public final Li11L1 OooO0o(Li11L1 li11L1) throws RuntimeException, ArithmeticException {
        return m16278OooO00o(li11L1)[1];
    }

    public final Li11L1 OooO0o0(Li11L1 li11L1) throws RuntimeException, ArithmeticException {
        return OooO0o(li11L1);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Li11L1)) {
            return false;
        }
        Li11L1 li11L1 = (Li11L1) obj;
        if (OooO00o() != li11L1.OooO00o()) {
            return false;
        }
        for (int i = 0; i < this.OooO00o; i++) {
            if (!this.f16548OooO00o[i].equals(li11L1.f16548OooO00o[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return OooO00o() + this.f16548OooO00o.hashCode();
    }
}
