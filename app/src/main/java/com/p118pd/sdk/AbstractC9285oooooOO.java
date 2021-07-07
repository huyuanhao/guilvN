package com.p118pd.sdk;

import kotlin.SinceKotlin;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.1")
/* renamed from: com.pd.sdk.oooooOO  reason: case insensitive filesystem */
public interface AbstractC9285oooooOO<T> {
    @NotNull
    CoroutineContext getContext();

    void resume(T t);

    void resumeWithException(@NotNull Throwable th);
}
