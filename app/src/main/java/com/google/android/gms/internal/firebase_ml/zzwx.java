package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;
import java.io.IOException;
import java.util.Arrays;

public final class zzwx {
    public static final zzwx zzbsm = new zzwx(0, new int[0], new Object[0], false);
    public int count;
    public boolean zzbkd;
    public int zzboi;
    public Object[] zzbqy;
    public int[] zzbsn;

    public zzwx() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzwx zza(zzwx zzwx, zzwx zzwx2) {
        int i = zzwx.count + zzwx2.count;
        int[] copyOf = Arrays.copyOf(zzwx.zzbsn, i);
        System.arraycopy(zzwx2.zzbsn, 0, copyOf, zzwx.count, zzwx2.count);
        Object[] copyOf2 = Arrays.copyOf(zzwx.zzbqy, i);
        System.arraycopy(zzwx2.zzbqy, 0, copyOf2, zzwx.count, zzwx2.count);
        return new zzwx(i, copyOf, copyOf2, true);
    }

    public static zzwx zztg() {
        return zzbsm;
    }

    public static zzwx zzth() {
        return new zzwx();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzwx)) {
            return false;
        }
        zzwx zzwx = (zzwx) obj;
        int i = this.count;
        if (i == zzwx.count) {
            int[] iArr = this.zzbsn;
            int[] iArr2 = zzwx.zzbsn;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.zzbqy;
                Object[] objArr2 = zzwx.zzbqy;
                int i3 = this.count;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzbsn;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzbqy;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzb(zzxr zzxr) throws IOException {
        if (this.count != 0) {
            if (zzxr.zzqh() == zzue.zzf.zzboz) {
                for (int i = 0; i < this.count; i++) {
                    zzb(this.zzbsn[i], this.zzbqy[i], zzxr);
                }
                return;
            }
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                zzb(this.zzbsn[i2], this.zzbqy[i2], zzxr);
            }
        }
    }

    public final void zzpt() {
        this.zzbkd = false;
    }

    public final int zzqy() {
        int i;
        int i2 = this.zzboi;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            int i5 = this.zzbsn[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zztl.zze(i6, ((Long) this.zzbqy[i4]).longValue());
            } else if (i7 == 1) {
                i = zztl.zzg(i6, ((Long) this.zzbqy[i4]).longValue());
            } else if (i7 == 2) {
                i = zztl.zzc(i6, (zzsw) this.zzbqy[i4]);
            } else if (i7 == 3) {
                i = (zztl.zzcu(i6) << 1) + ((zzwx) this.zzbqy[i4]).zzqy();
            } else if (i7 == 5) {
                i = zztl.zzo(i6, ((Integer) this.zzbqy[i4]).intValue());
            } else {
                throw new IllegalStateException(zzuo.zzrp());
            }
            i3 += i;
        }
        this.zzboi = i3;
        return i3;
    }

    public final int zzti() {
        int i = this.zzboi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zztl.zzd(this.zzbsn[i3] >>> 3, (zzsw) this.zzbqy[i3]);
        }
        this.zzboi = i2;
        return i2;
    }

    public zzwx(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzboi = -1;
        this.count = i;
        this.zzbsn = iArr;
        this.zzbqy = objArr;
        this.zzbkd = z;
    }

    public static void zzb(int i, Object obj, zzxr zzxr) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzxr.zzi(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzxr.zzc(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzxr.zza(i2, (zzsw) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzxr.zzk(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzuo.zzrp());
        } else if (zzxr.zzqh() == zzue.zzf.zzboz) {
            zzxr.zzde(i2);
            ((zzwx) obj).zzb(zzxr);
            zzxr.zzdf(i2);
        } else {
            zzxr.zzdf(i2);
            ((zzwx) obj).zzb(zzxr);
            zzxr.zzde(i2);
        }
    }

    public final void zza(zzxr zzxr) throws IOException {
        if (zzxr.zzqh() == zzue.zzf.zzbpa) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzxr.zza(this.zzbsn[i] >>> 3, this.zzbqy[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzxr.zza(this.zzbsn[i2] >>> 3, this.zzbqy[i2]);
        }
    }

    public final void zzb(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzvr.zza(sb, i, String.valueOf(this.zzbsn[i2] >>> 3), this.zzbqy[i2]);
        }
    }

    public final void zzb(int i, Object obj) {
        if (this.zzbkd) {
            int i2 = this.count;
            if (i2 == this.zzbsn.length) {
                int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
                this.zzbsn = Arrays.copyOf(this.zzbsn, i3);
                this.zzbqy = Arrays.copyOf(this.zzbqy, i3);
            }
            int[] iArr = this.zzbsn;
            int i4 = this.count;
            iArr[i4] = i;
            this.zzbqy[i4] = obj;
            this.count = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
