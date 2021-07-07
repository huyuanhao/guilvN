package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.L1IL丨II丨  reason: invalid class name */
public class L1ILII implements LLLi1iII {
    public static final int OooO0OO = 64;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f16161OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Lli1LL f16162OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f16163OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6744ll1L f16164OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16165OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16166OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[] f16167OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public OooO00o f16168OooO0O0 = new OooO00o();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16169OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f16170OooO0OO;

    /* renamed from: com.pd.sdk.L1IL丨II丨$OooO00o */
    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o() {
        }

        public byte[] OooO0O0() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public L1ILII(li1l11I1 li1l11i1) {
        this.f16163OooO00o = li1l11i1;
        this.f16164OooO00o = new C6744ll1L(new C1l1i(li1l11i1));
        this.OooO00o = -1;
        int OooO00o2 = this.f16163OooO00o.OooO00o();
        this.OooO0O0 = OooO00o2;
        this.f16166OooO00o = new byte[OooO00o2];
        this.f16170OooO0OO = new byte[OooO00o2];
        this.f16162OooO00o = OooO00o(OooO00o2);
        this.f16167OooO00o = new long[(this.OooO0O0 >>> 3)];
        this.f16169OooO0O0 = null;
    }

    public static Lli1LL OooO00o(int i) {
        if (i == 16) {
            return new C5196II1I();
        }
        if (i == 32) {
            return new iIIILI();
        }
        if (i == 64) {
            return new C9639ilI1I();
        }
        throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    private void OooO00o(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i2;
        while (i < i4) {
            OooO00o(this.f16167OooO00o, bArr, i);
            this.f16162OooO00o.OooO00o(this.f16167OooO00o);
            i += this.OooO0O0;
        }
        long[] jArr = this.f16167OooO00o;
        jArr[0] = ((((long) i3) & 4294967295L) << 3) ^ jArr[0];
        int i5 = this.OooO0O0 >>> 4;
        jArr[i5] = ((4294967295L & ((long) i2)) << 3) ^ jArr[i5];
        byte[] OooO0O02 = AbstractC6464l1l.OooO0O0(jArr);
        this.f16169OooO0O0 = OooO0O02;
        this.f16163OooO00o.OooO00o(OooO0O02, 0, OooO0O02, 0);
    }

    public static void OooO00o(long[] jArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = jArr[i2] ^ AbstractC6464l1l.m17601OooO0O0(bArr, i);
            i += 8;
        }
    }

