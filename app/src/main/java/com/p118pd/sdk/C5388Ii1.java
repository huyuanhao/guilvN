package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ii丨1  reason: invalid class name and case insensitive filesystem */
public class C5388Ii1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15750OooO00o;

    public C5388Ii1(byte[] bArr, int i) {
        this.f15750OooO00o = bArr;
        this.OooO00o = i;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15635OooO00o() {
        return this.f15750OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5388Ii1)) {
            return false;
        }
        C5388Ii1 r4 = (C5388Ii1) obj;
        if (r4.OooO00o != this.OooO00o) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.f15750OooO00o, r4.f15750OooO00o);
    }

    public int hashCode() {
        return this.OooO00o ^ C9586iIILl.OooO00o(this.f15750OooO00o);
    }
}
