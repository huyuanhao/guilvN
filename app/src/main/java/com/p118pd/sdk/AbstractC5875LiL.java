package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.ShortBufferException;

/* renamed from: com.pd.sdk.L丨i丨L  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5875LiL extends AbstractC5654LLII {
    public AlgorithmParameterSpec OooO00o;

    @Override // com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII
    public final int OooO00o() {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final int OooO00o(int i) {
        return this.o00oO0O == 1 ? OooO0OO(i) : OooO0O0(i);
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, BadPaddingException {
        if (bArr2.length >= OooO00o(i2)) {
            byte[] OooO00o2 = OooO00o(bArr, i, i2);
            System.arraycopy(OooO00o2, 0, bArr2, i3, OooO00o2.length);
            return OooO00o2.length;
        }
        throw new ShortBufferException("Output buffer too short.");
    }

    @Override // com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII, com.p118pd.sdk.AbstractC5654LLII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AlgorithmParameterSpec m16469OooO00o() {
        return this.OooO00o;
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
    public abstract byte[] OooO00o(byte[] bArr, int i, int i2) throws BadPaddingException;

    public abstract int OooO0O0(int i);

    @Override // com.p118pd.sdk.AbstractC5654LLII
    public final int OooO0O0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (bArr2.length >= OooO00o(i2)) {
            byte[] OooO0O0 = OooO0O0(bArr, i, i2);
            System.arraycopy(OooO0O0, 0, bArr2, i3, OooO0O0.length);
            return OooO0O0.length;
        }
        throw new ShortBufferException("output");
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
    public abstract byte[] OooO0O0(byte[] bArr, int i, int i2);

    public abstract int OooO0OO(int i);

    public final void OooO0OO(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        OooO00o(key, algorithmParameterSpec, IIllii.OooO00o());
    }
}
