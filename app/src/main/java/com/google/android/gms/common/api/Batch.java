package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

public final class Batch extends BasePendingResult<BatchResult> {
    public final Object mLock;
    public int zaaz;
    public boolean zaba;
    public boolean zabb;
    public final PendingResult<?>[] zabc;

    public static final class Builder {
        public List<PendingResult<?>> zabe = new ArrayList();
        public GoogleApiClient zabf;

        public Builder(GoogleApiClient googleApiClient) {
            this.zabf = googleApiClient;
        }

        public final <R extends Result> BatchResultToken<R> add(PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.zabe.size());
            this.zabe.add(pendingResult);
            return batchResultToken;
        }

        public final Batch build() {
            return new Batch(this.zabe, this.zabf, null);
        }
    }

    public Batch(List<PendingResult<?>> list, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.mLock = new Object();
        int size = list.size();
        this.zaaz = size;
        this.zabc = new PendingResult[size];
        if (list.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, this.zabc));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            PendingResult<?> pendingResult = list.get(i);
            this.zabc[i] = pendingResult;
            pendingResult.addStatusListener(new zaa(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        super.cancel();
        for (PendingResult<?> pendingResult : this.zabc) {
            pendingResult.cancel();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final BatchResult createFailedResult(Status status) {
        return new BatchResult(status, this.zabc);
    }

    public static /* synthetic */ int zab(Batch batch) {
        int i = batch.zaaz;
        batch.zaaz = i - 1;
        return i;
    }

    public /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, zaa zaa) {
        this(list, googleApiClient);
    }
}
