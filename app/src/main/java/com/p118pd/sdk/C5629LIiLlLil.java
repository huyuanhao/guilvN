package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.LIiLlLil  reason: case insensitive filesystem */
public class C5629LIiLlLil implements AbstractC5649LIlI {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6017i1Il f16319OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6389ii f16320OooO00o;

    @Override // com.p118pd.sdk.AbstractC5649LIlI
    public int OooO00o() {
        return (this.f16320OooO00o.OooO00o().OooO0OO().bitLength() + 7) / 8;
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    public BigInteger OooO00o(AbstractC6370iIIIl r3) {
        LiIiLii liIiLii = (LiIiLii) r3;
        if (liIiLii.OooO00o().equals(this.f16319OooO00o)) {
            BigInteger OooO0OO = this.f16319OooO00o.OooO0OO();
            BigInteger OooO00o2 = liIiLii.OooO00o();
            if (OooO00o2 == null || OooO00o2.compareTo(OooO00o) <= 0 || OooO00o2.compareTo(OooO0OO.subtract(OooO00o)) >= 0) {
                throw new IllegalArgumentException("Diffie-Hellman public key is weak");
            }
            BigInteger modPow = OooO00o2.modPow(this.f16320OooO00o.OooO00o(), OooO0OO);
            if (!modPow.equals(OooO00o)) {
                return modPow;
            }
            throw new IllegalStateException("Shared key can't be 1");
        }
        throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16087OooO00o(AbstractC6370iIIIl r2) {
        if (r2 instanceof liLL1l) {
            r2 = ((liLL1l) r2).OooO00o();
        }
        C6213iL11I r22 = (C6213iL11I) r2;
        if (r22 instanceof C6389ii) {
            C6389ii r23 = (C6389ii) r22;
            this.f16320OooO00o = r23;
            this.f16319OooO00o = r23.OooO00o();
            return;
        }
        throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
    }
}
