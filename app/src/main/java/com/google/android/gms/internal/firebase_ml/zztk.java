package com.google.android.gms.internal.firebase_ml;

public final class zztk extends zzti {
    public final byte[] buffer;
    public int limit;
    public int pos;
    public final boolean zzbkv;
    public int zzbkw;
    public int zzbkx;
    public int zzbky;

    public zztk(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzbky = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzbkx = i;
        this.zzbkv = z;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzti
    public final int zzco(int i) throws zzuo {
        if (i >= 0) {
            int zzqd = i + zzqd();
            int i2 = this.zzbky;
            if (zzqd <= i2) {
                this.zzbky = zzqd;
                int i3 = this.limit + this.zzbkw;
                this.limit = i3;
                int i4 = i3 - this.zzbkx;
                if (i4 > zzqd) {
                    int i5 = i4 - zzqd;
                    this.zzbkw = i5;
                    this.limit = i3 - i5;
                } else {
                    this.zzbkw = 0;
                }
                return i2;
            }
            throw zzuo.zzrm();
        }
        throw zzuo.zzrn();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzti
    public final int zzqd() {
        return this.pos - this.zzbkx;
    }
}
