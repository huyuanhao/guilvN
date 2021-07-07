package com.google.android.gms.internal.firebase_ml;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.google.firebase.p027ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.p027ml.common.modeldownload.FirebaseRemoteModel;
import java.io.FileNotFoundException;

public final class zzoo {
    public static final GmsLogger zzaoz = new GmsLogger("ModelDownloadManager", "");
    public final Context zzad;
    public final FirebaseApp zzapo;
    public final DownloadManager zzaqu;
    public final FirebaseRemoteModel zzaqv;
    public final zzon zzaqw;
    public final zzoq zzaqx;

    public zzoo(@NonNull FirebaseApp firebaseApp, @NonNull zzoq zzoq, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzon zzon) {
        this.zzapo = firebaseApp;
        this.zzaqx = zzoq;
        Context applicationContext = firebaseApp.getApplicationContext();
        this.zzad = applicationContext;
        this.zzaqv = firebaseRemoteModel;
        DownloadManager downloadManager = (DownloadManager) applicationContext.getSystemService("download");
        this.zzaqu = downloadManager;
        if (downloadManager == null) {
            zzaoz.mo10801d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.zzaqw = zzon;
    }

    private final synchronized Long zza(@NonNull DownloadManager.Request request, @NonNull zzop zzop) {
        if (this.zzaqu == null) {
            return null;
        }
        long enqueue = this.zzaqu.enqueue(request);
        GmsLogger gmsLogger = zzaoz;
        StringBuilder sb = new StringBuilder(53);
        sb.append("Schedule a new downloading task: ");
        sb.append(enqueue);
        gmsLogger.mo10801d("ModelDownloadManager", sb.toString());
        zzoa.zza(this.zzapo, enqueue, zzop);
        return Long.valueOf(enqueue);
    }

    private final synchronized boolean zzmb() throws FirebaseMLException {
        return this.zzaqx.zzmf() != null;
    }

    @Nullable
    @WorkerThread
    private final synchronized zzop zzmc() throws FirebaseMLException {
        String zzmj = this.zzaqv.zzmj();
        zzop zzb = zzou.zzb(this.zzapo, this.zzaqv, this.zzaqw);
        if (zzb == null) {
            return null;
        }
        FirebaseApp firebaseApp = this.zzapo;
        boolean z = false;
        if (zzb.zzaqz.equals(zzoa.zze(firebaseApp, zzmj)) && zznk.zza(firebaseApp.getApplicationContext()).equals(zzoa.zze(firebaseApp))) {
            zzaoz.mo10801d("ModelDownloadManager", "The new model is incompatible and the app is not upgraded, do not download");
        } else {
            z = true;
        }
        boolean z2 = !zzmb();
        if (z2) {
            zzoa.zzi(this.zzapo, zzmj);
        }
        boolean z3 = !zzb.zzaqz.equals(zzoa.zzd(this.zzapo, zzmj));
        if (!z || (!z2 && !z3)) {
            return null;
        }
        return zzb;
    }

    public final synchronized void zzby(@NonNull String str) throws FirebaseMLException {
        zzoa.zza(this.zzapo, this.zzaqv.zzmj(), str);
        zzly();
    }

    @Nullable
    @WorkerThread
    public final synchronized Long zzlv() throws FirebaseMLException {
        zzop zzmc = zzmc();
        if (zzmc == null) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(this.zzaqv.zzmj());
            gmsLogger.mo10801d("ModelDownloadManager", valueOf.length() != 0 ? "No model updates for model: ".concat(valueOf) : new String("No model updates for model: "));
            return null;
        }
        return zza(zzmc);
    }

    @Nullable
    public final synchronized Long zzlw() {
        return zzoa.zza(this.zzapo, this.zzaqv.zzmj());
    }

    @Nullable
    public final synchronized String zzlx() {
        return zzoa.zzc(this.zzapo, this.zzaqv.zzmj());
    }

    public final synchronized void zzly() throws FirebaseMLException {
        Long zzlw = zzlw();
        if (this.zzaqu != null) {
            if (zzlw != null) {
                GmsLogger gmsLogger = zzaoz;
                String valueOf = String.valueOf(zzlw);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Cancel or remove existing downloading task: ");
                sb.append(valueOf);
                gmsLogger.mo10801d("ModelDownloadManager", sb.toString());
                if (this.zzaqu.remove(zzlw.longValue()) > 0 || zzlz() == null) {
                    this.zzaqx.zzmg();
                    zzoa.zzh(this.zzapo, this.zzaqv.zzmj());
                }
            }
        }
    }

    @Nullable
    public final synchronized Integer zzlz() {
        Long zzlw = zzlw();
        Integer num = null;
        if (this.zzaqu != null) {
            if (zzlw != null) {
                Cursor query = this.zzaqu.query(new DownloadManager.Query().setFilterById(zzlw.longValue()));
                Integer valueOf = (query == null || !query.moveToFirst()) ? null : Integer.valueOf(query.getInt(query.getColumnIndex("status")));
                if (valueOf == null) {
                    return null;
                }
                if (valueOf.intValue() == 2 || valueOf.intValue() == 4 || valueOf.intValue() == 1 || valueOf.intValue() == 8 || valueOf.intValue() == 16) {
                    num = valueOf;
                }
                return num;
            }
        }
        return null;
    }

    @Nullable
    public final synchronized ParcelFileDescriptor zzma() {
        Long zzlw = zzlw();
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (this.zzaqu == null || zzlw == null) {
            return null;
        }
        try {
            parcelFileDescriptor = this.zzaqu.openDownloadedFile(zzlw.longValue());
        } catch (FileNotFoundException unused) {
            zzaoz.mo10803e("ModelDownloadManager", "Downloaded file is not found");
        }
        return parcelFileDescriptor;
    }

    @Nullable
    @WorkerThread
    private final synchronized Long zza(@NonNull zzop zzop) throws FirebaseMLException {
        String zzc = zzoa.zzc(this.zzapo, zzop.zzaqg);
        if (zzc == null || !zzc.equals(zzop.zzaqz)) {
            zzaoz.mo10801d("ModelDownloadManager", "Need to download a new model.");
            zzly();
            DownloadManager.Request request = new DownloadManager.Request(zzop.zzaqy);
            request.setDestinationUri(null);
            FirebaseModelDownloadConditions initialDownloadConditions = this.zzaqv.getInitialDownloadConditions();
            if (this.zzaqv.isModelUpdatesEnabled() || this.zzaqx.zzmf() == null) {
                if (this.zzaqv.isModelUpdatesEnabled() && this.zzaqx.zzmf() != null) {
                    zzaoz.mo10801d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                    initialDownloadConditions = this.zzaqv.getUpdatesDownloadConditions();
                }
                zzaoz.mo10801d("ModelDownloadManager", "Use initial download conditions.");
                if (Build.VERSION.SDK_INT >= 24) {
                    request.setRequiresCharging(initialDownloadConditions.isChargingRequired());
                    request.setRequiresDeviceIdle(initialDownloadConditions.isDeviceIdleRequired());
                }
                if (initialDownloadConditions.isWifiRequired()) {
                    request.setAllowedNetworkTypes(2);
                }
                return zza(request, zzop);
            }
            zzaoz.mo10801d("ModelDownloadManager", "Model update is disabled and have a previous downloaded model, skip downloading");
            return null;
        }
        zzaoz.mo10801d("ModelDownloadManager", "New model is already in downloading, do nothing.");
        return null;
    }
}
