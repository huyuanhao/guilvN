package com.p118pd.sdk;

import java.security.SecureRandom;
import java.util.Vector;

/* renamed from: com.pd.sdk.lL丨iLLl1  reason: invalid class name */
public abstract class lLiLLl1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1IilLL f18572OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SecureRandom f18573OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f18574OooO00o;
    public Vector OooO0O0;

    public lLiLLl1(SecureRandom secureRandom) {
        this.f18573OooO00o = secureRandom;
    }

    public final int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C1IilLL m17716OooO00o() {
        if (this.f18572OooO00o == null) {
            m17717OooO00o();
        }
        return new C1IilLL(this.f18572OooO00o);
    }

    public abstract AbstractC9726llL OooO00o(C1IilLL v);

    public final AbstractC9726llL OooO00o(AbstractC9726llL r5, lLiLLl1 r6) throws RuntimeException {
        if (r6 == this || this.f18572OooO00o.equals(r6.f18572OooO00o)) {
            return (AbstractC9726llL) r5.clone();
        }
        if (this.OooO00o == r6.OooO00o) {
            int indexOf = this.f18574OooO00o.indexOf(r6);
            if (indexOf == -1) {
                OooO00o(r6);
                indexOf = this.f18574OooO00o.indexOf(r6);
            }
            C1IilLL[] r0 = (C1IilLL[]) this.OooO0O0.elementAt(indexOf);
            AbstractC9726llL r52 = (AbstractC9726llL) r5.clone();
            if (r52 instanceof C5160I11L) {
                ((C5160I11L) r52).OooO0oO();
            }
            C1IilLL r1 = new C1IilLL(this.OooO00o, r52.m21439OooO00o());
            r1.m21277OooO00o(this.OooO00o);
            C1IilLL r53 = new C1IilLL(this.OooO00o);
            for (int i = 0; i < this.OooO00o; i++) {
                if (r1.m21282OooO00o(r0[i])) {
                    r53.m21291OooO0OO((this.OooO00o - 1) - i);
                }
            }
            if (r6 instanceof C6865lil11) {
                return new i1IIiLL((C6865lil11) r6, r53);
            }
            if (r6 instanceof LIilll) {
                C5160I11L r02 = new C5160I11L((LIilll) r6, r53.m21275OooO00o());
                r02.OooO0oO();
                return r02;
            }
            throw new RuntimeException("GF2nField.convert: B1 must be an instance of GF2nPolynomialField or GF2nONBField!");
        }
        throw new RuntimeException("GF2nField.convert: B1 has a different degree and thus cannot be coverted to!");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m17717OooO00o();

    public abstract void OooO00o(lLiLLl1 v);

    public final C1IilLL[] OooO00o(C1IilLL[] r7) {
        C1IilLL[] r0 = new C1IilLL[r7.length];
        C1IilLL[] r1 = new C1IilLL[r7.length];
        int i = 0;
        for (int i2 = 0; i2 < this.OooO00o; i2++) {
            r0[i2] = new C1IilLL(r7[i2]);
            r1[i2] = new C1IilLL(this.OooO00o);
            r1[i2].m21291OooO0OO((this.OooO00o - 1) - i2);
        }
        while (true) {
            int i3 = this.OooO00o;
            if (i < i3 - 1) {
                int i4 = i;
                while (true) {
                    int i5 = this.OooO00o;
                    if (i4 < i5 && !r0[i4].m21281OooO00o((i5 - 1) - i)) {
                        i4++;
                    }
                }
                if (i4 < this.OooO00o) {
                    if (i != i4) {
                        C1IilLL r3 = r0[i];
                        r0[i] = r0[i4];
                        r0[i4] = r3;
                        C1IilLL r32 = r1[i];
                        r1[i] = r1[i4];
                        r1[i4] = r32;
                    }
                    int i6 = i + 1;
                    int i7 = i6;
                    while (true) {
                        int i8 = this.OooO00o;
                        if (i7 >= i8) {
                            break;
                        }
                        if (r0[i7].m21281OooO00o((i8 - 1) - i)) {
                            r0[i7].m21279OooO00o(r0[i]);
                            r1[i7].m21279OooO00o(r1[i]);
                        }
                        i7++;
                    }
                    i = i6;
                } else {
                    throw new RuntimeException("GF2nField.invertMatrix: Matrix cannot be inverted!");
                }
            } else {
                for (int i9 = i3 - 1; i9 > 0; i9--) {
                    for (int i10 = i9 - 1; i10 >= 0; i10--) {
                        if (r0[i10].m21281OooO00o((this.OooO00o - 1) - i9)) {
                            r0[i10].m21279OooO00o(r0[i9]);
                            r1[i10].m21279OooO00o(r1[i9]);
                        }
                    }
                }
                return r1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof lLiLLl1)) {
            return false;
        }
        lLiLLl1 r4 = (lLiLLl1) obj;
        if (r4.OooO00o != this.OooO00o || !this.f18572OooO00o.equals(r4.f18572OooO00o)) {
            return false;
        }
        if (!(this instanceof C6865lil11) || (r4 instanceof C6865lil11)) {
            return !(this instanceof LIilll) || (r4 instanceof LIilll);
        }
        return false;
    }

    public int hashCode() {
        return this.OooO00o + this.f18572OooO00o.hashCode();
    }
}
