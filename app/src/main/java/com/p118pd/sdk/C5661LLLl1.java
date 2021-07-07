package com.p118pd.sdk;

import com.p118pd.sdk.C6190iLlIl;

/* renamed from: com.pd.sdk.LLLl1  reason: case insensitive filesystem */
public final class C5661LLLl1 extends C6190iLlIl implements AbstractC6433il1 {
    public final byte[] OooO00o;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.LLLl1$OooO0O0 */
    public static class OooO0O0 extends C6190iLlIl.OooO00o {
        public int OooO00o = 0;
        public final C9341I1iilI1 OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public byte[] f16472OooO0O0 = null;

        public OooO0O0(C9341I1iilI1 r2) {
            super(r2);
            this.OooO0O0 = r2;
        }

        public OooO0O0 OooO00o(int i) {
            this.OooO00o = i;
            return this;
        }

        @Override // com.p118pd.sdk.C6190iLlIl.OooO00o
        public OooO0O0 OooO00o(byte[] bArr) {
            this.f16472OooO0O0 = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        @Override // com.p118pd.sdk.C6190iLlIl.OooO00o
        public C5661LLLl1 OooO00o() {
            return new C5661LLLl1(this);
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            if (bArr != null) {
                int OooO00o2 = this.OooO0O0.OooO00o();
                int OooO0O02 = this.OooO0O0.m21385OooO00o().m15837OooO00o().OooO0O0();
                this.OooO00o = AbstractC6464l1l.OooO00o(bArr, 0);
                this.f16472OooO0O0 = C5532IiIllL.m15807OooO00o(bArr, 4, OooO00o2);
                OooO00o(C5532IiIllL.m15807OooO00o(bArr, 4 + OooO00o2, (OooO0O02 * OooO00o2) + (this.OooO0O0.OooO0O0() * OooO00o2)));
                return this;
            }
            throw new NullPointerException("signature == null");
        }
    }

    public C5661LLLl1(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.o00oO0O = oooO0O0.OooO00o;
        int OooO00o2 = m17157OooO00o().OooO00o();
        byte[] bArr = oooO0O0.f16472OooO0O0;
        if (bArr == null) {
            this.OooO00o = new byte[OooO00o2];
        } else if (bArr.length == OooO00o2) {
            this.OooO00o = bArr;
        } else {
            throw new IllegalArgumentException("size of random needs to be equal to size of digest");
        }
    }

    @Override // com.p118pd.sdk.C6190iLlIl, com.p118pd.sdk.C6190iLlIl, com.p118pd.sdk.C6190iLlIl, com.p118pd.sdk.C6190iLlIl, com.p118pd.sdk.AbstractC6433il1
    public int OooO00o() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.C6190iLlIl, com.p118pd.sdk.C6190iLlIl, com.p118pd.sdk.C6190iLlIl, com.p118pd.sdk.C6190iLlIl, com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16229OooO00o() {
        byte[][] OooO00o2;
        int OooO00o3 = m17157OooO00o().OooO00o();
        byte[] bArr = new byte[(OooO00o3 + 4 + (m17157OooO00o().m21385OooO00o().m15837OooO00o().OooO0O0() * OooO00o3) + (m17157OooO00o().OooO0O0() * OooO00o3))];
        AbstractC6464l1l.OooO00o(this.o00oO0O, bArr, 0);
        C5532IiIllL.OooO00o(bArr, this.OooO00o, 4);
        int i = 4 + OooO00o3;
        for (byte[] bArr2 : OooO00o().OooO00o()) {
            C5532IiIllL.OooO00o(bArr, bArr2, i);
            i += OooO00o3;
        }
        for (int i2 = 0; i2 < m17158OooO00o().size(); i2++) {
            C5532IiIllL.OooO00o(bArr, m17158OooO00o().get(i2).getValue(), i);
            i += OooO00o3;
        }
        return bArr;
    }

    public byte[] OooO0O0() {
        return C5532IiIllL.OooO00o(this.OooO00o);
    }
}
