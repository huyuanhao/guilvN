package com.google.android.gms.internal.vision;

public final class zzct {
    public static final zzcu zzlq;
    public static final int zzlr;

    public static final class zza extends zzcu {
        @Override // com.google.android.gms.internal.vision.zzcu
        public final void zza(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzct.<clinit>():void");
    }

    public static void zza(Throwable th) {
        zzlq.zza(th);
    }

    public static Integer zzbq() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
