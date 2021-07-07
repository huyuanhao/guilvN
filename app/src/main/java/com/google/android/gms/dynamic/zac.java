package com.google.android.gms.dynamic;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

public final class zac implements DeferredLifecycleHelper.zaa {
    public final /* synthetic */ DeferredLifecycleHelper zari;
    public final /* synthetic */ Bundle zark;

    public zac(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.zari = deferredLifecycleHelper;
        this.zark = bundle;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 1;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper.zab(this.zari).onCreate(this.zark);
    }
}
