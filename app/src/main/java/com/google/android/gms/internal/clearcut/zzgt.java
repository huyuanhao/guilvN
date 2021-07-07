package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

public final class zzgt {

    public static final class zza extends zzcg<zza, C4890zza> implements zzdq {
        public static volatile zzdz<zza> zzbg;
        public static final zza zzbil;

        /* renamed from: com.google.android.gms.internal.clearcut.zzgt$zza$zza  reason: collision with other inner class name */
        public static final class C4890zza extends zzcg.zza<zza, C4890zza> implements zzdq {
            public C4890zza() {
                super(zza.zzbil);
            }

            public /* synthetic */ C4890zza(zzgu zzgu) {
                this();
            }
        }

        public enum zzb implements zzcj {
            NO_RESTRICTION(0),
            SIDEWINDER_DEVICE(1),
            LATCHSKY_DEVICE(2);
            
            public static final zzck<zzb> zzbq = new zzgv();
            public final int value;

            /* access modifiers changed from: public */
            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbe(int i) {
                if (i == 0) {
                    return NO_RESTRICTION;
                }
                if (i == 1) {
                    return SIDEWINDER_DEVICE;
                }
                if (i != 2) {
                    return null;
                }
                return LATCHSKY_DEVICE;
            }

            public static zzck<zzb> zzd() {
                return zzbq;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            zza zza = new zza();
            zzbil = zza;
            zzcg.zza(zza.class, zza);
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt$zza>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r1, java.lang.Object r2, java.lang.Object r3) {
            /*
                r0 = this;
                int[] r2 = com.google.android.gms.internal.clearcut.zzgu.zzba
                r3 = 1
                int r1 = r1 - r3
                r1 = r2[r1]
                r2 = 0
                switch(r1) {
                    case 1: goto L_0x0042;
                    case 2: goto L_0x003c;
                    case 3: goto L_0x0033;
                    case 4: goto L_0x0030;
                    case 5: goto L_0x0016;
                    case 6: goto L_0x0011;
                    case 7: goto L_0x0010;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
            L_0x0010:
                return r2
            L_0x0011:
                java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
                return r1
            L_0x0016:
                com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt$zza> r1 = com.google.android.gms.internal.clearcut.zzgt.zza.zzbg
                if (r1 != 0) goto L_0x002f
                java.lang.Class<com.google.android.gms.internal.clearcut.zzgt$zza> r2 = com.google.android.gms.internal.clearcut.zzgt.zza.class
                monitor-enter(r2)
                com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt$zza> r1 = com.google.android.gms.internal.clearcut.zzgt.zza.zzbg     // Catch:{ all -> 0x002c }
                if (r1 != 0) goto L_0x002a
                com.google.android.gms.internal.clearcut.zzcg$zzb r1 = new com.google.android.gms.internal.clearcut.zzcg$zzb     // Catch:{ all -> 0x002c }
                com.google.android.gms.internal.clearcut.zzgt$zza r3 = com.google.android.gms.internal.clearcut.zzgt.zza.zzbil     // Catch:{ all -> 0x002c }
                r1.<init>(r3)     // Catch:{ all -> 0x002c }
                com.google.android.gms.internal.clearcut.zzgt.zza.zzbg = r1     // Catch:{ all -> 0x002c }
            L_0x002a:
                monitor-exit(r2)     // Catch:{ all -> 0x002c }
                goto L_0x002f
            L_0x002c:
                r1 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002c }
                throw r1
            L_0x002f:
                return r1
            L_0x0030:
                com.google.android.gms.internal.clearcut.zzgt$zza r1 = com.google.android.gms.internal.clearcut.zzgt.zza.zzbil
                return r1
            L_0x0033:
                com.google.android.gms.internal.clearcut.zzgt$zza r1 = com.google.android.gms.internal.clearcut.zzgt.zza.zzbil
                java.lang.String r3 = "\u0001\u0000"
                java.lang.Object r1 = com.google.android.gms.internal.clearcut.zzcg.zza(r1, r3, r2)
                return r1
            L_0x003c:
                com.google.android.gms.internal.clearcut.zzgt$zza$zza r1 = new com.google.android.gms.internal.clearcut.zzgt$zza$zza
                r1.<init>(r2)
                return r1
            L_0x0042:
                com.google.android.gms.internal.clearcut.zzgt$zza r1 = new com.google.android.gms.internal.clearcut.zzgt$zza
                r1.<init>()
                return r1
                switch-data {1->0x0042, 2->0x003c, 3->0x0033, 4->0x0030, 5->0x0016, 6->0x0011, 7->0x0010, }
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzgt.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
