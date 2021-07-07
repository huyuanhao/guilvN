package com.p118pd.sdk;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.i1i1lli */
public class i1i1lli implements AbstractC93171I1 {
    public final AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Ii1IliL f17393OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17394OooO00o;

    public i1i1lli(Ii1IliL r1, AbstractC6436l11LI r2) {
        this.f17393OooO00o = r1;
        this.OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        this.f17394OooO00o = z;
        C6213iL11I r0 = r4 instanceof liLL1l ? (C6213iL11I) ((liLL1l) r4).OooO00o() : (C6213iL11I) r4;
        if (z && !r0.OooO00o()) {
            throw new IllegalArgumentException("signing requires private key");
        } else if (z || !r0.OooO00o()) {
            reset();
            this.f17393OooO00o.OooO00o(z, r4);
        } else {
            throw new IllegalArgumentException("verification requires public key");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public boolean OooO00o(byte[] bArr) {
        if (!this.f17394OooO00o) {
            int OooO0O0 = this.OooO00o.OooO0O0();
            byte[] bArr2 = new byte[OooO0O0];
            this.OooO00o.OooO00o(bArr2, 0);
            try {
                byte[] OooO00o2 = this.f17393OooO00o.OooO00o(bArr, 0, bArr.length);
                if (OooO00o2.length < OooO0O0) {
                    byte[] bArr3 = new byte[OooO0O0];
                    System.arraycopy(OooO00o2, 0, bArr3, OooO0O0 - OooO00o2.length, OooO00o2.length);
                    OooO00o2 = bArr3;
                }
                return C9586iIILl.OooO0O0(OooO00o2, bArr2);
            } catch (Exception unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("GenericSigner not initialised for verification");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() throws CryptoException, DataLengthException {
        if (this.f17394OooO00o) {
            int OooO0O0 = this.OooO00o.OooO0O0();
            byte[] bArr = new byte[OooO0O0];
            this.OooO00o.OooO00o(bArr, 0);
            return this.f17393OooO00o.OooO00o(bArr, 0, OooO0O0);
        }
        throw new IllegalStateException("GenericSigner not initialised for signature generation.");
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        this.OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        this.OooO00o.update(bArr, i, i2);
    }
}
