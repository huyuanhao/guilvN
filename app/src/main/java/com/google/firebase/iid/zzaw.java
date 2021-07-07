package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.p118pd.sdk.C6971o0000oO0;
import com.p118pd.sdk.C7009o000OoOo;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class zzaw {
    public final SharedPreferences zzdc;
    public final zzy zzdd;
    @GuardedBy("this")
    public final Map<String, zzz> zzde;
    public final Context zzx;

    public zzaw(Context context) {
        this(context, new zzy());
    }

    private final synchronized boolean isEmpty() {
        return this.zzdc.getAll().isEmpty();
    }

    public static String zza(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public static String zzd(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized String zzak() {
        return this.zzdc.getString("topic_operaion_queue", "");
    }

    public final synchronized void zzal() {
        this.zzde.clear();
        zzy.zza(this.zzx);
        this.zzdc.edit().clear().commit();
    }

    public final synchronized zzax zzb(String str, String str2, String str3) {
        return zzax.zzi(this.zzdc.getString(zza(str, str2, str3), null));
    }

    public final synchronized void zzc(String str, String str2, String str3) {
        String zza = zza(str, str2, str3);
        SharedPreferences.Editor edit = this.zzdc.edit();
        edit.remove(zza);
        edit.commit();
    }

    public final synchronized void zzf(String str) {
        this.zzdc.edit().putString("topic_operaion_queue", str).apply();
    }

    public final synchronized zzz zzg(String str) {
        zzz zzz;
        zzz zzz2 = this.zzde.get(str);
        if (zzz2 != null) {
            return zzz2;
        }
        try {
            zzz = this.zzdd.zzb(this.zzx, str);
        } catch (zzaa unused) {
            FirebaseInstanceId.getInstance().zzm();
            zzz = this.zzdd.zzc(this.zzx, str);
        }
        this.zzde.put(str, zzz);
        return zzz;
    }

    public final synchronized void zzh(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.zzdc.edit();
        for (String str2 : this.zzdc.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    public zzaw(Context context, zzy zzy) {
        this.zzde = new C6971o0000oO0();
        this.zzx = context;
        this.zzdc = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.zzdd = zzy;
        File file = new File(C7009o000OoOo.OooO0OO(this.zzx), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !isEmpty()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    zzal();
                    FirebaseInstanceId.getInstance().zzm();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Error creating file in no backup dir: ".concat(valueOf);
                    } else {
                        new String("Error creating file in no backup dir: ");
                    }
                }
            }
        }
    }

    public final synchronized void zza(String str, String str2, String str3, String str4, String str5) {
        String zza = zzax.zza(str4, str5, System.currentTimeMillis());
        if (zza != null) {
            SharedPreferences.Editor edit = this.zzdc.edit();
            edit.putString(zza(str, str2, str3), zza);
            edit.commit();
        }
    }
}
