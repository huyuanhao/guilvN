package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.丨IillIi  reason: invalid class name and case insensitive filesystem */
public class C9386IillIi extends IL1Iii {
    public C9386IillIi(byte b, int i) {
        this(OooO00o(b), i);
    }

    public C9386IillIi(int i) {
        super(IL1Iii.m15473OooO00o(i), IL1Iii.OooO00o(i));
    }

    public C9386IillIi(AbstractC6854lLi1LL r2) throws IOException {
        super(r2.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o), 0);
    }

    public C9386IillIi(byte[] bArr) {
        this(bArr, 0);
    }

    public C9386IillIi(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static IL1Iii OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof C9386IillIi)) ? OooO00o((Object) OooO0o) : OooO00o(((AbstractC6804llL1ii) OooO0o).m17938OooO00o());
    }

    public static IL1Iii OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9386IillIi)) {
            return (C9386IillIi) obj;
        }
        if (obj instanceof iIilII1) {
            return (iIilII1) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (IL1Iii) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static C9386IillIi OooO00o(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new C9386IillIi(bArr2, b);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static byte[] OooO00o(byte b) {
        return new byte[]{b};
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.IL1Iii
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        byte[] bArr = this.f15549OooO00o;
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) OooO0OO();
        System.arraycopy(bArr, 0, bArr2, 1, length - 1);
        iii1.OooO00o(3, bArr2);
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.IL1Iii, com.p118pd.sdk.IL1Iii, com.p118pd.sdk.IL1Iii
    public boolean OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL, com.p118pd.sdk.IL1Iii
    public int OooO0O0() {
        return L1li1.OooO00o(this.f15549OooO00o.length + 1) + 1 + this.f15549OooO00o.length + 1;
    }
}
