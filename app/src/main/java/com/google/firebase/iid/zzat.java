package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzl;
import com.p118pd.sdk.C6987o000O0o;
import com.umeng.message.MsgConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

public final class zzat {
    public static int zzcf;
    public static PendingIntent zzcr;
    public final zzan zzan;
    @GuardedBy("responseCallbacks")
    public final C6987o000O0o<String, TaskCompletionSource<Bundle>> zzcs = new C6987o000O0o<>();
    public Messenger zzct;
    public Messenger zzcu;
    public zzl zzcv;
    public final Context zzx;

    public zzat(Context context, zzan zzan2) {
        this.zzx = context;
        this.zzan = zzan2;
        this.zzct = new Messenger(new zzau(this, Looper.getMainLooper()));
    }

    public static synchronized void zza(Context context, Intent intent) {
        synchronized (zzat.class) {
            if (zzcr == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                zzcr = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", zzcr);
        }
    }

    public static synchronized String zzah() {
        String num;
        synchronized (zzat.class) {
            int i = zzcf;
            zzcf = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* access modifiers changed from: private */
    public final void zzb(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzl.zza());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzl) {
                        this.zzcv = (zzl) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.zzcu = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra(MsgConstant.KEY_REGISTRATION_ID);
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            sb.toString();
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf2 = String.valueOf(stringExtra2);
                            if (valueOf2.length() != 0) {
                                "Received InstanceID error ".concat(valueOf2);
                            } else {
                                new String("Received InstanceID error ");
                            }
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                String valueOf3 = String.valueOf(stringExtra2);
                                if (valueOf3.length() != 0) {
                                    "Unexpected structured response ".concat(valueOf3);
                                } else {
                                    new String("Unexpected structured response ");
                                }
                            } else {
                                String str = split[2];
                                String str2 = split[3];
                                if (str2.startsWith(Constants.COLON_SEPARATOR)) {
                                    str2 = str2.substring(1);
                                }
                                zza(str, intent2.putExtra("error", str2).getExtras());
                            }
                        } else {
                            synchronized (this.zzcs) {
                                for (int i = 0; i < this.zzcs.size(); i++) {
                                    zza(this.zzcs.OooO00o(i), intent2.getExtras());
                                }
                            }
                        }
                    } else {
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            Bundle extras = intent2.getExtras();
                            extras.putString(MsgConstant.KEY_REGISTRATION_ID, group2);
                            zza(group, extras);
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf4 = String.valueOf(stringExtra);
                            if (valueOf4.length() != 0) {
                                "Unexpected response string: ".concat(valueOf4);
                            } else {
                                new String("Unexpected response string: ");
                            }
                        }
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf5 = String.valueOf(action);
                    if (valueOf5.length() != 0) {
                        "Unexpected response action: ".concat(valueOf5);
                    } else {
                        new String("Unexpected response action: ");
                    }
                }
            }
        }
    }

    private final Bundle zzd(Bundle bundle) throws IOException {
        Bundle zze = zze(bundle);
        if (zze == null || !zze.containsKey("google.messenger")) {
            return zze;
        }
        Bundle zze2 = zze(bundle);
        if (zze2 == null || !zze2.containsKey("google.messenger")) {
            return zze2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle zze(android.os.Bundle r8) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzat.zze(android.os.Bundle):android.os.Bundle");
    }

    public final Bundle zzc(Bundle bundle) throws IOException {
        if (this.zzan.zzaf() < 12000000) {
            return zzd(bundle);
        }
        try {
            return (Bundle) Tasks.await(zzab.zzc(this.zzx).zzb(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                sb.toString();
            }
            if (!(e.getCause() instanceof zzal) || ((zzal) e.getCause()).getErrorCode() != 4) {
                return null;
            }
            return zzd(bundle);
        }
    }

    private final void zza(String str, Bundle bundle) {
        synchronized (this.zzcs) {
            TaskCompletionSource<Bundle> remove = this.zzcs.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing callback for ".concat(valueOf);
                } else {
                    new String("Missing callback for ");
                }
                return;
            }
            remove.setResult(bundle);
        }
    }
}
