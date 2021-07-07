package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lIII1 */
public class lIII1 implements AbstractC9760IiI {
    public final int[] OooO00o;

    public lIII1(int[] iArr) {
        this.OooO00o = C9586iIILl.m21635OooO00o(iArr);
    }

    @Override // com.p118pd.sdk.AbstractC9760IiI, com.p118pd.sdk.AbstractC9760IiI
    public int OooO00o() {
        int[] iArr = this.OooO00o;
        return iArr[iArr.length - 1];
    }

    @Override // com.p118pd.sdk.AbstractC9760IiI, com.p118pd.sdk.AbstractC9760IiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17625OooO00o() {
        return C9586iIILl.m21635OooO00o(this.OooO00o);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lIII1)) {
            return false;
        }
        return C9586iIILl.OooO00o(this.OooO00o, ((lIII1) obj).OooO00o);
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o);
    }
}
