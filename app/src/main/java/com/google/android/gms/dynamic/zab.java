package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

public final class zab implements DeferredLifecycleHelper.zaa {
    public final /* synthetic */ Activity val$activity;
    public final /* synthetic */ DeferredLifecycleHelper zari;
    public final /* synthetic */ Bundle zarj;
    public final /* synthetic */ Bundle zark;

    public zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.zari = deferredLifecycleHelper;
        this.val$activity = activity;
        this.zarj = bundle;
        this.zark = bundle2;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper.zab(this.zari).onInflate(this.val$activity, this.zarj, this.zark);
    }
}
