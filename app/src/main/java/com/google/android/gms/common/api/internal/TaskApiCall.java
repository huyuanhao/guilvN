package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    public final Feature[] zakd;
    public final boolean zakk;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        public Feature[] zakd;
        public boolean zakk;
        public RemoteCall<A, TaskCompletionSource<ResultT>> zakl;

        public Builder() {
            this.zakk = true;
        }

        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.zakl != null, "execute parameter required");
            return new zack(this, this.zakd, this.zakk);
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.zakl = new zacj(biConsumer);
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> run(RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zakl = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zakk = z;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> setFeatures(Feature... featureArr) {
            this.zakd = featureArr;
            return this;
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zakd = null;
        this.zakk = false;
    }

    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>();
    }

    @KeepForSdk
    public abstract void doExecute(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zakk;
    }

    @Nullable
    public final Feature[] zabt() {
        return this.zakd;
    }

    @KeepForSdk
    public TaskApiCall(Feature[] featureArr, boolean z) {
        this.zakd = featureArr;
        this.zakk = z;
    }
}
