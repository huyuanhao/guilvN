package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.L丨iI1LL丨  reason: invalid class name */
public class LiI1LL extends AbstractC5875LiL implements AbstractC5711LiLli, AbstractC5855LLl {
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9837iLl f16833OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteArrayOutputStream f16834OooO00o = new ByteArrayOutputStream();

    /* renamed from: com.pd.sdk.L丨iI1LL丨$OooO00o */
    public static class OooO00o extends LiI1LL {
        public OooO00o() {
            super(C5427IlI1.OooO0O0(), new C9837iLl());
        }
    }

    public LiI1LL(AbstractC6436l11LI r1, C9837iLl r2) {
        this.OooO00o = r1;
        this.f16833OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public int OooO00o(Key key) throws InvalidKeyException {
        return this.f16833OooO00o.OooO00o((C5768Ll1L) (key instanceof PublicKey ? C6266iiilIIl.OooO00o((PublicKey) key) : C6266iiilIIl.OooO00o((PrivateKey) key)));
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII
    public String OooO00o() {
        return "McElieceFujisakiCipher";
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public byte[] OooO00o(byte[] bArr, int i, int i2) throws BadPaddingException {
        OooO0O0(bArr, i, i2);
        byte[] byteArray = this.f16834OooO00o.toByteArray();
        this.f16834OooO00o.reset();
        int i3 = this.o00oO0O;
        if (i3 == 1) {
            return this.f16833OooO00o.OooO00o(byteArray);
        }
        if (i3 == 2) {
            try {
                return this.f16833OooO00o.OooO0O0(byteArray);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        } else {
            throw new IllegalStateException("unknown mode in doFinal");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public int OooO0O0(int i) {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C6213iL11I OooO00o2 = C6266iiilIIl.OooO00o((PrivateKey) key);
        this.OooO00o.reset();
        this.f16833OooO00o.OooO00o(false, OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        liLL1l r2 = new liLL1l(C6266iiilIIl.OooO00o((PublicKey) key), secureRandom);
        this.OooO00o.reset();
        this.f16833OooO00o.OooO00o(true, r2);
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public byte[] OooO0O0(byte[] bArr, int i, int i2) {
        this.f16834OooO00o.write(bArr, i, i2);
        return new byte[0];
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public int OooO0OO(int i) {
        return 0;
    }
}
