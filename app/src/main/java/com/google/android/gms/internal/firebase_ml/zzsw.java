package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzsw implements Serializable, Iterable<Byte> {
    public static final zzsw zzbkl = new zztg(zzug.zzbpe);
    public static final zztc zzbkm = (zzsr.zzpv() ? new zzth(null) : new zzta(null));
    public static final Comparator<zzsw> zzbkn = new zzsy();
    public int zzadu = 0;

    public static int zzb(byte b) {
        return b & 255;
    }

    public static zzsw zzc(byte[] bArr, int i, int i2) {
        zzc(i, i + i2, bArr.length);
        return new zztg(zzbkm.zzd(bArr, i, i2));
    }

    public static zzsw zzcn(String str) {
        return new zztg(str.getBytes(zzug.UTF_8));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzadu;
        if (i == 0) {
            int size = size();
            i = zzb(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzadu = i;
        }
        return i;
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzsx(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract void zza(zzsv zzsv) throws IOException;

    public abstract int zzb(int i, int i2, int i3);

    public abstract String zzb(Charset charset);

    public abstract byte zzcl(int i);

    public abstract byte zzcm(int i);

    public abstract zzsw zzf(int i, int i2);

    public final String zzpx() {
        return size() == 0 ? "" : zzb(zzug.UTF_8);
    }

    public abstract boolean zzpy();

    public final int zzpz() {
        return this.zzadu;
    }

    public static zzte zzcn(int i) {
        return new zzte(i, null);
    }

    public static int zzc(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
