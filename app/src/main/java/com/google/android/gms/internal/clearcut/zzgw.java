package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.util.List;

public final class zzgw {

    public static final class zza extends zzcg<zza, C4891zza> implements zzdq {
        public static volatile zzdz<zza> zzbg;
        public static final zza zzbir;
        public zzcn<zzb> zzbiq = zzcg.zzbb();

        /* renamed from: com.google.android.gms.internal.clearcut.zzgw$zza$zza  reason: collision with other inner class name */
        public static final class C4891zza extends zzcg.zza<zza, C4891zza> implements zzdq {
            public C4891zza() {
                super(zza.zzbir);
            }

            public /* synthetic */ C4891zza(zzgx zzgx) {
                this();
            }
        }

        public static final class zzb extends zzcg<zzb, C4892zza> implements zzdq {
            public static volatile zzdz<zzb> zzbg;
            public static final zzb zzbiv;
            public int zzbb;
            public String zzbis = "";
            public long zzbit;
            public long zzbiu;
            public int zzya;

            /* renamed from: com.google.android.gms.internal.clearcut.zzgw$zza$zzb$zza  reason: collision with other inner class name */
            public static final class C4892zza extends zzcg.zza<zzb, C4892zza> implements zzdq {
                public C4892zza() {
                    super(zzb.zzbiv);
                }

                public /* synthetic */ C4892zza(zzgx zzgx) {
                    this();
                }

                public final C4892zza zzn(String str) {
                    zzbf();
                    ((zzb) this.zzjt).zzm(str);
                    return this;
                }

                public final C4892zza zzr(long j) {
                    zzbf();
                    ((zzb) this.zzjt).zzp(j);
                    return this;
                }

                public final C4892zza zzs(long j) {
                    zzbf();
                    ((zzb) this.zzjt).zzq(j);
                    return this;
                }
            }

            static {
                zzb zzb = new zzb();
                zzbiv = zzb;
                zzcg.zza(zzb.class, zzb);
            }

            public static C4892zza zzfz() {
                return (C4892zza) ((zzcg.zza) zzbiv.zza(zzcg.zzg.zzkh, (Object) null, (Object) null));
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzm(String str) {
                if (str != null) {
                    this.zzbb |= 2;
                    this.zzbis = str;
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzp(long j) {
                this.zzbb |= 4;
                this.zzbit = j;
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private final void zzq(long j) {
                this.zzbb |= 8;
                this.zzbiu = j;
            }

            public final int getEventCode() {
                return this.zzya;
            }

            /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw$zza$zzb>, com.google.android.gms.internal.clearcut.zzcg$zzb] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.google.android.gms.internal.clearcut.zzcg
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                // Method dump skipped, instructions count: 118
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }

            public final boolean zzfv() {
                return (this.zzbb & 1) == 1;
            }

            public final String zzfw() {
                return this.zzbis;
            }

            public final long zzfx() {
                return this.zzbit;
            }

            public final long zzfy() {
                return this.zzbiu;
            }
        }

        static {
            zza zza = new zza();
            zzbir = zza;
            zzcg.zza(zza.class, zza);
        }

        public static zza zzft() {
            return zzbir;
        }

        public static zza zzi(byte[] bArr) throws zzco {
            return (zza) zzcg.zzb(zzbir, bArr);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw$zza>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzgw.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        public final List<zzb> zzfs() {
            return this.zzbiq;
        }
    }
}
