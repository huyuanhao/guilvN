package com.google.android.gms.internal.vision;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.p118pd.sdk.C9058ooOoOoOO;
import javax.annotation.concurrent.GuardedBy;

public abstract class zzm<T> {
    public static String PREFIX = "com.google.android.gms.vision.dynamite";
    public final Object lock = new Object();
    public final String tag;
    public final String zzdh;
    public final String zzdi;
    public boolean zzdj = false;
    @GuardedBy("lock")
    public T zzdk;
    public final Context zze;

    public zzm(Context context, String str, String str2) {
        this.zze = context;
        this.tag = str;
        String str3 = PREFIX;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str2).length());
        sb.append(str3);
        sb.append(C9058ooOoOoOO.OooOO0);
        sb.append(str2);
        this.zzdh = sb.toString();
        this.zzdi = PREFIX;
    }

    public final boolean isOperational() {
        return zzq() != null;
    }

    public abstract T zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException;

    public abstract void zzm() throws RemoteException;

    public final void zzp() {
        synchronized (this.lock) {
            if (this.zzdk != null) {
                try {
                    zzm();
                } catch (RemoteException unused) {
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:8|9|10|11|12|(2:15|16)|17|(2:23|(1:25))(1:22)|26|27|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0017 */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: RemoteException (unused android.os.RemoteException), SYNTHETIC, Splitter:B:15:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T zzq() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            T r1 = r5.zzdk     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x000b
            T r1 = r5.zzdk     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return r1
        L_0x000b:
            r1 = 0
            android.content.Context r2 = r5.zze     // Catch:{ LoadingException -> 0x0017 }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION     // Catch:{ LoadingException -> 0x0017 }
            java.lang.String r4 = r5.zzdh     // Catch:{ LoadingException -> 0x0017 }
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r4)     // Catch:{ LoadingException -> 0x0017 }
            goto L_0x0023
        L_0x0017:
            android.content.Context r2 = r5.zze     // Catch:{ LoadingException -> 0x0022 }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION     // Catch:{ LoadingException -> 0x0022 }
            java.lang.String r4 = r5.zzdi     // Catch:{ LoadingException -> 0x0022 }
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r4)     // Catch:{ LoadingException -> 0x0022 }
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            if (r1 == 0) goto L_0x002d
            android.content.Context r2 = r5.zze     // Catch:{ RemoteException -> 0x002d, RemoteException -> 0x002d }
            java.lang.Object r1 = r5.zza(r1, r2)     // Catch:{ RemoteException -> 0x002d, RemoteException -> 0x002d }
            r5.zzdk = r1     // Catch:{ RemoteException -> 0x002d, RemoteException -> 0x002d }
        L_0x002d:
            boolean r1 = r5.zzdj
            if (r1 != 0) goto L_0x0039
            T r1 = r5.zzdk
            if (r1 != 0) goto L_0x0039
            r1 = 1
            r5.zzdj = r1
            goto L_0x003f
        L_0x0039:
            boolean r1 = r5.zzdj
            if (r1 == 0) goto L_0x003f
            T r1 = r5.zzdk
        L_0x003f:
            T r1 = r5.zzdk
            monitor-exit(r0)
            return r1
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzm.zzq():java.lang.Object");
    }
}
