package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨iL1  reason: invalid class name and case insensitive filesystem */
public class C9603iL1 extends AbstractC5738Lil {
    public static final BigInteger OooO00o = BigInteger.valueOf(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f23178OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f23179OooO00o;
    public C6513lIiI OooO0O0;

    public C9603iL1(I11li1 i11li1) {
        AbstractC5903LlLLL r6;
        this.f23178OooO00o = ILI.OooO00o(i11li1.OooO00o(0));
        int size = i11li1.size();
        if (size != 1) {
            if (size == 2) {
                r6 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1));
                int OooO00o2 = r6.OooO00o();
                if (OooO00o2 == 0) {
                    this.f23179OooO00o = C6513lIiI.OooO00o(r6, false);
                    return;
                } else if (OooO00o2 != 1) {
                    throw new IllegalArgumentException("Bad tag number: " + r6.OooO00o());
                }
            } else if (size == 3) {
                AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1));
                if (OooO00o3.OooO00o() == 0) {
                    this.f23179OooO00o = C6513lIiI.OooO00o(OooO00o3, false);
                    r6 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(2));
                    if (r6.OooO00o() != 1) {
                        throw new IllegalArgumentException("Bad tag number for 'maximum': " + r6.OooO00o());
                    }
                } else {
                    throw new IllegalArgumentException("Bad tag number for 'minimum': " + OooO00o3.OooO00o());
                }
            } else {
                throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
            }
            this.OooO0O0 = C6513lIiI.OooO00o(r6, false);
        }
    }

    public C9603iL1(ILI ili) {
        this(ili, null, null);
    }

    public C9603iL1(ILI ili, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f23178OooO00o = ili;
        if (bigInteger2 != null) {
            this.OooO0O0 = new C6513lIiI(bigInteger2);
        }
        this.f23179OooO00o = bigInteger == null ? null : new C6513lIiI(bigInteger);
    }

    public static C9603iL1 OooO00o(AbstractC5903LlLLL r1, boolean z) {
        return new C9603iL1(I11li1.OooO00o(r1, z));
    }

    public static C9603iL1 OooO00o(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof C9603iL1 ? (C9603iL1) obj : new C9603iL1(I11li1.OooO00o(obj));
    }

    public ILI OooO00o() {
        return this.f23178OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21659OooO00o() {
        C6513lIiI r0 = this.OooO0O0;
        if (r0 == null) {
            return null;
        }
        return r0.m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23178OooO00o);
        C6513lIiI r1 = this.f23179OooO00o;
        if (r1 != null && !r1.m17647OooO0O0().equals(OooO00o)) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f23179OooO00o));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0O0));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m21660OooO0O0() {
        C6513lIiI r0 = this.f23179OooO00o;
        return r0 == null ? OooO00o : r0.m17647OooO0O0();
    }
}
