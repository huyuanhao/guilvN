package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

public final class zad implements DeferredLifecycleHelper.zaa {
    public final /* synthetic */ ViewGroup val$container;
    public final /* synthetic */ DeferredLifecycleHelper zari;
    public final /* synthetic */ Bundle zark;
    public final /* synthetic */ FrameLayout zarl;
    public final /* synthetic */ LayoutInflater zarm;

    public zad(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.zari = deferredLifecycleHelper;
        this.zarl = frameLayout;
        this.zarm = layoutInflater;
        this.val$container = viewGroup;
        this.zark = bundle;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zarl.removeAllViews();
        this.zarl.addView(DeferredLifecycleHelper.zab(this.zari).onCreateView(this.zarm, this.val$container, this.zark));
    }
}
