package com.p118pd.sdk;

/* renamed from: com.pd.sdk.II丨Ili1L  reason: invalid class name */
public class IIIli1L extends C9611iLlI {
    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.I1LLllll
    public int OooO00o() {
        return 12;
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15436OooO00o() {
        return "ChaCha7539-" + ((C9611iLlI) this).OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15437OooO00o() {
        int[] iArr = ((C9611iLlI) this).f23191OooO00o;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI
    public void OooO00o(long j) {
        int i = (int) j;
        if (((int) (j >>> 32)) <= 0) {
            int[] iArr = ((C9611iLlI) this).f23191OooO00o;
            int i2 = iArr[12];
            iArr[12] = iArr[12] + i;
            if (i2 != 0 && iArr[12] < i2) {
                throw new IllegalStateException("attempt to increase counter past 2^32.");
            }
            return;
        }
        throw new IllegalStateException("attempt to increase counter past 2^32.");
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO00o(byte[] bArr) {
        C5512IIll1.OooO0O0(((C9611iLlI) this).OooO00o, ((C9611iLlI) this).f23191OooO00o, ((C9611iLlI) this).f23193OooO0O0);
        AbstractC6464l1l.OooO0O0(((C9611iLlI) this).f23193OooO0O0, bArr, 0);
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 32) {
                OooO00o(bArr.length, ((C9611iLlI) this).f23191OooO00o, 0);
                AbstractC6464l1l.OooO00o(bArr, 0, ((C9611iLlI) this).f23191OooO00o, 4, 8);
            } else {
                throw new IllegalArgumentException(m15436OooO00o() + " requires 256 bit key");
            }
        }
        AbstractC6464l1l.OooO00o(bArr2, 0, ((C9611iLlI) this).f23191OooO00o, 13, 3);
    }

    @Override // com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI
    public long OooO0O0() {
        return ((long) ((C9611iLlI) this).f23191OooO00o[12]) & 4294967295L;
    }

    @Override // com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m15438OooO0O0() {
        ((C9611iLlI) this).f23191OooO00o[12] = 0;
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO0O0(long j) {
        int i = (int) j;
        if (((int) (j >>> 32)) == 0) {
            int[] iArr = ((C9611iLlI) this).f23191OooO00o;
            if ((((long) iArr[12]) & 4294967295L) >= (4294967295L & ((long) i))) {
                iArr[12] = iArr[12] - i;
                return;
            }
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        throw new IllegalStateException("attempt to reduce counter past zero.");
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO0OO() {
        int[] iArr = ((C9611iLlI) this).f23191OooO00o;
        if (iArr[12] != 0) {
            iArr[12] = iArr[12] - 1;
            return;
        }
        throw new IllegalStateException("attempt to reduce counter past zero.");
    }
}
