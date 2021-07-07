package org.bouncycastle.crypto.prng;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

public class FixedSecureRandom extends SecureRandom {
    public byte[] _data;
    public int _index;
    public int _intPad;

    public FixedSecureRandom(boolean z, byte[] bArr) {
        this(z, new byte[][]{bArr});
    }

    public FixedSecureRandom(boolean z, byte[][] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != bArr.length; i++) {
            try {
                byteArrayOutputStream.write(bArr[i]);
            } catch (IOException unused) {
                throw new IllegalArgumentException("can't save value array.");
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this._data = byteArray;
        if (z) {
            this._intPad = byteArray.length % 4;
        }
    }

    public FixedSecureRandom(byte[] bArr) {
        this(false, new byte[][]{bArr});
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(false, bArr);
    }

    private int OooO00o() {
        byte[] bArr = this._data;
        int i = this._index;
        this._index = i + 1;
        return bArr[i] & 255;
    }

    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    public int nextInt() {
        int OooO00o = (OooO00o() << 24) | 0 | (OooO00o() << 16);
        int i = this._intPad;
        if (i == 2) {
            this._intPad = i - 1;
        } else {
            OooO00o |= OooO00o() << 8;
        }
        int i2 = this._intPad;
        if (i2 != 1) {
            return OooO00o | OooO00o();
        }
        this._intPad = i2 - 1;
        return OooO00o;
    }

    public long nextLong() {
        return (((long) OooO00o()) << 56) | 0 | (((long) OooO00o()) << 48) | (((long) OooO00o()) << 40) | (((long) OooO00o()) << 32) | (((long) OooO00o()) << 24) | (((long) OooO00o()) << 16) | (((long) OooO00o()) << 8) | ((long) OooO00o());
    }
}
