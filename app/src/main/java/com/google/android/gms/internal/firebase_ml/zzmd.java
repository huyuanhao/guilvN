package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzqs;
import com.google.android.gms.internal.firebase_ml.zzue;

public final class zzmd {

    public static final class zza extends zzue<zza, C4894zza> implements zzvq {
        public static final zza zzadz;
        public static volatile zzvz<zza> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzmd$zza$zza  reason: collision with other inner class name */
        public static final class C4894zza extends zzue.zza<zza, C4894zza> implements zzvq {
            public C4894zza() {
                super(zza.zzadz);
            }

            public /* synthetic */ C4894zza(zzme zzme) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzadz = zza;
            zzue.zza(zza.class, zza);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C4894zza(null);
                case 3:
                    return zzue.zza(zzadz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzadz;
                case 5:
                    zzvz<zza> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zza.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzadz);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzac extends zzue<zzac, zza> implements zzvq {
        public static final zzac zzaoy;
        public static volatile zzvz<zzac> zzbm;
        public String zzaoq = "";
        public String zzaor = "";
        public String zzaos = "";
        public String zzaot = "";
        public String zzaou = "";
        public String zzaov = "";
        public String zzaow = "";
        public zzun<String> zzaox = zzue.zzrb();
        public int zzbg;

        public static final class zza extends zzue.zza<zzac, zza> implements zzvq {
            public zza() {
                super(zzac.zzaoy);
            }

            public final zza zzbq(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbj(str);
                return this;
            }

            public final zza zzbr(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbk(str);
                return this;
            }

            public final zza zzbs(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbl(str);
                return this;
            }

            public final zza zzbt(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbm(str);
                return this;
            }

            public final zza zzbu(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbn(str);
                return this;
            }

            public final zza zzbv(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbo(str);
                return this;
            }

            public final zza zzbw(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbp(str);
                return this;
            }

            public final zza zzn(Iterable<String> iterable) {
                zzrf();
                ((zzac) this.zzbol).zzm(iterable);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzac zzac = new zzac();
            zzaoy = zzac;
            zzue.zza(zzac.class, zzac);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbj(String str) {
            if (str != null) {
                this.zzbg |= 1;
                this.zzaoq = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbk(String str) {
            if (str != null) {
                this.zzbg |= 2;
                this.zzaor = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbl(String str) {
            if (str != null) {
                this.zzbg |= 4;
                this.zzaos = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbm(String str) {
            if (str != null) {
                this.zzbg |= 8;
                this.zzaot = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbn(String str) {
            if (str != null) {
                this.zzbg |= 16;
                this.zzaou = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbo(String str) {
            if (str != null) {
                this.zzbg |= 32;
                this.zzaov = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbp(String str) {
            if (str != null) {
                this.zzbg |= 64;
                this.zzaow = str;
                return;
            }
            throw null;
        }

        public static zza zzli() {
            return (zza) zzaoy.zzqx();
        }

        public static zzac zzlj() {
            return zzaoy;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzm(Iterable<String> iterable) {
            if (!this.zzaox.zzps()) {
                this.zzaox = zzue.zza(this.zzaox);
            }
            zzsn.zza(iterable, this.zzaox);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzac();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaoy, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\u001a", new Object[]{"zzbg", "zzaoq", "zzaor", "zzaos", "zzaot", "zzaou", "zzaov", "zzaow", "zzaox"});
                case 4:
                    return zzaoy;
                case 5:
                    zzvz<zzac> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzac.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaoy);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzlh() {
            return this.zzaou;
        }
    }

    public static final class zzb extends zzue<zzb, zza> implements zzvq {
        public static final zzb zzaeb;
        public static volatile zzvz<zzb> zzbm;
        public int zzaea;
        public int zzbg;
        public int zzqo;

        public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
            public zza() {
                super(zzb.zzaeb);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzmd$zzb$zzb  reason: collision with other inner class name */
        public enum EnumC4895zzb implements zzuh {
            UNKNOWN_MODEL_TYPE(0),
            STABLE_MODEL(1),
            LATEST_MODEL(2);
            
            public static final zzui<EnumC4895zzb> zzbe = new zzmf();
            public final int value;

            /* access modifiers changed from: public */
            EnumC4895zzb(int i) {
                this.value = i;
            }

            public static EnumC4895zzb zzam(int i) {
                if (i == 0) {
                    return UNKNOWN_MODEL_TYPE;
                }
                if (i == 1) {
                    return STABLE_MODEL;
                }
                if (i != 2) {
                    return null;
                }
                return LATEST_MODEL;
            }

            public static zzuj zzq() {
                return zzmg.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        static {
            zzb zzb = new zzb();
            zzaeb = zzb;
            zzue.zza(zzb.class, zzb);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaeb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001", new Object[]{"zzbg", "zzqo", "zzaea", EnumC4895zzb.zzq()});
                case 4:
                    return zzaeb;
                case 5:
                    zzvz<zzb> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzb.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaeb);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzc extends zzue<zzc, zza> implements zzvq {
        public static final zzc zzaeg;
        public static volatile zzvz<zzc> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzc, zza> implements zzvq {
            public zza() {
                super(zzc.zzaeg);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzc zzc = new zzc();
            zzaeg = zzc;
            zzue.zza(zzc.class, zzc);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaeg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaeg;
                case 5:
                    zzvz<zzc> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzc.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaeg);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzd extends zzue<zzd, zza> implements zzvq {
        public static final zzd zzaeh;
        public static volatile zzvz<zzd> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzd, zza> implements zzvq {
            public zza() {
                super(zzd.zzaeh);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzd zzd = new zzd();
            zzaeh = zzd;
            zzue.zza(zzd.class, zzd);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaeh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaeh;
                case 5:
                    zzvz<zzd> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzd.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaeh);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zze extends zzue<zze, zza> implements zzvq {
        public static final zze zzaei;
        public static volatile zzvz<zze> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zze, zza> implements zzvq {
            public zza() {
                super(zze.zzaei);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zze zze = new zze();
            zzaei = zze;
            zzue.zza(zze.class, zze);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaei, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaei;
                case 5:
                    zzvz<zze> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zze.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaei);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzf extends zzue<zzf, zza> implements zzvq {
        public static final zzf zzaej;
        public static volatile zzvz<zzf> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzf, zza> implements zzvq {
            public zza() {
                super(zzf.zzaej);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzf zzf = new zzf();
            zzaej = zzf;
            zzue.zza(zzf.class, zzf);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaej, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaej;
                case 5:
                    zzvz<zzf> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzf.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaej);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzg extends zzue<zzg, zza> implements zzvq {
        public static final zzg zzaek;
        public static volatile zzvz<zzg> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzg, zza> implements zzvq {
            public zza() {
                super(zzg.zzaek);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzg zzg = new zzg();
            zzaek = zzg;
            zzue.zza(zzg.class, zzg);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaek, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaek;
                case 5:
                    zzvz<zzg> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzg.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaek);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzh extends zzue<zzh, zza> implements zzvq {
        public static final zzh zzael;
        public static volatile zzvz<zzh> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzh, zza> implements zzvq {
            public zza() {
                super(zzh.zzael);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzh zzh = new zzh();
            zzael = zzh;
            zzue.zza(zzh.class, zzh);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzael, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzael;
                case 5:
                    zzvz<zzh> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzh.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzael);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzi extends zzue<zzi, zza> implements zzvq {
        public static final zzi zzaem;
        public static volatile zzvz<zzi> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzi, zza> implements zzvq {
            public zza() {
                super(zzi.zzaem);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzi zzi = new zzi();
            zzaem = zzi;
            zzue.zza(zzi.class, zzi);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaem, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaem;
                case 5:
                    zzvz<zzi> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzi.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaem);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzj extends zzue<zzj, zza> implements zzvq {
        public static final zzj zzaen;
        public static volatile zzvz<zzj> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzj, zza> implements zzvq {
            public zza() {
                super(zzj.zzaen);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzj zzj = new zzj();
            zzaen = zzj;
            zzue.zza(zzj.class, zzj);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaen, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaen;
                case 5:
                    zzvz<zzj> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzj.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaen);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzk extends zzue<zzk, zza> implements zzvq {
        public static final zzk zzaeo;
        public static volatile zzvz<zzk> zzbm;
        public zzs zzadw;
        public zzb zzadx;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzk, zza> implements zzvq {
            public zza() {
                super(zzk.zzaeo);
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzk zzk = new zzk();
            zzaeo = zzk;
            zzue.zza(zzk.class, zzk);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaeo, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaeo;
                case 5:
                    zzvz<zzk> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzk.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaeo);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzn extends zzue<zzn, zza> implements zzvq {
        public static final zzum<Integer, zzmk> zzafj = new zzmj();
        public static final zzn zzafl;
        public static volatile zzvz<zzn> zzbm;
        public long zzaev;
        public zzo zzafg;
        public zzo zzafh;
        public zzul zzafi = zzue.zzqz();
        public boolean zzafk;
        public int zzbg;

        public static final class zza extends zzue.zza<zzn, zza> implements zzvq {
            public zza() {
                super(zzn.zzafl);
            }

            public final zza zzf(zzo zzo) {
                zzrf();
                ((zzn) this.zzbol).zzd(zzo);
                return this;
            }

            public final zza zzg(zzo zzo) {
                zzrf();
                ((zzn) this.zzbol).zze(zzo);
                return this;
            }

            public final zza zzh(Iterable<? extends zzmk> iterable) {
                zzrf();
                ((zzn) this.zzbol).zzg(iterable);
                return this;
            }

            public final zza zzl(long j) {
                zzrf();
                ((zzn) this.zzbol).zzj(j);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }

            public final zza zzl(boolean z) {
                zzrf();
                ((zzn) this.zzbol).zzk(z);
                return this;
            }
        }

        static {
            zzn zzn = new zzn();
            zzafl = zzn;
            zzue.zza(zzn.class, zzn);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzd(zzo zzo) {
            if (zzo != null) {
                this.zzafg = zzo;
                this.zzbg |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zze(zzo zzo) {
            if (zzo != null) {
                this.zzafh = zzo;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzg(Iterable<? extends zzmk> iterable) {
            if (!this.zzafi.zzps()) {
                this.zzafi = zzue.zza(this.zzafi);
            }
            for (zzmk zzmk : iterable) {
                this.zzafi.zzdh(zzmk.zzo());
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzj(long j) {
            this.zzbg |= 4;
            this.zzaev = j;
        }

        public static zza zzjo() {
            return (zza) zzafl.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzk(boolean z) {
            this.zzbg |= 8;
            this.zzafk = z;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzafl, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001e\u0004\u0003\u0002\u0005\u0007\u0003", new Object[]{"zzbg", "zzafg", "zzafh", "zzafi", zzmk.zzq(), "zzaev", "zzafk"});
                case 4:
                    return zzafl;
                case 5:
                    zzvz<zzn> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzn.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzafl);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzt extends zzue<zzt, zza> implements zzvq {
        public static final zzt zzaln;
        public static volatile zzvz<zzt> zzbm;
        public float zzall;
        public float zzalm;
        public int zzbg;
        public float zzfw;

        public static final class zza extends zzue.zza<zzt, zza> implements zzvq {
            public zza() {
                super(zzt.zzaln);
            }

            public final zza zzp(float f) {
                zzrf();
                ((zzt) this.zzbol).zzo(f);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzt zzt = new zzt();
            zzaln = zzt;
            zzue.zza(zzt.class, zzt);
        }

        public static zza zzkd() {
            return (zza) zzaln.zzqx();
        }

        public static zzt zzke() {
            return zzaln;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzo(float f) {
            this.zzbg |= 4;
            this.zzfw = f;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaln, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002", new Object[]{"zzbg", "zzall", "zzalm", "zzfw"});
                case 4:
                    return zzaln;
                case 5:
                    zzvz<zzt> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzt.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaln);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzy extends zzue<zzy, zza> implements zzvq {
        public static final zzy zzanr;
        public static volatile zzvz<zzy> zzbm;
        public int zzanq;
        public int zzbg;
        public float zzfw;

        public static final class zza extends zzue.zza<zzy, zza> implements zzvq {
            public zza() {
                super(zzy.zzanr);
            }

            public final zza zzq(float f) {
                zzrf();
                ((zzy) this.zzbol).zzo(f);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzy zzy = new zzy();
            zzanr = zzy;
            zzue.zza(zzy.class, zzy);
        }

        public static zza zzko() {
            return (zza) zzanr.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzo(float f) {
            this.zzbg |= 2;
            this.zzfw = f;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzy();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzanr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u0001\u0001", new Object[]{"zzbg", "zzanq", "zzfw"});
                case 4:
                    return zzanr;
                case 5:
                    zzvz<zzy> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzy.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzanr);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzz extends zzue<zzz, zza> implements zzvq {
        public static final zzz zzanv;
        public static volatile zzvz<zzz> zzbm;
        public zzs zzadw;
        public zzt zzans;
        public zzc zzant;
        public zzd zzanu;
        public int zzbg;

        public static final class zza extends zzue.zza<zzz, zza> implements zzvq {
            public zza() {
                super(zzz.zzanv);
            }

            public final zza zzb(zzt zzt) {
                zzrf();
                ((zzz) this.zzbol).zza((zzz) zzt);
                return this;
            }

            public final zza zzf(zzs.zza zza) {
                zzrf();
                ((zzz) this.zzbol).zza((zzz) zza);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }

            public final zza zzb(zzc zzc) {
                zzrf();
                ((zzz) this.zzbol).zza((zzz) zzc);
                return this;
            }

            public final zza zzb(zzd zzd) {
                zzrf();
                ((zzz) this.zzbol).zza((zzz) zzd);
                return this;
            }
        }

        public static final class zzb extends zzue<zzb, zza> implements zzvq {
            public static final zzb zzany;
            public static volatile zzvz<zzb> zzbm;
            public float zzanw;
            public String zzanx = "";
            public int zzbg;

            public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
                public zza() {
                    super(zzb.zzany);
                }

                public final zza zzbi(String str) {
                    zzrf();
                    ((zzb) this.zzbol).zzbh(str);
                    return this;
                }

                public final zza zzs(float f) {
                    zzrf();
                    ((zzb) this.zzbol).zzr(f);
                    return this;
                }

                public /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            static {
                zzb zzb = new zzb();
                zzany = zzb;
                zzue.zza(zzb.class, zzb);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzbh(String str) {
                if (str != null) {
                    this.zzbg |= 2;
                    this.zzanx = str;
                    return;
                }
                throw null;
            }

            public static zza zzks() {
                return (zza) zzany.zzqx();
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzr(float f) {
                this.zzbg |= 1;
                this.zzanw = f;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzue
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzue.zza(zzany, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0000\u0002\b\u0001", new Object[]{"zzbg", "zzanw", "zzanx"});
                    case 4:
                        return zzany;
                    case 5:
                        zzvz<zzb> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzb.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzany);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class zzd extends zzue<zzd, zza> implements zzvq {
            public static final zzd zzaoc;
            public static volatile zzvz<zzd> zzbm;
            public zzun<zzb> zzaob = zzue.zzrb();

            public static final class zza extends zzue.zza<zzd, zza> implements zzvq {
                public zza() {
                    super(zzd.zzaoc);
                }

                public final zza zzd(zzb.zza zza) {
                    zzrf();
                    ((zzd) this.zzbol).zzc(zza);
                    return this;
                }

                public /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            static {
                zzd zzd = new zzd();
                zzaoc = zzd;
                zzue.zza(zzd.class, zzd);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzc(zzb.zza zza2) {
                if (!this.zzaob.zzps()) {
                    this.zzaob = zzue.zza(this.zzaob);
                }
                this.zzaob.add((zzb) ((zzue) zza2.zzrj()));
            }

            public static zza zzkx() {
                return (zza) zzaoc.zzqx();
            }

            public static zzd zzky() {
                return zzaoc;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzue
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzue.zza(zzaoc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzaob", zzb.class});
                    case 4:
                        return zzaoc;
                    case 5:
                        zzvz<zzd> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzd.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzaoc);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        static {
            zzz zzz = new zzz();
            zzanv = zzz;
            zzue.zza(zzz.class, zzz);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        public static zza zzkq() {
            return (zza) zzanv.zzqx();
        }

        public static final class zzc extends zzue<zzc, zza> implements zzvq {
            public static final zzc zzaoa;
            public static volatile zzvz<zzc> zzbm;
            public zzb zzanz;
            public int zzbg;

            public static final class zza extends zzue.zza<zzc, zza> implements zzvq {
                public zza() {
                    super(zzc.zzaoa);
                }

                public final zza zzb(zzb.zza zza) {
                    zzrf();
                    ((zzc) this.zzbol).zza((zzc) zza);
                    return this;
                }

                public /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            static {
                zzc zzc = new zzc();
                zzaoa = zzc;
                zzue.zza(zzc.class, zzc);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zza(zzb.zza zza2) {
                this.zzanz = (zzb) ((zzue) zza2.zzrj());
                this.zzbg |= 1;
            }

            public static zza zzku() {
                return (zza) zzaoa.zzqx();
            }

            public static zzc zzkv() {
                return zzaoa;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzue
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzue.zza(zzaoa, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"zzbg", "zzanz"});
                    case 4:
                        return zzaoa;
                    case 5:
                        zzvz<zzc> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzc.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzaoa);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzt zzt) {
            if (zzt != null) {
                this.zzans = zzt;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzc zzc2) {
            if (zzc2 != null) {
                this.zzant = zzc2;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzd zzd2) {
            if (zzd2 != null) {
                this.zzanu = zzd2;
                this.zzbg |= 8;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzz();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzanv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"zzbg", "zzadw", "zzans", "zzant", "zzanu"});
                case 4:
                    return zzanv;
                case 5:
                    zzvz<zzz> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzz.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzanv);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzaa extends zzue<zzaa, zza> implements zzvq {
        public static final zzaa zzaoh;
        public static volatile zzvz<zzaa> zzbm;
        public zzs zzadw;
        public zzun<zzc> zzaod = zzue.zzrb();
        public int zzaoe;
        public int zzaof;
        public int zzaog;
        public int zzbg;

        public static final class zza extends zzue.zza<zzaa, zza> implements zzvq {
            public zza() {
                super(zzaa.zzaoh);
            }

            public final zza zzb(zzb zzb) {
                zzrf();
                ((zzaa) this.zzbol).zza((zzaa) zzb);
                return this;
            }

            public final zza zzbg(int i) {
                zzrf();
                ((zzaa) this.zzbol).zzbe(i);
                return this;
            }

            public final zza zzbh(int i) {
                zzrf();
                ((zzaa) this.zzbol).zzbf(i);
                return this;
            }

            public final zza zzg(zzs.zza zza) {
                zzrf();
                ((zzaa) this.zzbol).zza((zzaa) zza);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        public enum zzb implements zzuh {
            NO_ERROR(0),
            STATUS_SENSITIVE_TOPIC(1),
            STATUS_QUALITY_THRESHOLDED(2),
            STATUS_INTERNAL_ERROR(3),
            STATUS_NOT_SUPPORTED_LANGUAGE(101);
            
            public static final zzui<zzb> zzbe = new zzni();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbi(int i) {
                if (i == 0) {
                    return NO_ERROR;
                }
                if (i == 1) {
                    return STATUS_SENSITIVE_TOPIC;
                }
                if (i == 2) {
                    return STATUS_QUALITY_THRESHOLDED;
                }
                if (i == 3) {
                    return STATUS_INTERNAL_ERROR;
                }
                if (i != 101) {
                    return null;
                }
                return STATUS_NOT_SUPPORTED_LANGUAGE;
            }

            public static zzuj zzq() {
                return zznj.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        public static final class zzc extends zzue<zzc, zza> implements zzvq {
            public static final zzc zzaoo;
            public static volatile zzvz<zzc> zzbm;
            public float zzanw;
            public int zzbg;

            public static final class zza extends zzue.zza<zzc, zza> implements zzvq {
                public zza() {
                    super(zzc.zzaoo);
                }

                public /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            static {
                zzc zzc = new zzc();
                zzaoo = zzc;
                zzue.zza(zzc.class, zzc);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzue
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzue.zza(zzaoo, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new Object[]{"zzbg", "zzanw"});
                    case 4:
                        return zzaoo;
                    case 5:
                        zzvz<zzc> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzc.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzaoo);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        static {
            zzaa zzaa = new zzaa();
            zzaoh = zzaa;
            zzue.zza(zzaa.class, zzaa);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbe(int i) {
            this.zzbg |= 4;
            this.zzaof = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbf(int i) {
            this.zzbg |= 8;
            this.zzaog = i;
        }

        public static zza zzla() {
            return (zza) zzaoh.zzqx();
        }

        public static zzaa zzlb() {
            return zzaoh;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzbg |= 2;
                this.zzaoe = zzb2.zzo();
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzaa();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaoh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\u0004\u0002\u0005\u0004\u0003", new Object[]{"zzbg", "zzadw", "zzaod", zzc.class, "zzaoe", zzb.zzq(), "zzaof", "zzaog"});
                case 4:
                    return zzaoh;
                case 5:
                    zzvz<zzaa> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzaa.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaoh);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzab extends zzue<zzab, zza> implements zzvq {
        public static final zzab zzaop;
        public static volatile zzvz<zzab> zzbm;
        public zzs zzadw;
        public zzr zzady;
        public int zzbg;

        public static final class zza extends zzue.zza<zzab, zza> implements zzvq {
            public zza() {
                super(zzab.zzaop);
            }

            public final zza zze(zzr zzr) {
                zzrf();
                ((zzab) this.zzbol).zza((zzab) zzr);
                return this;
            }

            public final zza zzh(zzs.zza zza) {
                zzrf();
                ((zzab) this.zzbol).zza((zzab) zza);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzab zzab = new zzab();
            zzaop = zzab;
            zzue.zza(zzab.class, zzab);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        public static zza zzle() {
            return (zza) zzaop.zzqx();
        }

        public static zzab zzlf() {
            return zzaop;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzr zzr) {
            if (zzr != null) {
                this.zzady = zzr;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzab();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaop, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzbg", "zzadw", "zzady"});
                case 4:
                    return zzaop;
                case 5:
                    zzvz<zzab> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzab.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaop);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzm extends zzue<zzm, zza> implements zzvq {
        public static final zzm zzaew;
        public static volatile zzvz<zzm> zzbm;
        public zzs zzadw;
        public zzo zzaep;
        public zzun<zzb> zzaet = zzue.zzrb();
        public zzun<zzb> zzaeu = zzue.zzrb();
        public long zzaev;
        public int zzbg;

        public static final class zza extends zzue.zza<zzm, zza> implements zzvq {
            public zza() {
                super(zzm.zzaew);
            }

            public final zza zzb(zzs.zza zza) {
                zzrf();
                ((zzm) this.zzbol).zza((zzm) zza);
                return this;
            }

            public final zza zzc(zzo zzo) {
                zzrf();
                ((zzm) this.zzbol).zza((zzm) zzo);
                return this;
            }

            public final zza zzd(Iterable<? extends zzb> iterable) {
                zzrf();
                ((zzm) this.zzbol).zzb((zzm) iterable);
                return this;
            }

            public final zza zzk(long j) {
                zzrf();
                ((zzm) this.zzbol).zzj(j);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }

            public final zza zzc(Iterable<? extends zzb> iterable) {
                zzrf();
                ((zzm) this.zzbol).zza((zzm) iterable);
                return this;
            }
        }

        static {
            zzm zzm = new zzm();
            zzaew = zzm;
            zzue.zza(zzm.class, zzm);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzb(Iterable<? extends zzb> iterable) {
            if (!this.zzaeu.zzps()) {
                this.zzaeu = zzue.zza(this.zzaeu);
            }
            zzsn.zza(iterable, this.zzaeu);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzj(long j) {
            this.zzbg |= 4;
            this.zzaev = j;
        }

        public static zza zzjk() {
            return (zza) zzaew.zzqx();
        }

        public static final class zzb extends zzue<zzb, zza> implements zzvq {
            public static final zzb zzaez;
            public static volatile zzvz<zzb> zzbm;
            public int zzaex;
            public zzul zzaey = zzue.zzqz();
            public int zzbg;

            public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
                public zza() {
                    super(zzb.zzaez);
                }

                public final zza zzb(EnumC4896zzb zzb) {
                    zzrf();
                    ((zzb) this.zzbol).zza((zzb) zzb);
                    return this;
                }

                public final zza zzf(Iterable<? extends Integer> iterable) {
                    zzrf();
                    ((zzb) this.zzbol).zze(iterable);
                    return this;
                }

                public /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmd$zzm$zzb$zzb  reason: collision with other inner class name */
            public enum EnumC4896zzb implements zzuh {
                UNKNOWN_DATA_TYPE(0),
                TYPE_FLOAT32(1),
                TYPE_INT32(2),
                TYPE_BYTE(3),
                TYPE_LONG(4);
                
                public static final zzui<EnumC4896zzb> zzbe = new zzmh();
                public final int value;

                /* access modifiers changed from: public */
                EnumC4896zzb(int i) {
                    this.value = i;
                }

                public static EnumC4896zzb zzan(int i) {
                    if (i == 0) {
                        return UNKNOWN_DATA_TYPE;
                    }
                    if (i == 1) {
                        return TYPE_FLOAT32;
                    }
                    if (i == 2) {
                        return TYPE_INT32;
                    }
                    if (i == 3) {
                        return TYPE_BYTE;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return TYPE_LONG;
                }

                public static zzuj zzq() {
                    return zzmi.zzbs;
                }

                @Override // com.google.android.gms.internal.firebase_ml.zzuh
                public final int zzo() {
                    return this.value;
                }
            }

            static {
                zzb zzb = new zzb();
                zzaez = zzb;
                zzue.zza(zzb.class, zzb);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zza(EnumC4896zzb zzb) {
                if (zzb != null) {
                    this.zzbg |= 1;
                    this.zzaex = zzb.zzo();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zze(Iterable<? extends Integer> iterable) {
                if (!this.zzaey.zzps()) {
                    this.zzaey = zzue.zza(this.zzaey);
                }
                zzsn.zza(iterable, this.zzaey);
            }

            public static zza zzjm() {
                return (zza) zzaez.zzqx();
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzue
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzue.zza(zzaez, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzbg", "zzaex", EnumC4896zzb.zzq(), "zzaey"});
                    case 4:
                        return zzaez;
                    case 5:
                        zzvz<zzb> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzb.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzaez);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzo zzo) {
            if (zzo != null) {
                this.zzaep = zzo;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(Iterable<? extends zzb> iterable) {
            if (!this.zzaet.zzps()) {
                this.zzaet = zzue.zza(this.zzaet);
            }
            zzsn.zza(iterable, this.zzaet);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaew, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001b\u0004\u001b\u0005\u0003\u0002", new Object[]{"zzbg", "zzadw", "zzaep", "zzaet", zzb.class, "zzaeu", zzb.class, "zzaev"});
                case 4:
                    return zzaew;
                case 5:
                    zzvz<zzm> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzm.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaew);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzo extends zzue<zzo, zza> implements zzvq {
        public static final zzo zzafq;
        public static volatile zzvz<zzo> zzbm;
        public zzu zzafm;
        public zzb zzafn;
        public zzb zzafo;
        public boolean zzafp;
        public int zzbg;

        public static final class zza extends zzue.zza<zzo, zza> implements zzvq {
            public zza() {
                super(zzo.zzafq);
            }

            public final zza zzb(zzu.zza zza) {
                zzrf();
                ((zzo) this.zzbol).zza((zzo) zza);
                return this;
            }

            public final zza zzc(zzb zzb) {
                zzrf();
                ((zzo) this.zzbol).zza((zzo) zzb);
                return this;
            }

            public final zza zzd(zzb zzb) {
                zzrf();
                ((zzo) this.zzbol).zzb((zzo) zzb);
                return this;
            }

            public final zza zzn(boolean z) {
                zzrf();
                ((zzo) this.zzbol).zzm(z);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        public static final class zzb extends zzue<zzb, zza> implements zzvq {
            public static final zzb zzafv;
            public static volatile zzvz<zzb> zzbm;
            public boolean zzafr;
            public boolean zzafs;
            public boolean zzaft;
            public boolean zzafu;
            public int zzbg;

            public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
                public zza() {
                    super(zzb.zzafv);
                }

                public final zza zzr(boolean z) {
                    zzrf();
                    ((zzb) this.zzbol).zzo(z);
                    return this;
                }

                public final zza zzs(boolean z) {
                    zzrf();
                    ((zzb) this.zzbol).zzp(z);
                    return this;
                }

                public final zza zzt(boolean z) {
                    zzrf();
                    ((zzb) this.zzbol).zzq(z);
                    return this;
                }

                public /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            static {
                zzb zzb = new zzb();
                zzafv = zzb;
                zzue.zza(zzb.class, zzb);
            }

            public static zza zzjs() {
                return (zza) zzafv.zzqx();
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzo(boolean z) {
                this.zzbg |= 1;
                this.zzafr = z;
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzp(boolean z) {
                this.zzbg |= 2;
                this.zzafs = z;
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzq(boolean z) {
                this.zzbg |= 4;
                this.zzaft = z;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzue
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzue.zza(zzafv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003", new Object[]{"zzbg", "zzafr", "zzafs", "zzaft", "zzafu"});
                    case 4:
                        return zzafv;
                    case 5:
                        zzvz<zzb> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzb.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzafv);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        static {
            zzo zzo = new zzo();
            zzafq = zzo;
            zzue.zza(zzo.class, zzo);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzu.zza zza2) {
            this.zzafm = (zzu) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzb(zzb zzb2) {
            if (zzb2 != null) {
                this.zzafo = zzb2;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        public static zza zzjq() {
            return (zza) zzafq.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzm(boolean z) {
            this.zzbg |= 8;
            this.zzafp = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzafn = zzb2;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzafq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzbg", "zzafm", "zzafn", "zzafo", "zzafp"});
                case 4:
                    return zzafq;
                case 5:
                    zzvz<zzo> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzo.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzafq);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzq extends zzue<zzq, zza> implements zzvq {
        public static final zzq zzakt;
        public static volatile zzvz<zzq> zzbm;
        public zzac zzajy;
        public int zzajz;
        public zzl zzaka;
        public zzm zzakb;
        public zzn zzakc;
        public zzw zzakd;
        public zzab zzake;
        public zzv zzakf;
        public zzx zzakg;
        public zzaa zzakh;
        public zzz zzaki;
        public zzd zzakj;
        public zza zzakk;
        public zzc zzakl;
        public zzf zzakm;
        public zze zzakn;
        public zzg zzako;
        public zzh zzakp;
        public zzi zzakq;
        public zzj zzakr;
        public zzk zzaks;
        public int zzbg;

        public static final class zza extends zzue.zza<zzq, zza> implements zzvq {
            public zza() {
                super(zzq.zzakt);
            }

            public final zza zzb(zzac.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }

            public final zzac zzjw() {
                return ((zzq) this.zzbol).zzjw();
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }

            public final zza zzb(zzmn zzmn) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zzmn);
                return this;
            }

            public final zza zzb(zzl.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }

            public final zza zzb(zzm zzm) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zzm);
                return this;
            }

            public final zza zzb(zzm.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }

            public final zza zzb(zzn.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }

            public final zza zzb(zzw.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }

            public final zza zzb(zzab zzab) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zzab);
                return this;
            }

            public final zza zzb(zzab.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }

            public final zza zzb(zzv.zzc zzc) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zzc);
                return this;
            }

            public final zza zzb(zzx.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }

            public final zza zzb(zzaa zzaa) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zzaa);
                return this;
            }

            public final zza zzb(zzaa.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }

            public final zza zzb(zzz.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza((zzq) zza);
                return this;
            }
        }

        static {
            zzq zzq = new zzq();
            zzakt = zzq;
            zzue.zza(zzq.class, zzq);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzac.zza zza2) {
            this.zzajy = (zzac) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        public static zza zzjx() {
            return (zza) zzakt.zzqx();
        }

        public final zzac zzjw() {
            zzac zzac = this.zzajy;
            return zzac == null ? zzac.zzlj() : zzac;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzmn zzmn) {
            if (zzmn != null) {
                this.zzbg |= 2;
                this.zzajz = zzmn.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzl.zza zza2) {
            this.zzaka = (zzl) ((zzue) zza2.zzrj());
            this.zzbg |= 4;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzm zzm) {
            if (zzm != null) {
                this.zzakb = zzm;
                this.zzbg |= 8;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzm.zza zza2) {
            this.zzakb = (zzm) ((zzue) zza2.zzrj());
            this.zzbg |= 8;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzn.zza zza2) {
            this.zzakc = (zzn) ((zzue) zza2.zzrj());
            this.zzbg |= 16;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzw.zza zza2) {
            this.zzakd = (zzw) ((zzue) zza2.zzrj());
            this.zzbg |= 32;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzab zzab) {
            if (zzab != null) {
                this.zzake = zzab;
                this.zzbg |= 64;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzab.zza zza2) {
            this.zzake = (zzab) ((zzue) zza2.zzrj());
            this.zzbg |= 64;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzv.zzc zzc) {
            this.zzakf = (zzv) ((zzue) zzc.zzrj());
            this.zzbg |= 128;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzx.zza zza2) {
            this.zzakg = (zzx) ((zzue) zza2.zzrj());
            this.zzbg |= 256;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzaa zzaa) {
            if (zzaa != null) {
                this.zzakh = zzaa;
                this.zzbg |= 512;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzaa.zza zza2) {
            this.zzakh = (zzaa) ((zzue) zza2.zzrj());
            this.zzbg |= 512;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzz.zza zza2) {
            this.zzaki = (zzz) ((zzue) zza2.zzrj());
            this.zzbg |= 1024;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzakt, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0005\u0006\t\u0006\u0007\t\u0007\b\t\u000b\t\t\f\n\t\r\u000b\t\u000e\f\t\u000f\r\t\u0010\u000e\t\u0011\u000f\t\u0012\u0010\t\u0013\u0011\t\u0014\u0012\t\b\u0013\t\t\u0014\t\u0004\u0015\t\n", new Object[]{"zzbg", "zzajy", "zzajz", zzmn.zzq(), "zzaka", "zzakb", "zzakd", "zzake", "zzakf", "zzakj", "zzakk", "zzakl", "zzakm", "zzakn", "zzako", "zzakp", "zzakq", "zzakr", "zzaks", "zzakg", "zzakh", "zzakc", "zzaki"});
                case 4:
                    return zzakt;
                case 5:
                    zzvz<zzq> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzq.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzakt);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzv extends zzue<zzv, zzc> implements zzvq {
        public static final zzum<Integer, zza> zzamc = new zznc();
        public static final zzum<Integer, zzb> zzame = new zznd();
        public static final zzv zzamf;
        public static volatile zzvz<zzv> zzbm;
        public zzs zzadw;
        public zzr zzady;
        public zzqs.zza zzama;
        public zzul zzamb = zzue.zzqz();
        public zzul zzamd = zzue.zzqz();
        public int zzbg;

        public enum zza implements zzuh {
            FORMAT_UNKNOWN(0),
            FORMAT_CODE_128(1),
            FORMAT_CODE_39(2),
            FORMAT_CODE_93(4),
            FORMAT_CODABAR(8),
            FORMAT_DATA_MATRIX(16),
            FORMAT_EAN_13(32),
            FORMAT_EAN_8(64),
            FORMAT_ITF(128),
            FORMAT_QR_CODE(256),
            FORMAT_UPC_A(512),
            FORMAT_UPC_E(1024),
            FORMAT_PDF417(2048),
            FORMAT_AZTEC(4096);
            
            public static final zzui<zza> zzbe = new zzne();
            public final int value;

            /* access modifiers changed from: public */
            zza(int i) {
                this.value = i;
            }

            public static zza zzay(int i) {
                if (i == 0) {
                    return FORMAT_UNKNOWN;
                }
                if (i == 1) {
                    return FORMAT_CODE_128;
                }
                if (i == 2) {
                    return FORMAT_CODE_39;
                }
                switch (i) {
                    case 4:
                        return FORMAT_CODE_93;
                    case 8:
                        return FORMAT_CODABAR;
                    case 16:
                        return FORMAT_DATA_MATRIX;
                    case 32:
                        return FORMAT_EAN_13;
                    case 64:
                        return FORMAT_EAN_8;
                    case 128:
                        return FORMAT_ITF;
                    case 256:
                        return FORMAT_QR_CODE;
                    case 512:
                        return FORMAT_UPC_A;
                    case 1024:
                        return FORMAT_UPC_E;
                    case 2048:
                        return FORMAT_PDF417;
                    case 4096:
                        return FORMAT_AZTEC;
                    default:
                        return null;
                }
            }

            public static zzuj zzq() {
                return zznf.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        public enum zzb implements zzuh {
            TYPE_UNKNOWN(0),
            TYPE_CONTACT_INFO(1),
            TYPE_EMAIL(2),
            TYPE_ISBN(3),
            TYPE_PHONE(4),
            TYPE_PRODUCT(5),
            TYPE_SMS(6),
            TYPE_TEXT(7),
            TYPE_URL(8),
            TYPE_WIFI(9),
            TYPE_GEO(10),
            TYPE_CALENDAR_EVENT(11),
            TYPE_DRIVER_LICENSE(12);
            
            public static final zzui<zzb> zzbe = new zzng();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzb zzaz(int i) {
                switch (i) {
                    case 0:
                        return TYPE_UNKNOWN;
                    case 1:
                        return TYPE_CONTACT_INFO;
                    case 2:
                        return TYPE_EMAIL;
                    case 3:
                        return TYPE_ISBN;
                    case 4:
                        return TYPE_PHONE;
                    case 5:
                        return TYPE_PRODUCT;
                    case 6:
                        return TYPE_SMS;
                    case 7:
                        return TYPE_TEXT;
                    case 8:
                        return TYPE_URL;
                    case 9:
                        return TYPE_WIFI;
                    case 10:
                        return TYPE_GEO;
                    case 11:
                        return TYPE_CALENDAR_EVENT;
                    case 12:
                        return TYPE_DRIVER_LICENSE;
                    default:
                        return null;
                }
            }

            public static zzuj zzq() {
                return zznh.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        public static final class zzc extends zzue.zza<zzv, zzc> implements zzvq {
            public zzc() {
                super(zzv.zzamf);
            }

            public final zzc zzb(zzqs.zza zza) {
                zzrf();
                ((zzv) this.zzbol).zza((zzv) zza);
                return this;
            }

            public final zzc zzc(zzs.zza zza) {
                zzrf();
                ((zzv) this.zzbol).zza((zzv) zza);
                return this;
            }

            public final zzc zzk(Iterable<? extends zza> iterable) {
                zzrf();
                ((zzv) this.zzbol).zzi((zzv) iterable);
                return this;
            }

            public final zzc zzl(Iterable<? extends zzb> iterable) {
                zzrf();
                ((zzv) this.zzbol).zzj(iterable);
                return this;
            }

            public /* synthetic */ zzc(zzme zzme) {
                this();
            }

            public final zzc zzb(zzr zzr) {
                zzrf();
                ((zzv) this.zzbol).zza((zzv) zzr);
                return this;
            }
        }

        static {
            zzv zzv = new zzv();
            zzamf = zzv;
            zzue.zza(zzv.class, zzv);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzi(Iterable<? extends zza> iterable) {
            if (!this.zzamb.zzps()) {
                this.zzamb = zzue.zza(this.zzamb);
            }
            for (zza zza2 : iterable) {
                this.zzamb.zzdh(zza2.zzo());
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzj(Iterable<? extends zzb> iterable) {
            if (!this.zzamd.zzps()) {
                this.zzamd = zzue.zza(this.zzamd);
            }
            for (zzb zzb2 : iterable) {
                this.zzamd.zzdh(zzb2.zzo());
            }
        }

        public static zzc zzki() {
            return (zzc) zzamf.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzqs.zza zza2) {
            if (zza2 != null) {
                this.zzama = zza2;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzr zzr) {
            if (zzr != null) {
                this.zzady = zzr;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zzc(null);
                case 3:
                    return zzue.zza(zzamf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001e\u0004\u001e\u0005\t\u0002", new Object[]{"zzbg", "zzadw", "zzama", "zzamb", zza.zzq(), "zzamd", zzb.zzq(), "zzady"});
                case 4:
                    return zzamf;
                case 5:
                    zzvz<zzv> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzv.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzamf);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzw extends zzue<zzw, zza> implements zzvq {
        public static final zzw zzann;
        public static volatile zzvz<zzw> zzbm;
        public zzs zzadw;
        public zzr zzady;
        public zzqs.zzb zzanj;
        public zzp zzank;
        public int zzanl;
        public int zzanm;
        public int zzbg;

        public static final class zza extends zzue.zza<zzw, zza> implements zzvq {
            public zza() {
                super(zzw.zzann);
            }

            public final zza zzb(zzp zzp) {
                zzrf();
                ((zzw) this.zzbol).zza((zzw) zzp);
                return this;
            }

            public final zza zzbc(int i) {
                zzrf();
                ((zzw) this.zzbol).zzba(i);
                return this;
            }

            public final zza zzbd(int i) {
                zzrf();
                ((zzw) this.zzbol).zzbb(i);
                return this;
            }

            public final zza zzc(zzr zzr) {
                zzrf();
                ((zzw) this.zzbol).zza((zzw) zzr);
                return this;
            }

            public final zza zzd(zzs.zza zza) {
                zzrf();
                ((zzw) this.zzbol).zza((zzw) zza);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzw zzw = new zzw();
            zzann = zzw;
            zzue.zza(zzw.class, zzw);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzba(int i) {
            this.zzbg |= 16;
            this.zzanl = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbb(int i) {
            this.zzbg |= 32;
            this.zzanm = i;
        }

        public static zza zzkk() {
            return (zza) zzann.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzr zzr) {
            if (zzr != null) {
                this.zzady = zzr;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzp zzp) {
            if (zzp != null) {
                this.zzank = zzp;
                this.zzbg |= 8;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzw();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzann, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u000b\u0004\u0006\u000b\u0005", new Object[]{"zzbg", "zzadw", "zzanj", "zzady", "zzank", "zzanl", "zzanm"});
                case 4:
                    return zzann;
                case 5:
                    zzvz<zzw> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzw.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzann);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzx extends zzue<zzx, zza> implements zzvq {
        public static final zzx zzanp;
        public static volatile zzvz<zzx> zzbm;
        public zzs zzadw;
        public zzr zzady;
        public zzy zzano;
        public int zzbg;

        public static final class zza extends zzue.zza<zzx, zza> implements zzvq {
            public zza() {
                super(zzx.zzanp);
            }

            public final zza zzb(zzy zzy) {
                zzrf();
                ((zzx) this.zzbol).zza((zzx) zzy);
                return this;
            }

            public final zza zzd(zzr zzr) {
                zzrf();
                ((zzx) this.zzbol).zza((zzx) zzr);
                return this;
            }

            public final zza zze(zzs.zza zza) {
                zzrf();
                ((zzx) this.zzbol).zza((zzx) zza);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzx zzx = new zzx();
            zzanp = zzx;
            zzue.zza(zzx.class, zzx);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        public static zza zzkm() {
            return (zza) zzanp.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzy zzy) {
            if (zzy != null) {
                this.zzano = zzy;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzr zzr) {
            if (zzr != null) {
                this.zzady = zzr;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzx();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzanp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzano", "zzady"});
                case 4:
                    return zzanp;
                case 5:
                    zzvz<zzx> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzx.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzanp);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzl extends zzue<zzl, zza> implements zzvq {
        public static final zzl zzaes;
        public static volatile zzvz<zzl> zzbm;
        public zzo zzaep;
        public long zzaeq;
        public int zzaer;
        public int zzbg;

        public static final class zza extends zzue.zza<zzl, zza> implements zzvq {
            public zza() {
                super(zzl.zzaes);
            }

            public final zza zzb(zzo zzo) {
                zzrf();
                ((zzl) this.zzbol).zza((zzl) zzo);
                return this;
            }

            public final zza zzi(long j) {
                zzrf();
                ((zzl) this.zzbol).zzh(j);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }

            public final zza zzb(zzmk zzmk) {
                zzrf();
                ((zzl) this.zzbol).zza((zzl) zzmk);
                return this;
            }
        }

        static {
            zzl zzl = new zzl();
            zzaes = zzl;
            zzue.zza(zzl.class, zzl);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzo zzo) {
            if (zzo != null) {
                this.zzaep = zzo;
                this.zzbg |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzh(long j) {
            this.zzbg |= 2;
            this.zzaeq = j;
        }

        public static zza zzji() {
            return (zza) zzaes.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzmk zzmk) {
            if (zzmk != null) {
                this.zzbg |= 4;
                this.zzaer = zzmk.zzo();
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzaes, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u0003\u0001\u0003\f\u0002", new Object[]{"zzbg", "zzaep", "zzaeq", "zzaer", zzmk.zzq()});
                case 4:
                    return zzaes;
                case 5:
                    zzvz<zzl> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzl.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaes);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzp extends zzue<zzp, zza> implements zzvq {
        public static final zzp zzajh;
        public static volatile zzvz<zzp> zzbm;
        public int zzajb;
        public int zzajc;
        public int zzajd;
        public int zzaje;
        public boolean zzajf;
        public float zzajg;
        public int zzbg;

        public static final class zza extends zzue.zza<zzp, zza> implements zzvq {
            public zza() {
                super(zzp.zzajh);
            }

            public final zza zzb(zzd zzd) {
                zzrf();
                ((zzp) this.zzbol).zza((zzp) zzd);
                return this;
            }

            public final zza zzn(float f) {
                zzrf();
                ((zzp) this.zzbol).zzm(f);
                return this;
            }

            public final zza zzv(boolean z) {
                zzrf();
                ((zzp) this.zzbol).zzu(z);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }

            public final zza zzb(zzb zzb) {
                zzrf();
                ((zzp) this.zzbol).zza((zzp) zzb);
                return this;
            }

            public final zza zzb(zze zze) {
                zzrf();
                ((zzp) this.zzbol).zza((zzp) zze);
                return this;
            }

            public final zza zzb(zzc zzc) {
                zzrf();
                ((zzp) this.zzbol).zza((zzp) zzc);
                return this;
            }
        }

        public enum zzb implements zzuh {
            UNKNOWN_CLASSIFICATIONS(0),
            NO_CLASSIFICATIONS(1),
            ALL_CLASSIFICATIONS(2);
            
            public static final zzui<zzb> zzbe = new zzmq();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzb zzaq(int i) {
                if (i == 0) {
                    return UNKNOWN_CLASSIFICATIONS;
                }
                if (i == 1) {
                    return NO_CLASSIFICATIONS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_CLASSIFICATIONS;
            }

            public static zzuj zzq() {
                return zzmr.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        public enum zzc implements zzuh {
            UNKNOWN_CONTOURS(0),
            NO_CONTOURS(1),
            ALL_CONTOURS(2);
            
            public static final zzui<zzc> zzbe = new zzms();
            public final int value;

            /* access modifiers changed from: public */
            zzc(int i) {
                this.value = i;
            }

            public static zzc zzar(int i) {
                if (i == 0) {
                    return UNKNOWN_CONTOURS;
                }
                if (i == 1) {
                    return NO_CONTOURS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_CONTOURS;
            }

            public static zzuj zzq() {
                return zzmt.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        public enum zzd implements zzuh {
            UNKNOWN_LANDMARKS(0),
            NO_LANDMARKS(1),
            ALL_LANDMARKS(2);
            
            public static final zzui<zzd> zzbe = new zzmu();
            public final int value;

            /* access modifiers changed from: public */
            zzd(int i) {
                this.value = i;
            }

            public static zzd zzas(int i) {
                if (i == 0) {
                    return UNKNOWN_LANDMARKS;
                }
                if (i == 1) {
                    return NO_LANDMARKS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_LANDMARKS;
            }

            public static zzuj zzq() {
                return zzmv.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        public enum zze implements zzuh {
            UNKNOWN_PERFORMANCE(0),
            FAST(1),
            ACCURATE(2);
            
            public static final zzui<zze> zzbe = new zzmw();
            public final int value;

            /* access modifiers changed from: public */
            zze(int i) {
                this.value = i;
            }

            public static zze zzat(int i) {
                if (i == 0) {
                    return UNKNOWN_PERFORMANCE;
                }
                if (i == 1) {
                    return FAST;
                }
                if (i != 2) {
                    return null;
                }
                return ACCURATE;
            }

            public static zzuj zzq() {
                return zzmx.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        static {
            zzp zzp = new zzp();
            zzajh = zzp;
            zzue.zza(zzp.class, zzp);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzd zzd2) {
            if (zzd2 != null) {
                this.zzbg |= 1;
                this.zzajb = zzd2.zzo();
                return;
            }
            throw null;
        }

        public static zza zzju() {
            return (zza) zzajh.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzm(float f) {
            this.zzbg |= 32;
            this.zzajg = f;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzu(boolean z) {
            this.zzbg |= 16;
            this.zzajf = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzbg |= 2;
                this.zzajc = zzb2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zze zze2) {
            if (zze2 != null) {
                this.zzbg |= 4;
                this.zzajd = zze2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzc zzc2) {
            if (zzc2 != null) {
                this.zzbg |= 8;
                this.zzaje = zzc2.zzo();
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzajh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\u0007\u0004\u0006\u0001\u0005", new Object[]{"zzbg", "zzajb", zzd.zzq(), "zzajc", zzb.zzq(), "zzajd", zze.zzq(), "zzaje", zzc.zzq(), "zzajf", "zzajg"});
                case 4:
                    return zzajh;
                case 5:
                    zzvz<zzp> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzp.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzajh);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzr extends zzue<zzr, zza> implements zzvq {
        public static final zzr zzakx;
        public static volatile zzvz<zzr> zzbm;
        public int zzaku;
        public int zzakv;
        public int zzakw;
        public int zzbg;

        public static final class zza extends zzue.zza<zzr, zza> implements zzvq {
            public zza() {
                super(zzr.zzakx);
            }

            public final zza zzav(int i) {
                zzrf();
                ((zzr) this.zzbol).zzau(i);
                return this;
            }

            public final zza zzb(zzb zzb) {
                zzrf();
                ((zzr) this.zzbol).zza((zzr) zzb);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        public enum zzb implements zzuh {
            UNKNOWN_FORMAT(0),
            NV16(1),
            NV21(2),
            YV12(3),
            BITMAP(4),
            CM_SAMPLE_BUFFER_REF(5),
            UI_IMAGE(6);
            
            public static final zzui<zzb> zzbe = new zzmy();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzb zzaw(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_FORMAT;
                    case 1:
                        return NV16;
                    case 2:
                        return NV21;
                    case 3:
                        return YV12;
                    case 4:
                        return BITMAP;
                    case 5:
                        return CM_SAMPLE_BUFFER_REF;
                    case 6:
                        return UI_IMAGE;
                    default:
                        return null;
                }
            }

            public static zzuj zzq() {
                return zzmz.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        static {
            zzr zzr = new zzr();
            zzakx = zzr;
            zzue.zza(zzr.class, zzr);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzbg |= 1;
                this.zzaku = zzb2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzau(int i) {
            this.zzbg |= 2;
            this.zzakv = i;
        }

        public static zza zzjz() {
            return (zza) zzakx.zzqx();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzakx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u000b\u0001\u0003\u000b\u0002", new Object[]{"zzbg", "zzaku", zzb.zzq(), "zzakv", "zzakw"});
                case 4:
                    return zzakx;
                case 5:
                    zzvz<zzr> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzr.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzakx);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzs extends zzue<zzs, zza> implements zzvq {
        public static final zzs zzalk;
        public static volatile zzvz<zzs> zzbm;
        public int zzaer;
        public boolean zzafk;
        public long zzalg;
        public boolean zzalh;
        public boolean zzali;
        public boolean zzalj;
        public int zzbg;

        public static final class zza extends zzue.zza<zzs, zza> implements zzvq {
            public zza() {
                super(zzs.zzalk);
            }

            public final zza zzaa(boolean z) {
                zzrf();
                ((zzs) this.zzbol).zzx(true);
                return this;
            }

            public final zza zzab(boolean z) {
                zzrf();
                ((zzs) this.zzbol).zzy(true);
                return this;
            }

            public final zza zzac(boolean z) {
                zzrf();
                ((zzs) this.zzbol).zzk(z);
                return this;
            }

            public final zza zzc(zzmk zzmk) {
                zzrf();
                ((zzs) this.zzbol).zza((zzs) zzmk);
                return this;
            }

            public final zza zzn(long j) {
                zzrf();
                ((zzs) this.zzbol).zzm(j);
                return this;
            }

            public final zza zzz(boolean z) {
                zzrf();
                ((zzs) this.zzbol).zzw(z);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        static {
            zzs zzs = new zzs();
            zzalk = zzs;
            zzue.zza(zzs.class, zzs);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzmk zzmk) {
            if (zzmk != null) {
                this.zzbg |= 2;
                this.zzaer = zzmk.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzk(boolean z) {
            this.zzbg |= 32;
            this.zzafk = z;
        }

        public static zza zzkb() {
            return (zza) zzalk.zzqx();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzm(long j) {
            this.zzbg |= 1;
            this.zzalg = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzw(boolean z) {
            this.zzbg |= 4;
            this.zzalh = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzx(boolean z) {
            this.zzbg |= 8;
            this.zzali = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzy(boolean z) {
            this.zzbg |= 16;
            this.zzalj = z;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzalk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0003\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzbg", "zzalg", "zzaer", zzmk.zzq(), "zzalh", "zzali", "zzalj", "zzafk"});
                case 4:
                    return zzalk;
                case 5:
                    zzvz<zzs> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzs.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzalk);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzu extends zzue<zzu, zza> implements zzvq {
        public static final zzu zzalt;
        public static volatile zzvz<zzu> zzbm;
        public String zzalo = "";
        public String zzalp = "";
        public int zzalq;
        public String zzalr = "";
        public String zzals = "";
        public int zzbg;

        public static final class zza extends zzue.zza<zzu, zza> implements zzvq {
            public zza() {
                super(zzu.zzalt);
            }

            public final zza zzb(zzb zzb) {
                zzrf();
                ((zzu) this.zzbol).zza((zzu) zzb);
                return this;
            }

            public final zza zzbe(String str) {
                zzrf();
                ((zzu) this.zzbol).setName(str);
                return this;
            }

            public final zza zzbf(String str) {
                zzrf();
                ((zzu) this.zzbol).zzbc(str);
                return this;
            }

            public final zza zzbg(String str) {
                zzrf();
                ((zzu) this.zzbol).zzbd(str);
                return this;
            }

            public /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        public enum zzb implements zzuh {
            SOURCE_UNKNOWN(0),
            APP_ASSET(1),
            LOCAL(2),
            CLOUD(3),
            SDK_BUILT_IN(4);
            
            public static final zzui<zzb> zzbe = new zzna();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzb zzax(int i) {
                if (i == 0) {
                    return SOURCE_UNKNOWN;
                }
                if (i == 1) {
                    return APP_ASSET;
                }
                if (i == 2) {
                    return LOCAL;
                }
                if (i == 3) {
                    return CLOUD;
                }
                if (i != 4) {
                    return null;
                }
                return SDK_BUILT_IN;
            }

            public static zzuj zzq() {
                return zznb.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        static {
            zzu zzu = new zzu();
            zzalt = zzu;
            zzue.zza(zzu.class, zzu);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void setName(String str) {
            if (str != null) {
                this.zzbg |= 1;
                this.zzalo = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzbg |= 4;
                this.zzalq = zzb2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbc(String str) {
            if (str != null) {
                this.zzbg |= 8;
                this.zzalr = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzbd(String str) {
            if (str != null) {
                this.zzbg |= 16;
                this.zzals = str;
                return;
            }
            throw null;
        }

        public static zza zzkg() {
            return (zza) zzalt.zzqx();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzalt, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzbg", "zzalo", "zzalp", "zzalq", zzb.zzq(), "zzalr", "zzals"});
                case 4:
                    return zzalt;
                case 5:
                    zzvz<zzu> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzu.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzalt);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
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
