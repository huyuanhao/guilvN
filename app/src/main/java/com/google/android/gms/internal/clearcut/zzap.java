package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

public final class zzap {

    public static final class zza extends zzcg<zza, C4888zza> implements zzdq {
        public static volatile zzdz<zza> zzbg;
        public static final zza zzes;
        public int zzbb;
        public int zzel;
        public int zzem;
        public int zzen;
        public int zzeo;
        public int zzep;
        public int zzeq;
        public int zzer;

        /* renamed from: com.google.android.gms.internal.clearcut.zzap$zza$zza  reason: collision with other inner class name */
        public static final class C4888zza extends zzcg.zza<zza, C4888zza> implements zzdq {
            public C4888zza() {
                super(zza.zzes);
            }

            public /* synthetic */ C4888zza(zzaq zzaq) {
                this();
            }
        }

        public enum zzb implements zzcj {
            zzet(0),
            ON(1),
            OFF(2);
            
            public static final zzck<zzb> zzbq = new zzar();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzck<zzb> zzd() {
                return zzbq;
            }

            public static zzb zze(int i) {
                if (i == 0) {
                    return zzet;
                }
                if (i == 1) {
                    return ON;
                }
                if (i != 2) {
                    return null;
                }
                return OFF;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            zza zza = new zza();
            zzes = zza;
            zzcg.zza(zza.class, zza);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzap$zza>, com.google.android.gms.internal.clearcut.zzcg$zzb] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 190
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzap.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
