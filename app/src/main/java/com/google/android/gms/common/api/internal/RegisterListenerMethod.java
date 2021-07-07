package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {
    public final ListenerHolder<L> zajt;
    public final Feature[] zaju;
    public final boolean zajv;

    @KeepForSdk
    public RegisterListenerMethod(ListenerHolder<L> listenerHolder) {
        this.zajt = listenerHolder;
        this.zaju = null;
        this.zajv = false;
    }

    @KeepForSdk
    public void clearListener() {
        this.zajt.clear();
    }

    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zajt.getListenerKey();
    }

    @Nullable
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return this.zaju;
    }

    @KeepForSdk
    public abstract void registerListener(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    public final boolean shouldAutoResolveMissingFeatures() {
        return this.zajv;
    }

    @KeepForSdk
    public RegisterListenerMethod(ListenerHolder<L> listenerHolder, Feature[] featureArr, boolean z) {
        this.zajt = listenerHolder;
        this.zaju = featureArr;
        this.zajv = z;
    }
}
