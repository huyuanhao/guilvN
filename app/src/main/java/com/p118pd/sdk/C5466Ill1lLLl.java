package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.Ill1lLLl  reason: case insensitive filesystem */
public class C5466Ill1lLLl {
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);
    public C6017i1Il OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6389ii f15889OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f15890OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15891OooO00o;

    public BigInteger OooO00o() {
        LILI1II lili1ii = new LILI1II();
        lili1ii.OooO00o(new C6528lI1IL(this.f15891OooO00o, this.OooO00o));
        i1LLl1L OooO00o2 = lili1ii.OooO00o();
        this.f15890OooO00o = ((C6389ii) OooO00o2.OooO00o()).OooO00o();
        return ((LiIiLii) OooO00o2.OooO0O0()).OooO00o();
    }

    public BigInteger OooO00o(LiIiLii liIiLii, BigInteger bigInteger) {
        if (liIiLii.OooO00o().equals(this.OooO00o)) {
            BigInteger OooO0OO = this.OooO00o.OooO0OO();
            BigInteger OooO00o2 = liIiLii.OooO00o();
            if (OooO00o2 == null || OooO00o2.compareTo(OooO0O0) <= 0 || OooO00o2.compareTo(OooO0OO.subtract(OooO0O0)) >= 0) {
                throw new IllegalArgumentException("Diffie-Hellman public key is weak");
            }
            BigInteger modPow = OooO00o2.modPow(this.f15890OooO00o, OooO0OO);
            if (!modPow.equals(OooO0O0)) {
                return bigInteger.modPow(this.f15889OooO00o.OooO00o(), OooO0OO).multiply(modPow).mod(OooO0OO);
            }
            throw new IllegalStateException("Shared key can't be 1");
        }
        throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
    }

    public void OooO00o(AbstractC6370iIIIl r2) {
        if (r2 instanceof liLL1l) {
            liLL1l r22 = (liLL1l) r2;
            this.f15891OooO00o = r22.m17752OooO00o();
            r2 = r22.OooO00o();
        } else {
            this.f15891OooO00o = IIllii.OooO00o();
        }
        C6213iL11I r23 = (C6213iL11I) r2;
        if (r23 instanceof C6389ii) {
            C6389ii r24 = (C6389ii) r23;
            this.f15889OooO00o = r24;
            this.OooO00o = r24.OooO00o();
            return;
        }
        throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
    }
}
