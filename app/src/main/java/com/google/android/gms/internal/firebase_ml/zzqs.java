package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;

public final class zzqs {

    public static final class zza extends zzue<zza, C4897zza> implements zzvq {
        public static final zzum<Integer, zzsk> zzbbb = new zzqu();
        public static final zza zzbbc;
        public static volatile zzvz<zza> zzbm;
        public zzul zzbba = zzue.zzqz();

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzqs$zza$zza  reason: collision with other inner class name */
        public static final class C4897zza extends zzue.zza<zza, C4897zza> implements zzvq {
            public C4897zza() {
                super(zza.zzbbc);
            }

            public final C4897zza zzp(Iterable<? extends zzsk> iterable) {
                zzrf();
                ((zza) this.zzbol).zzo(iterable);
                return this;
            }

            public /* synthetic */ C4897zza(zzqt zzqt) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzbbc = zza;
            zzue.zza(zza.class, zza);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzo(Iterable<? extends zzsk> iterable) {
            if (!this.zzbba.zzps()) {
                this.zzbba = zzue.zza(this.zzbba);
            }
            for (zzsk zzsk : iterable) {
                this.zzbba.zzdh(zzsk.zzo());
            }
        }

        public static C4897zza zzof() {
            return (C4897zza) zzbbc.zzqx();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzqt.zzbn[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C4897zza(null);
                case 3:
                    return zzue.zza(zzbbc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzbba", zzsk.zzq()});
                case 4:
                    return zzbbc;
                case 5:
                    zzvz<zza> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zza.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzbbc);
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

    public static final class zzb extends zzue<zzb, zza> implements zzvq {
        public static final zzb zzbbh;
        public static volatile zzvz<zzb> zzbm;
        public float zzajg;
        public int zzbbd;
        public int zzbbe;
        public boolean zzbbf;
        public boolean zzbbg;
        public int zzbg;
        public int zzgd;

        public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
            public zza() {
                super(zzb.zzbbh);
            }

            public /* synthetic */ zza(zzqt zzqt) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzqs$zzb$zzb  reason: collision with other inner class name */
        public enum EnumC4898zzb implements zzuh {
            CLASSIFICATION_UNKNOWN(0),
            CLASSIFICATION_NONE(1),
            CLASSIFICATION_ALL(2);
            
            public static final zzui<EnumC4898zzb> zzbe = new zzqv();
            public final int value;

            /* access modifiers changed from: public */
            EnumC4898zzb(int i) {
                this.value = i;
            }

            public static EnumC4898zzb zzbv(int i) {
                if (i == 0) {
                    return CLASSIFICATION_UNKNOWN;
                }
                if (i == 1) {
                    return CLASSIFICATION_NONE;
                }
                if (i != 2) {
                    return null;
                }
                return CLASSIFICATION_ALL;
            }

            public static zzuj zzq() {
                return zzqw.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        public enum zzc implements zzuh {
            LANDMARK_UNKNOWN(0),
            LANDMARK_NONE(1),
            LANDMARK_ALL(2),
            LANDMARK_CONTOUR(3);
            
            public static final zzui<zzc> zzbe = new zzqx();
            public final int value;

            /* access modifiers changed from: public */
            zzc(int i) {
                this.value = i;
            }

            public static zzc zzbw(int i) {
                if (i == 0) {
                    return LANDMARK_UNKNOWN;
                }
                if (i == 1) {
                    return LANDMARK_NONE;
                }
                if (i == 2) {
                    return LANDMARK_ALL;
                }
                if (i != 3) {
                    return null;
                }
                return LANDMARK_CONTOUR;
            }

            public static zzuj zzq() {
                return zzqy.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        public enum zzd implements zzuh {
            MODE_UNKNOWN(0),
            MODE_ACCURATE(1),
            MODE_FAST(2),
            MODE_SELFIE(3);
            
            public static final zzui<zzd> zzbe = new zzqz();
            public final int value;

            /* access modifiers changed from: public */
            zzd(int i) {
                this.value = i;
            }

            public static zzd zzbx(int i) {
                if (i == 0) {
                    return MODE_UNKNOWN;
                }
                if (i == 1) {
                    return MODE_ACCURATE;
                }
                if (i == 2) {
                    return MODE_FAST;
                }
                if (i != 3) {
                    return null;
                }
                return MODE_SELFIE;
            }

            public static zzuj zzq() {
                return zzra.zzbs;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzuh
            public final int zzo() {
                return this.value;
            }
        }

        static {
            zzb zzb = new zzb();
            zzbbh = zzb;
            zzue.zza(zzb.class, zzb);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzqt.zzbn[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzue.zza(zzbbh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0001\u0005", new Object[]{"zzbg", "zzgd", zzd.zzq(), "zzbbd", zzc.zzq(), "zzbbe", EnumC4898zzb.zzq(), "zzbbf", "zzbbg", "zzajg"});
                case 4:
                    return zzbbh;
                case 5:
                    zzvz<zzb> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzb.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzbbh);
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
