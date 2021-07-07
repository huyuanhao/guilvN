package com.p118pd.sdk;

import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.Liillli  reason: case insensitive filesystem */
public class C5734Liillli implements C11iil {
    public C5712LiLl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f16631OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f16632OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16633OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16634OooO00o = new byte[256];
    public C5712LiLl OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public li1l11I1 f16635OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f16636OooO0O0;

    public C5734Liillli(iL1liI il1lii, li1l11I1 li1l11i1, li1l11I1 li1l11i12, AbstractC6436l11LI r21, AbstractC6436l11LI r22, int i) throws IOException {
        byte[] bArr;
        byte[] bArr2;
        C6274iilL1L r5;
        C6274iilL1L r2;
        this.f16631OooO00o = il1lii;
        il1lii.m17075OooO00o().OooO0O0(this.f16634OooO00o);
        this.f16633OooO00o = L1LL1Ii.OooO0O0(il1lii);
        this.f16636OooO0O0 = il1lii.m17074OooO00o().f17563OooO0O0;
        int OooO0O02 = (i * 2) + r21.OooO0O0() + r22.OooO0O0();
        OooO0O02 = !this.f16633OooO00o ? OooO0O02 + li1l11i1.OooO00o() + li1l11i12.OooO00o() : OooO0O02;
        byte[] OooO00o2 = L1LL1Ii.OooO00o(il1lii, OooO0O02);
        C5712LiLl r13 = new C5712LiLl(il1lii, r21, OooO00o2, 0, r21.OooO0O0());
        int OooO0O03 = r21.OooO0O0() + 0;
        C5712LiLl r6 = new C5712LiLl(il1lii, r22, OooO00o2, OooO0O03, r22.OooO0O0());
        int OooO0O04 = OooO0O03 + r22.OooO0O0();
        C6642li1LI r1 = new C6642li1LI(OooO00o2, OooO0O04, i);
        int i2 = OooO0O04 + i;
        C6642li1LI r23 = new C6642li1LI(OooO00o2, i2, i);
        int i3 = i2 + i;
        if (this.f16633OooO00o) {
            bArr2 = new byte[li1l11i1.OooO00o()];
            bArr = new byte[li1l11i12.OooO00o()];
        } else {
            bArr2 = C9586iIILl.m21632OooO00o(OooO00o2, i3, li1l11i1.OooO00o() + i3);
            int OooO00o3 = i3 + li1l11i1.OooO00o();
            bArr = C9586iIILl.m21632OooO00o(OooO00o2, OooO00o3, li1l11i12.OooO00o() + OooO00o3);
            i3 = OooO00o3 + li1l11i12.OooO00o();
        }
        if (i3 == OooO0O02) {
            if (il1lii.m17079OooO00o()) {
                this.OooO00o = r6;
                this.OooO0O0 = r13;
                this.f16632OooO00o = li1l11i12;
                this.f16635OooO0O0 = li1l11i1;
                r5 = new C6274iilL1L(r23, bArr);
                r2 = new C6274iilL1L(r1, bArr2);
            } else {
                this.OooO00o = r13;
                this.OooO0O0 = r6;
                this.f16632OooO00o = li1l11i1;
                this.f16635OooO0O0 = li1l11i12;
                r5 = new C6274iilL1L(r1, bArr2);
                r2 = new C6274iilL1L(r23, bArr);
            }
            this.f16632OooO00o.OooO00o(true, r5);
            this.f16635OooO0O0.OooO00o(false, r2);
            return;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.C11iil
    public int OooO00o(int i) {
        int i2;
        int OooO00o2 = this.f16632OooO00o.OooO00o();
        int OooO00o3 = this.OooO00o.OooO00o();
        if (this.f16633OooO00o) {
            i -= OooO00o2;
        }
        if (this.f16636OooO0O0) {
            int i3 = i - OooO00o3;
            i2 = i3 - (i3 % OooO00o2);
        } else {
            i2 = (i - (i % OooO00o2)) - OooO00o3;
        }
        return i2 - 1;
    }

    public int OooO00o(SecureRandom secureRandom, int i) {
        return Math.min(OooO0O0(secureRandom.nextInt()), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r8 != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int OooO00o(byte[] r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            int r6 = r6 + r7
            int r0 = r6 + -1
            byte r0 = r5[r0]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 1
            com.pd.sdk.iL1liI r2 = r4.f16631OooO00o
            boolean r2 = com.p118pd.sdk.L1LL1Ii.OooO00o(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0014
            if (r1 > r8) goto L_0x0017
        L_0x0014:
            int r9 = r9 + r1
            if (r9 <= r7) goto L_0x001b
        L_0x0017:
            r5 = 0
            r8 = 0
        L_0x0019:
            r1 = 0
            goto L_0x002b
        L_0x001b:
            int r7 = r6 - r1
            r8 = 0
        L_0x001e:
            int r9 = r7 + 1
            byte r7 = r5[r7]
            r7 = r7 ^ r0
            r7 = r7 | r8
            byte r8 = (byte) r7
            if (r9 < r6) goto L_0x0041
            r5 = r1
            if (r8 == 0) goto L_0x002b
            goto L_0x0019
        L_0x002b:
            byte[] r6 = r4.f16634OooO00o
        L_0x002d:
            r7 = 256(0x100, float:3.59E-43)
            if (r5 >= r7) goto L_0x003a
            int r7 = r5 + 1
            byte r5 = r6[r5]
            r5 = r5 ^ r0
            r5 = r5 | r8
            byte r8 = (byte) r5
            r5 = r7
            goto L_0x002d
        L_0x003a:
            byte r5 = r6[r3]
            r5 = r5 ^ r8
            byte r5 = (byte) r5
            r6[r3] = r5
            return r1
        L_0x0041:
            r7 = r9
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5734Liillli.OooO00o(byte[], int, int, int, int):int");
    }

    public C5712LiLl OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO00o(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2;
        int i4 = i;
        int OooO00o2 = this.f16635OooO0O0.OooO00o();
        int OooO00o3 = this.OooO0O0.OooO00o();
        int max = this.f16636OooO0O0 ? OooO00o2 + OooO00o3 : Math.max(OooO00o2, OooO00o3 + 1);
        if (this.f16633OooO00o) {
            max += OooO00o2;
        }
        if (i2 >= max) {
            int i5 = this.f16636OooO0O0 ? i2 - OooO00o3 : i2;
            if (i5 % OooO00o2 == 0) {
                if (this.f16636OooO0O0) {
                    int i6 = i4 + i2;
                    if (!C9586iIILl.OooO0O0(this.OooO0O0.OooO00o(j, s, bArr, i, i2 - OooO00o3), C9586iIILl.m21632OooO00o(bArr, i6 - OooO00o3, i6))) {
                        throw new TlsFatalAlert(20);
                    }
                }
                if (this.f16633OooO00o) {
                    this.f16635OooO0O0.OooO00o(false, new C6274iilL1L(null, bArr, i4, OooO00o2));
                    i4 += OooO00o2;
                    i5 -= OooO00o2;
                }
                for (int i7 = 0; i7 < i5; i7 += OooO00o2) {
                    int i8 = i4 + i7;
                    this.f16635OooO0O0.OooO00o(bArr, i8, bArr, i8);
                }
                int OooO00o4 = OooO00o(bArr, i4, i5, OooO00o2, this.f16636OooO0O0 ? 0 : OooO00o3);
                boolean z = OooO00o4 == 0;
                int i9 = i5 - OooO00o4;
                if (!this.f16636OooO0O0) {
                    i9 -= OooO00o3;
                    int i10 = i4 + i9;
                    i3 = i4;
                    bArr2 = bArr;
                    z |= !C9586iIILl.OooO0O0(this.OooO0O0.OooO00o(j, s, bArr, i4, i9, i5 - OooO00o3, this.f16634OooO00o), C9586iIILl.m21632OooO00o(bArr, i10, i10 + OooO00o3));
                } else {
                    i3 = i4;
                    bArr2 = bArr;
                }
                if (!z) {
                    return C9586iIILl.m21632OooO00o(bArr2, i3, i3 + i9);
                }
                throw new TlsFatalAlert(20);
            }
            throw new TlsFatalAlert(21);
        }
        throw new TlsFatalAlert(50);
    }

    public int OooO0O0(int i) {
        if (i == 0) {
            return 32;
        }
        int i2 = 0;
        while ((i & 1) == 0) {
            i2++;
            i >>= 1;
        }
        return i2;
    }

    public C5712LiLl OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO0O0(long j, short s, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2;
        int OooO00o2 = this.f16632OooO00o.OooO00o();
        int OooO00o3 = this.OooO00o.OooO00o();
        i1iiIl OooO0O02 = this.f16631OooO00o.OooO0O0();
        int i5 = (OooO00o2 - 1) - ((!this.f16636OooO0O0 ? i2 + OooO00o3 : i2) % OooO00o2);
        if ((this.f16636OooO0O0 || !this.f16631OooO00o.m17074OooO00o().f17560OooO00o) && !OooO0O02.m16892OooO00o() && !OooO0O02.m16893OooO0O0()) {
            i5 += OooO00o(this.f16631OooO00o.m17078OooO00o(), (255 - i5) / OooO00o2) * OooO00o2;
        }
        int i6 = OooO00o3 + i2 + i5 + 1;
        if (this.f16633OooO00o) {
            i6 += OooO00o2;
        }
        byte[] bArr3 = new byte[i6];
        if (this.f16633OooO00o) {
            byte[] bArr4 = new byte[OooO00o2];
            this.f16631OooO00o.m17075OooO00o().OooO0O0(bArr4);
            this.f16632OooO00o.OooO00o(true, new C6274iilL1L(null, bArr4));
            System.arraycopy(bArr4, 0, bArr3, 0, OooO00o2);
            bArr2 = bArr;
            i4 = i;
            i3 = OooO00o2 + 0;
        } else {
            bArr2 = bArr;
            i4 = i;
            i3 = 0;
        }
        System.arraycopy(bArr2, i4, bArr3, i3, i2);
        int i7 = i3 + i2;
        if (!this.f16636OooO0O0) {
            byte[] OooO00o4 = this.OooO00o.OooO00o(j, s, bArr, i, i2);
            System.arraycopy(OooO00o4, 0, bArr3, i7, OooO00o4.length);
            i7 += OooO00o4.length;
        }
        int i8 = i7;
        int i9 = 0;
        while (i9 <= i5) {
            bArr3[i8] = (byte) i5;
            i9++;
            i8++;
        }
        while (i3 < i8) {
            this.f16632OooO00o.OooO00o(bArr3, i3, bArr3, i3);
            i3 += OooO00o2;
        }
        if (!this.f16636OooO0O0) {
            return bArr3;
        }
        byte[] OooO00o5 = this.OooO00o.OooO00o(j, s, bArr3, 0, i8);
        System.arraycopy(OooO00o5, 0, bArr3, i8, OooO00o5.length);
        int length = OooO00o5.length;
        return bArr3;
    }
}
