package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.LILl1I */
public class LILl1I extends SignatureSpi implements AbstractC5711LiLli, AbstractC5855LLl {
    public IililIi OooO00o = new I1llLIL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f16305OooO00o = new C6760llIiL();
    public int o00oO0O = 64;
    public int o0ooOO0 = (64 / 2);

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : IlllII1.OooO00o(publicKey);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof AbstractC6484lII) {
            C5611LI1 r5 = (C5611LI1) IlllII1.OooO00o(privateKey);
            if (r5.OooO00o().OooO0OO().bitLength() <= 256) {
                this.f16305OooO00o.reset();
                SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
                if (secureRandom != null) {
                    this.OooO00o.OooO00o(true, new liLL1l(r5, secureRandom));
                } else {
                    this.OooO00o.OooO00o(true, r5);
                }
            } else {
                throw new InvalidKeyException("key out of range for ECGOST-2012-256");
            }
        } else {
            throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        C5611LI1 r3;
        if (publicKey instanceof ECPublicKey) {
            r3 = (C5611LI1) OooO00o(publicKey);
        } else {
            try {
                r3 = (C5611LI1) IlllII1.OooO00o(BouncyCastleProvider.getPublicKey(C6888ll.OooO00o(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
            }
        }
        if (r3.OooO00o().OooO0OO().bitLength() <= 256) {
            this.f16305OooO00o.reset();
            this.OooO00o.OooO00o(false, r3);
            return;
        }
        throw new InvalidKeyException("key out of range for ECGOST-2012-256");
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
        byte[] bArr = new byte[this.f16305OooO00o.OooO0O0()];
        this.f16305OooO00o.OooO00o(bArr, 0);
        try {
            byte[] bArr2 = new byte[this.o00oO0O];
            BigInteger[] OooO00o2 = this.OooO00o.OooO00o(bArr);
            byte[] byteArray = OooO00o2[0].toByteArray();
            byte[] byteArray2 = OooO00o2[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, this.o0ooOO0 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, this.o0ooOO0 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, this.o00oO0O - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, this.o00oO0O - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.f16305OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.f16305OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f16305OooO00o.OooO0O0()];
        this.f16305OooO00o.OooO00o(bArr2, 0);
        try {
            byte[] bArr3 = new byte[this.o0ooOO0];
            byte[] bArr4 = new byte[this.o0ooOO0];
            System.arraycopy(bArr, 0, bArr4, 0, this.o0ooOO0);
            System.arraycopy(bArr, this.o0ooOO0, bArr3, 0, this.o0ooOO0);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.OooO00o.OooO00o(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
