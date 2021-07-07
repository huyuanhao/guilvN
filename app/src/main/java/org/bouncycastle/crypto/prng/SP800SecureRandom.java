package org.bouncycastle.crypto.prng;

import com.p118pd.sdk.AbstractC5517ILI;
import com.p118pd.sdk.AbstractC5552Iil;
import com.p118pd.sdk.AbstractC6863liiI;
import com.p118pd.sdk.C5557Il1;
import java.security.SecureRandom;

public class SP800SecureRandom extends SecureRandom {
    public AbstractC6863liiI drbg;
    public final AbstractC5517ILI drbgProvider;
    public final AbstractC5552Iil entropySource;
    public final boolean predictionResistant;
    public final SecureRandom randomSource;

    public SP800SecureRandom(SecureRandom secureRandom, AbstractC5552Iil r2, AbstractC5517ILI r3, boolean z) {
        this.randomSource = secureRandom;
        this.entropySource = r2;
        this.drbgProvider = r3;
        this.predictionResistant = z;
    }

    public byte[] generateSeed(int i) {
        return C5557Il1.OooO00o(this.entropySource, i);
    }

    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.drbg == null) {
                this.drbg = this.drbgProvider.OooO00o(this.entropySource);
            }
            if (this.drbg.OooO00o(bArr, null, this.predictionResistant) < 0) {
                this.drbg.OooO00o(null);
                this.drbg.OooO00o(bArr, null, this.predictionResistant);
            }
        }
    }

    public void reseed(byte[] bArr) {
        synchronized (this) {
            if (this.drbg == null) {
                this.drbg = this.drbgProvider.OooO00o(this.entropySource);
            }
            this.drbg.OooO00o(bArr);
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
