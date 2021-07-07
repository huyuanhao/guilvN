package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zaca extends RegisterListenerMethod<A, L> {
    public final /* synthetic */ RegistrationMethods.Builder zakg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaca(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z) {
        super(listenerHolder, featureArr, z);
        this.zakg = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void registerListener(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.zakg.zaka.accept(a, taskCompletionSource);
    }
}
