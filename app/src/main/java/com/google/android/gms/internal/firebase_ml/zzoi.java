package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p027ml.common.FirebaseMLException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

@WorkerThread
public final class zzoi {
    public static final GmsLogger zzaoz = new GmsLogger("ModelLoader", "");
    @Nullable
    public final zzov zzaql;
    @Nullable
    public final zzog zzaqm;

    public zzoi(@Nullable zzov zzov, @Nullable zzog zzog) {
        Preconditions.checkArgument((zzov == null && zzog == null) ? false : true, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        this.zzaql = zzov;
        this.zzaqm = zzog;
    }

    private final synchronized <T> boolean zzb(zzoj<T> zzoj, List<zzmk> list) throws FirebaseMLException {
        MappedByteBuffer load;
        if (this.zzaqm == null || (load = this.zzaqm.load()) == null) {
            return false;
        }
        try {
            zzoj.zzb(load);
            this.zzaqm.zzlu();
            zzaoz.mo10801d("ModelLoader", "Local model source is loaded successfully");
            return true;
        } catch (RuntimeException e) {
            list.add(zzmk.LOCAL_MODEL_INVALID);
            throw e;
        }
    }

    public final synchronized <T> void zza(zzoj<T> zzoj) throws FirebaseMLException {
        Exception exc;
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        Exception e = null;
        try {
            z = zza(zzoj, arrayList);
            exc = null;
        } catch (Exception e2) {
            exc = e2;
            z = false;
        }
        if (!z) {
            try {
                z2 = zzb(zzoj, arrayList);
            } catch (Exception e3) {
                e = e3;
            }
            if (!z2) {
                arrayList.add(zzmk.NO_VALID_MODEL);
                if (exc != null) {
                    throw new FirebaseMLException("Remote model load failed: ", 14, exc);
                } else if (e != null) {
                    throw new FirebaseMLException("Local model load failed: ", 14, e);
                } else {
                    throw new FirebaseMLException("Cannot load custom model", 14);
                }
            }
        }
    }

    private final synchronized <T> boolean zza(zzoj<T> zzoj, List<zzmk> list) throws FirebaseMLException {
        if (this.zzaql != null) {
            try {
                MappedByteBuffer load = this.zzaql.load();
                if (load != null) {
                    zzoj.zzb(load);
                    this.zzaql.zzlu();
                    zzaoz.mo10801d("ModelLoader", "Remote model source is loaded successfully");
                    return true;
                }
                zzaoz.mo10801d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(zzmk.CLOUD_MODEL_LOADER_LOADS_NO_MODEL);
            } catch (FirebaseMLException e) {
                zzaoz.mo10801d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(zzmk.CLOUD_MODEL_LOADER_ERROR);
                throw e;
            }
        }
        return false;
    }
}
