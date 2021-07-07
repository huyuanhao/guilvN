package com.google.android.gms.dynamic;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import java.util.Iterator;

public final class zaa implements OnDelegateCreatedListener<T> {
    public final /* synthetic */ DeferredLifecycleHelper zari;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zari = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(T t) {
        DeferredLifecycleHelper.zaa(this.zari, (LifecycleDelegate) t);
        Iterator it = DeferredLifecycleHelper.zaa(this.zari).iterator();
        while (it.hasNext()) {
            ((DeferredLifecycleHelper.zaa) it.next()).zaa(DeferredLifecycleHelper.zab(this.zari));
        }
        DeferredLifecycleHelper.zaa(this.zari).clear();
        DeferredLifecycleHelper.zaa(this.zari, (Bundle) null);
    }
}
