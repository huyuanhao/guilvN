package com.google.android.gms.internal.firebase_ml;

public abstract class zzti {
    public int zzbks;
    public int zzbkt;
    public boolean zzbku;

    public zzti() {
        this.zzbks = 100;
        this.zzbkt = Integer.MAX_VALUE;
        this.zzbku = false;
    }

    public static zzti zza(byte[] bArr, int i, int i2, boolean z) {
        zztk zztk = new zztk(bArr, 0, i2, false);
        try {
            zztk.zzco(i2);
            return zztk;
        } catch (zzuo e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzcp(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzp(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract int zzco(int i) throws zzuo;

    public abstract int zzqd();
}
