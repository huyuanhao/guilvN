package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

@KeepForSdk
public class BaseImplementation {

    @KeepForSdk
    public interface ResultHolder<R> {
        @KeepForSdk
        void setFailedResult(Status status);

        @KeepForSdk
        void setResult(R r);
    }

    @KeepForSdk
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @KeepForSdk
        public final Api<?> mApi;
        @KeepForSdk
        public final Api.AnyClientKey<A> mClientKey;

        @KeepForSdk
        @Deprecated
        public ApiMethodImpl(@NonNull Api.AnyClientKey<A> anyClientKey, @NonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.mClientKey = (Api.AnyClientKey) Preconditions.checkNotNull(anyClientKey);
            this.mApi = null;
        }

        @KeepForSdk
        public abstract void doExecute(@NonNull A a) throws RemoteException;

        @KeepForSdk
        public final Api<?> getApi() {
            return this.mApi;
        }

        @KeepForSdk
        public final Api.AnyClientKey<A> getClientKey() {
            return this.mClientKey;
        }

        @KeepForSdk
        public void onSetFailedResult(@NonNull R r) {
        }

        @KeepForSdk
        public final void run(@NonNull A a) throws DeadObjectException {
            if (a instanceof SimpleClientAdapter) {
                a = ((SimpleClientAdapter) a).getClient();
            }
            try {
                doExecute(a);
            } catch (DeadObjectException e) {
                setFailedResult(e);
                throw e;
            } catch (RemoteException e2) {
                setFailedResult(e2);
            }
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public final void setFailedResult(@NonNull Status status) {
            Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success");
            R createFailedResult = createFailedResult(status);
            setResult((Result) createFailedResult);
            onSetFailedResult(createFailedResult);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<R extends com.google.android.gms.common.api.Result, A extends com.google.android.gms.common.api.Api$AnyClient> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(Object obj) {
            super.setResult((Result) obj);
        }

        @KeepForSdk
        public ApiMethodImpl(@NonNull Api<?> api, @NonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.checkNotNull(api, "Api must not be null");
            this.mClientKey = (Api.AnyClientKey<A>) api.getClientKey();
            this.mApi = api;
        }

        @KeepForSdk
        private void setFailedResult(@NonNull RemoteException remoteException) {
            setFailedResult(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        @KeepForSdk
        @VisibleForTesting
        public ApiMethodImpl(@NonNull BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.mClientKey = null;
            this.mApi = null;
        }
    }
}
