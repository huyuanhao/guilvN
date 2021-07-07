package com.p118pd.sdk;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0000  reason: case insensitive filesystem */
public class C9209oooo0000 extends C9204oooOoooo {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @ReplaceWith(expression = "this.sortWith(comparator)", imports = {}))
    @InlineOnly
    public static final <T> void OooO00o(@NotNull List<T> list, Comparator<? super T> comparator) {
        throw new NotImplementedError(null, 1, null);
    }

    public static final <T extends Comparable<? super T>> void OooO0O0(@NotNull List<T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @ReplaceWith(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @InlineOnly
    public static final <T> void OooO00o(@NotNull List<T> list, O00Oo000<? super T, ? super T, Integer> o00Oo000) {
        throw new NotImplementedError(null, 1, null);
    }

    public static final <T> void OooO0O0(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final <T> void OooO00o(@NotNull List<T> list, T t) {
        Collections.fill(list, t);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> OooO0O0(@NotNull Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        List<T> OooOO0 = CollectionsKt___CollectionsKt.OooOO0(iterable);
        Collections.shuffle(OooOO0);
        return OooOO0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final <T> void OooO00o(@NotNull List<T> list) {
        Collections.shuffle(list);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static final <T> void OooO00o(@NotNull List<T> list, Random random) {
        Collections.shuffle(list, random);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> OooO00o(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(random, "random");
        List<T> OooOO0 = CollectionsKt___CollectionsKt.OooOO0(iterable);
        Collections.shuffle(OooOO0, random);
        return OooOO0;
    }
}
