package com.google.android.gms.internal.firebase_ml;

public final class zztb extends zztg {
    public final int zzbkp;
    public final int zzbkq;

    public zztb(byte[] bArr, int i, int i2) {
        super(bArr);
        zzsw.zzc(i, i + i2, bArr.length);
        this.zzbkp = i;
        this.zzbkq = i2;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsw, com.google.android.gms.internal.firebase_ml.zztg
    public final int size() {
        return this.zzbkq;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsw, com.google.android.gms.internal.firebase_ml.zztg
    public final byte zzcl(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.bytes[this.zzbkp + i];
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

    @Override // com.google.android.gms.internal.firebase_ml.zzsw, com.google.android.gms.internal.firebase_ml.zztg
    public final byte zzcm(int i) {
        return this.bytes[this.zzbkp + i];
    }

    @Override // com.google.android.gms.internal.firebase_ml.zztg
    public final int zzqa() {
        return this.zzbkp;
    }
}
