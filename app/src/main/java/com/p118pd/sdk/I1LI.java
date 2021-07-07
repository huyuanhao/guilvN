package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.I1L丨I丨  reason: invalid class name */
public class I1LI extends SignatureSpi {
    public final LilIlILL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f15352OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6904li f15353OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f15354OooO00o;

    /* renamed from: com.pd.sdk.I1L丨I丨$OooO00o */
    public static class OooO00o extends I1LI {
        public OooO00o() {
            super(new LilIlILL());
        }
    }

    public I1LI(LilIlILL lilIlILL) {
        this.OooO00o = lilIlILL;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.f15354OooO00o == null && this.f15353OooO00o != null) {
            try {
                AlgorithmParameters OooO00o2 = this.f15352OooO00o.m17217OooO00o("PSS");
                this.f15354OooO00o = OooO00o2;
                OooO00o2.init(this.f15353OooO00o);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f15354OooO00o;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        AbstractC6370iIIIl OooO00o2 = IlllII1.OooO00o(privateKey);
        SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            OooO00o2 = new liLL1l(OooO00o2, secureRandom);
        }
        C6904li r0 = this.f15353OooO00o;
        if (r0 != null) {
            this.OooO00o.OooO00o(true, (AbstractC6370iIIIl) new LIIl1(OooO00o2, r0.OooO00o()));
        } else {
            this.OooO00o.OooO00o(true, OooO00o2);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AbstractC6370iIIIl OooO00o2 = ILIIIlI.OooO00o(publicKey);
        C6904li r0 = this.f15353OooO00o;
        if (r0 != null) {
            OooO00o2 = new LIIl1(OooO00o2, r0.OooO00o());
        }
        this.OooO00o.OooO00o(false, OooO00o2);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof C6904li) {
            this.f15353OooO00o = (C6904li) algorithmParameterSpec;
            return;
        }
        throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.OooO00o.OooO0O0();
        } catch (CryptoException e) {
            throw new SignatureException("unable to create signature: " + e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.OooO00o.m16327OooO00o(bArr);
    }
}
