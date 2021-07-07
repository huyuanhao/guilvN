package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

public final class zzkf extends zzfy<zzkf, zza> implements zzhh {
    public static final zzkf zzahj;
    public static volatile zzhq<zzkf> zzbf;
    public zzge<zzjx> zzahi = zzfy.zzey();
    public byte zzkc = 2;

    public static final class zza extends zzfy.zza<zzkf, zza> implements zzhh {
        public zza() {
            super(zzkf.zzahj);
        }

        public /* synthetic */ zza(zzkg zzkg) {
            this();
        }
    }

    static {
        zzkf zzkf = new zzkf();
        zzahj = zzkf;
        zzfy.zza(zzkf.class, zzkf);
    }

    public static zzkf zziq() {
        return zzahj;
    }

    @Override // com.google.android.gms.internal.vision.zzfy
    public final Object zza(int i, Object obj, Object obj2) {
        int i2 = 1;
        switch (zzkg.zzbc[i - 1]) {
            case 1:
                return new zzkf();
            case 2:
                return new zza(null);
            case 3:
                return zzfy.zza(zzahj, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzahi", zzjx.class});
            case 4:
                return zzahj;
            case 5:
                zzhq<zzkf> zzhq = zzbf;
                if (zzhq == null) {
                    synchronized (zzkf.class) {
                        zzhq = zzbf;
                        if (zzhq == null) {
                            zzhq = new zzfy.zzb<>(zzahj);
                            zzbf = zzhq;
                        }
                    }
                }
                return zzhq;
            case 6:
                return Byte.valueOf(this.zzkc);
            case 7:
                if (obj == null) {
                    i2 = 0;
                }
                this.zzkc = (byte) i2;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzjx zzcc(int i) {
        return this.zzahi.get(i);
    }

    public final int zzip() {
        return this.zzahi.size();
    }
}
