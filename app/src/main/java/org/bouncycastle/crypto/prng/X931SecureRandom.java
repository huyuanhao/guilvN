package org.bouncycastle.crypto.prng;

import com.p118pd.sdk.C5555IiIL;
import com.p118pd.sdk.C5557Il1;
import java.security.SecureRandom;

public class X931SecureRandom extends SecureRandom {
    public final C5555IiIL drbg;
    public final boolean predictionResistant;
    public final SecureRandom randomSource;

    public X931SecureRandom(SecureRandom secureRandom, C5555IiIL r2, boolean z) {
        this.randomSource = secureRandom;
        this.drbg = r2;
        this.predictionResistant = z;
    }

    public byte[] generateSeed(int i) {
        return C5557Il1.OooO00o(this.drbg.OooO00o(), i);
    }

    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.drbg.OooO00o(bArr, this.predictionResistant) < 0) {
                this.drbg.m15834OooO00o();
                this.drbg.OooO00o(bArr, this.predictionResistant);
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(long j) {
        synchronized (this) {
            if (this.randomSource != null) {
                this.randomSource.setSeed(j);
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            if (this.randomSource != null) {
                this.randomSource.setSeed(bArr);
            }
        }
    }
}
