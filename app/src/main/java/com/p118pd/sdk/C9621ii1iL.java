package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨ii丨1iL  reason: invalid class name and case insensitive filesystem */
public class C9621ii1iL extends AbstractC5738Lil {
    public LILIIiLl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5633LIiII f23206OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5845LIillll f23207OooO00o;

    public C9621ii1iL(I11li1 i11li1) {
        for (int i = 0; i != i11li1.size(); i++) {
            AbstractC5903LlLLL OooO00o2 = AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(i));
            int OooO00o3 = OooO00o2.OooO00o();
            if (OooO00o3 == 0) {
                this.f23206OooO00o = C5633LIiII.OooO00o(OooO00o2, true);
            } else if (OooO00o3 == 1) {
                this.OooO00o = new LILIIiLl(iIilII1.OooO00o(OooO00o2, false));
            } else if (OooO00o3 == 2) {
                this.f23207OooO00o = C5845LIillll.OooO00o(OooO00o2, false);
            } else {
                throw new IllegalArgumentException("Unknown tag encountered in structure: " + OooO00o2.OooO00o());
            }
        }
    }

    public C9621ii1iL(C5633LIiII r1, LILIIiLl lILIIiLl, C5845LIillll r3) {
        this.f23206OooO00o = r1;
        this.OooO00o = lILIIiLl;
        this.f23207OooO00o = r3;
    }

    public static C9621ii1iL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9621ii1iL OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9621ii1iL)) {
            return (C9621ii1iL) obj;
        }
        if (obj instanceof I11li1) {
            return new C9621ii1iL((I11li1) obj);
        }
        throw new IllegalArgumentException("Invalid DistributionPoint: " + obj.getClass().getName());
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
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5633LIiII m21682OooO00o() {
        return this.f23206OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5845LIillll m21683OooO00o() {
        return this.f23207OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f23206OooO00o != null) {
            r0.OooO00o(new ILI1Ll(0, this.f23206OooO00o));
        }
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO00o));
        }
        if (this.f23207OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 2, this.f23207OooO00o));
        }
        return new C5707LiL1(r0);
    }

    public String toString() {
        String OooO00o2 = Strings.m22984OooO00o();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(OooO00o2);
        C5633LIiII r2 = this.f23206OooO00o;
        if (r2 != null) {
            OooO00o(stringBuffer, OooO00o2, "distributionPoint", r2.toString());
        }
        LILIIiLl lILIIiLl = this.OooO00o;
        if (lILIIiLl != null) {
            OooO00o(stringBuffer, OooO00o2, "reasons", lILIIiLl.toString());
        }
        C5845LIillll r22 = this.f23207OooO00o;
        if (r22 != null) {
            OooO00o(stringBuffer, OooO00o2, "cRLIssuer", r22.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(OooO00o2);
        return stringBuffer.toString();
    }
}
