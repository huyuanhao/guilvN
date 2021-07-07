package com.p118pd.sdk;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.ooooOOO0  reason: case insensitive filesystem */
public final class C9262ooooOOO0<T> implements Comparator<T> {
    @NotNull
    public final Comparator<T> OooO00o;

    public C9262ooooOOO0(@NotNull Comparator<T> comparator) {
        o0O0OO00.OooO0o(comparator, "comparator");
        this.OooO00o = comparator;
    }

    @NotNull
    public final Comparator<T> OooO00o() {
        return this.OooO00o;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.OooO00o.compare(t2, t);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.OooO00o;
    }
}
