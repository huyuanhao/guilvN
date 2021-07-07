package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨IiI丨丨i  reason: invalid class name and case insensitive filesystem */
public class C9376IiIi extends iilI1iI {
    public byte[] OooO00o;

    public C9376IiIi(byte[] bArr) {
        super(1);
        this.OooO00o = bArr;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        if (obj instanceof byte[]) {
            return C9586iIILl.m21627OooO00o(this.OooO00o, (byte[]) obj);
        }
        if (obj instanceof liil1l) {
            return ((liil1l) obj).m17967OooO00o().equals(this);
        }
        return false;
    }

    @Override // com.p118pd.sdk.iilI1iI
    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.iilI1iI, java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C9376IiIi(this.OooO00o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9376IiIi)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((C9376IiIi) obj).OooO00o);
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o);
    }
}
