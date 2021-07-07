package com.google.android.gms.internal.vision;

import com.p118pd.sdk.O0O00O;
import java.io.IOException;
import java.util.Arrays;

public final class zzfb extends zzez {
    public final byte[] buffer;
    public int limit;
    public int pos;
    public final boolean zzsk;
    public int zzsl;
    public int zzsm;
    public int zzsn;
    public int zzso;

    public zzfb(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzso = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzsm = i;
        this.zzsk = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzdt() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfb.zzdt():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long zzdu() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfb.zzdu():long");
    }

    private final int zzdv() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzgf.zzfh();
    }

    private final long zzdw() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzgf.zzfh();
    }

    private final void zzdx() {
        int i = this.limit + this.zzsl;
        this.limit = i;
        int i2 = i - this.zzsm;
        int i3 = this.zzso;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzsl = i4;
            this.limit = i - i4;
            return;
        }
        this.zzsl = 0;
    }

    private final byte zzdy() throws IOException {
        int i = this.pos;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }
        throw zzgf.zzfh();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzdw());
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzdv());
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final String readString() throws IOException {
        int zzdt = zzdt();
        if (zzdt > 0 && zzdt <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzdt, zzga.UTF_8);
            this.pos += zzdt;
            return str;
        } else if (zzdt == 0) {
            return "";
        } else {
            if (zzdt < 0) {
                throw zzgf.zzfi();
            }
            throw zzgf.zzfh();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final <T extends zzhf> T zza(zzhq<T> zzhq, zzfk zzfk) throws IOException {
        int zzdt = zzdt();
        if (this.zzsf < this.zzsg) {
            int zzan = zzan(zzdt);
            this.zzsf++;
            T zza = zzhq.zza(this, zzfk);
            zzak(0);
            this.zzsf--;
            zzao(zzan);
            return zza;
        }
        throw zzgf.zzfn();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final void zzak(int i) throws zzgf {
        if (this.zzsn != i) {
            throw zzgf.zzfl();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final boolean zzal(int i) throws IOException {
        int zzdq;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzgf.zzfj();
            }
            while (i3 < 10) {
                if (zzdy() < 0) {
                    i3++;
                }
            }
            throw zzgf.zzfj();
            return true;
        } else if (i2 == 1) {
            zzap(8);
            return true;
        } else if (i2 == 2) {
            zzap(zzdt());
            return true;
        } else if (i2 == 3) {
            do {
                zzdq = zzdq();
                if (zzdq == 0) {
                    break;
                }
            } while (zzal(zzdq));
            zzak(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzap(4);
                return true;
            }
            throw zzgf.zzfm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzan(int i) throws zzgf {
        if (i >= 0) {
            int zzds = i + zzds();
            int i2 = this.zzso;
            if (zzds <= i2) {
                this.zzso = zzds;
                zzdx();
                return i2;
            }
            throw zzgf.zzfh();
        }
        throw zzgf.zzfi();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final void zzao(int i) {
        this.zzso = i;
        zzdx();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final void zzap(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzgf.zzfi();
        }
        throw zzgf.zzfh();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final boolean zzcm() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzcp() throws IOException {
        return zzdu();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzcq() throws IOException {
        return zzdu();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzcr() throws IOException {
        return zzdt();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzcs() throws IOException {
        return zzdw();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzct() throws IOException {
        return zzdv();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final boolean zzcu() throws IOException {
        return zzdu() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final String zzcv() throws IOException {
        int zzdt = zzdt();
        if (zzdt > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzdt <= i - i2) {
                String zzi = zziw.zzi(this.buffer, i2, zzdt);
                this.pos += zzdt;
                return zzi;
            }
        }
        if (zzdt == 0) {
            return "";
        }
        if (zzdt <= 0) {
            throw zzgf.zzfi();
        }
        throw zzgf.zzfh();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final zzeo zzcw() throws IOException {
        byte[] bArr;
        int zzdt = zzdt();
        if (zzdt > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzdt <= i - i2) {
                zzeo zzb = zzeo.zzb(this.buffer, i2, zzdt);
                this.pos += zzdt;
                return zzb;
            }
        }
        if (zzdt == 0) {
            return zzeo.zzrx;
        }
        if (zzdt > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzdt <= i3 - i4) {
                int i5 = zzdt + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzeo.zze(bArr);
            }
        }
        if (zzdt > 0) {
            throw zzgf.zzfh();
        } else if (zzdt == 0) {
            bArr = zzga.zzxn;
            return zzeo.zze(bArr);
        } else {
            throw zzgf.zzfi();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzcx() throws IOException {
        return zzdt();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzcy() throws IOException {
        return zzdt();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzcz() throws IOException {
        return zzdv();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzda() throws IOException {
        return zzdw();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzdb() throws IOException {
        return zzez.zzaq(zzdt());
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzdc() throws IOException {
        return zzez.zzd(zzdu());
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzdq() throws IOException {
        if (zzcm()) {
            this.zzsn = 0;
            return 0;
        }
        int zzdt = zzdt();
        this.zzsn = zzdt;
        if ((zzdt >>> 3) != 0) {
            return zzdt;
        }
        throw zzgf.zzfk();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzdr() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzdy = zzdy();
            j |= ((long) (zzdy & O0O00O.OooO0O0)) << i;
            if ((zzdy & O0O00O.OooO00o) == 0) {
                return j;
            }
        }
        throw zzgf.zzfj();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzds() {
        return this.pos - this.zzsm;
    }
}
