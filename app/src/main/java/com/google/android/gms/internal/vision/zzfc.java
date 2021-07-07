package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class zzfc implements zzhv {
    public int tag;
    public int zzru;
    public final zzez zzsp;
    public int zzsq = 0;

    public zzfc(zzez zzez) {
        zzez zzez2 = (zzez) zzga.zza((Object) zzez, "input");
        this.zzsp = zzez2;
        zzez2.zzsi = this;
    }

    public static zzfc zza(zzez zzez) {
        zzfc zzfc = zzez.zzsi;
        if (zzfc != null) {
            return zzfc;
        }
        return new zzfc(zzez);
    }

    private final void zzab(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzgf.zzfm();
        }
    }

    public static void zzac(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzgf.zzfo();
        }
    }

    public static void zzad(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzgf.zzfo();
        }
    }

    private final void zzae(int i) throws IOException {
        if (this.zzsp.zzds() != i) {
            throw zzgf.zzfh();
        }
    }

    private final <T> T zzd(zzhw<T> zzhw, zzfk zzfk) throws IOException {
        int i = this.zzru;
        this.zzru = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzhw.newInstance();
            zzhw.zza(newInstance, this, zzfk);
            zzhw.zze(newInstance);
            if (this.tag == this.zzru) {
                return newInstance;
            }
            throw zzgf.zzfo();
        } finally {
            this.zzru = i;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final double readDouble() throws IOException {
        zzab(1);
        return this.zzsp.readDouble();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final float readFloat() throws IOException {
        zzab(5);
        return this.zzsp.readFloat();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final String readString() throws IOException {
        zzab(2);
        return this.zzsp.readString();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zzb(Class<T> cls, zzfk zzfk) throws IOException {
        zzab(3);
        return (T) zzd(zzhs.zzgl().zzf(cls), zzfk);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zzc(zzhw<T> zzhw, zzfk zzfk) throws IOException {
        zzab(3);
        return (T) zzd(zzhw, zzfk);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcn() throws IOException {
        int i = this.zzsq;
        if (i != 0) {
            this.tag = i;
            this.zzsq = 0;
        } else {
            this.tag = this.zzsp.zzdq();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zzru) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final boolean zzco() throws IOException {
        int i;
        if (this.zzsp.zzcm() || (i = this.tag) == this.zzru) {
            return false;
        }
        return this.zzsp.zzal(i);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcp() throws IOException {
        zzab(0);
        return this.zzsp.zzcp();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcq() throws IOException {
        zzab(0);
        return this.zzsp.zzcq();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcr() throws IOException {
        zzab(0);
        return this.zzsp.zzcr();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzcs() throws IOException {
        zzab(1);
        return this.zzsp.zzcs();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzct() throws IOException {
        zzab(5);
        return this.zzsp.zzct();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final boolean zzcu() throws IOException {
        zzab(0);
        return this.zzsp.zzcu();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final String zzcv() throws IOException {
        zzab(2);
        return this.zzsp.zzcv();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final zzeo zzcw() throws IOException {
        zzab(2);
        return this.zzsp.zzcw();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcx() throws IOException {
        zzab(0);
        return this.zzsp.zzcx();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcy() throws IOException {
        zzab(0);
        return this.zzsp.zzcy();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzcz() throws IOException {
        zzab(5);
        return this.zzsp.zzcz();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzda() throws IOException {
        zzab(1);
        return this.zzsp.zzda();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzdb() throws IOException {
        zzab(0);
        return this.zzsp.zzdb();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final long zzdc() throws IOException {
        zzab(0);
        return this.zzsp.zzdc();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zze(List<Integer> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(this.zzsp.zzcr());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfz.zzbg(this.zzsp.zzcr());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzsp.zzcr()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    list.add(Integer.valueOf(this.zzsp.zzcr()));
                } while (this.zzsp.zzds() < zzds2);
                zzae(zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzf(List<Long> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzgt.zzp(this.zzsp.zzcs());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzcx = this.zzsp.zzcx();
                zzac(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzgt.zzp(this.zzsp.zzcs());
                } while (this.zzsp.zzds() < zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zzsp.zzcs()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzcx2 = this.zzsp.zzcx();
                zzac(zzcx2);
                int zzds2 = this.zzsp.zzds() + zzcx2;
                do {
                    list.add(Long.valueOf(this.zzsp.zzcs()));
                } while (this.zzsp.zzds() < zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzg(List<Integer> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzcx = this.zzsp.zzcx();
                zzad(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzfz.zzbg(this.zzsp.zzct());
                } while (this.zzsp.zzds() < zzds);
            } else if (i == 5) {
                do {
                    zzfz.zzbg(this.zzsp.zzct());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzcx2 = this.zzsp.zzcx();
                zzad(zzcx2);
                int zzds2 = this.zzsp.zzds() + zzcx2;
                do {
                    list.add(Integer.valueOf(this.zzsp.zzct()));
                } while (this.zzsp.zzds() < zzds2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzsp.zzct()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzh(List<Boolean> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzem) {
            zzem zzem = (zzem) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzem.addBoolean(this.zzsp.zzcu());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzem.addBoolean(this.zzsp.zzcu());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zzsp.zzcu()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    list.add(Boolean.valueOf(this.zzsp.zzcu()));
                } while (this.zzsp.zzds() < zzds2);
                zzae(zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzi(List<String> list) throws IOException {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzj(List<zzeo> list) throws IOException {
        int zzdq;
        if ((this.tag & 7) == 2) {
            do {
                list.add(zzcw());
                if (!this.zzsp.zzcm()) {
                    zzdq = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzk(List<Integer> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(this.zzsp.zzcx());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfz.zzbg(this.zzsp.zzcx());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzsp.zzcx()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    list.add(Integer.valueOf(this.zzsp.zzcx()));
                } while (this.zzsp.zzds() < zzds2);
                zzae(zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzl(List<Integer> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(this.zzsp.zzcy());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfz.zzbg(this.zzsp.zzcy());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzsp.zzcy()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    list.add(Integer.valueOf(this.zzsp.zzcy()));
                } while (this.zzsp.zzds() < zzds2);
                zzae(zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzm(List<Integer> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzcx = this.zzsp.zzcx();
                zzad(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzfz.zzbg(this.zzsp.zzcz());
                } while (this.zzsp.zzds() < zzds);
            } else if (i == 5) {
                do {
                    zzfz.zzbg(this.zzsp.zzcz());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzcx2 = this.zzsp.zzcx();
                zzad(zzcx2);
                int zzds2 = this.zzsp.zzds() + zzcx2;
                do {
                    list.add(Integer.valueOf(this.zzsp.zzcz()));
                } while (this.zzsp.zzds() < zzds2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzsp.zzcz()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzn(List<Long> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzgt.zzp(this.zzsp.zzda());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzcx = this.zzsp.zzcx();
                zzac(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzgt.zzp(this.zzsp.zzda());
                } while (this.zzsp.zzds() < zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zzsp.zzda()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzcx2 = this.zzsp.zzcx();
                zzac(zzcx2);
                int zzds2 = this.zzsp.zzds() + zzcx2;
                do {
                    list.add(Long.valueOf(this.zzsp.zzda()));
                } while (this.zzsp.zzds() < zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzo(List<Integer> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(this.zzsp.zzdb());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfz.zzbg(this.zzsp.zzdb());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzsp.zzdb()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    list.add(Integer.valueOf(this.zzsp.zzdb()));
                } while (this.zzsp.zzds() < zzds2);
                zzae(zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzp(List<Long> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(this.zzsp.zzdc());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgt.zzp(this.zzsp.zzdc());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzsp.zzdc()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    list.add(Long.valueOf(this.zzsp.zzdc()));
                } while (this.zzsp.zzds() < zzds2);
                zzae(zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    private final <T> T zzb(zzhw<T> zzhw, zzfk zzfk) throws IOException {
        int zzcx = this.zzsp.zzcx();
        zzez zzez = this.zzsp;
        if (zzez.zzsf < zzez.zzsg) {
            int zzan = zzez.zzan(zzcx);
            T newInstance = zzhw.newInstance();
            this.zzsp.zzsf++;
            zzhw.zza(newInstance, this, zzfk);
            zzhw.zze(newInstance);
            this.zzsp.zzak(0);
            zzez zzez2 = this.zzsp;
            zzez2.zzsf--;
            zzez2.zzao(zzan);
            return newInstance;
        }
        throw zzgf.zzfn();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zza(Class<T> cls, zzfk zzfk) throws IOException {
        zzab(2);
        return (T) zzb(zzhs.zzgl().zzf(cls), zzfk);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzc(List<Long> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(this.zzsp.zzcp());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgt.zzp(this.zzsp.zzcp());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzsp.zzcp()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    list.add(Long.valueOf(this.zzsp.zzcp()));
                } while (this.zzsp.zzds() < zzds2);
                zzae(zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> T zza(zzhw<T> zzhw, zzfk zzfk) throws IOException {
        zzab(2);
        return (T) zzb(zzhw, zzfk);
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zza(List<Double> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfh) {
            zzfh zzfh = (zzfh) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzfh.zzc(this.zzsp.readDouble());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzcx = this.zzsp.zzcx();
                zzac(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzfh.zzc(this.zzsp.readDouble());
                } while (this.zzsp.zzds() < zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.zzsp.readDouble()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzcx2 = this.zzsp.zzcx();
                zzac(zzcx2);
                int zzds2 = this.zzsp.zzds() + zzcx2;
                do {
                    list.add(Double.valueOf(this.zzsp.readDouble()));
                } while (this.zzsp.zzds() < zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzd(List<Long> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(this.zzsp.zzcq());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else if (i == 2) {
                int zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgt.zzp(this.zzsp.zzcq());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzsp.zzcq()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else if (i2 == 2) {
                int zzds2 = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    list.add(Long.valueOf(this.zzsp.zzcq()));
                } while (this.zzsp.zzds() < zzds2);
                zzae(zzds2);
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final void zzb(List<Float> list) throws IOException {
        int zzdq;
        int zzdq2;
        if (list instanceof zzfv) {
            zzfv zzfv = (zzfv) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzcx = this.zzsp.zzcx();
                zzad(zzcx);
                int zzds = this.zzsp.zzds() + zzcx;
                do {
                    zzfv.zzh(this.zzsp.readFloat());
                } while (this.zzsp.zzds() < zzds);
            } else if (i == 5) {
                do {
                    zzfv.zzh(this.zzsp.readFloat());
                    if (!this.zzsp.zzcm()) {
                        zzdq2 = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq2 == this.tag);
                this.zzsq = zzdq2;
            } else {
                throw zzgf.zzfm();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzcx2 = this.zzsp.zzcx();
                zzad(zzcx2);
                int zzds2 = this.zzsp.zzds() + zzcx2;
                do {
                    list.add(Float.valueOf(this.zzsp.readFloat()));
                } while (this.zzsp.zzds() < zzds2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.zzsp.readFloat()));
                    if (!this.zzsp.zzcm()) {
                        zzdq = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (zzdq == this.tag);
                this.zzsq = zzdq;
            } else {
                throw zzgf.zzfm();
            }
        }
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzdq;
        int zzdq2;
        if ((this.tag & 7) != 2) {
            throw zzgf.zzfm();
        } else if (!(list instanceof zzgo) || z) {
            do {
                list.add(z ? zzcv() : readString());
                if (!this.zzsp.zzcm()) {
                    zzdq = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else {
            zzgo zzgo = (zzgo) list;
            do {
                zzgo.zzc(zzcw());
                if (!this.zzsp.zzcm()) {
                    zzdq2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq2 == this.tag);
            this.zzsq = zzdq2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> void zzb(List<T> list, zzhw<T> zzhw, zzfk zzfk) throws IOException {
        int zzdq;
        int i = this.tag;
        if ((i & 7) == 3) {
            do {
                list.add(zzd(zzhw, zzfk));
                if (!this.zzsp.zzcm() && this.zzsq == 0) {
                    zzdq = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq == i);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    public final <T> void zza(List<T> list, zzhw<T> zzhw, zzfk zzfk) throws IOException {
        int zzdq;
        int i = this.tag;
        if ((i & 7) == 2) {
            do {
                list.add(zzb(zzhw, zzfk));
                if (!this.zzsp.zzcm() && this.zzsq == 0) {
                    zzdq = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq == i);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhv
    public final <K, V> void zza(Map<K, V> map, zzgy<K, V> zzgy, zzfk zzfk) throws IOException {
        zzab(2);
        int zzan = this.zzsp.zzan(this.zzsp.zzcx());
        Object obj = zzgy.zzyw;
        Object obj2 = zzgy.zzgq;
        while (true) {
            try {
                int zzcn = zzcn();
                if (zzcn == Integer.MAX_VALUE || this.zzsp.zzcm()) {
                    map.put(obj, obj2);
                } else if (zzcn == 1) {
                    obj = zza(zzgy.zzyv, (Class<?>) null, (zzfk) null);
                } else if (zzcn != 2) {
                    try {
                        if (!zzco()) {
                            throw new zzgf("Unable to parse map entry.");
                        }
                    } catch (zzgg unused) {
                        if (!zzco()) {
                            throw new zzgf("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = zza(zzgy.zzyx, zzgy.zzgq.getClass(), zzfk);
                }
            } finally {
                this.zzsp.zzao(zzan);
            }
        }
        map.put(obj, obj2);
    }

    private final Object zza(zzjd zzjd, Class<?> cls, zzfk zzfk) throws IOException {
        switch (zzfd.zzrr[zzjd.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzcu());
            case 2:
                return zzcw();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzcy());
            case 5:
                return Integer.valueOf(zzct());
            case 6:
                return Long.valueOf(zzcs());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzcr());
            case 9:
                return Long.valueOf(zzcq());
            case 10:
                return zza(cls, zzfk);
            case 11:
                return Integer.valueOf(zzcz());
            case 12:
                return Long.valueOf(zzda());
            case 13:
                return Integer.valueOf(zzdb());
            case 14:
                return Long.valueOf(zzdc());
            case 15:
                return zzcv();
            case 16:
                return Integer.valueOf(zzcx());
            case 17:
                return Long.valueOf(zzcp());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }
}
