package com.p118pd.sdk;

import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.II1i111L */
public class II1i111L {
    public static final byte[] OooO00o = Strings.m22985OooO00o("expand 32-byte to 64-byte state!");

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f15449OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final l1l1 f15450OooO00o;
    public final AbstractC6436l11LI OooO0O0;

    public II1i111L(AbstractC6436l11LI r2) {
        this(r2, null);
    }

    public II1i111L(AbstractC6436l11LI r2, AbstractC6436l11LI r3) {
        this.f15450OooO00o = new l1l1();
        this.f15449OooO00o = r2;
        this.OooO0O0 = r3;
    }

    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArr3 = new byte[64];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr3[i3] = bArr2[i2 + i3];
            bArr3[i3 + 32] = OooO00o[i3];
        }
        this.f15450OooO00o.OooO00o(bArr3, bArr3);
        for (int i4 = 0; i4 < 32; i4++) {
            bArr3[i4] = (byte) (bArr3[i4] ^ bArr2[(i2 + i4) + 32]);
        }
        this.f15450OooO00o.OooO00o(bArr3, bArr3);
        for (int i5 = 0; i5 < 32; i5++) {
            bArr[i + i5] = bArr3[i5];
        }
        return 0;
    }

    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        byte[] bArr4 = new byte[64];
        for (int i4 = 0; i4 < 64; i4++) {
            bArr4[i4] = (byte) (bArr2[i2 + i4] ^ bArr3[i3 + i4]);
        }
        return OooO00o(bArr, i, bArr4, 0);
    }

    public AbstractC6436l11LI OooO00o() {
        return this.OooO0O0;
    }

    public int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArr3 = new byte[64];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr3[i3] = bArr2[i2 + i3];
            bArr3[i3 + 32] = OooO00o[i3];
        }
        this.f15450OooO00o.OooO00o(bArr3, bArr3);
        for (int i4 = 0; i4 < 32; i4++) {
            bArr[i + i4] = bArr3[i4];
        }
        return 0;
    }

    public int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        byte[] bArr4 = new byte[32];
        for (int i4 = 0; i4 < 32; i4++) {
            bArr4[i4] = (byte) (bArr2[i2 + i4] ^ bArr3[i3 + i4]);
        }
        return OooO0O0(bArr, i, bArr4, 0);
    }

    public int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.f15449OooO00o.update(bArr2, 0, i2);
        this.f15449OooO00o.OooO00o(bArr, i);
        return 0;
    }
}
