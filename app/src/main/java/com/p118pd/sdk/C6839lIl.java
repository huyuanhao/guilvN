package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨I丨l  reason: invalid class name and case insensitive filesystem */
public class C6839lIl implements li1l11I1 {
    public static final long OooO00o = -5196783011329398165L;
    public static final int OooO0O0 = 64;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final long f18897OooO0O0 = -7046029254386353131L;
    public static final int OooO0OO = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18898OooO00o = 12;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18899OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[] f18900OooO00o = null;

    private long OooO00o(long j, long j2) {
        long j3 = j2 & 63;
        return (j >>> ((int) (64 - j3))) | (j << ((int) j3));
    }

    private long OooO00o(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + ((long) (bArr[i2 + i] & 255));
        }
        return j;
    }

    private void OooO00o(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) ((int) j);
            j >>>= 8;
        }
    }

    private void OooO00o(byte[] bArr) {
        long[] jArr;
        int length = (bArr.length + 7) / 8;
        long[] jArr2 = new long[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 8;
            jArr2[i2] = jArr2[i2] + (((long) (bArr[i] & 255)) << ((i % 8) * 8));
        }
        long[] jArr3 = new long[((this.f18898OooO00o + 1) * 2)];
        this.f18900OooO00o = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i3 = 1;
        while (true) {
            jArr = this.f18900OooO00o;
            if (i3 >= jArr.length) {
                break;
            }
            jArr[i3] = jArr[i3 - 1] + f18897OooO0O0;
            i3++;
        }
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        long j = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length2; i6++) {
            long[] jArr4 = this.f18900OooO00o;
            j = OooO00o(jArr4[i4] + j + j2, 3);
            jArr4[i4] = j;
            j2 = OooO00o(jArr2[i5] + j + j2, j2 + j);
            jArr2[i5] = j2;
            i4 = (i4 + 1) % this.f18900OooO00o.length;
            i5 = (i5 + 1) % length;
        }
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        long OooO00o2 = OooO00o(bArr, i);
        long OooO00o3 = OooO00o(bArr, i + 8);
        for (int i3 = this.f18898OooO00o; i3 >= 1; i3--) {
            int i4 = i3 * 2;
            OooO00o3 = OooO0O0(OooO00o3 - this.f18900OooO00o[i4 + 1], OooO00o2) ^ OooO00o2;
            OooO00o2 = OooO0O0(OooO00o2 - this.f18900OooO00o[i4], OooO00o3) ^ OooO00o3;
        }
        OooO00o(OooO00o2 - this.f18900OooO00o[0], bArr2, i2);
        OooO00o(OooO00o3 - this.f18900OooO00o[1], bArr2, i2 + 8);
        return 16;
    }

    private long OooO0O0(long j, long j2) {
        long j3 = j2 & 63;
        return (j << ((int) (64 - j3))) | (j >>> ((int) j3));
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        long OooO00o2 = OooO00o(bArr, i) + this.f18900OooO00o[0];
        long OooO00o3 = OooO00o(bArr, i + 8) + this.f18900OooO00o[1];
        for (int i3 = 1; i3 <= this.f18898OooO00o; i3++) {
            int i4 = i3 * 2;
            OooO00o2 = OooO00o(OooO00o2 ^ OooO00o3, OooO00o3) + this.f18900OooO00o[i4];
            OooO00o3 = OooO00o(OooO00o3 ^ OooO00o2, OooO00o2) + this.f18900OooO00o[i4 + 1];
        }
        OooO00o(OooO00o2, bArr2, i2);
        OooO00o(OooO00o3, bArr2, i2 + 8);
        return 16;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.f18899OooO00o ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17991OooO00o() {
        return "RC5-64";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof C5663LLiL1l) {
            C5663LLiL1l lLiL1l = (C5663LLiL1l) r4;
            this.f18899OooO00o = z;
            this.f18898OooO00o = lLiL1l.OooO00o();
            OooO00o(lLiL1l.m16235OooO00o());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + r4.getClass().getName());
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
