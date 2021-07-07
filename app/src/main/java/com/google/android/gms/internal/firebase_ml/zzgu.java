package com.google.android.gms.internal.firebase_ml;

public abstract class zzgu {
    @Deprecated
    public final byte zzxq;
    public final byte zzxr;
    public final int zzxs;
    public final int zzxt;
    public final int zzxu;
    public final int zzxv;

    public zzgu(int i, int i2, int i3, int i4) {
        this(3, 4, i3, i4, (byte) 61);
    }

    public abstract void zza(byte[] bArr, int i, int i2, zzgv zzgv);

    public abstract boolean zza(byte b);

    public final byte[] zza(int i, zzgv zzgv) {
        byte[] bArr = zzgv.buffer;
        if (bArr != null && bArr.length >= zzgv.pos + i) {
            return bArr;
        }
        byte[] bArr2 = zzgv.buffer;
        if (bArr2 == null) {
            zzgv.buffer = new byte[8192];
            zzgv.pos = 0;
            zzgv.zzxx = 0;
        } else {
            byte[] bArr3 = new byte[(bArr2.length << 1)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            zzgv.buffer = bArr3;
        }
        return zzgv.buffer;
    }

    public final long zzc(byte[] bArr) {
        int length = bArr.length;
        int i = this.zzxs;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.zzxt);
        int i2 = this.zzxu;
        return i2 > 0 ? j + ((((((long) i2) + j) - 1) / ((long) i2)) * ((long) this.zzxv)) : j;
    }

    public zzgu(int i, int i2, int i3, int i4, byte b) {
        this.zzxq = 61;
        this.zzxs = 3;
        this.zzxt = 4;
        this.zzxu = i3 > 0 && i4 > 0 ? (i3 / 4) << 2 : 0;
        this.zzxv = i4;
        this.zzxr = 61;
    }
}
