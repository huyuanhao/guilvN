package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

public final class zzgc extends zzcg.zzd<zzgc, zza> implements zzdq {
    public static volatile zzdz<zzgc> zzbg;
    public static final zzgc zzsg;
    public byte zzsf = 2;

    public static final class zza extends zzcg.zzc<zzgc, zza> implements zzdq {
        public zza() {
            super(zzgc.zzsg);
        }

        public /* synthetic */ zza(zzgd zzgd) {
            this();
        }
    }

    static {
        zzgc zzgc = new zzgc();
        zzsg = zzgc;
        zzcg.zza(zzgc.class, zzgc);
    }

    public static zzgc zzer() {
        return zzsg;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgc>, com.google.android.gms.internal.clearcut.zzcg$zzb] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.clearcut.zzcg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            int[] r4 = com.google.android.gms.internal.clearcut.zzgd.zzba
            r0 = 1
            int r2 = r2 - r0
            r2 = r4[r2]
            r4 = 0
            switch(r2) {
                case 1: goto L_0x004a;
                case 2: goto L_0x0044;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x001e;
                case 6: goto L_0x0017;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L_0x0010:
            if (r3 != 0) goto L_0x0013
            r0 = 0
        L_0x0013:
            byte r2 = (byte) r0
            r1.zzsf = r2
            return r4
        L_0x0017:
            byte r2 = r1.zzsf
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
        L_0x001e:
            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgc> r2 = com.google.android.gms.internal.clearcut.zzgc.zzbg
            if (r2 != 0) goto L_0x0037
            java.lang.Class<com.google.android.gms.internal.clearcut.zzgc> r3 = com.google.android.gms.internal.clearcut.zzgc.class
            monitor-enter(r3)
            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgc> r2 = com.google.android.gms.internal.clearcut.zzgc.zzbg     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0032
            com.google.android.gms.internal.clearcut.zzcg$zzb r2 = new com.google.android.gms.internal.clearcut.zzcg$zzb     // Catch:{ all -> 0x0034 }
            com.google.android.gms.internal.clearcut.zzgc r4 = com.google.android.gms.internal.clearcut.zzgc.zzsg     // Catch:{ all -> 0x0034 }
            r2.<init>(r4)     // Catch:{ all -> 0x0034 }
            com.google.android.gms.internal.clearcut.zzgc.zzbg = r2     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r2
        L_0x0037:
            return r2
        L_0x0038:
            com.google.android.gms.internal.clearcut.zzgc r2 = com.google.android.gms.internal.clearcut.zzgc.zzsg
            return r2
        L_0x003b:
            com.google.android.gms.internal.clearcut.zzgc r2 = com.google.android.gms.internal.clearcut.zzgc.zzsg
            java.lang.String r3 = "\u0003\u0000"
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.zzcg.zza(r2, r3, r4)
            return r2
        L_0x0044:
            com.google.android.gms.internal.clearcut.zzgc$zza r2 = new com.google.android.gms.internal.clearcut.zzgc$zza
            r2.<init>(r4)
            return r2
        L_0x004a:
            com.google.android.gms.internal.clearcut.zzgc r2 = new com.google.android.gms.internal.clearcut.zzgc
            r2.<init>()
            return r2
            switch-data {1->0x004a, 2->0x0044, 3->0x003b, 4->0x0038, 5->0x001e, 6->0x0017, 7->0x0010, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzgc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
