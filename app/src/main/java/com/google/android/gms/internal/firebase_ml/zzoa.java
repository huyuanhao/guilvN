package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.taobao.accs.common.Constants;

public final class zzoa {
    public static final GmsLogger zzaoz = new GmsLogger("SharedPrefManager", "");

    public static synchronized void zza(@NonNull FirebaseApp firebaseApp, boolean z) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putBoolean(String.format("logging_%s_%s", "vision", firebaseApp.getPersistenceKey()), z).apply();
        }
    }

    public static synchronized void zzb(@NonNull FirebaseApp firebaseApp, boolean z) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putBoolean(String.format("logging_%s_%s", Constants.KEY_MODEL, firebaseApp.getPersistenceKey()), z).apply();
        }
    }

    public static synchronized boolean zzc(@NonNull FirebaseApp firebaseApp) {
        boolean z;
        synchronized (zzoa.class) {
            z = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getBoolean(String.format("logging_%s_%s", "vision", firebaseApp.getPersistenceKey()), true);
        }
        return z;
    }

    public static synchronized boolean zzd(@NonNull FirebaseApp firebaseApp) {
        boolean z;
        synchronized (zzoa.class) {
            z = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getBoolean(String.format("logging_%s_%s", Constants.KEY_MODEL, firebaseApp.getPersistenceKey()), true);
        }
        return z;
    }

    @Nullable
    public static synchronized String zze(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        String string;
        synchronized (zzoa.class) {
            string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("bad_hash_%s_%s", firebaseApp.getPersistenceKey(), str), null);
        }
        return string;
    }

    public static synchronized long zzf(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        long j;
        synchronized (zzoa.class) {
            j = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("downloading_begin_time_%s_%s", firebaseApp.getPersistenceKey(), str), 0);
        }
        return j;
    }

    public static synchronized long zzg(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        long j;
        synchronized (zzoa.class) {
            j = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("model_first_use_time_%s_%s", firebaseApp.getPersistenceKey(), str), 0);
        }
        return j;
    }

    public static synchronized void zzh(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        synchronized (zzoa.class) {
            String zzc = zzc(firebaseApp, str);
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().remove(String.format("downloading_model_id_%s_%s", firebaseApp.getPersistenceKey(), str)).remove(String.format("downloading_model_hash_%s_%s", firebaseApp.getPersistenceKey(), str)).remove(String.format("downloading_model_type_%s", zzc)).remove(String.format("downloading_begin_time_%s_%s", firebaseApp.getPersistenceKey(), str)).remove(String.format("model_first_use_time_%s_%s", firebaseApp.getPersistenceKey(), str)).apply();
        }
    }

    public static synchronized void zzi(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().remove(String.format("current_model_hash_%s_%s", firebaseApp.getPersistenceKey(), str)).apply();
        }
    }

    @Nullable
    public static synchronized String zzc(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        String string;
        synchronized (zzoa.class) {
            string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("downloading_model_hash_%s_%s", firebaseApp.getPersistenceKey(), str), null);
        }
        return string;
    }

    @Nullable
    public static synchronized String zze(@NonNull FirebaseApp firebaseApp) {
        String string;
        synchronized (zzoa.class) {
            string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString("app_version", null);
        }
        return string;
    }

    @Nullable
    public static synchronized String zzd(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        String string;
        synchronized (zzoa.class) {
            string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("current_model_hash_%s_%s", firebaseApp.getPersistenceKey(), str), null);
        }
        return string;
    }

    @Nullable
    public static synchronized Long zza(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        synchronized (zzoa.class) {
            long j = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("downloading_model_id_%s_%s", firebaseApp.getPersistenceKey(), str), -1);
            if (j < 0) {
                return null;
            }
            return Long.valueOf(j);
        }
    }

    @Nullable
    public static synchronized zzok zzb(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        zzok zzok;
        synchronized (zzoa.class) {
            String string = firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("downloading_model_type_%s", str), "");
            zzok = null;
            try {
                zzok = zzok.zzbx(string);
            } catch (IllegalArgumentException unused) {
                GmsLogger gmsLogger = zzaoz;
                String valueOf = String.valueOf(string);
                gmsLogger.mo10803e("SharedPrefManager", valueOf.length() != 0 ? "Invalid model type ".concat(valueOf) : new String("Invalid model type "));
            }
        }
        return zzok;
    }

    public static synchronized void zza(@NonNull FirebaseApp firebaseApp, @NonNull String str, long j) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putLong(String.format("model_first_use_time_%s_%s", firebaseApp.getPersistenceKey(), str), j).apply();
        }
    }

    public static synchronized void zza(@NonNull FirebaseApp firebaseApp, @NonNull String str, @NonNull String str2) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("current_model_hash_%s_%s", firebaseApp.getPersistenceKey(), str), str2).apply();
        }
    }

    public static synchronized void zza(@NonNull FirebaseApp firebaseApp, long j, @NonNull zzop zzop) {
        synchronized (zzoa.class) {
            String modelName = zzop.getModelName();
            String zzmd = zzop.zzmd();
            zzok zzme = zzop.zzme();
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("downloading_model_hash_%s_%s", firebaseApp.getPersistenceKey(), modelName), zzmd).putLong(String.format("downloading_model_id_%s_%s", firebaseApp.getPersistenceKey(), modelName), j).putString(String.format("downloading_model_type_%s", zzmd), zzme.name()).putLong(String.format("downloading_begin_time_%s_%s", firebaseApp.getPersistenceKey(), modelName), SystemClock.elapsedRealtime()).apply();
        }
    }

    public static synchronized void zza(@NonNull FirebaseApp firebaseApp, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        synchronized (zzoa.class) {
            firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("bad_hash_%s_%s", firebaseApp.getPersistenceKey(), str), str2).putString("app_version", str3).apply();
        }
    }
}
