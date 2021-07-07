package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* renamed from: com.pd.sdk.丨丨LLi11I  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9816LLi11I extends AbstractC5654LLII {
    public ByteArrayOutputStream OooO00o = new ByteArrayOutputStream();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameterSpec f23414OooO00o;
    public int o0OOO0o;
    public int o0ooOoO;

    @Override // com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII
    public final int OooO00o() {
        return this.o00oO0O == 1 ? this.o0ooOoO : this.o0OOO0o;
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final int OooO00o(int i) {
        int size = i + this.OooO00o.size();
        int OooO00o2 = OooO00o();
        if (size > OooO00o2) {
            return 0;
        }
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        if (bArr2.length >= OooO00o(i2)) {
            byte[] OooO00o2 = OooO00o(bArr, i, i2);
            System.arraycopy(OooO00o2, 0, bArr2, i3, OooO00o2.length);
            return OooO00o2.length;
        }
        throw new ShortBufferException("Output buffer too short.");
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AlgorithmParameterSpec m21905OooO00o() {
        return this.f23414OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21906OooO00o(int i) throws IllegalBlockSizeException {
        int size = i + this.OooO00o.size();
        int i2 = this.o00oO0O;
        if (i2 == 1) {
            if (size > this.o0ooOoO) {
                throw new IllegalBlockSizeException("The length of the plaintext (" + size + " bytes) is not supported by the cipher (max. " + this.o0ooOoO + " bytes).");
            }
        } else if (i2 == 2 && size != this.o0OOO0o) {
            throw new IllegalBlockSizeException("Illegal ciphertext length (expected " + this.o0OOO0o + " bytes, was " + size + " bytes).");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final void OooO00o(String str) {
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final void OooO00o(Key key) throws InvalidKeyException {
        try {
            OooO00o(key, (AlgorithmParameterSpec) null);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void OooO00o(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            OooO00o(key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final void OooO00o(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.o00oO0O = 2;
        OooO0O0(key, algorithmParameterSpec);
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final void OooO00o(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.o00oO0O = 1;
        OooO0O0(key, algorithmParameterSpec, secureRandom);
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final byte[] OooO00o(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        m21906OooO00o(i2);
        OooO0O0(bArr, i, i2);
        byte[] byteArray = this.OooO00o.toByteArray();
        this.OooO00o.reset();
        int i3 = this.o00oO0O;
        if (i3 == 1) {
            return OooO0Oo(byteArray);
        }
        if (i3 != 2) {
            return null;
        }
        return OooO0OO(byteArray);
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final int OooO0O0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        OooO0O0(bArr, i, i2);
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final void OooO0O0(String str) {
    }

    public final void OooO0O0(Key key) throws InvalidKeyException {
        try {
            OooO00o(key, (AlgorithmParameterSpec) null, IIllii.OooO00o());
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public abstract void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public abstract void OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final byte[] OooO0O0() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final byte[] OooO0O0(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            this.OooO00o.write(bArr, i, i2);
        }
        return new byte[0];
    }

    public final void OooO0OO(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        OooO00o(key, algorithmParameterSpec, IIllii.OooO00o());
    }

    public abstract byte[] OooO0OO(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException;

    public abstract byte[] OooO0Oo(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException;
}
