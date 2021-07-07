package com.google.android.gms.internal.vision;

import com.p118pd.sdk.C7490o0OoOO0o;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzfe extends zzen {
    public static final Logger logger = Logger.getLogger(zzfe.class.getName());
    public static final boolean zzsr = zziu.zzhh();
    public zzfg zzss;

    public static final class zzb extends zza {
        public final ByteBuffer zzst;
        public int zzsu;

        public zzb(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzst = byteBuffer;
            this.zzsu = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.vision.zzfe, com.google.android.gms.internal.vision.zzfe.zza
        public final void flush() {
            this.zzst.position(this.zzsu + zzec());
        }
    }

    public static class zzc extends IOException {
        public zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public zzc(java.lang.String r3) {
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
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfe.zzc.<init>(java.lang.String):void");
        }

        public zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public zzc(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfe.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public zzfe() {
    }

    public static zzfe zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zzb(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (zziu.zzhi()) {
            return new zze(byteBuffer);
        } else {
            return new zzd(byteBuffer);
        }
    }

    public static int zzav(int i) {
        return zzax(i << 3);
    }

    public static int zzaw(int i) {
        if (i >= 0) {
            return zzax(i);
        }
        return 10;
    }

    public static int zzax(int i) {
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

    public static int zzay(int i) {
        return zzax(zzbc(i));
    }

    public static int zzaz(int i) {
        return 4;
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzba(int i) {
        return 4;
    }

    public static int zzbb(int i) {
        return zzaw(i);
    }

    public static int zzbc(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int zzbd(int i) {
        return zzax(i);
    }

    public static int zzc(int i, boolean z) {
        return zzav(i) + 1;
    }

    public static int zzd(int i, long j) {
        return zzav(i) + zzi(j);
    }

    public static int zze(int i, long j) {
        return zzav(i) + zzi(j);
    }

    public static int zzg(float f) {
        return 4;
    }

    public static zzfe zzg(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzi(int i, int i2) {
        return zzav(i) + zzaw(i2);
    }

    public static int zzi(long j) {
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

    public static int zzi(boolean z) {
        return 1;
    }

    public static int zzj(int i, int i2) {
        return zzav(i) + zzax(i2);
    }

    public static int zzk(int i, int i2) {
        return zzav(i) + zzax(zzbc(i2));
    }

    public static int zzk(long j) {
        return 8;
    }

    public static int zzl(int i, int i2) {
        return zzav(i) + 4;
    }

    public static int zzl(long j) {
        return 8;
    }

    public static int zzm(int i, int i2) {
        return zzav(i) + 4;
    }

    public static long zzm(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzn(int i, int i2) {
        return zzav(i) + zzaw(i2);
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzeo zzeo) throws IOException;

    public abstract void zza(int i, zzhf zzhf) throws IOException;

    public abstract void zza(int i, zzhf zzhf, zzhw zzhw) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(zzeo zzeo) throws IOException;

    public abstract void zza(zzhf zzhf, zzhw zzhw) throws IOException;

    public abstract void zzar(int i) throws IOException;

    public abstract void zzas(int i) throws IOException;

    public final void zzat(int i) throws IOException {
        zzas(zzbc(i));
    }

    public abstract void zzau(int i) throws IOException;

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzm(j));
    }

    public abstract void zzb(int i, zzeo zzeo) throws IOException;

    public abstract void zzb(int i, zzhf zzhf) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(zzhf zzhf) throws IOException;

    public abstract void zzc(byte b) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public abstract int zzdz();

    public abstract void zze(int i, int i2) throws IOException;

    public abstract void zze(long j) throws IOException;

    public final void zzea() {
        if (zzdz() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzf(int i, int i2) throws IOException;

    public final void zzf(long j) throws IOException {
        zze(zzm(j));
    }

    public abstract void zzf(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzg(long j) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public final void zzh(boolean z) throws IOException {
        zzc(z ? (byte) 1 : 0);
    }

    public abstract void zzm(String str) throws IOException;

    public static class zza extends zzfe {
        public final byte[] buffer;
        public final int limit;
        public final int offset;
        public int position;

        public zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.buffer = bArr;
                    this.offset = i;
                    this.position = i;
                    this.limit = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public void flush() {
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, long j) throws IOException {
            zzd(i, 0);
            zze(j);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzar(int i) throws IOException {
            if (i >= 0) {
                zzas(i);
            } else {
                zze((long) i);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzas(int i) throws IOException {
            if (!zzfe.zzsr || zzdz() < 10) {
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
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            } else {
                while ((i & C7490o0OoOO0o.OooO0oO) != 0) {
                    byte[] bArr3 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    zziu.zza(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                zziu.zza(bArr4, (long) i5, (byte) i);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzau(int i) throws IOException {
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
                bArr4[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, boolean z) throws IOException {
            zzd(i, 0);
            zzc(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(int i, long j) throws IOException {
            zzd(i, 1);
            zzg(j);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzd(int i, int i2) throws IOException {
            zzas((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final int zzdz() {
            return this.limit - this.position;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(int i, int i2) throws IOException {
            zzd(i, 0);
            zzar(i2);
        }

        public final int zzec() {
            return this.position - this.offset;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(int i, int i2) throws IOException {
            zzd(i, 0);
            zzas(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzg(long j) throws IOException {
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
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzh(int i, int i2) throws IOException {
            zzd(i, 5);
            zzau(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzm(String str) throws IOException {
            int i = this.position;
            try {
                int zzax = zzfe.zzax(str.length() * 3);
                int zzax2 = zzfe.zzax(str.length());
                if (zzax2 == zzax) {
                    int i2 = i + zzax2;
                    this.position = i2;
                    int zza = zziw.zza(str, this.buffer, i2, zzdz());
                    this.position = i;
                    zzas((zza - i) - zzax2);
                    this.position = zza;
                    return;
                }
                zzas(zziw.zza(str));
                this.position = zziw.zza(str, this.buffer, this.position, zzdz());
            } catch (zzja e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, String str) throws IOException {
            zzd(i, 2);
            zzm(str);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, zzhf zzhf) throws IOException {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzhf);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(long j) throws IOException {
            if (!zzfe.zzsr || zzdz() < 10) {
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
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    zziu.zza(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zziu.zza(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(byte[] bArr, int i, int i2) throws IOException {
            zzas(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzeo zzeo) throws IOException {
            zzd(i, 2);
            zza(zzeo);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzeo zzeo) throws IOException {
            zzas(zzeo.size());
            zzeo.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, zzeo zzeo) throws IOException {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzeo);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzhf zzhf) throws IOException {
            zzd(i, 2);
            zzb(zzhf);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzhf zzhf, zzhw zzhw) throws IOException {
            zzd(i, 2);
            zzec zzec = (zzec) zzhf;
            int zzcf = zzec.zzcf();
            if (zzcf == -1) {
                zzcf = zzhw.zzp(zzec);
                zzec.zzy(zzcf);
            }
            zzas(zzcf);
            zzhw.zza(zzhf, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(zzhf zzhf) throws IOException {
            zzas(zzhf.zzeq());
            zzhf.zzb(this);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzhf zzhf, zzhw zzhw) throws IOException {
            zzec zzec = (zzec) zzhf;
            int zzcf = zzec.zzcf();
            if (zzcf == -1) {
                zzcf = zzhw.zzp(zzec);
                zzec.zzy(zzcf);
            }
            zzas(zzcf);
            zzhw.zza(zzhf, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzen
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }
    }

    public static final class zzd extends zzfe {
        public final int zzsu;
        public final ByteBuffer zzsv;
        public final ByteBuffer zzsw;

        public zzd(ByteBuffer byteBuffer) {
            super();
            this.zzsv = byteBuffer;
            this.zzsw = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzsu = byteBuffer.position();
        }

        private final void zzo(String str) throws IOException {
            try {
                zziw.zza(str, this.zzsw);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void flush() {
            this.zzsv.position(this.zzsw.position());
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.zzsw.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, long j) throws IOException {
            zzd(i, 0);
            zze(j);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzar(int i) throws IOException {
            if (i >= 0) {
                zzas(i);
            } else {
                zze((long) i);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzas(int i) throws IOException {
            while ((i & C7490o0OoOO0o.OooO0oO) != 0) {
                this.zzsw.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.zzsw.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzau(int i) throws IOException {
            try {
                this.zzsw.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, boolean z) throws IOException {
            zzd(i, 0);
            zzc(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(int i, long j) throws IOException {
            zzd(i, 1);
            zzg(j);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzd(int i, int i2) throws IOException {
            zzas((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final int zzdz() {
            return this.zzsw.remaining();
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(int i, int i2) throws IOException {
            zzd(i, 0);
            zzar(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(int i, int i2) throws IOException {
            zzd(i, 0);
            zzas(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzg(long j) throws IOException {
            try {
                this.zzsw.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzh(int i, int i2) throws IOException {
            zzd(i, 5);
            zzau(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzm(String str) throws IOException {
            int position = this.zzsw.position();
            try {
                int zzax = zzfe.zzax(str.length() * 3);
                int zzax2 = zzfe.zzax(str.length());
                if (zzax2 == zzax) {
                    int position2 = this.zzsw.position() + zzax2;
                    this.zzsw.position(position2);
                    zzo(str);
                    int position3 = this.zzsw.position();
                    this.zzsw.position(position);
                    zzas(position3 - position2);
                    this.zzsw.position(position3);
                    return;
                }
                zzas(zziw.zza(str));
                zzo(str);
            } catch (zzja e) {
                this.zzsw.position(position);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, String str) throws IOException {
            zzd(i, 2);
            zzm(str);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, zzhf zzhf) throws IOException {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzhf);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(byte b) throws IOException {
            try {
                this.zzsw.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.zzsw.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.zzsw.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(byte[] bArr, int i, int i2) throws IOException {
            zzas(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzeo zzeo) throws IOException {
            zzd(i, 2);
            zza(zzeo);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzhf zzhf) throws IOException {
            zzd(i, 2);
            zzb(zzhf);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, zzeo zzeo) throws IOException {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzeo);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzhf zzhf, zzhw zzhw) throws IOException {
            zzd(i, 2);
            zza(zzhf, zzhw);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzhf zzhf, zzhw zzhw) throws IOException {
            zzec zzec = (zzec) zzhf;
            int zzcf = zzec.zzcf();
            if (zzcf == -1) {
                zzcf = zzhw.zzp(zzec);
                zzec.zzy(zzcf);
            }
            zzas(zzcf);
            zzhw.zza(zzhf, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(zzhf zzhf) throws IOException {
            zzas(zzhf.zzeq());
            zzhf.zzb(this);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzeo zzeo) throws IOException {
            zzas(zzeo.size());
            zzeo.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzen
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }
    }

    public static final class zze extends zzfe {
        public final ByteBuffer zzsv;
        public final ByteBuffer zzsw;
        public final long zzsx;
        public final long zzsy;
        public final long zzsz;
        public final long zzta;
        public long zztb = this.zzsy;

        public zze(ByteBuffer byteBuffer) {
            super();
            this.zzsv = byteBuffer;
            this.zzsw = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long zzb = zziu.zzb(byteBuffer);
            this.zzsx = zzb;
            this.zzsy = zzb + ((long) byteBuffer.position());
            long limit = this.zzsx + ((long) byteBuffer.limit());
            this.zzsz = limit;
            this.zzta = limit - 10;
        }

        private final void zzn(long j) {
            this.zzsw.position((int) (j - this.zzsx));
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void flush() {
            this.zzsv.position((int) (this.zztb - this.zzsx));
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.zztb;
                if (this.zzsz - j >= j2) {
                    zziu.zza(bArr, (long) i, j2, j);
                    this.zztb += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zztb), Long.valueOf(this.zzsz), Integer.valueOf(i2)));
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, long j) throws IOException {
            zzd(i, 0);
            zze(j);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzar(int i) throws IOException {
            if (i >= 0) {
                zzas(i);
            } else {
                zze((long) i);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzas(int i) throws IOException {
            if (this.zztb <= this.zzta) {
                while ((i & C7490o0OoOO0o.OooO0oO) != 0) {
                    long j = this.zztb;
                    this.zztb = j + 1;
                    zziu.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.zztb;
                this.zztb = 1 + j2;
                zziu.zza(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.zztb;
                if (j3 >= this.zzsz) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zztb), Long.valueOf(this.zzsz), 1));
                } else if ((i & C7490o0OoOO0o.OooO0oO) == 0) {
                    this.zztb = 1 + j3;
                    zziu.zza(j3, (byte) i);
                    return;
                } else {
                    this.zztb = j3 + 1;
                    zziu.zza(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzau(int i) throws IOException {
            this.zzsw.putInt((int) (this.zztb - this.zzsx), i);
            this.zztb += 4;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, boolean z) throws IOException {
            zzd(i, 0);
            zzc(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(int i, long j) throws IOException {
            zzd(i, 1);
            zzg(j);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzd(int i, int i2) throws IOException {
            zzas((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final int zzdz() {
            return (int) (this.zzsz - this.zztb);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(int i, int i2) throws IOException {
            zzd(i, 0);
            zzar(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(int i, int i2) throws IOException {
            zzd(i, 0);
            zzas(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzg(long j) throws IOException {
            this.zzsw.putLong((int) (this.zztb - this.zzsx), j);
            this.zztb += 8;
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzh(int i, int i2) throws IOException {
            zzd(i, 5);
            zzau(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzm(String str) throws IOException {
            long j = this.zztb;
            try {
                int zzax = zzfe.zzax(str.length() * 3);
                int zzax2 = zzfe.zzax(str.length());
                if (zzax2 == zzax) {
                    int i = ((int) (this.zztb - this.zzsx)) + zzax2;
                    this.zzsw.position(i);
                    zziw.zza(str, this.zzsw);
                    int position = this.zzsw.position() - i;
                    zzas(position);
                    this.zztb += (long) position;
                    return;
                }
                int zza = zziw.zza(str);
                zzas(zza);
                zzn(this.zztb);
                zziw.zza(str, this.zzsw);
                this.zztb += (long) zza;
            } catch (zzja e) {
                this.zztb = j;
                zzn(j);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, String str) throws IOException {
            zzd(i, 2);
            zzm(str);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, zzhf zzhf) throws IOException {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzhf);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzc(byte b) throws IOException {
            long j = this.zztb;
            if (j < this.zzsz) {
                this.zztb = 1 + j;
                zziu.zza(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zztb), Long.valueOf(this.zzsz), 1));
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zze(long j) throws IOException {
            if (this.zztb <= this.zzta) {
                while ((j & -128) != 0) {
                    long j2 = this.zztb;
                    this.zztb = j2 + 1;
                    zziu.zza(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.zztb;
                this.zztb = 1 + j3;
                zziu.zza(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.zztb;
                if (j4 >= this.zzsz) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zztb), Long.valueOf(this.zzsz), 1));
                } else if ((j & -128) == 0) {
                    this.zztb = 1 + j4;
                    zziu.zza(j4, (byte) ((int) j));
                    return;
                } else {
                    this.zztb = j4 + 1;
                    zziu.zza(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzf(byte[] bArr, int i, int i2) throws IOException {
            zzas(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzeo zzeo) throws IOException {
            zzd(i, 2);
            zza(zzeo);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzhf zzhf) throws IOException {
            zzd(i, 2);
            zzb(zzhf);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(int i, zzeo zzeo) throws IOException {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzeo);
            zzd(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(int i, zzhf zzhf, zzhw zzhw) throws IOException {
            zzd(i, 2);
            zza(zzhf, zzhw);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzhf zzhf, zzhw zzhw) throws IOException {
            zzec zzec = (zzec) zzhf;
            int zzcf = zzec.zzcf();
            if (zzcf == -1) {
                zzcf = zzhw.zzp(zzec);
                zzec.zzy(zzcf);
            }
            zzas(zzcf);
            zzhw.zza(zzhf, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zzb(zzhf zzhf) throws IOException {
            zzas(zzhf.zzeq());
            zzhf.zzb(this);
        }

        @Override // com.google.android.gms.internal.vision.zzfe
        public final void zza(zzeo zzeo) throws IOException {
            zzas(zzeo.size());
            zzeo.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzen
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }
    }

    public static int zzb(int i, float f) {
        return zzav(i) + 4;
    }

    public static int zzc(int i, zzeo zzeo) {
        int zzav = zzav(i);
        int size = zzeo.size();
        return zzav + zzax(size) + size;
    }

    public static int zzh(int i, long j) {
        return zzav(i) + 8;
    }

    public static int zzj(long j) {
        return zzi(zzm(j));
    }

    public final void zzf(float f) throws IOException {
        zzau(Float.floatToRawIntBits(f));
    }

    public static int zzb(int i, double d) {
        return zzav(i) + 8;
    }

    public static int zzd(int i, zzhf zzhf) {
        return (zzav(1) << 1) + zzj(2, i) + zzc(3, zzhf);
    }

    public static int zzf(int i, long j) {
        return zzav(i) + zzi(zzm(j));
    }

    public static int zzh(long j) {
        return zzi(j);
    }

    public static int zzn(String str) {
        int i;
        try {
            i = zziw.zza(str);
        } catch (zzja unused) {
            i = str.getBytes(zzga.UTF_8).length;
        }
        return zzax(i) + i;
    }

    public final void zzg(int i, int i2) throws IOException {
        zzf(i, zzbc(i2));
    }

    public static int zzb(int i, String str) {
        return zzav(i) + zzn(str);
    }

    public static int zzg(int i, long j) {
        return zzav(i) + 8;
    }

    public static int zzh(byte[] bArr) {
        int length = bArr.length;
        return zzax(length) + length;
    }

    public static int zzb(int i, zzhf zzhf, zzhw zzhw) {
        return zzav(i) + zzb(zzhf, zzhw);
    }

    public static int zzc(int i, zzhf zzhf) {
        return zzav(i) + zzc(zzhf);
    }

    public static int zzb(int i, zzgm zzgm) {
        return (zzav(1) << 1) + zzj(2, i) + zza(3, zzgm);
    }

    public static int zzc(zzhf zzhf) {
        int zzeq = zzhf.zzeq();
        return zzax(zzeq) + zzeq;
    }

    public static int zzd(int i, zzeo zzeo) {
        return (zzav(1) << 1) + zzj(2, i) + zzc(3, zzeo);
    }

    @Deprecated
    public static int zzc(int i, zzhf zzhf, zzhw zzhw) {
        int zzav = zzav(i) << 1;
        zzec zzec = (zzec) zzhf;
        int zzcf = zzec.zzcf();
        if (zzcf == -1) {
            zzcf = zzhw.zzp(zzec);
            zzec.zzy(zzcf);
        }
        return zzav + zzcf;
    }

    public final void zza(int i, float f) throws IOException {
        zzh(i, Float.floatToRawIntBits(f));
    }

    public static int zzb(zzeo zzeo) {
        int size = zzeo.size();
        return zzax(size) + size;
    }

    @Deprecated
    public static int zzd(zzhf zzhf) {
        return zzhf.zzeq();
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zza(double d) throws IOException {
        zzg(Double.doubleToRawLongBits(d));
    }

    public static int zza(int i, zzgm zzgm) {
        int zzav = zzav(i);
        int zzeq = zzgm.zzeq();
        return zzav + zzax(zzeq) + zzeq;
    }

    public static int zzb(zzhf zzhf, zzhw zzhw) {
        zzec zzec = (zzec) zzhf;
        int zzcf = zzec.zzcf();
        if (zzcf == -1) {
            zzcf = zzhw.zzp(zzec);
            zzec.zzy(zzcf);
        }
        return zzax(zzcf) + zzcf;
    }

    public static int zza(zzgm zzgm) {
        int zzeq = zzgm.zzeq();
        return zzax(zzeq) + zzeq;
    }

    public final void zza(String str, zzja zzja) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzja);
        byte[] bytes = str.getBytes(zzga.UTF_8);
        try {
            zzas(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc(e);
        } catch (zzc e2) {
            throw e2;
        }
    }
}
