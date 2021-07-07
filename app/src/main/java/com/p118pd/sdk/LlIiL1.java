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

/* renamed from: com.pd.sdk.LlI丨iL1  reason: invalid class name */
public class LlIiL1 extends AbstractC5875LiL implements AbstractC5711LiLli, AbstractC5855LLl {
    public LLLI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f16713OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteArrayOutputStream f16714OooO00o;

    /* renamed from: com.pd.sdk.LlI丨iL1$OooO00o */
    public static class OooO00o extends LlIiL1 {
        public OooO00o() {
            super(C5427IlI1.OooO0OO(), new LLLI());
        }
    }

    /* renamed from: com.pd.sdk.LlI丨iL1$OooO0O0 */
    public static class OooO0O0 extends LlIiL1 {
        public OooO0O0() {
            super(C5427IlI1.OooO0Oo(), new LLLI());
        }
    }

    /* renamed from: com.pd.sdk.LlI丨iL1$OooO0OO */
    public static class OooO0OO extends LlIiL1 {
        public OooO0OO() {
            super(C5427IlI1.OooO0o0(), new LLLI());
        }
    }

    /* renamed from: com.pd.sdk.LlI丨iL1$OooO0Oo  reason: case insensitive filesystem */
    public static class C5783OooO0Oo extends LlIiL1 {
        public C5783OooO0Oo() {
            super(C5427IlI1.OooOO0(), new LLLI());
        }
    }

    /* renamed from: com.pd.sdk.LlI丨iL1$OooO0o0  reason: case insensitive filesystem */
    public static class C5784OooO0o0 extends LlIiL1 {
        public C5784OooO0o0() {
            super(C5427IlI1.OooO0O0(), new LLLI());
        }
    }

    public LlIiL1() {
        this.f16714OooO00o = new ByteArrayOutputStream();
        this.f16714OooO00o = new ByteArrayOutputStream();
    }

    public LlIiL1(AbstractC6436l11LI r2, LLLI llli) {
        this.f16714OooO00o = new ByteArrayOutputStream();
        this.f16713OooO00o = r2;
        this.OooO00o = llli;
        this.f16714OooO00o = new ByteArrayOutputStream();
    }

    private byte[] OooO0OO() {
        this.f16714OooO00o.write(1);
        byte[] byteArray = this.f16714OooO00o.toByteArray();
        this.f16714OooO00o.reset();
        return byteArray;
    }

    private byte[] OooO0OO(byte[] bArr) throws BadPaddingException {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == 1) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        throw new BadPaddingException("invalid ciphertext");
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public int OooO00o(Key key) throws InvalidKeyException {
        C6213iL11I OooO00o2;
        if (key instanceof PublicKey) {
            OooO00o2 = C6266iiilIIl.OooO00o((PublicKey) key);
        } else if (key instanceof PrivateKey) {
            OooO00o2 = C6266iiilIIl.OooO00o((PrivateKey) key);
        } else {
            throw new InvalidKeyException();
        }
        return this.OooO00o.OooO00o((C5768Ll1L) OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII
    public String OooO00o() {
        return "McElieceKobaraImaiCipher";
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public byte[] OooO00o(byte[] bArr, int i, int i2) throws BadPaddingException {
        OooO0O0(bArr, i, i2);
        int i3 = this.o00oO0O;
        if (i3 == 1) {
            return this.OooO00o.OooO00o(OooO0OO());
        }
        if (i3 == 2) {
            try {
                byte[] byteArray = this.f16714OooO00o.toByteArray();
                this.f16714OooO00o.reset();
                return OooO0OO(this.OooO00o.OooO0O0(byteArray));
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
        this.f16714OooO00o.reset();
        C6213iL11I OooO00o2 = C6266iiilIIl.OooO00o((PrivateKey) key);
        this.f16713OooO00o.reset();
        this.OooO00o.OooO00o(false, OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.f16714OooO00o.reset();
        liLL1l r2 = new liLL1l(C6266iiilIIl.OooO00o((PublicKey) key), secureRandom);
        this.f16713OooO00o.reset();
        this.OooO00o.OooO00o(true, r2);
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public byte[] OooO0O0(byte[] bArr, int i, int i2) {
        this.f16714OooO00o.write(bArr, i, i2);
        return new byte[0];
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public int OooO0OO(int i) {
        return 0;
    }
}
