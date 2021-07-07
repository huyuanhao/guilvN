package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zaad implements OnCompleteListener<TResult> {
    public final /* synthetic */ zaab zafm;
    public final /* synthetic */ TaskCompletionSource zafn;

    public zaad(zaab zaab, TaskCompletionSource taskCompletionSource) {
        this.zafm = zaab;
        this.zafn = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task<TResult> task) {
        this.zafm.zafk.remove(this.zafn);
    }
}
