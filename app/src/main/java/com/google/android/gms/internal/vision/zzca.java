package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
import java.util.List;

public final class zzca {
    public static final zzfy.zzf<zzjx, List<zzb>> zziv = zzfy.zza(zzjx.zzid(), zzb.zzbb(), null, 202056002, zzjd.MESSAGE, false, zzb.class);

    public static final class zzb extends zzfy<zzb, zza> implements zzhh {
        public static volatile zzhq<zzb> zzbf;
        public static final zzb zzjf;
        public int zzbg;
        public int zzjd;
        public zzge<C4900zzb> zzje = zzfy.zzey();

        public static final class zza extends zzfy.zza<zzb, zza> implements zzhh {
            public zza() {
                super(zzb.zzjf);
            }

            public /* synthetic */ zza(zzcb zzcb) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.vision.zzca$zzb$zzb  reason: collision with other inner class name */
        public static final class C4900zzb extends zzfy<C4900zzb, zza> implements zzhh {
            public static volatile zzhq<C4900zzb> zzbf;
            public static final C4900zzb zzjj;
            public int zzbg;
            public float zzjg;
            public float zzjh;
            public float zzji;

            /* renamed from: com.google.android.gms.internal.vision.zzca$zzb$zzb$zza */
            public static final class zza extends zzfy.zza<C4900zzb, zza> implements zzhh {
                public zza() {
                    super(C4900zzb.zzjj);
                }

                public /* synthetic */ zza(zzcb zzcb) {
                    this();
                }
            }

            static {
                C4900zzb zzb = new C4900zzb();
                zzjj = zzb;
                zzfy.zza(C4900zzb.class, zzb);
            }

            public final float getX() {
                return this.zzjg;
            }

            public final float getY() {
                return this.zzjh;
            }

