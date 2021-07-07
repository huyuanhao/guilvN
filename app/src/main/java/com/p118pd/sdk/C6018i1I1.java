package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1I丨1  reason: invalid class name and case insensitive filesystem */
public class C6018i1I1 implements AbstractC93201li {
    public final boolean OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f17362OooO00o;
    public final byte[] OooO0O0;
    public final byte[] OooO0OO;

    public C6018i1I1(byte[] bArr, boolean z, byte[] bArr2, byte[] bArr3) {
        if (bArr != null) {
            this.f17362OooO00o = C9586iIILl.m21630OooO00o(bArr);
            this.OooO00o = z;
            if (bArr2 == null || bArr2.length == 0) {
                this.OooO0O0 = null;
            } else {
                this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
            }
            if (bArr3 == null) {
                this.OooO0OO = new byte[0];
            } else {
                this.OooO0OO = C9586iIILl.m21630OooO00o(bArr3);
            }
        } else {
            throw new IllegalArgumentException("IKM (input keying material) should not be null");
        }
    }

    public C6018i1I1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(bArr, false, bArr2, bArr3);
    }

    public static C6018i1I1 OooO00o(byte[] bArr) {
        return new C6018i1I1(bArr, false, null, null);
    }

    public static C6018i1I1 OooO00o(byte[] bArr, byte[] bArr2) {
        return new C6018i1I1(bArr, true, null, bArr2);
    }

    public boolean OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16867OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17362OooO00o);
    }

    public byte[] OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.OooO0OO);
    }

    public byte[] OooO0OO() {
        return C9586iIILl.m21630OooO00o(this.OooO0O0);
    }
}
