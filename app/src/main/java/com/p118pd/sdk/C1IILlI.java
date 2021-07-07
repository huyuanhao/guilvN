package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.丨1IIL丨lI  reason: invalid class name */
public class C1IILlI implements AbstractC6769llL1L {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final iLIli1 f22753OooO00o;

    public C1IILlI(iLIli1 r1) {
        this.f22753OooO00o = r1;
        this.OooO00o = 128;
    }

    public C1IILlI(iLIli1 r1, int i) {
        this.f22753OooO00o = r1;
        this.OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.OooO00o / 8;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        try {
            return this.f22753OooO00o.OooO00o(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21266OooO00o() {
        return this.f22753OooO00o.m17104OooO00o().m17732OooO00o() + "-GMAC";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r6) throws IllegalArgumentException {
        if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r62 = (C6274iilL1L) r6;
            this.f22753OooO00o.OooO00o(true, (AbstractC6370iIIIl) new C5553Iili((C6642li1LI) r62.OooO00o(), this.OooO00o, r62.m17301OooO00o()));
            return;
        }
        throw new IllegalArgumentException("GMAC requires ParametersWithIV");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        this.f22753OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) throws IllegalStateException {
        this.f22753OooO00o.OooO00o(b);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        this.f22753OooO00o.OooO00o(bArr, i, i2);
    }
}
