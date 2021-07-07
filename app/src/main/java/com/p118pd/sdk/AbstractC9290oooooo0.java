package com.p118pd.sdk;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.coroutines.experimental.RestrictsSuspension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@RestrictsSuspension
/* renamed from: com.pd.sdk.oooooo0  reason: case insensitive filesystem */
public abstract class AbstractC9290oooooo0<T> {
    @Nullable
    public final Object OooO00o(@NotNull Iterable<? extends T> iterable, @NotNull AbstractC9285oooooOO<? super C9174oooOOooO> ooooooo) {
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            return OooO00o((Iterator) iterable.iterator(), ooooooo);
        }
        return C9174oooOOooO.OooO00o;
    }

    @Nullable
    public abstract Object OooO00o(T t, @NotNull AbstractC9285oooooOO<? super C9174oooOOooO> ooooooo);

    @Nullable
    public abstract Object OooO00o(@NotNull Iterator<? extends T> it, @NotNull AbstractC9285oooooOO<? super C9174oooOOooO> ooooooo);

    @Nullable
    public final Object OooO00o(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull AbstractC9285oooooOO<? super C9174oooOOooO> ooooooo) {
        return OooO00o((Iterator) oo0ooo00.iterator(), ooooooo);
    }
}
