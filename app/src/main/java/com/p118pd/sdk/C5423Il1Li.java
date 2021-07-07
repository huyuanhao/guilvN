package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.Il1丨Li  reason: invalid class name and case insensitive filesystem */
public class C5423Il1Li implements AbstractC6769llL1L {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f15806OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f15807OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long f15808OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public long f15809OooO0Oo;
    public long OooO0o;
    public long OooO0o0;
    public long OooO0oO;

    public C5423Il1Li() {
        this.OooO0oO = 0;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO00o = 2;
        this.OooO0O0 = 4;
    }

    public C5423Il1Li(int i, int i2) {
        this.OooO0oO = 0;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO00o = i;
        this.OooO0O0 = i2;
    }

    public static long OooO00o(long j, int i) {
        return (j >>> (-i)) | (j << i);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return 8;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        AbstractC6464l1l.OooO0O0(m15654OooO00o(), bArr, i);
        return 8;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m15654OooO00o() throws DataLengthException, IllegalStateException {
        long j = this.OooO0oO;
        int i = this.OooO0OO;
        long j2 = j >>> ((7 - i) << 3);
        this.OooO0oO = j2;
        long j3 = j2 >>> 8;
        this.OooO0oO = j3;
        this.OooO0oO = j3 | ((((long) ((this.OooO0Oo << 3) + i)) & 255) << 56);
        m15656OooO00o();
        this.OooO0o0 ^= 255;
        OooO00o(this.OooO0O0);
        long j4 = ((this.f15808OooO0OO ^ this.f15809OooO0Oo) ^ this.OooO0o0) ^ this.OooO0o;
        reset();
        return j4;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15655OooO00o() {
        return "SipHash-" + this.OooO00o + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15656OooO00o() {
        this.OooO0Oo++;
        this.OooO0o ^= this.OooO0oO;
        OooO00o(this.OooO00o);
        this.f15808OooO0OO ^= this.OooO0oO;
    }

    public void OooO00o(int i) {
        long j = this.f15808OooO0OO;
        long j2 = this.f15809OooO0Oo;
        long j3 = this.OooO0o0;
        long j4 = this.OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            long j5 = j + j2;
            long j6 = j3 + j4;
            long OooO00o2 = OooO00o(j2, 13) ^ j5;
            long OooO00o3 = OooO00o(j4, 16) ^ j6;
            long j7 = j6 + OooO00o2;
            j = OooO00o(j5, 32) + OooO00o3;
            j2 = OooO00o(OooO00o2, 17) ^ j7;
            j4 = OooO00o(OooO00o3, 21) ^ j;
            j3 = OooO00o(j7, 32);
        }
        this.f15808OooO0OO = j;
        this.f15809OooO0Oo = j2;
        this.OooO0o0 = j3;
        this.OooO0o = j4;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r3) throws IllegalArgumentException {
        if (r3 instanceof C6642li1LI) {
            byte[] OooO00o2 = ((C6642li1LI) r3).OooO00o();
            if (OooO00o2.length == 16) {
                this.f15806OooO00o = AbstractC6464l1l.m17601OooO0O0(OooO00o2, 0);
                this.f15807OooO0O0 = AbstractC6464l1l.m17601OooO0O0(OooO00o2, 8);
                reset();
                return;
            }
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        long j = this.f15806OooO00o;
        this.f15808OooO0OO = 8317987319222330741L ^ j;
        long j2 = this.f15807OooO0O0;
        this.f15809OooO0Oo = 7237128888997146477L ^ j2;
        this.OooO0o0 = j ^ 7816392313619706465L;
        this.OooO0o = 8387220255154660723L ^ j2;
        this.OooO0oO = 0;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) throws IllegalStateException {
        long j = this.OooO0oO >>> 8;
        this.OooO0oO = j;
        this.OooO0oO = j | ((((long) b) & 255) << 56);
        int i = this.OooO0OO + 1;
        this.OooO0OO = i;
        if (i == 8) {
            m15656OooO00o();
            this.OooO0OO = 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        int i3 = i2 & -8;
        int i4 = this.OooO0OO;
        int i5 = 0;
        if (i4 == 0) {
            while (i5 < i3) {
                this.OooO0oO = AbstractC6464l1l.m17601OooO0O0(bArr, i + i5);
                m15656OooO00o();
                i5 += 8;
            }
            while (i5 < i2) {
                long j = this.OooO0oO >>> 8;
                this.OooO0oO = j;
                this.OooO0oO = j | ((((long) bArr[i + i5]) & 255) << 56);
                i5++;
            }
            this.OooO0OO = i2 - i3;
            return;
        }
        int i6 = i4 << 3;
        int i7 = 0;
        while (i7 < i3) {
            long OooO0O02 = AbstractC6464l1l.m17601OooO0O0(bArr, i + i7);
            this.OooO0oO = (this.OooO0oO >>> (-i6)) | (OooO0O02 << i6);
            m15656OooO00o();
            this.OooO0oO = OooO0O02;
            i7 += 8;
        }
        while (i7 < i2) {
            long j2 = this.OooO0oO >>> 8;
            this.OooO0oO = j2;
            this.OooO0oO = j2 | ((((long) bArr[i + i7]) & 255) << 56);
            int i8 = this.OooO0OO + 1;
            this.OooO0OO = i8;
            if (i8 == 8) {
                m15656OooO00o();
                this.OooO0OO = 0;
            }
            i7++;
        }
    }
}
