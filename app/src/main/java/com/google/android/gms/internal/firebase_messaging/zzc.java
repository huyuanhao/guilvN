package com.google.android.gms.internal.firebase_messaging;

public final class zzc {
    public static final zzd zzb;
    public static final int zzc;

    public static final class zza extends zzd {
        @Override // com.google.android.gms.internal.firebase_messaging.zzd
        public final void zza(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_messaging.zzc.<clinit>():void");
    }

    public static void zza(Throwable th, Throwable th2) {
        zzb.zza(th, th2);
    }

    public static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
