package com.google.android.gms.internal.vision;

public final class zzes extends zzex {
    public final int zzsb;
    public final int zzsc;

    public zzes(byte[] bArr, int i, int i2) {
        super(bArr);
        zzeo.zzb(i, i + i2, bArr.length);
        this.zzsb = i;
        this.zzsc = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzeo, com.google.android.gms.internal.vision.zzex
    public final int size() {
        return this.zzsc;
    }

    @Override // com.google.android.gms.internal.vision.zzeo, com.google.android.gms.internal.vision.zzex
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzse, zzdn(), bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzeo, com.google.android.gms.internal.vision.zzex
    public final byte zzai(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzse[this.zzsb + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.vision.zzex
    public final int zzdn() {
        return this.zzsb;
    }
}
