package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* renamed from: com.pd.sdk.L11l */
public class L11l extends AbstractC9816LLi11I implements AbstractC5711LiLli, AbstractC5855LLl {
    public LI1iLI OooO00o;

    /* renamed from: com.pd.sdk.L11l$OooO00o */
    public static class OooO00o extends L11l {
        public OooO00o() {
            super(new LI1iLI());
        }
    }

    public L11l(LI1iLI lI1iLI) {
        this.OooO00o = lI1iLI;
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC9816LLi11I
    public int OooO00o(Key key) throws InvalidKeyException {
        return this.OooO00o.OooO00o((C5240IIiI) (key instanceof PublicKey ? LlILi.OooO00o((PublicKey) key) : LlILi.OooO00o((PrivateKey) key)));
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC9816LLi11I, com.p118pd.sdk.AbstractC9816LLi11I
    public String OooO00o() {
        return "McEliecePKCS";
    }

    @Override // com.p118pd.sdk.AbstractC9816LLi11I
    public void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.OooO00o.OooO00o(false, LlILi.OooO00o((PrivateKey) key));
        LI1iLI lI1iLI = this.OooO00o;
        this.o0ooOoO = lI1iLI.OooO0Oo;
        this.o0OOO0o = lI1iLI.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC9816LLi11I
    public void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.OooO00o.OooO00o(true, new liLL1l(LlILi.OooO00o((PublicKey) key), secureRandom));
        LI1iLI lI1iLI = this.OooO00o;
        this.o0ooOoO = lI1iLI.OooO0Oo;
        this.o0OOO0o = lI1iLI.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC9816LLi11I
    public byte[] OooO0OO(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        try {
            return this.OooO00o.OooO0O0(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC9816LLi11I
    public byte[] OooO0Oo(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        try {
            return this.OooO00o.m16015OooO00o(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
