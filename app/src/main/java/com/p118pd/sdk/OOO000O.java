package com.p118pd.sdk;

import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "TimingKt")
/* renamed from: com.pd.sdk.OOO000O */
public final class OOO000O {
    public static final long OooO00o(@NotNull O00O0000<C9174oooOOooO> o00o0000) {
        o0O0OO00.OooO0o(o00o0000, "block");
        long nanoTime = System.nanoTime();
        o00o0000.invoke();
        return System.nanoTime() - nanoTime;
    }

    public static final long OooO0O0(@NotNull O00O0000<C9174oooOOooO> o00o0000) {
        o0O0OO00.OooO0o(o00o0000, "block");
        long currentTimeMillis = System.currentTimeMillis();
        o00o0000.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
