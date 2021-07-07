package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.LL1liLL */
public abstract class LL1liLL implements li1l11I1 {
    public static final int OooO0o = 32;
    public static final int OooO0o0 = 16;
    public static final int OooO0oO = -1640531527;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16404OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16405OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    public static int OooO00o(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static int OooO0O0(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public final void OooO(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        int i8 = (i4 & i) ^ i7;
        this.OooO0Oo = i8;
        int i9 = i ^ (i2 & i5);
        this.OooO0OO = (i3 | i9) ^ i7;
        int i10 = (i6 ^ i9) & i8;
        this.OooO0O0 = (i6 ^ -1) ^ i10;
        this.OooO00o = (i9 ^ -1) ^ i10;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public final int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f16405OooO00o == null) {
            throw new IllegalStateException(m16173OooO00o() + " not initialised");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this.f16404OooO00o) {
            OooO0O0(bArr, i, bArr2, i2);
            return 16;
        } else {
            m16175OooO00o(bArr, i, bArr2, i2);
            return 16;
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16173OooO00o() {
        return "Serpent";
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m16174OooO00o() {
        int OooO00o2 = OooO00o(this.OooO00o, 13);
        int OooO00o3 = OooO00o(this.OooO0OO, 3);
        this.OooO0O0 = OooO00o((this.OooO0O0 ^ OooO00o2) ^ OooO00o3, 1);
        int OooO00o4 = OooO00o((this.OooO0Oo ^ OooO00o3) ^ (OooO00o2 << 3), 7);
        this.OooO0Oo = OooO00o4;
        this.OooO00o = OooO00o((OooO00o2 ^ this.OooO0O0) ^ OooO00o4, 5);
        this.OooO0OO = OooO00o((this.OooO0Oo ^ OooO00o3) ^ (this.OooO0O0 << 7), 22);
    }

    public final void OooO00o(int i, int i2, int i3, int i4) {
        int i5 = i ^ -1;
        int i6 = i2 ^ i;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        int i9 = i6 ^ i8;
        this.OooO0OO = i9;
        int i10 = (i6 & i4) ^ i5;
        int i11 = (i9 & i10) ^ i7;
        this.OooO0O0 = i11;
        int i12 = (i & i7) ^ (i11 | i8);
        this.OooO0Oo = i12;
        this.OooO00o = i12 ^ (i10 ^ i8);
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C6642li1LI) {
            this.f16404OooO00o = z;
            this.f16405OooO00o = OooO00o(((C6642li1LI) r4).OooO00o());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + m16173OooO00o() + " init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m16175OooO00o(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract int[] OooO00o(byte[] bArr);

    public final void OooO0O0() {
        int OooO0O02 = (OooO0O0(this.OooO0OO, 22) ^ this.OooO0Oo) ^ (this.OooO0O0 << 7);
        int OooO0O03 = OooO0O0(this.OooO00o, 5) ^ this.OooO0O0;
        int i = this.OooO0Oo;
        int i2 = OooO0O03 ^ i;
        int OooO0O04 = OooO0O0(i, 7);
        int OooO0O05 = OooO0O0(this.OooO0O0, 1);
        this.OooO0Oo = (OooO0O04 ^ OooO0O02) ^ (i2 << 3);
        this.OooO0O0 = (OooO0O05 ^ i2) ^ OooO0O02;
        this.OooO0OO = OooO0O0(OooO0O02, 3);
        this.OooO00o = OooO0O0(i2, 13);
    }

    public final void OooO0O0(int i, int i2, int i3, int i4) {
        int i5 = i4 ^ i2;
        int i6 = i ^ (i2 & i5);
        int i7 = i5 ^ i6;
        int i8 = i3 ^ i7;
        this.OooO0Oo = i8;
        int i9 = i2 ^ (i5 & i6);
        int i10 = i6 ^ (i8 | i9);
        this.OooO0O0 = i10;
        int i11 = i10 ^ -1;
        int i12 = i9 ^ i8;
        this.OooO00o = i11 ^ i12;
        this.OooO0OO = (i11 | i12) ^ i7;
    }

    public abstract void OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2);

    public final void OooO0OO(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = i ^ i3;
        int i7 = i3 ^ i5;
        int i8 = (i2 & i7) ^ i6;
        this.OooO00o = i8;
        int i9 = (((i | (i5 ^ -1)) ^ i4) | i6) ^ i5;
        this.OooO0Oo = i9;
        int i10 = i7 ^ -1;
        int i11 = i9 | i8;
        this.OooO0O0 = i10 ^ i11;
        this.OooO0OO = (i11 ^ i6) ^ (i4 & i10);
    }

    public final void OooO0Oo(int i, int i2, int i3, int i4) {
        int i5 = i | i2;
        int i6 = i2 ^ i3;
        int i7 = i ^ (i2 & i6);
        int i8 = i3 ^ i7;
        int i9 = i4 | i7;
        int i10 = i6 ^ i9;
        this.OooO00o = i10;
        int i11 = (i9 | i6) ^ i4;
        this.OooO0OO = i8 ^ i11;
        int i12 = i5 ^ i11;
        int i13 = i7 ^ (i10 & i12);
        this.OooO0Oo = i13;
        this.OooO0O0 = i13 ^ (i12 ^ i10);
    }

    public final void OooO0o(int i, int i2, int i3, int i4) {
        int i5 = i3 ^ -1;
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        int i8 = (i2 ^ i5) ^ i7;
        this.OooO0Oo = i8;
        int i9 = i8 | i2;
        this.OooO0O0 = i6 ^ (i & i9);
        int i10 = i4 | i;
        this.OooO00o = (i5 ^ i9) ^ i10;
        this.OooO0OO = ((i ^ i3) | i7) ^ (i2 & i10);
    }

    public final void OooO0o0(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ ((i3 | i4) & i);
        int i6 = i3 ^ (i & i5);
        int i7 = i4 ^ i6;
        this.OooO0O0 = i7;
        int i8 = i ^ -1;
        int i9 = (i6 & i7) ^ i5;
        this.OooO0Oo = i9;
        int i10 = i4 ^ (i7 | i8);
        this.OooO00o = i9 ^ i10;
        this.OooO0OO = (i8 ^ i7) ^ (i5 & i10);
    }

    public final void OooO0oO(int i, int i2, int i3, int i4) {
        int i5 = i ^ -1;
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        this.OooO0O0 = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        int i10 = i8 ^ (i2 | i9);
        this.OooO0Oo = i10;
        int i11 = i2 | i10;
        this.OooO00o = i9 ^ i11;
        this.OooO0OO = (i4 & i5) ^ (i11 ^ i7);
    }

    public final void OooO0oo(int i, int i2, int i3, int i4) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        int i7 = i5 ^ i6;
        this.OooO0Oo = i7;
        int i8 = i2 ^ i6;
        int i9 = ((i7 ^ (i4 ^ -1)) | i8) ^ i;
        this.OooO0O0 = i9;
        int i10 = (i8 ^ i3) ^ (i4 | i9);
        this.OooO00o = i10;
        this.OooO0OO = ((i & i7) ^ i10) ^ (i5 ^ i9);
    }

    public final void OooOO0(int i, int i2, int i3, int i4) {
        int i5 = (i ^ -1) ^ i2;
        int i6 = (i | i5) ^ i3;
        int i7 = i4 ^ i6;
        this.OooO0OO = i7;
        int i8 = i2 ^ (i4 | i5);
        int i9 = i7 ^ i5;
        int i10 = (i6 & i8) ^ i9;
        this.OooO0Oo = i10;
        int i11 = i8 ^ i6;
        this.OooO0O0 = i10 ^ i11;
        this.OooO00o = i6 ^ (i11 & i9);
    }

    public final void OooOO0O(int i, int i2, int i3, int i4) {
        int i5 = i ^ -1;
        int i6 = i2 ^ i4;
        int i7 = (i3 & i5) ^ i6;
        this.OooO00o = i7;
        int i8 = i3 ^ i5;
        int i9 = i2 & (i3 ^ i7);
        int i10 = i8 ^ i9;
        this.OooO0Oo = i10;
        int i11 = i ^ ((i9 | i4) & (i7 | i8));
        this.OooO0OO = i11;
        this.OooO0O0 = (i11 ^ (i4 | i5)) ^ (i6 ^ i10);
    }

    public final void OooOO0o(int i, int i2, int i3, int i4) {
        int i5 = i ^ i2;
        int i6 = i & i3;
        int i7 = i | i4;
        int i8 = i3 ^ i4;
        int i9 = i6 | (i5 & i7);
        int i10 = i8 ^ i9;
        this.OooO0OO = i10;
        int i11 = (i7 ^ i2) ^ i9;
        int i12 = i5 ^ (i8 & i11);
        this.OooO00o = i12;
        int i13 = i12 & i10;
        this.OooO0O0 = i11 ^ i13;
        this.OooO0Oo = (i2 | i4) ^ (i8 ^ i13);
    }

    public final void OooOOO(int i, int i2, int i3, int i4) {
        int i5 = i ^ -1;
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        int i8 = (i3 ^ i5) ^ (i6 | i7);
        this.OooO00o = i8;
        int i9 = i4 & i8;
        int i10 = (i6 ^ i8) ^ i9;
        this.OooO0O0 = i10;
        int i11 = i7 ^ (i8 | i5);
        this.OooO0OO = (i6 | i9) ^ i11;
        this.OooO0Oo = (i11 & i10) ^ (i2 ^ i9);
    }

    public final void OooOOO0(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ (i4 & i5);
        int i7 = i2 | i6;
        this.OooO0Oo = i5 ^ i7;
        int i8 = i2 ^ -1;
        int i9 = (i5 | i8) ^ i6;
        this.OooO00o = i9;
        int i10 = i8 ^ i5;
        int i11 = (i7 & i10) ^ (i9 & i);
        this.OooO0OO = i11;
        this.OooO0O0 = (i ^ i6) ^ (i10 & i11);
    }

    public final void OooOOOO(int i, int i2, int i3, int i4) {
        int i5 = i ^ -1;
        int i6 = i ^ i4;
        int i7 = i2 ^ i6;
        int i8 = i3 ^ (i5 | i6);
        int i9 = i2 ^ i8;
        this.OooO0O0 = i9;
        int i10 = (i6 | i9) ^ i4;
        int i11 = (i8 & i10) ^ i7;
        this.OooO0OO = i11;
        int i12 = i10 ^ i8;
        this.OooO00o = i11 ^ i12;
        this.OooO0Oo = (i12 & i7) ^ (i8 ^ -1);
    }

    public final void OooOOOo(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        int i8 = i2 ^ ((i4 | i5) & i7);
        this.OooO0O0 = i8;
        int i9 = (i & i7) ^ i5;
        this.OooO0Oo = i9;
        int i10 = (i8 | i6) ^ i7;
        int i11 = i6 ^ (i9 & i10);
        this.OooO0OO = i11;
        this.OooO00o = (i9 & i11) ^ (i10 ^ -1);
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
