package com.p118pd.sdk;

import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.L丨Iillll  reason: invalid class name and case insensitive filesystem */
public class C5845LIillll extends AbstractC5738Lil {
    public final ILI[] OooO00o;

    public C5845LIillll(I11li1 i11li1) {
        this.OooO00o = new ILI[i11li1.size()];
        for (int i = 0; i != i11li1.size(); i++) {
            this.OooO00o[i] = ILI.OooO00o(i11li1.OooO00o(i));
        }
    }

    public C5845LIillll(ILI ili) {
        this.OooO00o = new ILI[]{ili};
    }

    public C5845LIillll(ILI[] iliArr) {
        this.OooO00o = iliArr;
    }

    public static C5845LIillll OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5845LIillll OooO00o(iI11IL r0, LlLI1 llLI1) {
        return OooO00o(r0.m17472OooO00o(llLI1));
    }

    public static C5845LIillll OooO00o(Object obj) {
        if (obj instanceof C5845LIillll) {
            return (C5845LIillll) obj;
        }
        if (obj != null) {
            return new C5845LIillll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ILI[] OooO00o() {
        ILI[] iliArr = this.OooO00o;
        ILI[] iliArr2 = new ILI[iliArr.length];
        System.arraycopy(iliArr, 0, iliArr2, 0, iliArr.length);
        return iliArr2;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o2 = Strings.m22984OooO00o();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(OooO00o2);
        for (int i = 0; i != this.OooO00o.length; i++) {
            stringBuffer.append(C9878I1.f23489OooO00o);
            stringBuffer.append(this.OooO00o[i]);
            stringBuffer.append(OooO00o2);
        }
        return stringBuffer.toString();
    }
}
