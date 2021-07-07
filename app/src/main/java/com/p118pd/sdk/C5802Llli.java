package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.Lll丨丨i  reason: invalid class name and case insensitive filesystem */
public class C5802Llli {
    public static final int OooO0OO = 1024;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16744OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16745OooO00o;
    public int OooO0O0;

    public C5802Llli() {
        this(1024);
    }

    public C5802Llli(int i) {
        this.OooO00o = 0;
        this.OooO0O0 = 0;
        this.f16744OooO00o = false;
        this.f16745OooO00o = i == 0 ? L1LL1Ii.f16174OooO00o : new byte[i];
    }

    public C5802Llli(byte[] bArr, int i, int i2) {
        this.OooO00o = 0;
        this.OooO0O0 = 0;
        this.f16744OooO00o = false;
        this.f16745OooO00o = bArr;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f16744OooO00o = true;
    }

    public static int OooO00o(int i) {
        int i2 = i | (i >> 1);
        int i3 = i2 | (i2 >> 2);
        int i4 = i3 | (i3 >> 4);
        int i5 = i4 | (i4 >> 8);
        return (i5 | (i5 >> 16)) + 1;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ByteArrayInputStream m16405OooO00o(int i) {
        int i2 = this.OooO0O0;
        if (i <= i2) {
            int i3 = this.OooO00o;
            this.OooO0O0 = i2 - i;
            this.OooO00o = i3 + i;
            return new ByteArrayInputStream(this.f16745OooO00o, i3, i);
        }
        throw new IllegalStateException("Cannot read " + i + " bytes, only got " + this.OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16406OooO00o() {
        int i = this.OooO0O0;
        if (i == 0) {
            this.f16745OooO00o = L1LL1Ii.f16174OooO00o;
        } else {
            int OooO00o2 = OooO00o(i);
            byte[] bArr = this.f16745OooO00o;
            if (OooO00o2 < bArr.length) {
                byte[] bArr2 = new byte[OooO00o2];
                System.arraycopy(bArr, this.OooO00o, bArr2, 0, this.OooO0O0);
                this.f16745OooO00o = bArr2;
            } else {
                return;
            }
        }
        this.OooO00o = 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16407OooO00o(int i) {
        int i2 = this.OooO0O0;
        if (i <= i2) {
            this.OooO0O0 = i2 - i;
            this.OooO00o += i;
            return;
        }
        throw new IllegalStateException("Cannot remove " + i + " bytes, only got " + this.OooO0O0);
    }

    public void OooO00o(OutputStream outputStream, int i) throws IOException {
        if (i <= this.OooO0O0) {
            outputStream.write(this.f16745OooO00o, this.OooO00o, i);
            return;
        }
        throw new IllegalStateException("Cannot copy " + i + " bytes, only got " + this.OooO0O0);
    }

    public void OooO00o(byte[] bArr, int i, int i2) {
        if (!this.f16744OooO00o) {
            int i3 = this.OooO00o;
            int i4 = this.OooO0O0;
            if (i3 + i4 + i2 > this.f16745OooO00o.length) {
                int OooO00o2 = OooO00o(i4 + i2);
                byte[] bArr2 = this.f16745OooO00o;
                if (OooO00o2 > bArr2.length) {
                    byte[] bArr3 = new byte[OooO00o2];
                    System.arraycopy(bArr2, this.OooO00o, bArr3, 0, this.OooO0O0);
                    this.f16745OooO00o = bArr3;
                } else {
                    System.arraycopy(bArr2, this.OooO00o, bArr2, 0, this.OooO0O0);
                }
                this.OooO00o = 0;
            }
            System.arraycopy(bArr, i, this.f16745OooO00o, this.OooO00o + this.OooO0O0, i2);
            this.OooO0O0 += i2;
            return;
        }
        throw new IllegalStateException("Cannot add data to read-only buffer");
    }

    public void OooO00o(byte[] bArr, int i, int i2, int i3) {
        if (bArr.length - i < i2) {
            throw new IllegalArgumentException("Buffer size of " + bArr.length + " is too small for a read of " + i2 + " bytes");
        } else if (this.OooO0O0 - i3 >= i2) {
            System.arraycopy(this.f16745OooO00o, this.OooO00o + i3, bArr, i, i2);
        } else {
            throw new IllegalStateException("Not enough data to read");
        }
    }

    public byte[] OooO00o(int i, int i2) {
        byte[] bArr = new byte[i];
        OooO0O0(bArr, 0, i, i2);
        return bArr;
    }

    public void OooO0O0(byte[] bArr, int i, int i2, int i3) {
        OooO00o(bArr, i, i2, i3);
        m16407OooO00o(i3 + i2);
    }
}
