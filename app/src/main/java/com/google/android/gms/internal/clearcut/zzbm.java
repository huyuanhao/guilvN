package com.google.android.gms.internal.clearcut;

public final class zzbm extends zzbk {
    public final byte[] buffer;
    public int limit;
    public int pos;
    public final boolean zzfu;
    public int zzfv;
    public int zzfw;
    public int zzfx;

    public zzbm(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzfx = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzfw = i;
        this.zzfu = z;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzaf() {
        return this.pos - this.zzfw;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzl(int i) throws zzco {
        if (i >= 0) {
            int zzaf = i + zzaf();
            int i2 = this.zzfx;
            if (zzaf <= i2) {
                this.zzfx = zzaf;
                int i3 = this.limit + this.zzfv;
                this.limit = i3;
                int i4 = i3 - this.zzfw;
                if (i4 > zzaf) {
                    int i5 = i4 - zzaf;
                    this.zzfv = i5;
                    this.limit = i3 - i5;
                } else {
                    this.zzfv = 0;
                }
                return i2;
            }
            throw zzco.zzbl();
        }
        throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
