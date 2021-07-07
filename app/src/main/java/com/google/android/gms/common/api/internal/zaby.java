package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zaby implements RemoteCall {
    public final BiConsumer zake;

    public zaby(BiConsumer biConsumer) {
        this.zake = biConsumer;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        this.zake.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
    }
}
