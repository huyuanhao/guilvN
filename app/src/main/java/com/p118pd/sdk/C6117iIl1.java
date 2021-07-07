package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iIl1  reason: case insensitive filesystem */
public class C6117iIl1 implements AbstractC6769llL1L {
    public static final int OooOo00 = 16;
    public int OooO;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final li1l11I1 f17576OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f17577OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final byte[] f17578OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public int OooOOoo;

    public C6117iIl1() {
        this.f17577OooO00o = new byte[1];
        this.f17578OooO0O0 = new byte[16];
        this.OooOOO = 0;
        this.f17576OooO00o = null;
    }

    public C6117iIl1(li1l11I1 li1l11i1) {
        this.f17577OooO00o = new byte[1];
        this.f17578OooO0O0 = new byte[16];
        this.OooOOO = 0;
        if (li1l11i1.OooO00o() == 16) {
            this.f17576OooO00o = li1l11i1;
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
    }

    public static final long OooO00o(int i, int i2) {
        return (((long) i) & 4294967295L) * ((long) i2);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    private void OooO00o() {
        int i = this.OooOOO;
        if (i < 16) {
            this.f17578OooO0O0[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.f17578OooO0O0[i2] = 0;
            }
        }
        long OooO0O02 = ((long) AbstractC6464l1l.OooO0O0(this.f17578OooO0O0, 0)) & 4294967295L;
        long OooO0O03 = ((long) AbstractC6464l1l.OooO0O0(this.f17578OooO0O0, 4)) & 4294967295L;
        long OooO0O04 = ((long) AbstractC6464l1l.OooO0O0(this.f17578OooO0O0, 8)) & 4294967295L;
        long OooO0O05 = 4294967295L & ((long) AbstractC6464l1l.OooO0O0(this.f17578OooO0O0, 12));
        this.OooOOOO = (int) (((long) this.OooOOOO) + (OooO0O02 & AbstractC6797lll.f18836OooO00o));
        this.OooOOOo = (int) (((long) this.OooOOOo) + ((((OooO0O03 << 32) | OooO0O02) >>> 26) & AbstractC6797lll.f18836OooO00o));
        this.OooOOo0 = (int) (((long) this.OooOOo0) + (((OooO0O03 | (OooO0O04 << 32)) >>> 20) & AbstractC6797lll.f18836OooO00o));
        this.OooOOo = (int) (((long) this.OooOOo) + ((((OooO0O05 << 32) | OooO0O04) >>> 14) & AbstractC6797lll.f18836OooO00o));
        int i3 = (int) (((long) this.OooOOoo) + (OooO0O05 >>> 8));
        this.OooOOoo = i3;
        if (this.OooOOO == 16) {
            this.OooOOoo = i3 + 16777216;
        }
        long OooO00o2 = OooO00o(this.OooOOOO, this.OooO00o) + OooO00o(this.OooOOOo, this.OooO) + OooO00o(this.OooOOo0, this.OooO0oo) + OooO00o(this.OooOOo, this.OooO0oO) + OooO00o(this.OooOOoo, this.OooO0o);
        long OooO00o3 = OooO00o(this.OooOOOO, this.OooO0O0) + OooO00o(this.OooOOOo, this.OooO00o) + OooO00o(this.OooOOo0, this.OooO) + OooO00o(this.OooOOo, this.OooO0oo) + OooO00o(this.OooOOoo, this.OooO0oO);
        long OooO00o4 = OooO00o(this.OooOOOO, this.OooO0OO) + OooO00o(this.OooOOOo, this.OooO0O0) + OooO00o(this.OooOOo0, this.OooO00o) + OooO00o(this.OooOOo, this.OooO) + OooO00o(this.OooOOoo, this.OooO0oo);
        long OooO00o5 = OooO00o(this.OooOOOO, this.OooO0Oo) + OooO00o(this.OooOOOo, this.OooO0OO) + OooO00o(this.OooOOo0, this.OooO0O0) + OooO00o(this.OooOOo, this.OooO00o) + OooO00o(this.OooOOoo, this.OooO);
        long OooO00o6 = OooO00o(this.OooOOOO, this.OooO0o0) + OooO00o(this.OooOOOo, this.OooO0Oo) + OooO00o(this.OooOOo0, this.OooO0OO) + OooO00o(this.OooOOo, this.OooO0O0) + OooO00o(this.OooOOoo, this.OooO00o);
        int i4 = ((int) OooO00o2) & iIiLL1I.OooO0Oo;
        this.OooOOOO = i4;
        long j = OooO00o3 + (OooO00o2 >>> 26);
        int i5 = ((int) j) & iIiLL1I.OooO0Oo;
        this.OooOOOo = i5;
        long j2 = OooO00o4 + (j >>> 26);
        this.OooOOo0 = ((int) j2) & iIiLL1I.OooO0Oo;
        long j3 = OooO00o5 + (j2 >>> 26);
        this.OooOOo = ((int) j3) & iIiLL1I.OooO0Oo;
        long j4 = OooO00o6 + (j3 >>> 26);
        this.OooOOoo = ((int) j4) & iIiLL1I.OooO0Oo;
        int i6 = i4 + (((int) (j4 >>> 26)) * 5);
        this.OooOOOO = i6;
        this.OooOOOo = i5 + (i6 >>> 26);
        this.OooOOOO = i6 & iIiLL1I.OooO0Oo;
    }

    private void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i = 16;
            if (this.f17576OooO00o == null || (bArr2 != null && bArr2.length == 16)) {
                int OooO0O02 = AbstractC6464l1l.OooO0O0(bArr, 0);
                int OooO0O03 = AbstractC6464l1l.OooO0O0(bArr, 4);
                int OooO0O04 = AbstractC6464l1l.OooO0O0(bArr, 8);
                int OooO0O05 = AbstractC6464l1l.OooO0O0(bArr, 12);
                this.OooO00o = 67108863 & OooO0O02;
                int i2 = ((OooO0O02 >>> 26) | (OooO0O03 << 6)) & 67108611;
                this.OooO0O0 = i2;
                int i3 = ((OooO0O03 >>> 20) | (OooO0O04 << 12)) & 67092735;
                this.OooO0OO = i3;
                int i4 = ((OooO0O04 >>> 14) | (OooO0O05 << 18)) & 66076671;
                this.OooO0Oo = i4;
                int i5 = (OooO0O05 >>> 8) & 1048575;
                this.OooO0o0 = i5;
                this.OooO0o = i2 * 5;
                this.OooO0oO = i3 * 5;
                this.OooO0oo = i4 * 5;
                this.OooO = i5 * 5;
                li1l11I1 li1l11i1 = this.f17576OooO00o;
                if (li1l11i1 != null) {
                    byte[] bArr3 = new byte[16];
                    li1l11i1.OooO00o(true, new C6642li1LI(bArr, 16, 16));
                    this.f17576OooO00o.OooO00o(bArr2, 0, bArr3, 0);
                    bArr = bArr3;
                    i = 0;
                }
                this.OooOO0 = AbstractC6464l1l.OooO0O0(bArr, i + 0);
                this.OooOO0O = AbstractC6464l1l.OooO0O0(bArr, i + 4);
                this.OooOO0o = AbstractC6464l1l.OooO0O0(bArr, i + 8);
                this.OooOOO0 = AbstractC6464l1l.OooO0O0(bArr, i + 12);
                return;
            }
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17010OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        if (i + 16 <= bArr.length) {
            if (this.OooOOO > 0) {
                OooO00o();
            }
            int i2 = this.OooOOOo;
            int i3 = this.OooOOOO;
            int i4 = i2 + (i3 >>> 26);
            this.OooOOOo = i4;
            int i5 = i3 & iIiLL1I.OooO0Oo;
            this.OooOOOO = i5;
            int i6 = this.OooOOo0 + (i4 >>> 26);
            this.OooOOo0 = i6;
            int i7 = i4 & iIiLL1I.OooO0Oo;
            this.OooOOOo = i7;
            int i8 = this.OooOOo + (i6 >>> 26);
            this.OooOOo = i8;
            int i9 = i6 & iIiLL1I.OooO0Oo;
            this.OooOOo0 = i9;
            int i10 = this.OooOOoo + (i8 >>> 26);
            this.OooOOoo = i10;
            int i11 = i8 & iIiLL1I.OooO0Oo;
            this.OooOOo = i11;
            int i12 = i5 + ((i10 >>> 26) * 5);
            this.OooOOOO = i12;
            int i13 = i10 & iIiLL1I.OooO0Oo;
            this.OooOOoo = i13;
            int i14 = i7 + (i12 >>> 26);
            this.OooOOOo = i14;
            int i15 = i12 & iIiLL1I.OooO0Oo;
            this.OooOOOO = i15;
            int i16 = i15 + 5;
            int i17 = i16 >>> 26;
            int i18 = i16 & iIiLL1I.OooO0Oo;
            int i19 = i17 + i14;
            int i20 = i19 >>> 26;
            int i21 = i19 & iIiLL1I.OooO0Oo;
            int i22 = i20 + i9;
            int i23 = i22 >>> 26;
            int i24 = i22 & iIiLL1I.OooO0Oo;
            int i25 = i23 + i11;
            int i26 = 67108863 & i25;
            int i27 = ((i25 >>> 26) + i13) - 67108864;
            int i28 = (i27 >>> 31) - 1;
            int i29 = i28 ^ -1;
            int i30 = (i15 & i29) | (i18 & i28);
            this.OooOOOO = i30;
            int i31 = (i14 & i29) | (i21 & i28);
            this.OooOOOo = i31;
            int i32 = (i9 & i29) | (i24 & i28);
            this.OooOOo0 = i32;
            int i33 = (i26 & i28) | (i11 & i29);
            this.OooOOo = i33;
            int i34 = (i13 & i29) | (i27 & i28);
            this.OooOOoo = i34;
            long j = (((long) (i30 | (i31 << 26))) & 4294967295L) + (((long) this.OooOO0) & 4294967295L);
            long j2 = (((long) ((i31 >>> 6) | (i32 << 20))) & 4294967295L) + (((long) this.OooOO0O) & 4294967295L);
            long j3 = (((long) ((i32 >>> 12) | (i33 << 14))) & 4294967295L) + (((long) this.OooOO0o) & 4294967295L);
            AbstractC6464l1l.OooO0O0((int) j, bArr, i);
            long j4 = j2 + (j >>> 32);
            AbstractC6464l1l.OooO0O0((int) j4, bArr, i + 4);
            long j5 = j3 + (j4 >>> 32);
            AbstractC6464l1l.OooO0O0((int) j5, bArr, i + 8);
            AbstractC6464l1l.OooO0O0((int) ((((long) ((i33 >>> 18) | (i34 << 8))) & 4294967295L) + (4294967295L & ((long) this.OooOOO0)) + (j5 >>> 32)), bArr, i + 12);
            reset();
            return 16;
        }
        throw new OutputLengthException("Output buffer is too short.");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17011OooO00o() {
        if (this.f17576OooO00o == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.f17576OooO00o.m17732OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r3) throws IllegalArgumentException {
        byte[] bArr;
        if (this.f17576OooO00o == null) {
            bArr = null;
        } else if (r3 instanceof C6274iilL1L) {
            C6274iilL1L r32 = (C6274iilL1L) r3;
            bArr = r32.m17301OooO00o();
            r3 = r32.OooO00o();
        } else {
            throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
        }
        if (r3 instanceof C6642li1LI) {
            OooO00o(((C6642li1LI) r3).OooO00o(), bArr);
            reset();
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a key.");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        this.OooOOO = 0;
        this.OooOOoo = 0;
        this.OooOOo = 0;
        this.OooOOo0 = 0;
        this.OooOOOo = 0;
        this.OooOOOO = 0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.f17577OooO00o;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.OooOOO == 16) {
                OooO00o();
                this.OooOOO = 0;
            }
            int min = Math.min(i2 - i3, 16 - this.OooOOO);
            System.arraycopy(bArr, i3 + i, this.f17578OooO0O0, this.OooOOO, min);
            i3 += min;
            this.OooOOO += min;
        }
    }
}
