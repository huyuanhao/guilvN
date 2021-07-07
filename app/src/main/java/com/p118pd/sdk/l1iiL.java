package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.l1ii丨L丨  reason: invalid class name */
public abstract class l1iiL extends SignatureSpi implements AbstractC5711LiLli, AbstractC5855LLl {
    public IililIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18296OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9514Lill f18297OooO00o;

    public l1iiL(AbstractC6436l11LI r1, IililIi iililIi, AbstractC9514Lill r3) {
        this.f18296OooO00o = r1;
        this.OooO00o = iililIi;
        this.f18297OooO00o = r3;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.f18296OooO00o.OooO0O0()];
        this.f18296OooO00o.OooO00o(bArr, 0);
        try {
            BigInteger[] OooO00o2 = this.OooO00o.OooO00o(bArr);
            return this.f18297OooO00o.OooO00o(OooO00o2[0], OooO00o2[1]);
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.f18296OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.f18296OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f18296OooO00o.OooO0O0()];
        this.f18296OooO00o.OooO00o(bArr2, 0);
        try {
            BigInteger[] OooO00o2 = this.f18297OooO00o.OooO00o(bArr);
            return this.OooO00o.OooO00o(bArr2, OooO00o2[0], OooO00o2[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
