package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C7490o0OoOO0o;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zztl extends zzsv {
    public static final Logger logger = Logger.getLogger(zztl.class.getName());
    public static final boolean zzbkz = zzxc.zztj();
    public zztn zzbla;

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public zzb(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zztl.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public zztl() {
    }

    public static int zzai(boolean z) {
        return 1;
    }

    public static int zzcp(String str) {
        int i;
        try {
            i = zzxe.zzb(str);
        } catch (zzxi unused) {
            i = str.getBytes(zzug.UTF_8).length;
        }
        return zzcw(i) + i;
    }

    public static int zzcu(int i) {
        return zzcw(i << 3);
    }

    public static int zzcv(int i) {
        if (i >= 0) {
            return zzcw(i);
        }
        return 10;
    }

    public static int zzcw(int i) {
        if ((i & C7490o0OoOO0o.OooO0oO) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzcx(int i) {
        return zzcw(zzdc(i));
    }

    public static int zzcy(int i) {
        return 4;
    }

    public static int zzcz(int i) {
        return 4;
    }

    public static int zzd(double d) {
        return 8;
    }

    public static int zzd(int i, long j) {
        return zzcu(i) + zzu(j);
    }

    public static int zzda(int i) {
        return zzcv(i);
    }

    public static int zzdb(int i) {
        return zzcw(i) + i;
    }

    public static int zzdc(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int zzdd(int i) {
        return zzcw(i);
    }

    public static int zze(int i, long j) {
        return zzcu(i) + zzu(j);
    }

    public static int zzf(int i, long j) {
        return zzcu(i) + zzu(zzy(j));
    }

    public static zztl zzg(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzh(int i, long j) {
        return zzcu(i) + 8;
    }

    public static int zzl(int i, int i2) {
        return zzcu(i) + zzcv(i2);
    }

    public static int zzm(int i, int i2) {
        return zzcu(i) + zzcw(i2);
    }

    public static int zzn(int i, int i2) {
        return zzcu(i) + zzcw(zzdc(i2));
    }

    public static int zzo(int i, int i2) {
        return zzcu(i) + 4;
    }

    public static int zzp(int i, int i2) {
        return zzcu(i) + 4;
    }

    public static int zzq(int i, int i2) {
        return zzcu(i) + zzcv(i2);
    }

    public static int zzu(float f) {
        return 4;
    }

    public static int zzu(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int zzv(long j) {
        return zzu(zzy(j));
    }

    public static int zzw(long j) {
        return 8;
    }

    public static int zzx(long j) {
        return 8;
    }

    public static long zzy(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public final void zza(int i, float f) throws IOException {
        zzk(i, Float.floatToRawIntBits(f));
    }

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzsw zzsw) throws IOException;

    public abstract void zza(int i, zzvo zzvo) throws IOException;

    public abstract void zza(int i, zzvo zzvo, zzwe zzwe) throws IOException;

    public abstract void zza(zzsw zzsw) throws IOException;

    public final void zzah(boolean z) throws IOException {
        zzd(z ? (byte) 1 : 0);
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzy(j));
    }

    public abstract void zzb(int i, zzsw zzsw) throws IOException;

    public abstract void zzb(int i, String str) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(zzvo zzvo) throws IOException;

    public final void zzc(double d) throws IOException {
        zzs(Double.doubleToRawLongBits(d));
    }

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzco(String str) throws IOException;

    public abstract void zzcq(int i) throws IOException;

    public abstract void zzcr(int i) throws IOException;

    public final void zzcs(int i) throws IOException {
        zzcr(zzdc(i));
    }

    public abstract void zzct(int i) throws IOException;

    public abstract void zzd(byte b) throws IOException;

    public abstract void zze(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzg(int i, int i2) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i, int i2) throws IOException;

    public final void zzj(int i, int i2) throws IOException {
        zzi(i, zzdc(i2));
    }

    public abstract void zzk(int i, int i2) throws IOException;

    public abstract void zzq(long j) throws IOException;

    public abstract int zzqe();

    public final void zzqf() {
        if (zzqe() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzr(long j) throws IOException {
        zzq(zzy(j));
    }

    public abstract void zzs(long j) throws IOException;

    public final void zzt(float f) throws IOException {
        zzct(Float.floatToRawIntBits(f));
    }

    public static class zza extends zztl {
        public final byte[] buffer;
        public final int limit;
        public final int offset;
        public int position;

        public zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.buffer = bArr;
                    this.offset = 0;
                    this.position = 0;
                    this.limit = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        private final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zza(int i, long j) throws IOException {
            zzg(i, 0);
            zzq(j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzb(int i, boolean z) throws IOException {
            zzg(i, 0);
            zzd(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzc(int i, long j) throws IOException {
            zzg(i, 1);
            zzs(j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzco(String str) throws IOException {
            int i = this.position;
            try {
                int zzcw = zztl.zzcw(str.length() * 3);
                int zzcw2 = zztl.zzcw(str.length());
                if (zzcw2 == zzcw) {
                    int i2 = i + zzcw2;
                    this.position = i2;
                    int zza = zzxe.zza(str, this.buffer, i2, zzqe());
                    this.position = i;
                    zzcr((zza - i) - zzcw2);
                    this.position = zza;
                    return;
                }
                zzcr(zzxe.zzb(str));
                this.position = zzxe.zza(str, this.buffer, this.position, zzqe());
            } catch (zzxi e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzcq(int i) throws IOException {
            if (i >= 0) {
                zzcr(i);
            } else {
                zzq((long) i);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzcr(int i) throws IOException {
            if (!zztl.zzbkz || zzqe() < 10) {
                while ((i & C7490o0OoOO0o.OooO0oO) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            } else {
                while ((i & C7490o0OoOO0o.OooO0oO) != 0) {
                    byte[] bArr3 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    zzxc.zza(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                zzxc.zza(bArr4, (long) i5, (byte) i);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzct(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                this.position = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzd(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzcr(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzg(int i, int i2) throws IOException {
            zzcr((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzh(int i, int i2) throws IOException {
            zzg(i, 0);
            zzcq(i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzi(int i, int i2) throws IOException {
            zzg(i, 0);
            zzcr(i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzk(int i, int i2) throws IOException {
            zzg(i, 5);
            zzct(i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzq(long j) throws IOException {
            if (!zztl.zzbkz || zzqe() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    zzxc.zza(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzxc.zza(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final int zzqe() {
            return this.limit - this.position;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzs(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.buffer;
                int i3 = i2 + 1;
                this.position = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.buffer;
                int i6 = i5 + 1;
                this.position = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.buffer;
                int i7 = i6 + 1;
                this.position = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.buffer;
                int i8 = i7 + 1;
                this.position = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.buffer;
                this.position = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zza(int i, zzsw zzsw) throws IOException {
            zzg(i, 2);
            zza(zzsw);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzb(int i, String str) throws IOException {
            zzg(i, 2);
            zzco(str);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zza(zzsw zzsw) throws IOException {
            zzcr(zzsw.size());
            zzsw.zza(this);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzb(int i, zzsw zzsw) throws IOException {
            zzg(1, 3);
            zzi(2, i);
            zza(3, zzsw);
            zzg(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zza(int i, zzvo zzvo, zzwe zzwe) throws IOException {
            zzg(i, 2);
            zzsn zzsn = (zzsn) zzvo;
            int zzpq = zzsn.zzpq();
            if (zzpq == -1) {
                zzpq = zzwe.zzaa(zzsn);
                zzsn.zzch(zzpq);
            }
            zzcr(zzpq);
            zzwe.zza(zzvo, this.zzbla);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zzb(zzvo zzvo) throws IOException {
            zzcr(zzvo.zzqy());
            zzvo.zzb(this);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzsv
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zztl
        public final void zza(int i, zzvo zzvo) throws IOException {
            zzg(1, 3);
            zzi(2, i);
            zzg(3, 2);
            zzb(zzvo);
            zzg(1, 4);
        }
    }

    public static int zzb(int i, float f) {
        return zzcu(i) + 4;
    }

    public static int zzc(int i, boolean z) {
        return zzcu(i) + 1;
    }

    public static int zzh(byte[] bArr) {
        int length = bArr.length;
        return zzcw(length) + length;
    }

    public static int zzt(long j) {
        return zzu(j);
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public static int zza(int i, zzuv zzuv) {
        int zzcu = zzcu(i);
        int zzqy = zzuv.zzqy();
        return zzcu + zzcw(zzqy) + zzqy;
    }

    public static int zzb(int i, double d) {
        return zzcu(i) + 8;
    }

    public static int zzc(int i, String str) {
        return zzcu(i) + zzcp(str);
    }

    public static int zzd(int i, zzsw zzsw) {
        return (zzcu(1) << 1) + zzm(2, i) + zzc(3, zzsw);
    }

    public static int zzg(int i, long j) {
        return zzcu(i) + 8;
    }

    public static int zzb(int i, zzvo zzvo, zzwe zzwe) {
        return zzcu(i) + zza(zzvo, zzwe);
    }

    public static int zzc(int i, zzsw zzsw) {
        int zzcu = zzcu(i);
        int size = zzsw.size();
        return zzcu + zzcw(size) + size;
    }

    public static int zzb(int i, zzvo zzvo) {
        return (zzcu(1) << 1) + zzm(2, i) + zzcu(3) + zzc(zzvo);
    }

    public static int zza(zzuv zzuv) {
        int zzqy = zzuv.zzqy();
        return zzcw(zzqy) + zzqy;
    }

    @Deprecated
    public static int zzd(zzvo zzvo) {
        return zzvo.zzqy();
    }

    public static int zzc(zzvo zzvo) {
        int zzqy = zzvo.zzqy();
        return zzcw(zzqy) + zzqy;
    }

    public static int zza(zzvo zzvo, zzwe zzwe) {
        zzsn zzsn = (zzsn) zzvo;
        int zzpq = zzsn.zzpq();
        if (zzpq == -1) {
            zzpq = zzwe.zzaa(zzsn);
            zzsn.zzch(zzpq);
        }
        return zzcw(zzpq) + zzpq;
    }

    public static int zzb(int i, zzuv zzuv) {
        return (zzcu(1) << 1) + zzm(2, i) + zza(3, zzuv);
    }

    @Deprecated
    public static int zzc(int i, zzvo zzvo, zzwe zzwe) {
        int zzcu = zzcu(i) << 1;
        zzsn zzsn = (zzsn) zzvo;
        int zzpq = zzsn.zzpq();
        if (zzpq == -1) {
            zzpq = zzwe.zzaa(zzsn);
            zzsn.zzch(zzpq);
        }
        return zzcu + zzpq;
    }

    public static int zzb(zzsw zzsw) {
        int size = zzsw.size();
        return zzcw(size) + size;
    }

    public final void zza(String str, zzxi zzxi) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzxi);
        byte[] bytes = str.getBytes(zzug.UTF_8);
        try {
            zzcr(bytes.length);
            zzb(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        } catch (zzb e2) {
            throw e2;
        }
    }
}
