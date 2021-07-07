package com.p118pd.sdk;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0oo  reason: case insensitive filesystem */
public class C9237oooo0oo {
    @NotNull
    public static final <T> Set<T> OooO00o(T t) {
        Set<T> singleton = Collections.singleton(t);
        o0O0OO00.OooO00o((Object) singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    @NotNull
    public static final <T> TreeSet<T> OooO00o(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return (TreeSet) ArraysKt___ArraysKt.OooO0OO((Object[]) tArr, (Collection) new TreeSet());
    }

    @NotNull
    public static final <T> TreeSet<T> OooO00o(@NotNull Comparator<? super T> comparator, @NotNull T... tArr) {
        o0O0OO00.OooO0o(comparator, "comparator");
        o0O0OO00.OooO0o(tArr, "elements");
        return (TreeSet) ArraysKt___ArraysKt.OooO0OO((Object[]) tArr, (Collection) new TreeSet(comparator));
    }
}
