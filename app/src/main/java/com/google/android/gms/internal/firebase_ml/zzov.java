package com.google.android.gms.internal.firebase_ml;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.google.firebase.p027ml.common.modeldownload.FirebaseRemoteModel;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class zzov {
    public static final GmsLogger zzaoz = new GmsLogger("RemoteModelLoader", "");
    public static Map<String, zzov> zzarj = new HashMap();
    public final zzon zzaqw;
    public final zzok zzara;
    public final zzoo zzark;
    public final zzoq zzarl;
    public final zzow zzarm;
    public boolean zzarn = true;

    public zzov(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzol zzol, zzow zzow, @NonNull zzok zzok) {
        this.zzarl = new zzoq(firebaseApp, firebaseRemoteModel.zzmj(), zzol, zzok);
        this.zzaqw = new zzon(firebaseApp, firebaseRemoteModel);
        this.zzark = new zzoo(firebaseApp, this.zzarl, firebaseRemoteModel, this.zzaqw);
        this.zzarm = zzow;
        this.zzara = zzok;
    }

    public static synchronized zzov zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzol zzol, zzow zzow, zzok zzok) {
        zzov zzov;
        synchronized (zzov.class) {
            String zzmj = firebaseRemoteModel.zzmj();
            if (!zzarj.containsKey(zzmj)) {
                zzarj.put(zzmj, new zzov(firebaseApp, firebaseRemoteModel, zzol, zzow, zzok));
            }
            zzov = zzarj.get(zzmj);
        }
        return zzov;
    }

    @Nullable
    @WorkerThread
    private final MappedByteBuffer zzad(boolean z) throws FirebaseMLException {
        Long zzlw = this.zzark.zzlw();
        String zzlx = this.zzark.zzlx();
        if (zzlw == null || zzlx == null) {
            zzaoz.mo10801d("RemoteModelLoader", "No new model is downloading.");
            this.zzark.zzly();
            return null;
        }
        Integer zzlz = this.zzark.zzlz();
        if (zzlz == null) {
            this.zzark.zzly();
            return null;
        }
        GmsLogger gmsLogger = zzaoz;
        String valueOf = String.valueOf(zzlz);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Download Status code: ");
        sb.append(valueOf);
        gmsLogger.mo10801d("RemoteModelLoader", sb.toString());
        if (zzlz.intValue() == 8) {
            zzaoz.mo10801d("RemoteModelLoader", "Model downloaded successfully");
            this.zzaqw.zza(zzmk.NO_ERROR, true);
            ParcelFileDescriptor zzma = this.zzark.zzma();
            if (zzma == null) {
                this.zzark.zzly();
                return null;
            }
            zzaoz.mo10801d("RemoteModelLoader", "moving downloaded model from external storage to private folder.");
            try {
                File zza = this.zzarl.zza(zzma, zzlx, this.zzaqw);
                if (zza == null) {
                    return null;
                }
                GmsLogger gmsLogger2 = zzaoz;
                String valueOf2 = String.valueOf(zza.getParent());
                gmsLogger2.mo10801d("RemoteModelLoader", valueOf2.length() != 0 ? "Moved the downloaded model to private folder successfully: ".concat(valueOf2) : new String("Moved the downloaded model to private folder successfully: "));
                this.zzark.zzby(zzlx);
                if (z && this.zzarl.zzb(zza)) {
                    zzaoz.mo10801d("RemoteModelLoader", "All old models are deleted.");
                    zza = this.zzarl.zzc(zza);
                }
                return zzbz(zza.getAbsolutePath());
            } finally {
                this.zzark.zzly();
            }
        } else {
            if (zzlz.intValue() == 16) {
                this.zzaqw.zza(zzmk.DOWNLOAD_FAILED, true);
                this.zzark.zzly();
            }
            return null;
        }
    }

    @WorkerThread
    private final MappedByteBuffer zzbz(@NonNull String str) throws FirebaseMLException {
        return this.zzarm.zzca(str);
    }

    @Nullable
    @WorkerThread
    public final synchronized MappedByteBuffer load() throws FirebaseMLException {
        MappedByteBuffer zzad;
        zzaoz.mo10801d("RemoteModelLoader", "Try to load newly downloaded model file.");
        zzad = zzad(this.zzarn);
        if (zzad == null) {
            zzaoz.mo10801d("RemoteModelLoader", "Loading existing model file.");
            String zzmf = this.zzarl.zzmf();
            if (zzmf == null) {
                zzaoz.mo10801d("RemoteModelLoader", "No existing model file");
                zzad = null;
            } else {
                zzad = zzbz(zzmf);
            }
        }
        if (this.zzarn) {
            this.zzarn = false;
            zzaoz.mo10801d("RemoteModelLoader", "Initial loading, check for model updates.");
            this.zzark.zzlv();
        }
        return zzad;
    }

    public final void zzlu() throws FirebaseMLException {
        this.zzarm.zzlu();
    }
}
