package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨li  reason: invalid class name and case insensitive filesystem */
public class C5561Ili {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16087OooO00o;
    public int OooO0O0;

    public C5561Ili(byte[] bArr, int i) {
        this(bArr, i, -1);
    }

    public C5561Ili(byte[] bArr, int i, int i2) {
        this.f16087OooO00o = bArr;
        this.OooO0O0 = i;
        this.OooO00o = i2;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15866OooO00o() {
        return this.f16087OooO00o;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5561Ili)) {
            return false;
        }
        C5561Ili r4 = (C5561Ili) obj;
        if (r4.OooO0O0 != this.OooO0O0) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.f16087OooO00o, r4.f16087OooO00o);
    }

    public int hashCode() {
        return this.OooO0O0 ^ C9586iIILl.OooO00o(this.f16087OooO00o);
    }
}
