package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨iIl丨I  reason: invalid class name and case insensitive filesystem */
public final class C6394iiIlI extends C6213iL11I implements AbstractC6433il1 {
    public final C9341I1iilI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18201OooO00o;
    public final byte[] OooO0O0;

    /* renamed from: com.pd.sdk.i丨iIl丨I$OooO0O0 */
    public static class OooO0O0 {
        public final C9341I1iilI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f18202OooO00o = null;
        public byte[] OooO0O0 = null;
        public byte[] OooO0OO = null;

        public OooO0O0(C9341I1iilI1 r2) {
            this.OooO00o = r2;
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            this.OooO0OO = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public C6394iiIlI OooO00o() {
            return new C6394iiIlI(this);
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            this.OooO0O0 = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public OooO0O0 OooO0OO(byte[] bArr) {
            this.f18202OooO00o = C5532IiIllL.OooO00o(bArr);
            return this;
        }
    }

    public C6394iiIlI(OooO0O0 oooO0O0) {
        super(false);
        C9341I1iilI1 r1 = oooO0O0.OooO00o;
        this.OooO00o = r1;
        if (r1 != null) {
            int OooO00o2 = r1.OooO00o();
            byte[] bArr = oooO0O0.OooO0OO;
            if (bArr != null) {
                if (bArr.length == OooO00o2 + OooO00o2) {
                    this.f18201OooO00o = C5532IiIllL.m15807OooO00o(bArr, 0, OooO00o2);
                    this.OooO0O0 = C5532IiIllL.m15807OooO00o(bArr, OooO00o2 + 0, OooO00o2);
                    return;
                }
                throw new IllegalArgumentException("public key has wrong size");
            }
            byte[] bArr2 = oooO0O0.f18202OooO00o;
            if (bArr2 == null) {
                this.f18201OooO00o = new byte[OooO00o2];
            } else if (bArr2.length == OooO00o2) {
                this.f18201OooO00o = bArr2;
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
    public C9341I1iilI1 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17515OooO00o() {
        int OooO00o2 = this.OooO00o.OooO00o();
        byte[] bArr = new byte[(OooO00o2 + OooO00o2)];
        C5532IiIllL.OooO00o(bArr, this.f18201OooO00o, 0);
        C5532IiIllL.OooO00o(bArr, this.OooO0O0, OooO00o2 + 0);
        return bArr;
    }

    public byte[] OooO0O0() {
        return C5532IiIllL.OooO00o(this.OooO0O0);
    }

    public byte[] OooO0OO() {
        return C5532IiIllL.OooO00o(this.f18201OooO00o);
    }
}
