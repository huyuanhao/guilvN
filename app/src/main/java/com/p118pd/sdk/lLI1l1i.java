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

/* renamed from: com.pd.sdk.lLI1l1i丨  reason: invalid class name */
public class lLI1l1i extends AbstractC5875LiL implements AbstractC5711LiLli, AbstractC5855LLl {
    public LiIIL1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18472OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteArrayOutputStream f18473OooO00o = new ByteArrayOutputStream();

    /* renamed from: com.pd.sdk.lLI1l1i丨$OooO00o */
    public static class OooO00o extends lLI1l1i {
        public OooO00o() {
            super(C5427IlI1.OooO0OO(), new LiIIL1L());
        }
    }

    /* renamed from: com.pd.sdk.lLI1l1i丨$OooO0O0 */
    public static class OooO0O0 extends lLI1l1i {
        public OooO0O0() {
            super(C5427IlI1.OooO0Oo(), new LiIIL1L());
        }
    }

    /* renamed from: com.pd.sdk.lLI1l1i丨$OooO0OO */
    public static class OooO0OO extends lLI1l1i {
        public OooO0OO() {
            super(C5427IlI1.OooO0o0(), new LiIIL1L());
        }
    }

    /* renamed from: com.pd.sdk.lLI1l1i丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C6571OooO0Oo extends lLI1l1i {
        public C6571OooO0Oo() {
            super(C5427IlI1.OooOO0(), new LiIIL1L());
        }
    }

    /* renamed from: com.pd.sdk.lLI1l1i丨$OooO0o0  reason: case insensitive filesystem */
    public static class C6572OooO0o0 extends lLI1l1i {
        public C6572OooO0o0() {
            super(C5427IlI1.OooO0O0(), new LiIIL1L());
        }
    }

    public lLI1l1i(AbstractC6436l11LI r2, LiIIL1L r3) {
        this.f18472OooO00o = r2;
        this.OooO00o = r3;
        this.f18473OooO00o = new ByteArrayOutputStream();
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public int OooO00o(Key key) throws InvalidKeyException {
        return this.OooO00o.OooO00o((C5768Ll1L) (key instanceof PublicKey ? C6266iiilIIl.OooO00o((PublicKey) key) : C6266iiilIIl.OooO00o((PrivateKey) key)));
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII
    public String OooO00o() {
        return "McEliecePointchevalCipher";
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public byte[] OooO00o(byte[] bArr, int i, int i2) throws BadPaddingException {
        OooO0O0(bArr, i, i2);
        byte[] byteArray = this.f18473OooO00o.toByteArray();
        this.f18473OooO00o.reset();
        int i3 = this.o00oO0O;
        if (i3 == 1) {
            return this.OooO00o.OooO00o(byteArray);
        }
        if (i3 != 2) {
            return null;
        }
        try {
            return this.OooO00o.OooO0O0(byteArray);
        } catch (InvalidCipherTextException e) {
            throw new BadPaddingException(e.getMessage());
        }
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public int OooO0O0(int i) {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C6213iL11I OooO00o2 = C6266iiilIIl.OooO00o((PrivateKey) key);
        this.f18472OooO00o.reset();
        this.OooO00o.OooO00o(false, OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        liLL1l r2 = new liLL1l(C6266iiilIIl.OooO00o((PublicKey) key), secureRandom);
        this.f18472OooO00o.reset();
        this.OooO00o.OooO00o(true, r2);
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL, com.p118pd.sdk.AbstractC5654LLII
    public byte[] OooO0O0(byte[] bArr, int i, int i2) {
        this.f18473OooO00o.write(bArr, i, i2);
        return new byte[0];
    }

    @Override // com.p118pd.sdk.AbstractC5875LiL
    public int OooO0OO(int i) {
        return 0;
    }
}
