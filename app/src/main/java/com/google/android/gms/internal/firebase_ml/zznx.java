package com.google.android.gms.internal.firebase_ml;

import android.app.Application;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.p118pd.sdk.C7265o0O000oo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class zznx {
    public static final GmsLogger zzape = new GmsLogger("ModelResourceManager", "");
    @GuardedBy("ModelResourceManager.class")
    public static zznx zzaqc;
    public final zznn zzapx = zznn.zzln();
    public final AtomicLong zzapy = new AtomicLong(Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL);
    @GuardedBy("this")
    public final Set<zznw> zzapz = new HashSet();
    public final Set<zznw> zzaqa = new HashSet();
    public final ConcurrentHashMap<zznw, zznz> zzaqb = new ConcurrentHashMap<>();

    public zznx(FirebaseApp firebaseApp) {
        if (firebaseApp.getApplicationContext() instanceof Application) {
            BackgroundDetector.initialize((Application) firebaseApp.getApplicationContext());
        } else {
            zzape.mo10803e("ModelResourceManager", "No valid Application available and auto-manage cannot work");
        }
        BackgroundDetector.getInstance().addListener(new zzny(this));
        if (BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
            this.zzapy.set(C7265o0O000oo.OooO0o.OooO00o);
        }
    }

    public static synchronized zznx zzb(FirebaseApp firebaseApp) {
        zznx zznx;
        synchronized (zznx.class) {
            if (zzaqc == null) {
                zzaqc = new zznx(firebaseApp);
            }
            zznx = zzaqc;
        }
        return zznx;
    }

    private final synchronized void zzc(zznw zznw) {
        zznz zze = zze(zznw);
        this.zzapx.zzb(zze);
        long j = this.zzapy.get();
        GmsLogger gmsLogger = zzape;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Rescheduling modelResource release after: ");
        sb.append(j);
        gmsLogger.mo10810v("ModelResourceManager", sb.toString());
        this.zzapx.zza(zze, j);
    }

    private final zznz zze(zznw zznw) {
        this.zzaqb.putIfAbsent(zznw, new zznz(this, zznw, "OPERATION_RELEASE"));
        return this.zzaqb.get(zznw);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzlq() {
        for (zznw zznw : this.zzapz) {
            zzc(zznw);
        }
    }

    public final synchronized void zza(@NonNull zznw zznw) {
        Preconditions.checkNotNull(zznw, "Model source can not be null");
        zzape.mo10801d("ModelResourceManager", "Add auto-managed model resource");
        if (this.zzapz.contains(zznw)) {
            zzape.mo10806i("ModelResourceManager", "The model resource is already registered.");
            return;
        }
        this.zzapz.add(zznw);
        zzb(zznw);
    }

    public final synchronized void zzd(@Nullable zznw zznw) {
        if (zznw != null) {
            zznz zze = zze(zznw);
            this.zzapx.zzb(zze);
            this.zzapx.zza(zze, 0);
        }
    }

    @WorkerThread
    public final void zzf(zznw zznw) throws FirebaseMLException {
        if (!this.zzaqa.contains(zznw)) {
            try {
                zznw.zzlp();
                this.zzaqa.add(zznw);
            } catch (RuntimeException e) {
                throw new FirebaseMLException("The load task failed", 13, e);
            }
        }
    }

    private final synchronized void zzb(@Nullable zznw zznw) {
        if (zznw != null) {
            this.zzapx.zza(new zznz(this, zznw, "OPERATION_LOAD"));
            if (this.zzapz.contains(zznw)) {
                zzc(zznw);
            }
        }
    }
}
