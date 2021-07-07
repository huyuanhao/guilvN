package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

public final class zzcz {

    public static final class zza extends zzfy<zza, C4901zza> implements zzhh {
        public static volatile zzhq<zza> zzbf;
        public static final zza zzma;
        public int zzbg;
        public int zzlx = 1;
        public int zzly = 1;
        public String zzlz = "";

        /* renamed from: com.google.android.gms.internal.vision.zzcz$zza$zza  reason: collision with other inner class name */
        public static final class C4901zza extends zzfy.zza<zza, C4901zza> implements zzhh {
            public C4901zza() {
                super(zza.zzma);
            }

            public /* synthetic */ C4901zza(zzda zzda) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzma = zza;
            zzfy.zza(zza.class, zza);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C4901zza(null);
                case 3:
                    return zzfy.zza(zzma, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\b\u0002", new Object[]{"zzbg", "zzlx", zzdv.zzah(), "zzly", zzdy.zzah(), "zzlz"});
                case 4:
                    return zzma;
                case 5:
                    zzhq<zza> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zza.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzma);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzb extends zzfy<zzb, zza> implements zzhh {
        public static volatile zzhq<zzb> zzbf;
        public static final zzb zzmc;
        public zzge<zzh> zzmb = zzfy.zzey();

        public static final class zza extends zzfy.zza<zzb, zza> implements zzhh {
            public zza() {
                super(zzb.zzmc);
            }

            public /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzmc = zzb;
            zzfy.zza(zzb.class, zzb);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzmc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzmb", zzh.class});
                case 4:
                    return zzmc;
                case 5:
                    zzhq<zzb> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzb.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzmc);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzc extends zzfy<zzc, zza> implements zzhh {
        public static volatile zzhq<zzc> zzbf;
        public static final zzc zzmk;
        public int zzbg;
        public String zzmd = "";
        public boolean zzme;
        public int zzmf;
        public long zzmg;
        public long zzmh;
        public long zzmi;
        public String zzmj = "";

        public static final class zza extends zzfy.zza<zzc, zza> implements zzhh {
            public zza() {
                super(zzc.zzmk);
            }

            public /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        public enum zzb implements zzgb {
            REASON_UNKNOWN(0),
            REASON_MISSING(1),
            REASON_UPGRADE(2),
            REASON_INVALID(3);
            
            public static final zzgc<zzb> zzdv = new zzdb();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzgd zzah() {
                return zzdc.zzhl;
            }

            public static zzb zzs(int i) {
                if (i == 0) {
                    return REASON_UNKNOWN;
                }
                if (i == 1) {
                    return REASON_MISSING;
                }
                if (i == 2) {
                    return REASON_UPGRADE;
                }
                if (i != 3) {
                    return null;
                }
                return REASON_INVALID;
            }

            @Override // com.google.android.gms.internal.vision.zzgb
            public final int zzr() {
                return this.value;
            }
        }

        static {
            zzc zzc = new zzc();
            zzmk = zzc;
            zzfy.zza(zzc.class, zzc);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzmk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\b\u0006", new Object[]{"zzbg", "zzmd", "zzme", "zzmf", zzb.zzah(), "zzmg", "zzmh", "zzmi", "zzmj"});
                case 4:
                    return zzmk;
                case 5:
                    zzhq<zzc> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzc.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzmk);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzd extends zzfy<zzd, zza> implements zzhh {
        public static volatile zzhq<zzd> zzbf;
        public static final zzd zzmy;
        public int zzbg;
        public String zzmq = "";
        public String zzmr = "";
        public zzge<String> zzms = zzfy.zzey();
        public int zzmt;
        public String zzmu = "";
        public long zzmv;
        public long zzmw;
        public zzge<zzi> zzmx = zzfy.zzey();

        public static final class zza extends zzfy.zza<zzd, zza> implements zzhh {
            public zza() {
                super(zzd.zzmy);
            }

            public /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        public enum zzb implements zzgb {
            RESULT_UNKNOWN(0),
            RESULT_SUCCESS(1),
            RESULT_FAIL(2),
            RESULT_SKIPPED(3);
            
            public static final zzgc<zzb> zzdv = new zzdd();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzgd zzah() {
                return zzde.zzhl;
            }

            public static zzb zzt(int i) {
                if (i == 0) {
                    return RESULT_UNKNOWN;
                }
                if (i == 1) {
                    return RESULT_SUCCESS;
                }
                if (i == 2) {
                    return RESULT_FAIL;
                }
                if (i != 3) {
                    return null;
                }
                return RESULT_SKIPPED;
            }

            @Override // com.google.android.gms.internal.vision.zzgb
            public final int zzr() {
                return this.value;
            }
        }

        static {
            zzd zzd = new zzd();
            zzmy = zzd;
            zzfy.zza(zzd.class, zzd);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzmy, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001a\u0004\f\u0002\u0005\b\u0003\u0006\u0002\u0004\u0007\u0002\u0005\b\u001b", new Object[]{"zzbg", "zzmq", "zzmr", "zzms", "zzmt", zzb.zzah(), "zzmu", "zzmv", "zzmw", "zzmx", zzi.class});
                case 4:
                    return zzmy;
                case 5:
                    zzhq<zzd> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzd.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzmy);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zze extends zzfy<zze, zza> implements zzhh {
        public static volatile zzhq<zze> zzbf;
        public static final zze zznk;
        public int zzbg;
        public float zzne;
        public float zznf;
        public float zzng;
        public float zznh;
        public float zzni;
        public float zznj;

        public static final class zza extends zzfy.zza<zze, zza> implements zzhh {
            public zza() {
                super(zze.zznk);
            }

            public /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        static {
            zze zze = new zze();
            zznk = zze;
            zzfy.zza(zze.class, zze);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zznk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0001\u0003\u0005\u0001\u0004\u0006\u0001\u0005", new Object[]{"zzbg", "zzne", "zznf", "zzng", "zznh", "zzni", "zznj"});
                case 4:
                    return zznk;
                case 5:
                    zzhq<zze> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zze.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zznk);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzf extends zzfy<zzf, zza> implements zzhh {
        public static volatile zzhq<zzf> zzbf;
        public static final zzf zzno;
        public int zzbg;
        public long zzhr;
        public int zzlx;
        public long zznl;
        public long zznm;
        public long zznn;

        public static final class zza extends zzfy.zza<zzf, zza> implements zzhh {
            public zza() {
                super(zzf.zzno);
            }

            public /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        public enum zzb implements zzgb {
            FORMAT_UNKNOWN(0),
            FORMAT_LUMINANCE(1),
            FORMAT_RGB8(2),
            FORMAT_MONOCHROME(3);
            
            public static final zzgc<zzb> zzdv = new zzdf();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzgd zzah() {
                return zzdg.zzhl;
            }

            public static zzb zzu(int i) {
                if (i == 0) {
                    return FORMAT_UNKNOWN;
                }
                if (i == 1) {
                    return FORMAT_LUMINANCE;
                }
                if (i == 2) {
                    return FORMAT_RGB8;
                }
                if (i != 3) {
                    return null;
                }
                return FORMAT_MONOCHROME;
            }

            @Override // com.google.android.gms.internal.vision.zzgb
            public final int zzr() {
                return this.value;
            }
        }

        static {
            zzf zzf = new zzf();
            zzno = zzf;
            zzfy.zza(zzf.class, zzf);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzno, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0004\u0005\u0002\u0003", new Object[]{"zzbg", "zzlx", zzb.zzah(), "zznl", "zznm", "zzhr", "zznn"});
                case 4:
                    return zzno;
                case 5:
                    zzhq<zzf> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzf.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzno);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzg extends zzfy<zzg, zza> implements zzhh {
        public static volatile zzhq<zzg> zzbf;
        public static final zzg zznu;
        public int zzbg;
        public long zzmv;
        public long zzmw;

        public static final class zza extends zzfy.zza<zzg, zza> implements zzhh {
            public zza() {
                super(zzg.zznu);
            }

            public /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        static {
            zzg zzg = new zzg();
            zznu = zzg;
            zzfy.zza(zzg.class, zzg);
        }

        public static zzhq<zzg> zzbx() {
            return (zzhq) zznu.zza(zzfy.zzg.zzxd, (Object) null, (Object) null);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zznu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001", new Object[]{"zzbg", "zzmv", "zzmw"});
                case 4:
                    return zznu;
                case 5:
                    zzhq<zzg> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzg.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zznu);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzh extends zzfy<zzh, zza> implements zzhh {
        public static volatile zzhq<zzh> zzbf;
        public static final zzh zznx;
        public int zzbg;
        public int zznv;
        public int zznw;

        public static final class zza extends zzfy.zza<zzh, zza> implements zzhh {
            public zza() {
                super(zzh.zznx);
            }

            public /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        static {
            zzh zzh = new zzh();
            zznx = zzh;
            zzfy.zza(zzh.class, zzh);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zznx, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzbg", "zznv", "zznw"});
                case 4:
                    return zznx;
                case 5:
                    zzhq<zzh> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzh.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zznx);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzi extends zzfy<zzi, zza> implements zzhh {
        public static volatile zzhq<zzi> zzbf;
        public static final zzi zzoc;
        public int zzbg;
        public zzb zzny;
        public int zznz;
        public zze zzoa;
        public zza zzob;

        public static final class zza extends zzfy.zza<zzi, zza> implements zzhh {
            public zza() {
                super(zzi.zzoc);
            }

            public /* synthetic */ zza(zzda zzda) {
                this();
            }
        }

        static {
            zzi zzi = new zzi();
            zzoc = zzi;
            zzfy.zza(zzi.class, zzi);
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzda.zzbc[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzoc, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\u0004\u0001\u0010\t\u0002\u0011\t\u0003", new Object[]{"zzbg", "zzny", "zznz", "zzoa", "zzob"});
                case 4:
                    return zzoc;
                case 5:
                    zzhq<zzi> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzi.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzoc);
                                zzbf = zzhq;
                            }
                        }
                    }
                    return zzhq;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
