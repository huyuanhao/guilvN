package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.firebase.FirebaseApp;
import com.p118pd.sdk.C7058o00O0OO0;
import com.p118pd.sdk.C7060o00O0OOo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class zznu {
    public static final GmsLogger zzaoz = new GmsLogger("MlStatsLogger", "");
    @Nullable
    public static List<String> zzapn;
    @GuardedBy("MlStatsLogger.class")
    public static final Map<String, zznu> zzax = new HashMap();
    public final FirebaseApp zzapo;
    public final String zzapp;
    public final String zzapq;
    public final String zzapr;
    public final String zzaps;
    public final String zzapt;
    public final ClearcutLogger zzapu;
    @GuardedBy("this")
    public final Map<zzmn, Long> zzapv = new HashMap();
    public final int zzapw;

    public zznu(FirebaseApp firebaseApp, int i) {
        this.zzapo = firebaseApp;
        this.zzapw = i;
        String projectId = firebaseApp.getOptions().getProjectId();
        String str = "";
        this.zzapr = projectId == null ? str : projectId;
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        this.zzaps = gcmSenderId == null ? str : gcmSenderId;
        String apiKey = firebaseApp.getOptions().getApiKey();
        this.zzapt = apiKey != null ? apiKey : str;
        Context applicationContext = firebaseApp.getApplicationContext();
        this.zzapu = ClearcutLogger.anonymousLogger(applicationContext, "FIREBASE_ML_SDK");
        this.zzapp = applicationContext.getPackageName();
        this.zzapq = zznk.zza(applicationContext);
    }

    public static synchronized zznu zza(@NonNull FirebaseApp firebaseApp, int i) {
        zznu zznu;
        synchronized (zznu.class) {
            Preconditions.checkNotNull(firebaseApp);
            String str = "";
            if (i == 1) {
                str = "_vision";
            } else if (i == 2) {
                str = "_model";
            } else if (i == 3) {
                str = "_natural_language";
            } else if (i == 4) {
                str = "_model_download";
            }
            String valueOf = String.valueOf(firebaseApp.getPersistenceKey());
            String concat = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            zznu = zzax.get(concat);
            if (zznu == null) {
                zznu = new zznu(firebaseApp, i);
                zzax.put(concat, zznu);
            }
        }
        return zznu;
    }

    private final boolean zzfd() {
        int i = this.zzapw;
        if (i == 1) {
            return zzoa.zzc(this.zzapo);
        }
        if (i != 2) {
            return i == 3 || i == 4;
        }
        return zzoa.zzd(this.zzapo);
    }

    @NonNull
    public static synchronized List<String> zzlo() {
        synchronized (zznu.class) {
            if (zzapn != null) {
                return zzapn;
            }
            C7060o00O0OOo OooO00o = C7058o00O0OO0.OooO00o(Resources.getSystem().getConfiguration());
            zzapn = new ArrayList(OooO00o.m18329OooO00o());
            for (int i = 0; i < OooO00o.m18329OooO00o(); i++) {
                zzapn.add(zznk.zza(OooO00o.OooO00o(i)));
            }
            return zzapn;
        }
    }

    public final synchronized void zza(@NonNull zzmd.zzq.zza zza, @NonNull zzmn zzmn) {
        if (!zzfd()) {
            zzaoz.mo10801d("MlStatsLogger", "Logging is disabled.");
            return;
        }
        String zzlh = zza.zzjw().zzlh();
        if ("NA".equals(zzlh) || "".equals(zzlh)) {
            zzlh = "NA";
        }
        zza.zzb(zzmn).zzb(zzmd.zzac.zzli().zzbq(this.zzapp).zzbr(this.zzapq).zzbs(this.zzapr).zzbv(this.zzaps).zzbw(this.zzapt).zzbu(zzlh).zzn(zzlo()).zzbt(zznl.zzll().getVersion("firebase-ml-common")));
        zzmd.zzq zzq = (zzmd.zzq) ((zzue) zza.zzrj());
        GmsLogger gmsLogger = zzaoz;
        String valueOf = String.valueOf(zzq);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Logging FirebaseMlSdkLogEvent ");
        sb.append(valueOf);
        gmsLogger.mo10801d("MlStatsLogger", sb.toString());
        this.zzapu.newEvent(zzq.toByteArray()).log();
    }

    public final synchronized void zza(@NonNull zznv zznv, @NonNull zzmn zzmn) {
        if (zzfd()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.zzapv.get(zzmn) == null || elapsedRealtime - this.zzapv.get(zzmn).longValue() > TimeUnit.SECONDS.toMillis(30)) {
                this.zzapv.put(zzmn, Long.valueOf(elapsedRealtime));
                zza(zznv.zzm(), zzmn);
            }
        }
    }
}
