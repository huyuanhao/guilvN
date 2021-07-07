package com.p118pd.sdk;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0000O0 */
public final class O0000O0 implements AbstractC9282oooooO0<Object> {
    public static final O0000O0 OooO00o = new O0000O0();

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    @NotNull
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    public void resumeWith(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @NotNull
    public String toString() {
        return "This continuation is already complete";
    }
}