            @Override // com.google.android.gms.internal.vision.zzfy
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzcb.zzbc[i - 1]) {
                    case 1:
                        return new C4900zzb();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzfy.zza(zzjj, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002", new Object[]{"zzbg", "zzjg", "zzjh", "zzji"});
                    case 4:
                        return zzjj;
                    case 5:
                        zzhq<C4900zzb> zzhq = zzbf;
                        if (zzhq == null) {
                            synchronized (C4900zzb.class) {
                                zzhq = zzbf;
                                if (zzhq == null) {
                                    zzhq = new zzfy.zzb<>(zzjj);
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

        public enum zzc implements zzgb {
            CONTOUR_UNKNOWN(0),
            FACE_OVAL(1),
            LEFT_EYEBROW_TOP(2),
            LEFT_EYEBROW_BOTTOM(3),
            RIGHT_EYEBROW_TOP(4),
            RIGHT_EYEBROW_BOTTOM(5),
            LEFT_EYE(6),
            RIGHT_EYE(7),
            UPPER_LIP_TOP(8),
            UPPER_LIP_BOTTOM(9),
            LOWER_LIP_TOP(10),
            LOWER_LIP_BOTTOM(11),
            NOSE_BRIDGE(12),
            NOSE_BOTTOM(13),
            LEFT_CHEEK_CENTER(14),
            RIGHT_CHEEK_CENTER(15);
            
            public static final zzgc<zzc> zzdv = new zzcf();
            public final int value;

            /* access modifiers changed from: public */
            zzc(int i) {
                this.value = i;
            }

            public static zzgd zzah() {
                return zzcg.zzhl;
            }

            public static zzc zzp(int i) {
                switch (i) {
                    case 0:
                        return CONTOUR_UNKNOWN;
                    case 1:
                        return FACE_OVAL;
                    case 2:
                        return LEFT_EYEBROW_TOP;
                    case 3:
                        return LEFT_EYEBROW_BOTTOM;
                    case 4:
                        return RIGHT_EYEBROW_TOP;
                    case 5:
                        return RIGHT_EYEBROW_BOTTOM;
                    case 6:
                        return LEFT_EYE;
                    case 7:
                        return RIGHT_EYE;
                    case 8:
                        return UPPER_LIP_TOP;
                    case 9:
                        return UPPER_LIP_BOTTOM;
                    case 10:
                        return LOWER_LIP_TOP;
                    case 11:
                        return LOWER_LIP_BOTTOM;
                    case 12:
                        return NOSE_BRIDGE;
                    case 13:
                        return NOSE_BOTTOM;
                    case 14:
                        return LEFT_CHEEK_CENTER;
                    case 15:
                        return RIGHT_CHEEK_CENTER;
                    default:
                        return null;
                }
            }

            @Override // com.google.android.gms.internal.vision.zzgb
            public final int zzr() {
                return this.value;
            }
        }

        static {
            zzb zzb = new zzb();
            zzjf = zzb;
            zzfy.zza(zzb.class, zzb);
        }

        public static zzb zzbb() {
            return zzjf;
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcb.zzbc[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzjf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzbg", "zzjd", zzc.zzah(), "zzje", C4900zzb.class});
                case 4:
                    return zzjf;
                case 5:
                    zzhq<zzb> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzb.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzjf);
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

        public final zzc zzay() {
            zzc zzp = zzc.zzp(this.zzjd);
            return zzp == null ? zzc.CONTOUR_UNKNOWN : zzp;
        }

        public final List<C4900zzb> zzaz() {
            return this.zzje;
        }

        public final int zzba() {
            return this.zzje.size();
        }
    }

    public static final class zzc extends zzfy<zzc, zza> implements zzhh {
        public static volatile zzhq<zzc> zzbf;
        public static final zzc zzkd;
        public int zzbg;
        public zzkf zzkb;
        public byte zzkc = 2;

        public static final class zza extends zzfy.zza<zzc, zza> implements zzhh {
            public zza() {
                super(zzc.zzkd);
            }

            public /* synthetic */ zza(zzcb zzcb) {
                this();
            }
        }

        static {
            zzc zzc = new zzc();
            zzkd = zzc;
            zzfy.zza(zzc.class, zzc);
        }

        public static zzc zza(byte[] bArr, zzfk zzfk) throws zzgf {
            return (zzc) zzfy.zzb(zzkd, bArr, zzfk);
        }

        public final zzkf zzbe() {
            zzkf zzkf = this.zzkb;
            return zzkf == null ? zzkf.zziq() : zzkf;
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            int i2 = 1;
            switch (zzcb.zzbc[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzkd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"zzbg", "zzkb"});
                case 4:
                    return zzkd;
                case 5:
                    zzhq<zzc> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzc.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzkd);
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
    }

    public static final class zze extends zzfy<zze, zza> implements zzhh {
        public static volatile zzhq<zze> zzbf;
        public static final zze zzku;
        public int zzbg;
        public zzg zzkr;
        public zzg zzks;
        public zzg zzkt;

        public static final class zza extends zzfy.zza<zze, zza> implements zzhh {
            public zza() {
                super(zze.zzku);
            }

            public final zza zzh(zzg zzg) {
                zzfc();
                ((zze) this.zzwn).zze(zzg);
                return this;
            }

            public final zza zzi(zzg zzg) {
                zzfc();
                ((zze) this.zzwn).zzf(zzg);
                return this;
            }

            public final zza zzj(zzg zzg) {
                zzfc();
                ((zze) this.zzwn).zzg(zzg);
                return this;
            }

            public /* synthetic */ zza(zzcb zzcb) {
                this();
            }
        }

        static {
            zze zze = new zze();
            zzku = zze;
            zzfy.zza(zze.class, zze);
        }

        public static zza zzbk() {
            return (zza) ((zzfy.zza) zzku.zza(zzfy.zzg.zzxb, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zze(zzg zzg) {
            if (zzg != null) {
                this.zzkr = zzg;
                this.zzbg |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzf(zzg zzg) {
            if (zzg != null) {
                this.zzks = zzg;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzg(zzg zzg) {
            if (zzg != null) {
                this.zzkt = zzg;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcb.zzbc[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzku, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzkr", "zzks", "zzkt"});
                case 4:
                    return zzku;
                case 5:
                    zzhq<zze> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zze.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzku);
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
        public static final zzf zzle;
        public int zzbg;
        public zzg zzla;
        public zzg zzlb;
        public zzg zzlc;
        public zzg zzld;

        public static final class zza extends zzfy.zza<zzf, zza> implements zzhh {
            public zza() {
                super(zzf.zzle);
            }

            public final zza zzo(zzg zzg) {
                zzfc();
                ((zzf) this.zzwn).zzk(zzg);
                return this;
            }

            public final zza zzp(zzg zzg) {
                zzfc();
                ((zzf) this.zzwn).zzl(zzg);
                return this;
            }

            public final zza zzq(zzg zzg) {
                zzfc();
                ((zzf) this.zzwn).zzm(zzg);
                return this;
            }

            public final zza zzr(zzg zzg) {
                zzfc();
                ((zzf) this.zzwn).zzn(zzg);
                return this;
            }

            public /* synthetic */ zza(zzcb zzcb) {
                this();
            }
        }

        static {
            zzf zzf = new zzf();
            zzle = zzf;
            zzfy.zza(zzf.class, zzf);
        }

        public static zza zzbm() {
            return (zza) ((zzfy.zza) zzle.zza(zzfy.zzg.zzxb, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzk(zzg zzg) {
            if (zzg != null) {
                this.zzla = zzg;
                this.zzbg |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzl(zzg zzg) {
            if (zzg != null) {
                this.zzlb = zzg;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzm(zzg zzg) {
            if (zzg != null) {
                this.zzlc = zzg;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzn(zzg zzg) {
            if (zzg != null) {
                this.zzld = zzg;
                this.zzbg |= 8;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcb.zzbc[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzle, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"zzbg", "zzla", "zzlb", "zzlc", "zzld"});
                case 4:
                    return zzle;
                case 5:
                    zzhq<zzf> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzf.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzle);
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
        public static final zzg zzlm;
        public int zzbg;
        public zzeo zzlk = zzeo.zzrx;
        public String zzll = "";

        public static final class zza extends zzfy.zza<zzg, zza> implements zzhh {
            public zza() {
                super(zzg.zzlm);
            }

            public final zza zzj(String str) {
                zzfc();
                ((zzg) this.zzwn).zzi(str);
                return this;
            }

            public /* synthetic */ zza(zzcb zzcb) {
                this();
            }
        }

        static {
            zzg zzg = new zzg();
            zzlm = zzg;
            zzfy.zza(zzg.class, zzg);
        }

        public static zza zzbo() {
            return (zza) ((zzfy.zza) zzlm.zza(zzfy.zzg.zzxb, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzi(String str) {
            if (str != null) {
                this.zzbg |= 2;
                this.zzll = str;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcb.zzbc[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzlm, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0000\u0002\b\u0001", new Object[]{"zzbg", "zzlk", "zzll"});
                case 4:
                    return zzlm;
                case 5:
                    zzhq<zzg> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzg.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzlm);
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

    public static final class zza extends zzfy<zza, C4899zza> implements zzhh {
        public static volatile zzhq<zza> zzbf;
        public static final zza zziy;
        public int zzbg;
        public zzg zziw;
        public zzg zzix;

        /* renamed from: com.google.android.gms.internal.vision.zzca$zza$zza  reason: collision with other inner class name */
        public static final class C4899zza extends zzfy.zza<zza, C4899zza> implements zzhh {
            public C4899zza() {
                super(zza.zziy);
            }

            public final C4899zza zzc(zzg zzg) {
                zzfc();
                ((zza) this.zzwn).zza((zza) zzg);
                return this;
            }

            public final C4899zza zzd(zzg zzg) {
                zzfc();
                ((zza) this.zzwn).zzb((zza) zzg);
                return this;
            }

            public /* synthetic */ C4899zza(zzcb zzcb) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zziy = zza;
            zzfy.zza(zza.class, zza);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzg zzg) {
            if (zzg != null) {
                this.zziw = zzg;
                this.zzbg |= 1;
                return;
            }
            throw null;
        }

        public static C4899zza zzaw() {
            return (C4899zza) ((zzfy.zza) zziy.zza(zzfy.zzg.zzxb, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzb(zzg zzg) {
            if (zzg != null) {
                this.zzix = zzg;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcb.zzbc[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C4899zza(null);
                case 3:
                    return zzfy.zza(zziy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzbg", "zziw", "zzix"});
                case 4:
                    return zziy;
                case 5:
                    zzhq<zza> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zza.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zziy);
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
        public static final zzd zzkq;
        public int zzbg;
        public float zzke = 0.1f;
        public int zzkf = 1;
        public int zzkg = 1;
        public int zzkh = 1;
        public boolean zzki;
        public boolean zzkj;
        public float zzkk = 45.0f;
        public float zzkl = 0.5f;
        public boolean zzkm;
        public zze zzkn;
        public zza zzko;
        public zzf zzkp;

        public static final class zza extends zzfy.zza<zzd, zza> implements zzhh {
            public zza() {
                super(zzd.zzkq);
            }

            public final zza zzb(zzch zzch) {
                zzfc();
                ((zzd) this.zzwn).zza((zzd) zzch);
                return this;
            }

            public final zza zzd(boolean z) {
                zzfc();
                ((zzd) this.zzwn).zza((zzd) z);
                return this;
            }

            public final zza zze(float f) {
                zzfc();
                ((zzd) this.zzwn).zzd((zzd) f);
                return this;
            }

            public final zza zzf(boolean z) {
                zzfc();
                ((zzd) this.zzwn).zzc(true);
                return this;
            }

            public /* synthetic */ zza(zzcb zzcb) {
                this();
            }

            public final zza zzb(zzcc zzcc) {
                zzfc();
                ((zzd) this.zzwn).zza((zzd) zzcc);
                return this;
            }

            public final zza zze(boolean z) {
                zzfc();
                ((zzd) this.zzwn).zzb((zzd) z);
                return this;
            }

            public final zza zzb(zzck zzck) {
                zzfc();
                ((zzd) this.zzwn).zza((zzd) zzck);
                return this;
            }

            public final zza zzb(zze zze) {
                zzfc();
                ((zzd) this.zzwn).zza((zzd) zze);
                return this;
            }

            public final zza zzb(zza zza) {
                zzfc();
                ((zzd) this.zzwn).zza((zzd) zza);
                return this;
            }

            public final zza zzb(zzf zzf) {
                zzfc();
                ((zzd) this.zzwn).zza((zzd) zzf);
                return this;
            }
        }

        static {
            zzd zzd = new zzd();
            zzkq = zzd;
            zzfy.zza(zzd.class, zzd);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzch zzch) {
            if (zzch != null) {
                this.zzbg |= 2;
                this.zzkf = zzch.zzr();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzb(boolean z) {
            this.zzbg |= 32;
            this.zzkj = z;
        }

        public static zza zzbi() {
            return (zza) ((zzfy.zza) zzkq.zza(zzfy.zzg.zzxb, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzc(boolean z) {
            this.zzbg |= 256;
            this.zzkm = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzd(float f) {
            this.zzbg |= 1;
            this.zzke = f;
        }

        public final zzch zzbg() {
            zzch zzq = zzch.zzq(this.zzkf);
            return zzq == null ? zzch.NO_LANDMARK : zzq;
        }

        public final zzcc zzbh() {
            zzcc zzo = zzcc.zzo(this.zzkg);
            return zzo == null ? zzcc.NO_CLASSIFICATION : zzo;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzcc zzcc) {
            if (zzcc != null) {
                this.zzbg |= 4;
                this.zzkg = zzcc.zzr();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzck zzck) {
            if (zzck != null) {
                this.zzbg |= 8;
                this.zzkh = zzck.zzr();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(boolean z) {
            this.zzbg |= 16;
            this.zzki = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zze zze) {
            if (zze != null) {
                this.zzkn = zze;
                this.zzbg |= 512;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzko = zza2;
                this.zzbg |= 1024;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzf zzf) {
            if (zzf != null) {
                this.zzkp = zzf;
                this.zzbg |= 2048;
                return;
            }
            throw null;
        }

        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzcb.zzbc[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzkq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\u0001\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0001\u0006\b\u0001\u0007\t\u0007\b\n\t\t\u000b\t\n\f\t\u000b", new Object[]{"zzbg", "zzke", "zzkf", zzch.zzah(), "zzkg", zzcc.zzah(), "zzkh", zzck.zzah(), "zzki", "zzkj", "zzkk", "zzkl", "zzkm", "zzkn", "zzko", "zzkp"});
                case 4:
                    return zzkq;
                case 5:
                    zzhq<zzd> zzhq = zzbf;
                    if (zzhq == null) {
                        synchronized (zzd.class) {
                            zzhq = zzbf;
                            if (zzhq == null) {
                                zzhq = new zzfy.zzb<>(zzkq);
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
