package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Lii丨il  reason: invalid class name and case insensitive filesystem */
public final class C5736Liiil extends C6213iL11I implements AbstractC6433il1 {
    public final C6454l1ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16638OooO00o;
    public final byte[] OooO0O0;

    /* renamed from: com.pd.sdk.Lii丨il$OooO0O0 */
    public static class OooO0O0 {
        public final C6454l1ii OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f16639OooO00o = null;
        public byte[] OooO0O0 = null;
        public byte[] OooO0OO = null;

        public OooO0O0(C6454l1ii l1ii) {
            this.OooO00o = l1ii;
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            this.OooO0OO = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public C5736Liiil OooO00o() {
            return new C5736Liiil(this);
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            this.OooO0O0 = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public OooO0O0 OooO0OO(byte[] bArr) {
            this.f16639OooO00o = C5532IiIllL.OooO00o(bArr);
            return this;
        }
    }

    public C5736Liiil(OooO0O0 oooO0O0) {
        super(false);
        C6454l1ii l1ii = oooO0O0.OooO00o;
        this.OooO00o = l1ii;
        if (l1ii != null) {
            int OooO00o2 = l1ii.OooO00o();
            byte[] bArr = oooO0O0.OooO0OO;
            if (bArr != null) {
                if (bArr.length == OooO00o2 + OooO00o2) {
                    this.f16638OooO00o = C5532IiIllL.m15807OooO00o(bArr, 0, OooO00o2);
                    this.OooO0O0 = C5532IiIllL.m15807OooO00o(bArr, OooO00o2 + 0, OooO00o2);
                    return;
                }
                throw new IllegalArgumentException("public key has wrong size");
            }
            byte[] bArr2 = oooO0O0.f16639OooO00o;
            if (bArr2 == null) {
                this.f16638OooO00o = new byte[OooO00o2];
            } else if (bArr2.length == OooO00o2) {
                this.f16638OooO00o = bArr2;
            } else {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            byte[] bArr3 = oooO0O0.OooO0O0;
            if (bArr3 == null) {
                this.OooO0O0 = new byte[OooO00o2];
            } else if (bArr3.length == OooO00o2) {
                this.OooO0O0 = bArr3;
            } else {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    public C6454l1ii OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16315OooO00o() {
        int OooO00o2 = this.OooO00o.OooO00o();
        byte[] bArr = new byte[(OooO00o2 + OooO00o2)];
        C5532IiIllL.OooO00o(bArr, this.f16638OooO00o, 0);
        C5532IiIllL.OooO00o(bArr, this.OooO0O0, OooO00o2 + 0);
        return bArr;
    }

    public byte[] OooO0O0() {
        return C5532IiIllL.OooO00o(this.OooO0O0);
    }

    public byte[] OooO0OO() {
        return C5532IiIllL.OooO00o(this.f16638OooO00o);
    }
}
