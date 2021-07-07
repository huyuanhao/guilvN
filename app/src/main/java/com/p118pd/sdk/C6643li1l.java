package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;

/* renamed from: com.pd.sdk.li1丨丨l  reason: invalid class name and case insensitive filesystem */
public final class C6643li1l extends C6213iL11I implements AbstractC6433il1 {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6454l1ii f18587OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BDSStateMap f18588OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18589OooO00o;
    public final byte[] OooO0O0;
    public final byte[] OooO0OO;
    public final byte[] OooO0Oo;

    /* renamed from: com.pd.sdk.li1丨丨l$OooO0O0 */
    public static class OooO0O0 {
        public long OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6454l1ii f18590OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C9341I1iilI1 f18591OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public BDSStateMap f18592OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f18593OooO00o = null;
        public byte[] OooO0O0 = null;
        public byte[] OooO0OO = null;
        public byte[] OooO0Oo = null;
        public byte[] OooO0o0 = null;

        public OooO0O0(C6454l1ii l1ii) {
            this.f18590OooO00o = l1ii;
        }

        public OooO0O0 OooO00o(long j) {
            this.OooO00o = j;
            return this;
        }

        public OooO0O0 OooO00o(BDSStateMap bDSStateMap) {
            this.f18592OooO00o = bDSStateMap;
            return this;
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            this.OooO0OO = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public OooO0O0 OooO00o(byte[] bArr, C9341I1iilI1 r2) {
            this.OooO0o0 = C5532IiIllL.OooO00o(bArr);
            this.f18591OooO00o = r2;
            return this;
        }

        public C6643li1l OooO00o() {
            return new C6643li1l(this);
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            this.OooO0Oo = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public OooO0O0 OooO0OO(byte[] bArr) {
            this.OooO0O0 = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public OooO0O0 OooO0Oo(byte[] bArr) {
            this.f18593OooO00o = C5532IiIllL.OooO00o(bArr);
            return this;
        }
    }

    public C6643li1l(OooO0O0 oooO0O0) {
        super(true);
        C6454l1ii l1ii = oooO0O0.f18590OooO00o;
        this.f18587OooO00o = l1ii;
        if (l1ii != null) {
            int OooO00o2 = l1ii.OooO00o();
            byte[] bArr = oooO0O0.OooO0o0;
            if (bArr == null) {
                this.OooO00o = oooO0O0.OooO00o;
                byte[] bArr2 = oooO0O0.f18593OooO00o;
                if (bArr2 == null) {
                    this.f18589OooO00o = new byte[OooO00o2];
                } else if (bArr2.length == OooO00o2) {
                    this.f18589OooO00o = bArr2;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] bArr3 = oooO0O0.OooO0O0;
                if (bArr3 == null) {
                    this.OooO0O0 = new byte[OooO00o2];
                } else if (bArr3.length == OooO00o2) {
                    this.OooO0O0 = bArr3;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] bArr4 = oooO0O0.OooO0OO;
                if (bArr4 == null) {
                    this.OooO0OO = new byte[OooO00o2];
                } else if (bArr4.length == OooO00o2) {
                    this.OooO0OO = bArr4;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] bArr5 = oooO0O0.OooO0Oo;
                if (bArr5 == null) {
                    this.OooO0Oo = new byte[OooO00o2];
                } else if (bArr5.length == OooO00o2) {
                    this.OooO0Oo = bArr5;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                BDSStateMap bDSStateMap = oooO0O0.f18592OooO00o;
                if (bDSStateMap == null) {
                    if (!C5532IiIllL.OooO00o(this.f18587OooO00o.OooO0O0(), oooO0O0.OooO00o) || bArr4 == null || bArr2 == null) {
                        this.f18588OooO00o = new BDSStateMap();
                        return;
                    }
                    bDSStateMap = new BDSStateMap(this.f18587OooO00o, oooO0O0.OooO00o, bArr4, bArr2);
                }
                this.f18588OooO00o = bDSStateMap;
            } else if (oooO0O0.f18591OooO00o != null) {
                int OooO0O02 = this.f18587OooO00o.OooO0O0();
                int i = (OooO0O02 + 7) / 8;
                long OooO00o3 = C5532IiIllL.OooO00o(bArr, 0, i);
                this.OooO00o = OooO00o3;
                if (C5532IiIllL.OooO00o(OooO0O02, OooO00o3)) {
                    int i2 = i + 0;
                    this.f18589OooO00o = C5532IiIllL.m15807OooO00o(bArr, i2, OooO00o2);
                    int i3 = i2 + OooO00o2;
                    this.OooO0O0 = C5532IiIllL.m15807OooO00o(bArr, i3, OooO00o2);
                    int i4 = i3 + OooO00o2;
                    this.OooO0OO = C5532IiIllL.m15807OooO00o(bArr, i4, OooO00o2);
                    int i5 = i4 + OooO00o2;
                    this.OooO0Oo = C5532IiIllL.m15807OooO00o(bArr, i5, OooO00o2);
                    int i6 = i5 + OooO00o2;
                    try {
                        BDSStateMap bDSStateMap2 = (BDSStateMap) C5532IiIllL.OooO00o(C5532IiIllL.m15807OooO00o(bArr, i6, bArr.length - i6), BDSStateMap.class);
                        bDSStateMap2.setXMSS(oooO0O0.f18591OooO00o);
                        this.f18588OooO00o = bDSStateMap2;
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e.getMessage(), e);
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalArgumentException(e2.getMessage(), e2);
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                throw new NullPointerException("xmss == null");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    public long OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6454l1ii m17733OooO00o() {
        return this.f18587OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6643li1l m17734OooO00o() {
        return new OooO0O0(this.f18587OooO00o).OooO00o(this.OooO00o + 1).OooO0Oo(this.f18589OooO00o).OooO0OO(this.OooO0O0).OooO00o(this.OooO0OO).OooO0O0(this.OooO0Oo).OooO00o(new BDSStateMap(this.f18588OooO00o, this.f18587OooO00o, OooO00o(), this.OooO0OO, this.f18589OooO00o)).OooO00o();
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BDSStateMap m17735OooO00o() {
        return this.f18588OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17736OooO00o() {
        int OooO00o2 = this.f18587OooO00o.OooO00o();
        int OooO0O02 = (this.f18587OooO00o.OooO0O0() + 7) / 8;
        byte[] bArr = new byte[(OooO0O02 + OooO00o2 + OooO00o2 + OooO00o2 + OooO00o2)];
        C5532IiIllL.OooO00o(bArr, C5532IiIllL.m15806OooO00o(this.OooO00o, OooO0O02), 0);
        int i = OooO0O02 + 0;
        C5532IiIllL.OooO00o(bArr, this.f18589OooO00o, i);
        int i2 = i + OooO00o2;
        C5532IiIllL.OooO00o(bArr, this.OooO0O0, i2);
        int i3 = i2 + OooO00o2;
        C5532IiIllL.OooO00o(bArr, this.OooO0OO, i3);
        C5532IiIllL.OooO00o(bArr, this.OooO0Oo, i3 + OooO00o2);
        try {
            return C9586iIILl.m21645OooO0O0(bArr, C5532IiIllL.OooO00o(this.f18588OooO00o));
        } catch (IOException e) {
            throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
        }
    }

    public byte[] OooO0O0() {
        return C5532IiIllL.OooO00o(this.OooO0OO);
    }

    public byte[] OooO0OO() {
        return C5532IiIllL.OooO00o(this.OooO0Oo);
    }

    public byte[] OooO0Oo() {
        return C5532IiIllL.OooO00o(this.OooO0O0);
    }

    public byte[] OooO0o0() {
        return C5532IiIllL.OooO00o(this.f18589OooO00o);
    }
}
