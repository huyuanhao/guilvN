package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zacb extends UnregisterListenerMethod<A, L> {
    public final /* synthetic */ RegistrationMethods.Builder zakg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacb(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zakg = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void unregisterListener(A a, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        this.zakg.zakb.accept(a, taskCompletionSource);
    }
}
