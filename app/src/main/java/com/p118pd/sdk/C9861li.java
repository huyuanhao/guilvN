package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.丨丨li丨  reason: invalid class name and case insensitive filesystem */
public class C9861li implements AbstractC6769llL1L {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final L1ILII f23478OooO00o;

    public C9861li(L1ILII r1) {
        this.f23478OooO00o = r1;
        this.OooO00o = r1.OooO00o().OooO00o() * 8;
    }

    public C9861li(L1ILII r1, int i) {
        this.f23478OooO00o = r1;
        this.OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.OooO00o / 8;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        try {
            return this.f23478OooO00o.OooO00o(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21948OooO00o() {
        return this.f23478OooO00o.OooO00o().m17732OooO00o() + "-KGMAC";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r6) throws IllegalArgumentException {
        if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r62 = (C6274iilL1L) r6;
            this.f23478OooO00o.OooO00o(true, (AbstractC6370iIIIl) new C5553Iili((C6642li1LI) r62.OooO00o(), this.OooO00o, r62.m17301OooO00o()));
            return;
        }
        throw new IllegalArgumentException("KGMAC requires ParametersWithIV");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        this.f23478OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) throws IllegalStateException {
        this.f23478OooO00o.OooO00o(b);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        this.f23478OooO00o.OooO00o(bArr, i, i2);
    }
}
