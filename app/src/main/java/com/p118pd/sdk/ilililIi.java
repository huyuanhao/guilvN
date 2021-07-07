package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.ilililIi */
public class ilililIi extends AbstractC5738Lil {
    public C5845LIillll OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18060OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f18061OooO00o;

    public ilililIi(I11li1 i11li1) {
        this.f18061OooO00o = null;
        this.OooO00o = null;
        this.f18060OooO00o = null;
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2.nextElement());
            int OooO00o4 = OooO00o3.OooO00o();
            if (OooO00o4 == 0) {
                this.f18061OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o3, false);
            } else if (OooO00o4 == 1) {
                this.OooO00o = C5845LIillll.OooO00o(OooO00o3, false);
            } else if (OooO00o4 == 2) {
                this.f18060OooO00o = C6513lIiI.OooO00o(OooO00o3, false);
            } else {
                throw new IllegalArgumentException("illegal tag");
            }
        }
    }

    public ilililIi(C5845LIillll r2, BigInteger bigInteger) {
        this((byte[]) null, r2, bigInteger);
    }

    public ilililIi(C6888ll r5) {
        this.f18061OooO00o = null;
        this.OooO00o = null;
        this.f18060OooO00o = null;
        C6461l1liI l1lii = new C6461l1liI();
        byte[] bArr = new byte[l1lii.OooO0O0()];
        byte[] OooO00o2 = r5.OooO00o().m15475OooO00o();
        l1lii.update(OooO00o2, 0, OooO00o2.length);
        l1lii.OooO00o(bArr, 0);
        this.f18061OooO00o = new C6487lIIiIlL(bArr);
    }

    public ilililIi(C6888ll r5, C5845LIillll r6, BigInteger bigInteger) {
        this.f18061OooO00o = null;
        this.OooO00o = null;
        this.f18060OooO00o = null;
        C6461l1liI l1lii = new C6461l1liI();
        byte[] bArr = new byte[l1lii.OooO0O0()];
        byte[] OooO00o2 = r5.OooO00o().m15475OooO00o();
        l1lii.update(OooO00o2, 0, OooO00o2.length);
        l1lii.OooO00o(bArr, 0);
        this.f18061OooO00o = new C6487lIIiIlL(bArr);
        this.OooO00o = C5845LIillll.OooO00o(r6.OooO0O0());
        this.f18060OooO00o = new C6513lIiI(bigInteger);
    }

    public ilililIi(byte[] bArr) {
        this(bArr, (C5845LIillll) null, (BigInteger) null);
    }

    public ilililIi(byte[] bArr, C5845LIillll r4, BigInteger bigInteger) {
        C6513lIiI r0 = null;
        this.f18061OooO00o = null;
        this.OooO00o = null;
        this.f18060OooO00o = null;
        this.f18061OooO00o = bArr != null ? new C6487lIIiIlL(bArr) : null;
        this.OooO00o = r4;
        this.f18060OooO00o = bigInteger != null ? new C6513lIiI(bigInteger) : r0;
    }

    public static ilililIi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static ilililIi OooO00o(iI11IL r1) {
        return OooO00o(r1.m17472OooO00o(C5237III.oo00oO));
    }

    public static ilililIi OooO00o(Object obj) {
        if (obj instanceof ilililIi) {
            return (ilililIi) obj;
        }
        if (obj != null) {
            return new ilililIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5845LIillll OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17391OooO00o() {
        C6513lIiI r0 = this.f18060OooO00o;
        if (r0 != null) {
            return r0.m17647OooO0O0();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17392OooO00o() {
        AbstractC6804llL1ii r0 = this.f18061OooO00o;
        if (r0 != null) {
            return r0.m17938OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f18061OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f18061OooO00o));
        }
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO00o));
        }
        if (this.f18060OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 2, this.f18060OooO00o));
        }
        return new C5707LiL1(r0);
    }

    public String toString() {
        return "AuthorityKeyIdentifier: KeyID(" + this.f18061OooO00o.m17938OooO00o() + C3848l.f10402t;
    }
}
