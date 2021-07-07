package com.p118pd.sdk;

import com.p118pd.sdk.iL1iI1L;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.I丨l1l  reason: invalid class name and case insensitive filesystem */
public final class C5558Il1l {
    public final II11LLI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6578lLILi f16076OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16077OooO00o;
    public byte[] OooO0O0;

    public C5558Il1l(C6578lLILi r3) {
        if (r3 != null) {
            this.f16076OooO00o = r3;
            int OooO00o2 = r3.OooO00o();
            this.OooO00o = new II11LLI(r3.m17679OooO00o(), OooO00o2);
            this.f16077OooO00o = new byte[OooO00o2];
            this.OooO0O0 = new byte[OooO00o2];
            return;
        }
        throw new NullPointerException("params == null");
    }

    private List<Integer> OooO00o(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("msg == null");
        } else if (i == 4 || i == 16) {
            int OooO00o2 = C5532IiIllL.OooO00o(i);
            if (i2 <= (bArr.length * 8) / OooO00o2) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    for (int i4 = 8 - OooO00o2; i4 >= 0; i4 -= OooO00o2) {
                        arrayList.add(Integer.valueOf((bArr[i3] >> i4) & (i - 1)));
                        if (arrayList.size() == i2) {
                            return arrayList;
                        }
                    }
                }
                return arrayList;
            }
            throw new IllegalArgumentException("outLength too big");
        } else {
            throw new IllegalArgumentException("w needs to be 4 or 16");
        }
    }

    private byte[] OooO00o(int i) {
        if (i >= 0 && i < this.f16076OooO00o.OooO0O0()) {
            return this.OooO00o.OooO0Oo(this.f16077OooO00o, C5532IiIllL.m15806OooO00o((long) i, 32));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    private byte[] OooO00o(byte[] bArr, int i, int i2, iL1iI1L il1ii1l) {
        int OooO00o2 = this.f16076OooO00o.OooO00o();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        } else if (bArr.length != OooO00o2) {
            throw new IllegalArgumentException("startHash needs to be " + OooO00o2 + "bytes");
        } else if (il1ii1l == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (il1ii1l.OooO00o() != null) {
            int i3 = i + i2;
            if (i3 > this.f16076OooO00o.OooO0o0() - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i2 == 0) {
                return bArr;
            } else {
                byte[] OooO00o3 = OooO00o(bArr, i, i2 - 1, il1ii1l);
                iL1iI1L il1ii1l2 = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0OO(il1ii1l.OooO0o()).OooO00o(il1ii1l.OooO0Oo()).OooO0O0(i3 - 1).OooO00o(0)).OooO00o();
                byte[] OooO0Oo = this.OooO00o.OooO0Oo(this.OooO0O0, il1ii1l2.OooO00o());
                byte[] OooO0Oo2 = this.OooO00o.OooO0Oo(this.OooO0O0, ((iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l2.OooO0O0())).OooO00o(il1ii1l2.m15365OooO00o())).OooO0OO(il1ii1l2.OooO0o()).OooO00o(il1ii1l2.OooO0Oo()).OooO0O0(il1ii1l2.OooO0o0()).OooO00o(1)).OooO00o()).OooO00o());
                byte[] bArr2 = new byte[OooO00o2];
                for (int i4 = 0; i4 < OooO00o2; i4++) {
                    bArr2[i4] = (byte) (OooO00o3[i4] ^ OooO0Oo2[i4]);
                }
                return this.OooO00o.OooO00o(OooO0Oo, bArr2);
            }
        } else {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
    }

    public I1LLIII OooO00o(byte[] bArr, iL1iI1L il1ii1l) {
        if (bArr == null) {
            throw new NullPointerException("messageDigest == null");
        } else if (bArr.length != this.f16076OooO00o.OooO00o()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        } else if (il1ii1l != null) {
            List<Integer> OooO00o2 = OooO00o(bArr, this.f16076OooO00o.OooO0o0(), this.f16076OooO00o.OooO0OO());
            int i = 0;
            for (int i2 = 0; i2 < this.f16076OooO00o.OooO0OO(); i2++) {
                i += (this.f16076OooO00o.OooO0o0() - 1) - OooO00o2.get(i2).intValue();
            }
            int OooO0Oo = i << (8 - ((this.f16076OooO00o.OooO0Oo() * C5532IiIllL.OooO00o(this.f16076OooO00o.OooO0o0())) % 8));
            double OooO0Oo2 = (double) (this.f16076OooO00o.OooO0Oo() * C5532IiIllL.OooO00o(this.f16076OooO00o.OooO0o0()));
            Double.isNaN(OooO0Oo2);
            OooO00o2.addAll(OooO00o(C5532IiIllL.m15806OooO00o((long) OooO0Oo, (int) Math.ceil(OooO0Oo2 / 8.0d)), this.f16076OooO00o.OooO0o0(), this.f16076OooO00o.OooO0Oo()));
            byte[][] bArr2 = new byte[this.f16076OooO00o.OooO0O0()][];
            for (int i3 = 0; i3 < this.f16076OooO00o.OooO0O0(); i3++) {
                il1ii1l = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0OO(il1ii1l.OooO0o()).OooO00o(i3).OooO0O0(il1ii1l.OooO0o0()).OooO00o(il1ii1l.OooO00o())).OooO00o();
                bArr2[i3] = OooO00o(OooO00o(i3), 0, OooO00o2.get(i3).intValue(), il1ii1l);
            }
            return new I1LLIII(this.f16076OooO00o, bArr2);
        } else {
            throw new NullPointerException("otsHashAddress == null");
        }
    }

    public II11LLI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6578lLILi m15837OooO00o() {
        return this.f16076OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6650liIL m15838OooO00o() {
        int OooO0O02 = this.f16076OooO00o.OooO0O0();
        byte[][] bArr = new byte[OooO0O02][];
        for (int i = 0; i < OooO0O02; i++) {
            bArr[i] = OooO00o(i);
        }
        return new C6650liIL(this.f16076OooO00o, bArr);
    }

    public C6880lli OooO00o(iL1iI1L il1ii1l) {
        if (il1ii1l != null) {
            byte[][] bArr = new byte[this.f16076OooO00o.OooO0O0()][];
            for (int i = 0; i < this.f16076OooO00o.OooO0O0(); i++) {
                il1ii1l = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0OO(il1ii1l.OooO0o()).OooO00o(i).OooO0O0(il1ii1l.OooO0o0()).OooO00o(il1ii1l.OooO00o())).OooO00o();
                bArr[i] = OooO00o(OooO00o(i), 0, this.f16076OooO00o.OooO0o0() - 1, il1ii1l);
            }
            return new C6880lli(this.f16076OooO00o, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    public C6880lli OooO00o(byte[] bArr, I1LLIII r8, iL1iI1L il1ii1l) {
        if (bArr == null) {
            throw new NullPointerException("messageDigest == null");
        } else if (bArr.length != this.f16076OooO00o.OooO00o()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        } else if (r8 == null) {
            throw new NullPointerException("signature == null");
        } else if (il1ii1l != null) {
            List<Integer> OooO00o2 = OooO00o(bArr, this.f16076OooO00o.OooO0o0(), this.f16076OooO00o.OooO0OO());
            int i = 0;
            for (int i2 = 0; i2 < this.f16076OooO00o.OooO0OO(); i2++) {
                i += (this.f16076OooO00o.OooO0o0() - 1) - OooO00o2.get(i2).intValue();
            }
            int OooO0Oo = i << (8 - ((this.f16076OooO00o.OooO0Oo() * C5532IiIllL.OooO00o(this.f16076OooO00o.OooO0o0())) % 8));
            double OooO0Oo2 = (double) (this.f16076OooO00o.OooO0Oo() * C5532IiIllL.OooO00o(this.f16076OooO00o.OooO0o0()));
            Double.isNaN(OooO0Oo2);
            OooO00o2.addAll(OooO00o(C5532IiIllL.m15806OooO00o((long) OooO0Oo, (int) Math.ceil(OooO0Oo2 / 8.0d)), this.f16076OooO00o.OooO0o0(), this.f16076OooO00o.OooO0Oo()));
            byte[][] bArr2 = new byte[this.f16076OooO00o.OooO0O0()][];
            for (int i3 = 0; i3 < this.f16076OooO00o.OooO0O0(); i3++) {
                il1ii1l = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0OO(il1ii1l.OooO0o()).OooO00o(i3).OooO0O0(il1ii1l.OooO0o0()).OooO00o(il1ii1l.OooO00o())).OooO00o();
                bArr2[i3] = OooO00o(r8.OooO00o()[i3], OooO00o2.get(i3).intValue(), (this.f16076OooO00o.OooO0o0() - 1) - OooO00o2.get(i3).intValue(), il1ii1l);
            }
            return new C6880lli(this.f16076OooO00o, bArr2);
        } else {
            throw new NullPointerException("otsHashAddress == null");
        }
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        } else if (bArr.length != this.f16076OooO00o.OooO00o()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        } else if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        } else if (bArr2.length == this.f16076OooO00o.OooO00o()) {
            this.f16077OooO00o = bArr;
            this.OooO0O0 = bArr2;
        } else {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15839OooO00o(byte[] bArr, I1LLIII r4, iL1iI1L il1ii1l) {
        if (bArr == null) {
            throw new NullPointerException("messageDigest == null");
        } else if (bArr.length != this.f16076OooO00o.OooO00o()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        } else if (r4 == null) {
            throw new NullPointerException("signature == null");
        } else if (il1ii1l != null) {
            return C5532IiIllL.OooO00o(OooO00o(bArr, r4, il1ii1l).OooO00o(), OooO00o(il1ii1l).OooO00o());
        } else {
            throw new NullPointerException("otsHashAddress == null");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15840OooO00o() {
        return C5532IiIllL.OooO00o(this.OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15841OooO00o(byte[] bArr, iL1iI1L il1ii1l) {
        return this.OooO00o.OooO0Oo(bArr, ((iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0OO(il1ii1l.OooO0o()).OooO00o()).OooO00o());
    }

    public byte[] OooO0O0() {
        return C5532IiIllL.OooO00o(OooO0O0());
    }
}
