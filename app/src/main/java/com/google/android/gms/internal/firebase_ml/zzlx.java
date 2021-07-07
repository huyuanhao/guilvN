package com.google.android.gms.internal.firebase_ml;

public final class zzlx {
    public static final zzly zzadp;
    public static final int zzadq;

    public static final class zza extends zzly {
        @Override // com.google.android.gms.internal.firebase_ml.zzly
        public final void zza(Throwable th, Throwable th2) {
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzly
        public final void zzb(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzlx.<clinit>():void");
    }

    public static void zza(Throwable th, Throwable th2) {
        zzadp.zza(th, th2);
    }

    public static void zzb(Throwable th) {
        zzadp.zzb(th);
    }

    public static Integer zziw() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
