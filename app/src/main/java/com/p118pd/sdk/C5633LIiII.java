package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.LIi丨II  reason: invalid class name and case insensitive filesystem */
public class C5633LIiII extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public AbstractC6854lLi1LL OooO00o;
    public int o00oO0O;

    public C5633LIiII(int i, AbstractC6854lLi1LL r2) {
        this.o00oO0O = i;
        this.OooO00o = r2;
    }

    public C5633LIiII(C5845LIillll r2) {
        this(0, r2);
    }

    public C5633LIiII(AbstractC5903LlLLL r3) {
        int OooO00o2 = r3.OooO00o();
        this.o00oO0O = OooO00o2;
        this.OooO00o = OooO00o2 == 0 ? C5845LIillll.OooO00o(r3, false) : I11L.OooO00o(r3, false);
    }

    public static C5633LIiII OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(AbstractC5903LlLLL.OooO00o(r0, true));
    }

    public static C5633LIiII OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5633LIiII)) {
            return (C5633LIiII) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C5633LIiII((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
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

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16110OooO0O0() {
        return new ILI1Ll(false, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16111OooO0O0() {
        return this.OooO00o;
    }

    public String toString() {
        String str;
        String str2;
        String OooO00o2 = Strings.m22984OooO00o();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(OooO00o2);
        if (this.o00oO0O == 0) {
            str2 = this.OooO00o.toString();
            str = "fullName";
        } else {
            str2 = this.OooO00o.toString();
            str = "nameRelativeToCRLIssuer";
        }
        OooO00o(stringBuffer, OooO00o2, str, str2);
        stringBuffer.append("]");
        stringBuffer.append(OooO00o2);
        return stringBuffer.toString();
    }
}
