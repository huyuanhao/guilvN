package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public interface zzq<TResult> {
    void cancel();

    void onComplete(@NonNull Task<TResult> task);
}
