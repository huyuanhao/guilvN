package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIIl  reason: case insensitive filesystem */
public class C5619LIIl implements iiIi11 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final iiIi11 f16290OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16291OooO00o;

    public C5619LIIl(iiIi11 r2, int i) {
        if (r2 == null) {
            throw new IllegalArgumentException("generator cannot be null");
        } else if (i >= 2) {
            this.f16290OooO00o = r2;
            this.f16291OooO00o = new byte[i];
        } else {
            throw new IllegalArgumentException("windowSize must be at least 2");
        }
    }

    private void OooO0O0(byte[] bArr, int i, int i2) {
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.OooO00o < 1) {
                    this.f16290OooO00o.OooO00o(this.f16291OooO00o, 0, this.f16291OooO00o.length);
                    this.OooO00o = this.f16291OooO00o.length;
                }
                byte[] bArr2 = this.f16291OooO00o;
                int i4 = this.OooO00o - 1;
                this.OooO00o = i4;
                bArr[i3 + i] = bArr2[i4];
            }
        }
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(long j) {
        synchronized (this) {
            this.OooO00o = 0;
            this.f16290OooO00o.OooO00o(j);
        }
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(byte[] bArr) {
        synchronized (this) {
            this.OooO00o = 0;
            this.f16290OooO00o.OooO00o(bArr);
        }
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO00o(byte[] bArr, int i, int i2) {
        OooO0O0(bArr, i, i2);
    }

    @Override // com.p118pd.sdk.iiIi11
    public void OooO0O0(byte[] bArr) {
        OooO0O0(bArr, 0, bArr.length);
    }
}
