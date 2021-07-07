package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.firebase_ml.zznp;
import com.google.firebase.p027ml.common.FirebaseMLException;

public interface zznm<T, S extends zznp> {
    @WorkerThread
    T zza(S s) throws FirebaseMLException;

    @Nullable
    zznw zzlm();
}
