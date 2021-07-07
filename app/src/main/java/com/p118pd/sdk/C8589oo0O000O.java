package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oo0O000O  reason: case insensitive filesystem */
public class C8589oo0O000O {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f21705OooO00o;
    public int OooO0O0;

    public C8589oo0O000O() {
        this.f21705OooO00o = null;
        this.OooO00o = 1024;
        this.OooO0O0 = 0;
        this.f21705OooO00o = new byte[1024];
    }

    public C8589oo0O000O(int i) {
        this.f21705OooO00o = null;
        this.OooO00o = 1024;
        this.OooO0O0 = 0;
        this.OooO00o = i;
        this.f21705OooO00o = new byte[i];
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(byte[] bArr, int i) {
        if (i > 0) {
            byte[] bArr2 = this.f21705OooO00o;
            int length = bArr2.length;
            int i2 = this.OooO0O0;
            if (length - i2 >= i) {
                System.arraycopy(bArr, 0, bArr2, i2, i);
            } else {
                byte[] bArr3 = new byte[((bArr2.length + i) << 1)];
                System.arraycopy(bArr2, 0, bArr3, 0, i2);
                System.arraycopy(bArr, 0, bArr3, this.OooO0O0, i);
                this.f21705OooO00o = bArr3;
            }
            this.OooO0O0 += i;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m20236OooO00o() {
        int i = this.OooO0O0;
        if (i <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f21705OooO00o, 0, bArr, 0, i);
        return bArr;
    }
}
