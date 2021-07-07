package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.i1丨Iiiil  reason: invalid class name */
public class i1Iiiil extends C6744ll1L {
    public static final long OooO0O0 = 135;
    public static final long OooO0OO = 1061;
    public static final long OooO0Oo = 293;
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long[] f17458OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f17459OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final long[] f17460OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f17461OooO0OO = -1;

    public i1Iiiil(li1l11I1 li1l11i1) {
        ((C6744ll1L) this).f18716OooO00o = li1l11i1;
        int OooO00o2 = li1l11i1.OooO00o();
        this.f17459OooO0O0 = OooO00o2;
        this.OooO00o = OooO00o(OooO00o2);
        int i = this.f17459OooO0O0;
        this.f17458OooO00o = new long[(i >>> 3)];
        this.f17460OooO0O0 = new long[(i >>> 3)];
    }

    public static long OooO00o(int i) {
        if (i == 16) {
            return 135;
        }
        if (i == 32) {
            return OooO0OO;
        }
        if (i == 64) {
            return 293;
        }
        throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    public static void OooO00o(long j, long[] jArr) {
        long j2 = 0;
        int i = 0;
        while (i < jArr.length) {
            long j3 = jArr[i];
            jArr[i] = j2 ^ (j3 << 1);
            i++;
            j2 = j3 >>> 63;
        }
        jArr[0] = (j & (-j2)) ^ jArr[0];
    }

    private void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.f17461OooO0OO;
        if (i3 != -1) {
            this.f17461OooO0OO = i3 + 1;
            OooO00o(this.OooO00o, this.f17460OooO0O0);
            byte[] bArr3 = new byte[this.f17459OooO0O0];
            AbstractC6464l1l.OooO0O0(this.f17460OooO0O0, bArr3, 0);
            int i4 = this.f17459OooO0O0;
            byte[] bArr4 = new byte[i4];
            System.arraycopy(bArr3, 0, bArr4, 0, i4);
            for (int i5 = 0; i5 < this.f17459OooO0O0; i5++) {
                bArr4[i5] = (byte) (bArr4[i5] ^ bArr[i + i5]);
            }
            ((C6744ll1L) this).f18716OooO00o.OooO00o(bArr4, 0, bArr4, 0);
            for (int i6 = 0; i6 < this.f17459OooO0O0; i6++) {
                bArr2[i2 + i6] = (byte) (bArr4[i6] ^ bArr3[i6]);
            }
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte b, byte[] bArr, int i) {
        throw new IllegalStateException("unsupported operation");
    }

    @Override // com.p118pd.sdk.C6744ll1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16923OooO00o(int i) {
        return i;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte[] bArr, int i) {
        OooO00o();
        return 0;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length - i < i2) {
            throw new DataLengthException("Input buffer too short");
        } else if (bArr2.length - i < i2) {
            throw new OutputLengthException("Output buffer too short");
        } else if (i2 % this.f17459OooO0O0 == 0) {
            int i4 = 0;
            while (i4 < i2) {
                OooO00o(bArr, i + i4, bArr2, i3 + i4);
                i4 += this.f17459OooO0O0;
            }
            return i2;
        } else {
            throw new IllegalArgumentException("Partial blocks not supported");
        }
    }

    @Override // com.p118pd.sdk.C6744ll1L, com.p118pd.sdk.C6744ll1L, com.p118pd.sdk.C6744ll1L
    public void OooO00o() {
        ((C6744ll1L) this).f18716OooO00o.reset();
        long[] jArr = this.f17458OooO00o;
        System.arraycopy(jArr, 0, this.f17460OooO0O0, 0, jArr.length);
        this.f17461OooO0OO = 0;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public void OooO00o(boolean z, AbstractC6370iIIIl r6) {
        if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r62 = (C6274iilL1L) r6;
            AbstractC6370iIIIl OooO00o2 = r62.OooO00o();
            byte[] OooO00o3 = r62.m17301OooO00o();
            int length = OooO00o3.length;
            int i = this.f17459OooO0O0;
            if (length == i) {
                byte[] bArr = new byte[i];
                System.arraycopy(OooO00o3, 0, bArr, 0, i);
                ((C6744ll1L) this).f18716OooO00o.OooO00o(true, OooO00o2);
                ((C6744ll1L) this).f18716OooO00o.OooO00o(bArr, 0, bArr, 0);
                ((C6744ll1L) this).f18716OooO00o.OooO00o(z, OooO00o2);
                AbstractC6464l1l.OooO0O0(bArr, 0, this.f17458OooO00o);
                long[] jArr = this.f17458OooO00o;
                System.arraycopy(jArr, 0, this.f17460OooO0O0, 0, jArr.length);
                this.f17461OooO0OO = 0;
                return;
            }
            throw new IllegalArgumentException("Currently only support IVs of exactly one block");
        }
        throw new IllegalArgumentException("Invalid parameters passed");
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO0O0(int i) {
        return i;
    }
}
