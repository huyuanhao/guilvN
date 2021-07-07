package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.iIi丨I  reason: invalid class name and case insensitive filesystem */
public class C6114iIiI implements Ii1IliL {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public liLI1l1i f17573OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9828LlI f17574OooO00o = new C9828LlI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17575OooO00o;

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO00o() {
        return this.f17574OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        SecureRandom secureRandom;
        this.f17574OooO00o.OooO00o(z, r3);
        if (r3 instanceof liLL1l) {
            liLL1l r32 = (liLL1l) r3;
            this.f17573OooO00o = (liLI1l1i) r32.OooO00o();
            secureRandom = r32.m17752OooO00o();
        } else {
            this.f17573OooO00o = (liLI1l1i) r3;
            secureRandom = IIllii.OooO00o();
        }
        this.f17575OooO00o = secureRandom;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        BigInteger bigInteger;
        C11lI r5;
        BigInteger OooO0o;
        if (this.f17573OooO00o != null) {
            BigInteger OooO00o2 = this.f17574OooO00o.OooO00o(bArr, i, i2);
            liLI1l1i lili1l1i = this.f17573OooO00o;
            if (!(lili1l1i instanceof C11lI) || (OooO0o = (r5 = (C11lI) lili1l1i).OooO0o()) == null) {
                bigInteger = this.f17574OooO00o.OooO00o(OooO00o2);
            } else {
                BigInteger OooO0O0 = r5.OooO0O0();
                BigInteger bigInteger2 = OooO00o;
                BigInteger OooO00o3 = IIiL.OooO00o(bigInteger2, OooO0O0.subtract(bigInteger2), this.f17575OooO00o);
                bigInteger = this.f17574OooO00o.OooO00o(OooO00o3.modPow(OooO0o, OooO0O0).multiply(OooO00o2).mod(OooO0O0)).multiply(OooO00o3.modInverse(OooO0O0)).mod(OooO0O0);
                if (!OooO00o2.equals(bigInteger.modPow(OooO0o, OooO0O0))) {
                    throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                }
            }
            return this.f17574OooO00o.m21919OooO00o(bigInteger);
        }
        throw new IllegalStateException("RSA engine not initialised");
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO0O0() {
        return this.f17574OooO00o.OooO0O0();
    }
}
