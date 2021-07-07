package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IL1ll丨1丨  reason: invalid class name */
public class IL1ll1 implements AbstractC6830lILl1 {
    public C5495I1I1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15561OooO00o;

    public IL1ll1(byte[] bArr, C5495I1I1 r4) {
        if (bArr == null) {
            throw new IllegalArgumentException("'sessionID' cannot be null");
        } else if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException("'sessionID' must have length between 1 and 32 bytes, inclusive");
        } else {
            this.f15561OooO00o = C9586iIILl.m21630OooO00o(bArr);
            this.OooO00o = r4;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6830lILl1, com.p118pd.sdk.AbstractC6830lILl1, com.p118pd.sdk.AbstractC6830lILl1
    public synchronized C5495I1I1 OooO00o() {
        return this.OooO00o == null ? null : this.OooO00o.m15726OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6830lILl1, com.p118pd.sdk.AbstractC6830lILl1, com.p118pd.sdk.AbstractC6830lILl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized boolean m15480OooO00o() {
        return this.OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC6830lILl1, com.p118pd.sdk.AbstractC6830lILl1, com.p118pd.sdk.AbstractC6830lILl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized byte[] m15481OooO00o() {
        return this.f15561OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6830lILl1
    public synchronized void invalidate() {
        if (this.OooO00o != null) {
            this.OooO00o.m15730OooO00o();
            this.OooO00o = null;
        }
    }
}
