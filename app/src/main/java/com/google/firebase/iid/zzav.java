package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.p118pd.sdk.C6987o000O0o;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public final class zzav {
    public static zzav zzcx;
    @GuardedBy("serviceClassNames")
    public final C6987o000O0o<String, String> zzcy = new C6987o000O0o<>();
    public Boolean zzcz = null;
    @VisibleForTesting
    public final Queue<Intent> zzda = new ArrayDeque();
    @VisibleForTesting
    public final Queue<Intent> zzdb = new ArrayDeque();

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, zza(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    public static synchronized zzav zzai() {
        zzav zzav;
        synchronized (zzav.class) {
            if (zzcx == null) {
                zzcx = new zzav();
            }
            zzav = zzcx;
        }
        return zzav;
    }

    public static void zzb(Context context, Intent intent) {
        context.sendBroadcast(zza(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    public static void zzc(Context context, Intent intent) {
        context.sendBroadcast(zza(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3 A[Catch:{ SecurityException -> 0x010c, IllegalStateException -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00da A[Catch:{ SecurityException -> 0x010c, IllegalStateException -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df A[Catch:{ SecurityException -> 0x010c, IllegalStateException -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzd(android.content.Context r6, android.content.Intent r7) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzav.zzd(android.content.Context, android.content.Intent):int");
    }

    public final Intent zzaj() {
        return this.zzdb.poll();
    }

    public final int zzb(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Starting service: ".concat(valueOf);
            } else {
                new String("Starting service: ");
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                c = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            c = 0;
        }
        if (c == 0) {
            this.zzda.offer(intent);
        } else if (c != 1) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "Unknown service action: ".concat(valueOf2);
                return 500;
            }
            new String("Unknown service action: ");
            return 500;
        } else {
            this.zzdb.offer(intent);
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return zzd(context, intent2);
    }

    public static Intent zza(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }
}
