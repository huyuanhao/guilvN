package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

public final class zzbo extends zzfy<zzbo, zza> implements zzhh {
    public static volatile zzhq<zzbo> zzbf;
    public static final zzbo zzhs;
    public int zzbg;
    public int zzhm;
    public int zzhn;
    public int zzho;
    public int zzhp;
    public boolean zzhq;
    public long zzhr;

    public static final class zza extends zzfy.zza<zzbo, zza> implements zzhh {
        public zza() {
            super(zzbo.zzhs);
        }

        public final zza zzb(zzbl zzbl) {
            zzfc();
            ((zzbo) this.zzwn).zza((zzbo) zzbl);
            return this;
        }

        public final zza zzc(long j) {
            zzfc();
            ((zzbo) this.zzwn).zzb((zzbo) j);
            return this;
        }

        public final zza zzi(int i) {
            zzfc();
            ((zzbo) this.zzwn).setWidth(i);
            return this;
        }

        public final zza zzj(int i) {
            zzfc();
            ((zzbo) this.zzwn).setHeight(i);
            return this;
        }

        public /* synthetic */ zza(zzbp zzbp) {
            this();
        }

        public final zza zzb(zzbq zzbq) {
            zzfc();
            ((zzbo) this.zzwn).zza((zzbo) zzbq);
            return this;
        }
    }

    static {
        zzbo zzbo = new zzbo();
        zzhs = zzbo;
        zzfy.zza(zzbo.class, zzbo);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setHeight(int i) {
        this.zzbg |= 2;
        this.zzhn = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setWidth(int i) {
        this.zzbg |= 1;
        this.zzhm = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void zza(zzbl zzbl) {
        if (zzbl != null) {
            this.zzbg |= 4;
            this.zzho = zzbl.zzr();
            return;
        }
        throw null;
    }

    public static zza zzai() {
        return (zza) ((zzfy.zza) zzhs.zza(zzfy.zzg.zzxb, (Object) null, (Object) null));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void zzb(long j) {
        this.zzbg |= 32;
        this.zzhr = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void zza(zzbq zzbq) {
        if (zzbq != null) {
            this.zzbg |= 8;
            this.zzhp = zzbq.zzr();
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.zzfy
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbp.zzbc[i - 1]) {
            case 1:
                return new zzbo();
            case 2:
                return new zza(null);
            case 3:
                return zzfy.zza(zzhs, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\f\u0003\u0005\u0007\u0004\u0006\u0002\u0005", new Object[]{"zzbg", "zzhm", "zzhn", "zzho", zzbl.zzah(), "zzhp", zzbq.zzah(), "zzhq", "zzhr"});
            case 4:
                return zzhs;
            case 5:
                zzhq<zzbo> zzhq2 = zzbf;
                if (zzhq2 == null) {
                    synchronized (zzbo.class) {
                        zzhq2 = zzbf;
                        if (zzhq2 == null) {
                            zzhq2 = new zzfy.zzb<>(zzhs);
                            zzbf = zzhq2;
                        }
                    }
                }
                return zzhq2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
