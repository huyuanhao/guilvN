package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import s.h.e.l.l.C;

public class zabu extends zal {
    public TaskCompletionSource<Void> zajo = new TaskCompletionSource<>();

    static {
        C.i(13);
    }

    public zabu(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static native zabu zac(Activity activity);

    public final Task<Void> getTask() {
        return this.zajo.getTask();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public native void onDestroy();

    @Override // com.google.android.gms.common.api.internal.zal
    public final native void zaa(ConnectionResult connectionResult, int i);

    @Override // com.google.android.gms.common.api.internal.zal
    public final native void zao();
}
