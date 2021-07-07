package com.google.firebase.p027ml.common.modeldownload;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(16)
/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelManager */
public class FirebaseModelManager {
    public static final GmsLogger zzaoz = new GmsLogger("FirebaseModelManager", "");
    @GuardedBy("FirebaseModelManager.class")
    public static Map<String, FirebaseModelManager> zzax = new HashMap();
    @GuardedBy("this")
    public Map<String, FirebaseRemoteModel> zzarz = new HashMap();
    @GuardedBy("this")
    public Map<String, FirebaseRemoteModel> zzasa = new HashMap();
    @GuardedBy("this")
    public Map<String, FirebaseLocalModel> zzasb = new HashMap();

    public static synchronized FirebaseModelManager getInstance() {
        FirebaseModelManager zzf;
        synchronized (FirebaseModelManager.class) {
            zzf = zzf(FirebaseApp.getInstance());
        }
        return zzf;
    }

    public static synchronized FirebaseModelManager zzf(@NonNull FirebaseApp firebaseApp) {
        synchronized (FirebaseModelManager.class) {
            Preconditions.checkNotNull(firebaseApp, "Please provide a valid FirebaseApp");
            String persistenceKey = firebaseApp.getPersistenceKey();
            if (zzax.containsKey(persistenceKey)) {
                return zzax.get(persistenceKey);
            }
            FirebaseModelManager firebaseModelManager = new FirebaseModelManager();
            zzax.put(persistenceKey, firebaseModelManager);
            return firebaseModelManager;
        }
    }

    public synchronized boolean registerLocalModel(@NonNull FirebaseLocalModel firebaseLocalModel) {
        Preconditions.checkNotNull(firebaseLocalModel, "FirebaseLocalModel can not be null");
        if (this.zzasb.containsKey(firebaseLocalModel.getModelName())) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(firebaseLocalModel.getModelName());
            gmsLogger.mo10812w("FirebaseModelManager", valueOf.length() != 0 ? "The local model name is already registered: ".concat(valueOf) : new String("The local model name is already registered: "));
            return false;
        }
        this.zzasb.put(firebaseLocalModel.getModelName(), firebaseLocalModel);
        return true;
    }

    public synchronized boolean registerRemoteModel(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        Preconditions.checkNotNull(firebaseRemoteModel, "FirebaseRemoteModel can not be null");
        if (firebaseRemoteModel.zzmk()) {
            if (this.zzasa.containsKey(firebaseRemoteModel.zzmj())) {
                GmsLogger gmsLogger = zzaoz;
                String valueOf = String.valueOf(firebaseRemoteModel.zzmj());
                gmsLogger.mo10812w("FirebaseModelManager", valueOf.length() != 0 ? "The base model is already registered: ".concat(valueOf) : new String("The base model is already registered: "));
                return false;
            }
            this.zzasa.put(firebaseRemoteModel.zzmj(), firebaseRemoteModel);
        } else if (this.zzarz.containsKey(firebaseRemoteModel.zzmj())) {
            GmsLogger gmsLogger2 = zzaoz;
            String valueOf2 = String.valueOf(firebaseRemoteModel.zzmj());
            gmsLogger2.mo10812w("FirebaseModelManager", valueOf2.length() != 0 ? "The remote model name is already registered: ".concat(valueOf2) : new String("The remote model name is already registered: "));
            return false;
        } else {
            this.zzarz.put(firebaseRemoteModel.zzmj(), firebaseRemoteModel);
        }
        return true;
    }

    @Nullable
    public final synchronized FirebaseRemoteModel zzcb(@NonNull String str) {
        return this.zzarz.get(str);
    }

    @Nullable
    public final synchronized FirebaseLocalModel zzcc(@NonNull String str) {
        return this.zzasb.get(str);
    }
}
