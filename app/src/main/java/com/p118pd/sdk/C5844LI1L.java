package com.p118pd.sdk;

import com.p118pd.sdk.iL1iI1L;
import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.BDS;

/* renamed from: com.pd.sdk.L丨I1L  reason: invalid class name and case insensitive filesystem */
public final class C5844LI1L extends C6213iL11I implements AbstractC6433il1 {
    public final C9341I1iilI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BDS f16809OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16810OooO00o;
    public final byte[] OooO0O0;
    public final byte[] OooO0OO;
    public final byte[] OooO0Oo;

    /* renamed from: com.pd.sdk.L丨I1L$OooO0O0 */
    public static class OooO0O0 {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9341I1iilI1 f16811OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public BDS f16812OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f16813OooO00o = null;
        public C9341I1iilI1 OooO0O0 = null;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public byte[] f16814OooO0O0 = null;
        public byte[] OooO0OO = null;
        public byte[] OooO0Oo = null;
        public byte[] OooO0o0 = null;

        public OooO0O0(C9341I1iilI1 r2) {
            this.f16811OooO00o = r2;
        }

        public OooO0O0 OooO00o(int i) {
            this.OooO00o = i;
            return this;
        }

        public OooO0O0 OooO00o(BDS bds) {
            this.f16812OooO00o = bds;
            return this;
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            this.OooO0OO = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public OooO0O0 OooO00o(byte[] bArr, C9341I1iilI1 r2) {
            this.OooO0o0 = C5532IiIllL.OooO00o(bArr);
            this.OooO0O0 = r2;
            return this;
        }

        public C5844LI1L OooO00o() {
            return new C5844LI1L(this);
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            this.OooO0Oo = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public OooO0O0 OooO0OO(byte[] bArr) {
            this.f16814OooO0O0 = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public OooO0O0 OooO0Oo(byte[] bArr) {
            this.f16813OooO00o = C5532IiIllL.OooO00o(bArr);
            return this;
        }
    }

    public C5844LI1L(OooO0O0 oooO0O0) {
        super(true);
        C9341I1iilI1 r1 = oooO0O0.f16811OooO00o;
        this.OooO00o = r1;
        if (r1 != null) {
            int OooO00o2 = r1.OooO00o();
            byte[] bArr = oooO0O0.OooO0o0;
            if (bArr == null) {
                byte[] bArr2 = oooO0O0.f16813OooO00o;
                if (bArr2 == null) {
                    this.f16810OooO00o = new byte[OooO00o2];
                } else if (bArr2.length == OooO00o2) {
                    this.f16810OooO00o = bArr2;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] bArr3 = oooO0O0.f16814OooO0O0;
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
                BDS bds = oooO0O0.f16812OooO00o;
                if (bds != null) {
                    this.f16809OooO00o = bds;
                } else {
                    this.f16809OooO00o = (oooO0O0.OooO00o >= (1 << this.OooO00o.OooO0O0()) + -2 || bArr4 == null || bArr2 == null) ? new BDS(this.OooO00o, oooO0O0.OooO00o) : new BDS(this.OooO00o, bArr4, bArr2, (iL1iI1L) new iL1iI1L.OooO0O0().OooO00o(), oooO0O0.OooO00o);
                }
            } else if (oooO0O0.OooO0O0 != null) {
                int OooO0O02 = this.OooO00o.OooO0O0();
                int OooO00o3 = AbstractC6464l1l.OooO00o(bArr, 0);
                if (C5532IiIllL.OooO00o(OooO0O02, (long) OooO00o3)) {
                    this.f16810OooO00o = C5532IiIllL.m15807OooO00o(bArr, 4, OooO00o2);
                    int i = 4 + OooO00o2;
                    this.OooO0O0 = C5532IiIllL.m15807OooO00o(bArr, i, OooO00o2);
                    int i2 = i + OooO00o2;
                    this.OooO0OO = C5532IiIllL.m15807OooO00o(bArr, i2, OooO00o2);
                    int i3 = i2 + OooO00o2;
                    this.OooO0Oo = C5532IiIllL.m15807OooO00o(bArr, i3, OooO00o2);
                    int i4 = i3 + OooO00o2;
                    try {
                        BDS bds2 = (BDS) C5532IiIllL.OooO00o(C5532IiIllL.m15807OooO00o(bArr, i4, bArr.length - i4), BDS.class);
                        bds2.setXMSS(oooO0O0.OooO0O0);
                        bds2.validate();
                        if (bds2.getIndex() == OooO00o3) {
                            this.f16809OooO00o = bds2;
                            return;
                        }
                        throw new IllegalStateException("serialized BDS has wrong index");
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
    public int OooO00o() {
        return this.f16809OooO00o.getIndex();
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5844LI1L m16427OooO00o() {
        OooO0O0 OooO0O02;
        BDS bds;
        if (OooO00o() < (1 << this.OooO00o.OooO0O0()) - 1) {
            OooO0O02 = new OooO0O0(this.OooO00o).OooO0Oo(this.f16810OooO00o).OooO0OO(this.OooO0O0).OooO00o(this.OooO0OO).OooO0O0(this.OooO0Oo);
            bds = this.f16809OooO00o.getNextState(this.OooO0OO, this.f16810OooO00o, (iL1iI1L) new iL1iI1L.OooO0O0().OooO00o());
        } else {
            OooO0O02 = new OooO0O0(this.OooO00o).OooO0Oo(this.f16810OooO00o).OooO0OO(this.OooO0O0).OooO00o(this.OooO0OO).OooO0O0(this.OooO0Oo);
            bds = new BDS(this.OooO00o, OooO00o() + 1);
        }
        return OooO0O02.OooO00o(bds).OooO00o();
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9341I1iilI1 m16428OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BDS m16429OooO00o() {
        return this.f16809OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16430OooO00o() {
        int OooO00o2 = this.OooO00o.OooO00o();
        byte[] bArr = new byte[(OooO00o2 + 4 + OooO00o2 + OooO00o2 + OooO00o2)];
        AbstractC6464l1l.OooO00o(this.f16809OooO00o.getIndex(), bArr, 0);
        C5532IiIllL.OooO00o(bArr, this.f16810OooO00o, 4);
        int i = 4 + OooO00o2;
        C5532IiIllL.OooO00o(bArr, this.OooO0O0, i);
        int i2 = i + OooO00o2;
        C5532IiIllL.OooO00o(bArr, this.OooO0OO, i2);
        C5532IiIllL.OooO00o(bArr, this.OooO0Oo, i2 + OooO00o2);
        try {
            return C9586iIILl.m21645OooO0O0(bArr, C5532IiIllL.OooO00o(this.f16809OooO00o));
        } catch (IOException e) {
            throw new RuntimeException("error serializing bds state: " + e.getMessage());
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
        return C5532IiIllL.OooO00o(this.f16810OooO00o);
    }
}
