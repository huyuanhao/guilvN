package com.google.firebase.iid;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.p118pd.sdk.C6971o0000oO0;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Map;

public final class zzba {
    @GuardedBy("itself")
    public final zzaw zzaj;
    @GuardedBy("this")
    public int zzdl = 0;
    @GuardedBy("this")
    public final Map<Integer, TaskCompletionSource<Void>> zzdm = new C6971o0000oO0();

    public zzba(zzaw zzaw) {
        this.zzaj = zzaw;
    }

    @Nullable
    @GuardedBy("this")
    private final String zzar() {
        String zzak;
        synchronized (this.zzaj) {
            zzak = this.zzaj.zzak();
        }
        if (TextUtils.isEmpty(zzak)) {
            return null;
        }
        String[] split = zzak.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    private final synchronized boolean zzk(String str) {
        synchronized (this.zzaj) {
            String zzak = this.zzaj.zzak();
            String valueOf = String.valueOf(str);
            if (!zzak.startsWith(valueOf.length() != 0 ? Constants.ACCEPT_TIME_SEPARATOR_SP.concat(valueOf) : new String(Constants.ACCEPT_TIME_SEPARATOR_SP))) {
                return false;
            }
            String valueOf2 = String.valueOf(str);
            this.zzaj.zzf(zzak.substring((valueOf2.length() != 0 ? Constants.ACCEPT_TIME_SEPARATOR_SP.concat(valueOf2) : new String(Constants.ACCEPT_TIME_SEPARATOR_SP)).length()));
            return true;
        }
    }

    public final synchronized Task<Void> zza(String str) {
        String zzak;
        TaskCompletionSource<Void> taskCompletionSource;
        int i;
        synchronized (this.zzaj) {
            zzak = this.zzaj.zzak();
            zzaw zzaw = this.zzaj;
            StringBuilder sb = new StringBuilder(String.valueOf(zzak).length() + 1 + String.valueOf(str).length());
            sb.append(zzak);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(str);
            zzaw.zzf(sb.toString());
        }
        taskCompletionSource = new TaskCompletionSource<>();
        Map<Integer, TaskCompletionSource<Void>> map = this.zzdm;
        if (TextUtils.isEmpty(zzak)) {
            i = 0;
        } else {
            i = zzak.split(Constants.ACCEPT_TIME_SEPARATOR_SP).length - 1;
        }
        map.put(Integer.valueOf(this.zzdl + i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final synchronized boolean zzaq() {
        return zzar() != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = r4.zzdm.remove(java.lang.Integer.valueOf(r4.zzdl));
        zzk(r0);
        r4.zzdl++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r2.setResult(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (zza(r5, r0) != false) goto L_0x0017;
     */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzc(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.zzar()     // Catch:{ all -> 0x0039 }
            r1 = 1
            if (r0 != 0) goto L_0x000e
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.zzl()     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            boolean r2 = zza(r5, r0)
            if (r2 != 0) goto L_0x0017
            r5 = 0
            return r5
        L_0x0017:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> r2 = r4.zzdm     // Catch:{ all -> 0x0036 }
            int r3 = r4.zzdl     // Catch:{ all -> 0x0036 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x0036 }
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2     // Catch:{ all -> 0x0036 }
            r4.zzk(r0)     // Catch:{ all -> 0x0036 }
            int r0 = r4.zzdl     // Catch:{ all -> 0x0036 }
            int r0 = r0 + r1
            r4.zzdl = r0     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.setResult(r0)
            goto L_0x0000
        L_0x0036:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0039:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x003d
        L_0x003c:
            throw r5
        L_0x003d:
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzba.zzc(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    @WorkerThread
    public static boolean zza(FirebaseInstanceId firebaseInstanceId, String str) {
        String[] split = str.split("!");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            char c = 65535;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str2.equals("U")) {
                            c = 1;
                        }
                    }
                } else if (str2.equals(ExifInterface.o000oOoo)) {
                    c = 0;
                }
                if (c == 0) {
                    firebaseInstanceId.zzb(str3);
                    FirebaseInstanceId.zzl();
                } else if (c == 1) {
                    firebaseInstanceId.zzc(str3);
                    FirebaseInstanceId.zzl();
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Topic sync failed: ".concat(valueOf);
                } else {
                    new String("Topic sync failed: ");
                }
                return false;
            }
        }
        return true;
    }
}
