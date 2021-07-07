package com.google.android.gms.internal.vision;

import com.p118pd.sdk.C8026oOO00oOo;
import com.p118pd.sdk.O0O00O;
import com.umeng.commonsdk.proguard.C3587az;
import java.io.IOException;

public final class zzjk {
    public final byte[] buffer;
    public final int zzacz;
    public final int zzada;
    public int zzadb;
    public int zzadc;
    public zzez zzadd;
    public int zzsf;
    public int zzsg = 64;
    public int zzsh = 67108864;
    public int zzsl;
    public int zzsn;
    public int zzso = Integer.MAX_VALUE;

    public zzjk(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzacz = i;
        int i3 = i2 + i;
        this.zzadb = i3;
        this.zzada = i3;
        this.zzadc = i;
    }

    private final void zzap(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzadc;
            int i3 = i2 + i;
            int i4 = this.zzso;
            if (i3 > i4) {
                zzap(i4 - i2);
                throw zzjs.zzht();
            } else if (i <= this.zzadb - i2) {
                this.zzadc = i2 + i;
            } else {
                throw zzjs.zzht();
            }
        } else {
            throw zzjs.zzhu();
        }
    }

    private final void zzdx() {
        int i = this.zzadb + this.zzsl;
        this.zzadb = i;
        int i2 = this.zzso;
        if (i > i2) {
            int i3 = i - i2;
            this.zzsl = i3;
            this.zzadb = i - i3;
            return;
        }
        this.zzsl = 0;
    }

    private final byte zzdy() throws IOException {
        int i = this.zzadc;
        if (i != this.zzadb) {
            byte[] bArr = this.buffer;
            this.zzadc = i + 1;
            return bArr[i];
        }
        throw zzjs.zzht();
    }

    public static zzjk zzk(byte[] bArr, int i, int i2) {
        return new zzjk(bArr, 0, i2);
    }

    public final int getPosition() {
        return this.zzadc - this.zzacz;
    }

    public final String readString() throws IOException {
        int zzdt = zzdt();
        if (zzdt < 0) {
            throw zzjs.zzhu();
        } else if (zzdt <= this.zzadb - this.zzadc) {
            String str = new String(this.buffer, this.zzadc, zzdt, zzjr.UTF_8);
            this.zzadc += zzdt;
            return str;
        } else {
            throw zzjs.zzht();
        }
    }

    public final void zza(zzjt zzjt) throws IOException {
        int zzdt = zzdt();
        if (this.zzsf < this.zzsg) {
            int zzan = zzan(zzdt);
            this.zzsf++;
            zzjt.zza(this);
            zzak(0);
            this.zzsf--;
            zzao(zzan);
            return;
        }
        throw new zzjs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void zzak(int i) throws zzjs {
        if (this.zzsn != i) {
            throw new zzjs("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzal(int i) throws IOException {
        int zzdq;
        int i2 = i & 7;
        if (i2 == 0) {
            zzdt();
            return true;
        } else if (i2 == 1) {
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
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
                zzdv();
                return true;
            }
            throw new zzjs("Protocol message tag had invalid wire type.");
        }
    }

    public final int zzan(int i) throws zzjs {
        if (i >= 0) {
            int i2 = i + this.zzadc;
            int i3 = this.zzso;
            if (i2 <= i3) {
                this.zzso = i2;
                zzdx();
                return i3;
            }
            throw zzjs.zzht();
        }
        throw zzjs.zzhu();
    }

    public final void zzao(int i) {
        this.zzso = i;
        zzdx();
    }

    public final void zzbt(int i) {
        zzw(i, this.zzsn);
    }

    public final boolean zzcu() throws IOException {
        return zzdt() != 0;
    }

    public final int zzdq() throws IOException {
        if (this.zzadc == this.zzadb) {
            this.zzsn = 0;
            return 0;
        }
        int zzdt = zzdt();
        this.zzsn = zzdt;
        if (zzdt != 0) {
            return zzdt;
        }
        throw new zzjs("Protocol message contained an invalid tag (zero).");
    }

    public final int zzdt() throws IOException {
        int i;
        byte zzdy = zzdy();
        if (zzdy >= 0) {
            return zzdy;
        }
        int i2 = zzdy & O0O00O.OooO0O0;
        byte zzdy2 = zzdy();
        if (zzdy2 >= 0) {
            i = zzdy2 << 7;
        } else {
            i2 |= (zzdy2 & O0O00O.OooO0O0) << 7;
            byte zzdy3 = zzdy();
            if (zzdy3 >= 0) {
                i = zzdy3 << C3587az.f9268l;
            } else {
                i2 |= (zzdy3 & O0O00O.OooO0O0) << 14;
                byte zzdy4 = zzdy();
                if (zzdy4 >= 0) {
                    i = zzdy4 << 21;
                } else {
                    int i3 = i2 | ((zzdy4 & O0O00O.OooO0O0) << 21);
                    byte zzdy5 = zzdy();
                    int i4 = i3 | (zzdy5 << C8026oOO00oOo.OooO00o);
                    if (zzdy5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (zzdy() >= 0) {
                            return i4;
                        }
                    }
                    throw zzjs.zzhv();
                }
            }
        }
        return i2 | i;
    }

    public final long zzdu() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzdy = zzdy();
            j |= ((long) (zzdy & O0O00O.OooO0O0)) << i;
            if ((zzdy & O0O00O.OooO00o) == 0) {
                return j;
            }
        }
        throw zzjs.zzhv();
    }

    public final int zzdv() throws IOException {
        return (zzdy() & 255) | ((zzdy() & 255) << 8) | ((zzdy() & 255) << 16) | ((zzdy() & 255) << 24);
    }

    public final int zzhq() {
        int i = this.zzso;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzadc;
    }

    public final byte[] zzv(int i, int i2) {
        if (i2 == 0) {
            return zzjw.zzaea;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzacz + i, bArr, 0, i2);
        return bArr;
    }

    public final void zzw(int i, int i2) {
        int i3 = this.zzadc;
        int i4 = this.zzacz;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.zzadc - this.zzacz);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.zzadc = i4 + i;
            this.zzsn = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final <T extends zzfy<T, ?>> T zza(zzhq<T> zzhq) throws IOException {
        try {
            if (this.zzadd == null) {
                this.zzadd = zzez.zze(this.buffer, this.zzacz, this.zzada);
            }
            int zzds = this.zzadd.zzds();
            int i = this.zzadc - this.zzacz;
            if (zzds <= i) {
                this.zzadd.zzap(i - zzds);
                this.zzadd.zzam(this.zzsg - this.zzsf);
                T t = (T) ((zzfy) this.zzadd.zza(zzhq, zzfk.zzel()));
                zzal(this.zzsn);
                return t;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(zzds), Integer.valueOf(i)));
        } catch (zzgf e) {
            throw new zzjs("", e);
        }
    }
}