    private void OooO0O0(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            OooO00o(this.f16167OooO00o, bArr, i);
            this.f16162OooO00o.OooO00o(this.f16167OooO00o);
            i += this.OooO0O0;
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        this.f16168OooO0O0.write(b);
        return 0;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15899OooO00o(int i) {
        int size = i + this.f16168OooO0O0.size();
        if (this.f16165OooO00o) {
            return size + this.OooO00o;
        }
        int i2 = this.OooO00o;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int i2;
        int size = this.f16168OooO0O0.size();
        if (this.f16165OooO00o || size >= this.OooO00o) {
            byte[] bArr2 = new byte[this.OooO0O0];
            this.f16163OooO00o.OooO00o(bArr2, 0, bArr2, 0);
            long[] jArr = new long[(this.OooO0O0 >>> 3)];
            AbstractC6464l1l.OooO0O0(bArr2, 0, jArr);
            this.f16162OooO00o.OooO0O0(jArr);
            C9586iIILl.OooO00o(bArr2, (byte) 0);
            C9586iIILl.OooO00o(jArr, 0L);
            int size2 = this.f16161OooO00o.size();
            if (size2 > 0) {
                OooO0O0(this.f16161OooO00o.OooO0O0(), 0, size2);
            }
            if (!this.f16165OooO00o) {
                int i3 = size - this.OooO00o;
                if (bArr.length - i >= i3) {
                    OooO00o(this.f16168OooO0O0.OooO0O0(), 0, i3, size2);
                    int OooO00o2 = this.f16164OooO00o.OooO00o(this.f16168OooO0O0.OooO0O0(), 0, i3, bArr, i);
                    i2 = OooO00o2 + this.f16164OooO00o.OooO00o(bArr, i + OooO00o2);
                } else {
                    throw new OutputLengthException("Output buffer too short");
                }
            } else if ((bArr.length - i) - this.OooO00o >= size) {
                int OooO00o3 = this.f16164OooO00o.OooO00o(this.f16168OooO0O0.OooO0O0(), 0, size, bArr, i);
                i2 = OooO00o3 + this.f16164OooO00o.OooO00o(bArr, i + OooO00o3);
                OooO00o(bArr, i, size, size2);
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
            byte[] bArr3 = this.f16169OooO0O0;
            if (bArr3 == null) {
                throw new IllegalStateException("mac is not calculated");
            } else if (this.f16165OooO00o) {
                System.arraycopy(bArr3, 0, bArr, i + i2, this.OooO00o);
                reset();
                return i2 + this.OooO00o;
            } else {
                byte[] bArr4 = new byte[this.OooO00o];
                byte[] OooO0O02 = this.f16168OooO0O0.OooO0O0();
                int i4 = this.OooO00o;
                System.arraycopy(OooO0O02, size - i4, bArr4, 0, i4);
                int i5 = this.OooO00o;
                byte[] bArr5 = new byte[i5];
                System.arraycopy(this.f16169OooO0O0, 0, bArr5, 0, i5);
                if (C9586iIILl.OooO0O0(bArr4, bArr5)) {
                    reset();
                    return i2;
                }
                throw new InvalidCipherTextException("mac verification failed");
            }
        } else {
            throw new InvalidCipherTextException("data too short");
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i + i2) {
            this.f16168OooO0O0.write(bArr, i, i2);
            return 0;
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    public li1l11I1 OooO00o() {
        return this.f16163OooO00o;
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15900OooO00o() {
        return this.f16163OooO00o.m17732OooO00o() + "/KGCM";
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte b) {
        this.f16161OooO00o.write(b);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(boolean z, AbstractC6370iIIIl r6) throws IllegalArgumentException {
        C6642li1LI r5;
        this.f16165OooO00o = z;
        if (r6 instanceof C5553Iili) {
            C5553Iili r62 = (C5553Iili) r6;
            byte[] OooO0O02 = r62.OooO0O0();
            byte[] bArr = this.f16170OooO0OO;
            C9586iIILl.OooO00o(bArr, (byte) 0);
            System.arraycopy(OooO0O02, 0, this.f16170OooO0OO, bArr.length - OooO0O02.length, OooO0O02.length);
            this.f16166OooO00o = r62.m15833OooO00o();
            int OooO00o2 = r62.OooO00o();
            if (OooO00o2 < 64 || OooO00o2 > (this.OooO0O0 << 3) || (OooO00o2 & 7) != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + OooO00o2);
            }
            this.OooO00o = OooO00o2 >>> 3;
            r5 = r62.m15832OooO00o();
            byte[] bArr2 = this.f16166OooO00o;
            if (bArr2 != null) {
                OooO00o(bArr2, 0, bArr2.length);
            }
        } else if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r63 = (C6274iilL1L) r6;
            byte[] OooO00o3 = r63.m17301OooO00o();
            byte[] bArr3 = this.f16170OooO0OO;
            C9586iIILl.OooO00o(bArr3, (byte) 0);
            System.arraycopy(OooO00o3, 0, this.f16170OooO0OO, bArr3.length - OooO00o3.length, OooO00o3.length);
            this.f16166OooO00o = null;
            this.OooO00o = this.OooO0O0;
            r5 = (C6642li1LI) r63.OooO00o();
        } else {
            throw new IllegalArgumentException("Invalid parameter passed");
        }
        this.f16169OooO0O0 = new byte[this.OooO0O0];
        this.f16164OooO00o.OooO00o(true, (AbstractC6370iIIIl) new C6274iilL1L(r5, this.f16170OooO0OO));
        this.f16163OooO00o.OooO00o(true, r5);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte[] bArr, int i, int i2) {
        this.f16161OooO00o.write(bArr, i, i2);
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15901OooO00o() {
        int i = this.OooO00o;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f16169OooO0O0, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO0O0(int i) {
        return 0;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void reset() {
        C9586iIILl.OooO00o(this.f16167OooO00o, 0L);
        this.f16163OooO00o.reset();
        this.f16168OooO0O0.reset();
        this.f16161OooO00o.reset();
        byte[] bArr = this.f16166OooO00o;
        if (bArr != null) {
            OooO00o(bArr, 0, bArr.length);
        }
    }
}
