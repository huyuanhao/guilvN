package com.google.android.gms.internal.clearcut;

public final class zzbe extends zzbi {
    public final int zzfm;
    public final int zzfn;

    public zzbe(byte[] bArr, int i, int i2) {
        super(bArr);
        zzbb.zzb(i, i + i2, bArr.length);
        this.zzfm = i;
        this.zzfn = i2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb, com.google.android.gms.internal.clearcut.zzbi
    public final int size() {
        return this.zzfn;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi
    public final int zzac() {
        return this.zzfm;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb, com.google.android.gms.internal.clearcut.zzbi
    public final byte zzj(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzfp[this.zzfm + i];
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
}
