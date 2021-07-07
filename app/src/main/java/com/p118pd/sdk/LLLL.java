package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.LLLL */
public class LLLL implements AbstractC5649LIlI {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public i11Liiil f16462OooO00o;

    private BigInteger OooO00o(C6017i1Il i1il, C6389ii r6, LiIiLii liIiLii, C6389ii r8, LiIiLii liIiLii2, LiIiLii liIiLii3) {
        BigInteger OooO0Oo = i1il.OooO0Oo();
        BigInteger pow = BigInteger.valueOf(2).pow((OooO0Oo.bitLength() + 1) / 2);
        return liIiLii3.OooO00o().multiply(liIiLii.OooO00o().modPow(liIiLii3.OooO00o().mod(pow).add(pow), i1il.OooO0OO())).modPow(r8.OooO00o().add(liIiLii2.OooO00o().mod(pow).add(pow).multiply(r6.OooO00o())).mod(OooO0Oo), i1il.OooO0OO());
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI
    public int OooO00o() {
        return (this.f16462OooO00o.OooO0O0().OooO00o().OooO0OO().bitLength() + 7) / 8;
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    public BigInteger OooO00o(AbstractC6370iIIIl r9) {
        C6110iIiLii r92 = (C6110iIiLii) r9;
        C6389ii OooO0O0 = this.f16462OooO00o.OooO0O0();
        if (!this.f16462OooO00o.OooO0O0().OooO00o().equals(r92.OooO0O0().OooO00o())) {
            throw new IllegalStateException("MQV public key components have wrong domain parameters");
        } else if (this.f16462OooO00o.OooO0O0().OooO00o().OooO0Oo() != null) {
            BigInteger OooO00o2 = OooO00o(OooO0O0.OooO00o(), OooO0O0, r92.OooO0O0(), this.f16462OooO00o.m16848OooO00o(), this.f16462OooO00o.OooO00o(), r92.OooO00o());
            if (!OooO00o2.equals(OooO00o)) {
                return OooO00o2;
            }
            throw new IllegalStateException("1 is not a valid agreement value for MQV");
        } else {
            throw new IllegalStateException("MQV key domain parameters do not have Q set");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16221OooO00o(AbstractC6370iIIIl r1) {
        this.f16462OooO00o = (i11Liiil) r1;
    }
}
