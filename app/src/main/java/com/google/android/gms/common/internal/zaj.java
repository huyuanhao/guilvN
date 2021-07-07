package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

public final class zaj implements PendingResult.StatusListener {
    public final /* synthetic */ PendingResult zaou;
    public final /* synthetic */ TaskCompletionSource zaov;
    public final /* synthetic */ PendingResultUtil.ResultConverter zaow;
    public final /* synthetic */ PendingResultUtil.zaa zaox;

    public zaj(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, PendingResultUtil.zaa zaa) {
        this.zaou = pendingResult;
        this.zaov = taskCompletionSource;
        this.zaow = resultConverter;
        this.zaox = zaa;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.zaov.setResult(this.zaow.convert(this.zaou.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.zaov.setException(this.zaox.zaf(status));
    }
}
