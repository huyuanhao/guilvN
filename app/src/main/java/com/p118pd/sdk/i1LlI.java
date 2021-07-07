package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.i1LlI */
public class i1LlI extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LILIIiLl f17387OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5633LIiII f17388OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;

    public i1LlI(I11li1 i11li1) {
        this.OooO00o = i11li1;
        for (int i = 0; i != i11li1.size(); i++) {
            AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(i));
            int OooO00o3 = OooO00o2.OooO00o();
            if (OooO00o3 == 0) {
                this.f17388OooO00o = C5633LIiII.OooO00o(OooO00o2, true);
            } else if (OooO00o3 == 1) {
                this.OooO0O0 = C5514IL.OooO00o(OooO00o2, false).m15792OooO0O0();
            } else if (OooO00o3 == 2) {
                this.OooO0OO = C5514IL.OooO00o(OooO00o2, false).m15792OooO0O0();
            } else if (OooO00o3 == 3) {
                this.f17387OooO00o = new LILIIiLl(iIilII1.OooO00o(OooO00o2, false));
            } else if (OooO00o3 == 4) {
                this.OooO0Oo = C5514IL.OooO00o(OooO00o2, false).m15792OooO0O0();
            } else if (OooO00o3 == 5) {
                this.OooO0o0 = C5514IL.OooO00o(OooO00o2, false).m15792OooO0O0();
            } else {
                throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
            }
        }
    }

    public i1LlI(C5633LIiII r8, boolean z, boolean z2) {
        this(r8, false, false, null, z, z2);
    }

    public i1LlI(C5633LIiII r5, boolean z, boolean z2, LILIIiLl lILIIiLl, boolean z3, boolean z4) {
        this.f17388OooO00o = r5;
        this.OooO0Oo = z3;
        this.OooO0o0 = z4;
        this.OooO0OO = z2;
        this.OooO0O0 = z;
        this.f17387OooO00o = lILIIiLl;
        iILLL1 r0 = new iILLL1();
        if (r5 != null) {
            r0.OooO00o(new ILI1Ll(true, 0, r5));
        }
        if (z) {
            r0.OooO00o(new ILI1Ll(false, 1, C5514IL.OooO00o(true)));
        }
        if (z2) {
            r0.OooO00o(new ILI1Ll(false, 2, C5514IL.OooO00o(true)));
        }
        if (lILIIiLl != null) {
            r0.OooO00o(new ILI1Ll(false, 3, lILIIiLl));
        }
        if (z3) {
            r0.OooO00o(new ILI1Ll(false, 4, C5514IL.OooO00o(true)));
        }
        if (z4) {
            r0.OooO00o(new ILI1Ll(false, 5, C5514IL.OooO00o(true)));
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static i1LlI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static i1LlI OooO00o(Object obj) {
        if (obj instanceof i1LlI) {
            return (i1LlI) obj;
        }
        if (obj != null) {
            return new i1LlI(I11li1.OooO00o(obj));
        }
        return null;
    }

    private String OooO00o(boolean z) {
        return z ? "true" : "false";
    }

    private void OooO00o(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append(C9878I1.f23489OooO00o);
        stringBuffer.append(str2);
        stringBuffer.append(Constants.COLON_SEPARATOR);
        stringBuffer.append(str);
        stringBuffer.append(C9878I1.f23489OooO00o);
        stringBuffer.append(C9878I1.f23489OooO00o);
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public LILIIiLl OooO00o() {
        return this.f17387OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5633LIiII m16880OooO00o() {
        return this.f17388OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16881OooO00o() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16882OooO0O0() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public boolean OooO0OO() {
        return this.OooO0OO;
    }

    public boolean OooO0Oo() {
        return this.OooO0O0;
    }

    public String toString() {
        String OooO00o2 = Strings.m22984OooO00o();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(OooO00o2);
        C5633LIiII r2 = this.f17388OooO00o;
        if (r2 != null) {
            OooO00o(stringBuffer, OooO00o2, "distributionPoint", r2.toString());
        }
        boolean z = this.OooO0O0;
        if (z) {
            OooO00o(stringBuffer, OooO00o2, "onlyContainsUserCerts", OooO00o(z));
        }
        boolean z2 = this.OooO0OO;
        if (z2) {
            OooO00o(stringBuffer, OooO00o2, "onlyContainsCACerts", OooO00o(z2));
        }
        LILIIiLl lILIIiLl = this.f17387OooO00o;
        if (lILIIiLl != null) {
            OooO00o(stringBuffer, OooO00o2, "onlySomeReasons", lILIIiLl.toString());
        }
        boolean z3 = this.OooO0o0;
        if (z3) {
            OooO00o(stringBuffer, OooO00o2, "onlyContainsAttributeCerts", OooO00o(z3));
        }
        boolean z4 = this.OooO0Oo;
        if (z4) {
            OooO00o(stringBuffer, OooO00o2, "indirectCRL", OooO00o(z4));
        }
        stringBuffer.append("]");
        stringBuffer.append(OooO00o2);
        return stringBuffer.toString();
    }
}
