package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

/* renamed from: com.pd.sdk.LLII丨丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5654LLII extends CipherSpi {
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public int o00oO0O;

    public abstract int OooO00o();

    public abstract int OooO00o(int i);

    public abstract int OooO00o(Key key) throws InvalidKeyException;

    public abstract int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract String m16192OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AlgorithmParameterSpec m16193OooO00o();

    public abstract void OooO00o(String str) throws NoSuchAlgorithmException;

    public abstract void OooO00o(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public abstract void OooO00o(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final byte[] m16194OooO00o() throws IllegalBlockSizeException, BadPaddingException {
        return OooO00o((byte[]) null, 0, 0);
    }

    public final byte[] OooO00o(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        return OooO00o(bArr, 0, bArr.length);
    }

    public abstract byte[] OooO00o(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException;

    public abstract int OooO0O0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException;

    public abstract void OooO0O0(String str) throws NoSuchPaddingException;

    public abstract byte[] OooO0O0();

    public final byte[] OooO0O0(byte[] bArr) {
        return OooO0O0(bArr, 0, bArr.length);
    }

    public abstract byte[] OooO0O0(byte[] bArr, int i, int i2);

    @Override // javax.crypto.CipherSpi
    public final int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        return OooO00o(bArr, i, i2, bArr2, i3);
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        return OooO00o(bArr, i, i2);
    }

    public final int engineGetBlockSize() {
        return OooO00o();
    }

    public final byte[] engineGetIV() {
        return OooO0O0();
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetKeySize(Key key) throws InvalidKeyException {
        if (key instanceof Key) {
            return OooO00o(key);
        }
        throw new InvalidKeyException("Unsupported key.");
    }

    public final int engineGetOutputSize(int i) {
        return OooO00o(i);
    }

    public final AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            engineInit(i, key, secureRandom);
        } else {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidParameterException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof AlgorithmParameterSpec)) {
            throw new InvalidAlgorithmParameterException();
        } else if (key == null || !(key instanceof Key)) {
            throw new InvalidKeyException();
        } else {
            this.o00oO0O = i;
            if (i == 1) {
                OooO00o(key, algorithmParameterSpec, secureRandom);
            } else if (i == 2) {
                OooO00o(key, algorithmParameterSpec);
            }
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetMode(String str) throws NoSuchAlgorithmException {
        OooO00o(str);
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetPadding(String str) throws NoSuchPaddingException {
        OooO0O0(str);
    }

    @Override // javax.crypto.CipherSpi
    public final int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        return OooO0O0(bArr, i, i2, bArr2, i3);
    }

    public final byte[] engineUpdate(byte[] bArr, int i, int i2) {
        return OooO0O0(bArr, i, i2);
    }
}
