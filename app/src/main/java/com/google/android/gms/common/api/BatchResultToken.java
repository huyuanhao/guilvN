package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

public final class BatchResultToken<R extends Result> {
    public final int mId;

    public BatchResultToken(int i) {
        this.mId = i;
    }
}
