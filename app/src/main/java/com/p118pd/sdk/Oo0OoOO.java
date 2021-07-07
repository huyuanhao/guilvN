package com.p118pd.sdk;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.coroutines.RestrictsSuspension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@RestrictsSuspension
/* renamed from: com.pd.sdk.Oo0OoOO */
public abstract class Oo0OoOO<T> {
    @Nullable
    public final Object OooO00o(@NotNull Iterable<? extends T> iterable, @NotNull AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0) {
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            return OooO00o((Iterator) iterable.iterator(), oooooo0);
        }
        return C9174oooOOooO.OooO00o;
    }

    @Nullable
    public abstract Object OooO00o(T t, @NotNull AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0);

    @Nullable
    public abstract Object OooO00o(@NotNull Iterator<? extends T> it, @NotNull AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0);

    @Nullable
    public final Object OooO00o(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0) {
        return OooO00o((Iterator) oo0ooo00.iterator(), oooooo0);
    }
}
