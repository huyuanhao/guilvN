package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.iLI丨I1ii  reason: invalid class name */
public class iLII1ii extends AbstractC5738Lil {
    public C5514IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17713OooO00o;

    public iLII1ii(int i) {
        this.OooO00o = C5514IL.OooO00o(false);
        this.f17713OooO00o = null;
        this.OooO00o = C5514IL.OooO00o(true);
        this.f17713OooO00o = new C6513lIiI((long) i);
    }

    public iLII1ii(I11li1 i11li1) {
        this.OooO00o = C5514IL.OooO00o(false);
        this.f17713OooO00o = null;
        if (i11li1.size() == 0) {
            this.OooO00o = null;
            this.f17713OooO00o = null;
            return;
        }
        if (i11li1.OooO00o(0) instanceof C5514IL) {
            this.OooO00o = C5514IL.OooO00o(i11li1.OooO00o(0));
        } else {
            this.OooO00o = null;
            this.f17713OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        }
        if (i11li1.size() <= 1) {
            return;
        }
        if (this.OooO00o != null) {
            this.f17713OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("wrong sequence in constructor");
    }

    public iLII1ii(boolean z) {
        this.OooO00o = C5514IL.OooO00o(false);
        this.f17713OooO00o = null;
        if (z) {
            this.OooO00o = C5514IL.OooO00o(true);
        } else {
            this.OooO00o = null;
        }
        this.f17713OooO00o = null;
    }

    public static iLII1ii OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static iLII1ii OooO00o(iI11IL r1) {
        return OooO00o(r1.m17472OooO00o(C5237III.o00Ooo0o));
    }

    public static iLII1ii OooO00o(Object obj) {
        if (obj instanceof iLII1ii) {
            return (iLII1ii) obj;
        }
        if (obj instanceof C5551IiL) {
            return OooO00o(C5551IiL.OooO00o((C5551IiL) obj));
        }
        if (obj != null) {
            return new iLII1ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        C6513lIiI r0 = this.f17713OooO00o;
        if (r0 != null) {
            return r0.m17647OooO0O0();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17107OooO00o() {
        C5514IL r0 = this.OooO00o;
        return r0 != null && r0.m15792OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        C5514IL r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        C6513lIiI r12 = this.f17713OooO00o;
        if (r12 != null) {
            r0.OooO00o(r12);
        }
        return new C5707LiL1(r0);
    }

    public String toString() {
        StringBuilder sb;
        if (this.f17713OooO00o != null) {
            sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(m17107OooO00o());
            sb.append("), pathLenConstraint = ");
            sb.append(this.f17713OooO00o.m17647OooO0O0());
        } else if (this.OooO00o == null) {
            return "BasicConstraints: isCa(false)";
        } else {
            sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(m17107OooO00o());
            sb.append(C3848l.f10402t);
        }
        return sb.toString();
    }
}
