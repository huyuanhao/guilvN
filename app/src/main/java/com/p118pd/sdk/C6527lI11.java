package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.lI丨11  reason: invalid class name and case insensitive filesystem */
public class C6527lI11 extends SignatureSpi implements AbstractC5711LiLli, AbstractC5855LLl {
    public IililIi OooO00o = new C6836lIiLLi();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18410OooO00o = new C6846lLIlii();

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECGOST3410PublicKey ? ((BCECGOST3410PublicKey) publicKey).engineGetKeyParameters() : IlllII1.OooO00o(publicKey);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        C6213iL11I OooO00o2 = privateKey instanceof AbstractC6484lII ? IlllII1.OooO00o(privateKey) : C6886llll.OooO00o(privateKey);
        this.f18410OooO00o.reset();
        SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            this.OooO00o.OooO00o(true, new liLL1l(OooO00o2, secureRandom));
        } else {
            this.OooO00o.OooO00o(true, OooO00o2);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        C6213iL11I r3;
        if (publicKey instanceof ECPublicKey) {
            r3 = OooO00o(publicKey);
        } else if (publicKey instanceof AbstractC5419Il1i) {
            r3 = C6886llll.OooO00o(publicKey);
        } else {
            try {
                r3 = IlllII1.OooO00o(BouncyCastleProvider.getPublicKey(C6888ll.OooO00o(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException("can't recognise key type in DSA based signer");
            }
        }
        this.f18410OooO00o.reset();
        this.OooO00o.OooO00o(false, r3);
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
        byte[] bArr = new byte[this.f18410OooO00o.OooO0O0()];
        this.f18410OooO00o.OooO00o(bArr, 0);
        try {
            byte[] bArr2 = new byte[64];
            BigInteger[] OooO00o2 = this.OooO00o.OooO00o(bArr);
            byte[] byteArray = OooO00o2[0].toByteArray();
            byte[] byteArray2 = OooO00o2[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, 32 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, 32 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, 64 - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, 64 - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.f18410OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.f18410OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f18410OooO00o.OooO0O0()];
        this.f18410OooO00o.OooO00o(bArr2, 0);
        try {
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 0, bArr4, 0, 32);
            System.arraycopy(bArr, 32, bArr3, 0, 32);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.OooO00o.OooO00o(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
