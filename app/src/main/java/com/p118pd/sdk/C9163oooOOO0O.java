package com.p118pd.sdk;

import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "TuplesKt")
/* renamed from: com.pd.sdk.oooOOO0O  reason: case insensitive filesystem */
public final class C9163oooOOO0O {
    @NotNull
    public static final <A, B> Pair<A, B> OooO00o(A a, B b) {
        return new Pair<>(a, b);
    }

    @NotNull
    public static final <T> List<T> OooO00o(@NotNull Pair<? extends T, ? extends T> pair) {
        o0O0OO00.OooO0o(pair, "receiver$0");
        return CollectionsKt__CollectionsKt.m22698OooO00o(pair.getFirst(), pair.getSecond());
    }

    @NotNull
    public static final <T> List<T> OooO00o(@NotNull Triple<? extends T, ? extends T, ? extends T> triple) {
        o0O0OO00.OooO0o(triple, "receiver$0");
        return CollectionsKt__CollectionsKt.m22698OooO00o(triple.getFirst(), triple.getSecond(), triple.getThird());
    }
}
