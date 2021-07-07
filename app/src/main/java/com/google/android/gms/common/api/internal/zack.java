package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zack extends TaskApiCall<A, ResultT> {
    public final /* synthetic */ TaskApiCall.Builder zakm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zack(TaskApiCall.Builder builder, Feature[] featureArr, boolean z) {
        super(featureArr, z);
        this.zakm = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void doExecute(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException {
        this.zakm.zakl.accept(a, taskCompletionSource);
    }
}
