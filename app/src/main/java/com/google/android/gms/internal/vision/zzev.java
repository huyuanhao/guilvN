package com.google.android.gms.internal.vision;

public final class zzev {
    public final byte[] buffer;
    public final zzfe zzsd;

    public zzev(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzsd = zzfe.zzg(bArr);
    }

    public final zzeo zzdo() {
        this.zzsd.zzea();
        return new zzex(this.buffer);
    }

    public final zzfe zzdp() {
        return this.zzsd;
    }

    public /* synthetic */ zzev(int i, zzep zzep) {
        this(i);
    }
}
