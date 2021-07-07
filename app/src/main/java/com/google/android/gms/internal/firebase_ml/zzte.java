package com.google.android.gms.internal.firebase_ml;

public final class zzte {
    public final byte[] buffer;
    public final zztl zzbkr;

    public zzte(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzbkr = zztl.zzg(bArr);
    }

    public final zzsw zzqb() {
        this.zzbkr.zzqf();
        return new zztg(this.buffer);
    }

    public final zztl zzqc() {
        return this.zzbkr;
    }

    public /* synthetic */ zzte(int i, zzsx zzsx) {
        this(i);
    }
}
