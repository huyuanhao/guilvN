package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.丨i1lIi  reason: invalid class name and case insensitive filesystem */
public class C9576i1lIi implements lIL1i11 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lIL1i11 f23152OooO00o;

    public C9576i1lIi(lIL1i11 r2, int i) {
        if (r2 == null) {
            throw new IllegalArgumentException("baseDigest must not be null");
        } else if (i <= r2.OooO0O0()) {
            this.f23152OooO00o = r2;
            this.OooO00o = i;
        } else {
            throw new IllegalArgumentException("baseDigest output not large enough to support length");
        }
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o() {
        return this.f23152OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.f23152OooO00o.OooO0O0()];
        this.f23152OooO00o.OooO00o(bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, i, this.OooO00o);
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21617OooO00o() {
        return this.f23152OooO00o.OooO00o() + C3848l.f10401s + (this.OooO00o * 8) + C3848l.f10402t;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f23152OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        this.f23152OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        this.f23152OooO00o.update(bArr, i, i2);
    }
}
