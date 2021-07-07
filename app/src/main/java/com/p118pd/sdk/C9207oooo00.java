package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo00  reason: case insensitive filesystem */
public class C9207oooo00 extends C9211oooo000o {
    @NotNull
    public static final <R> List<R> OooO00o(@NotNull Iterable<?> iterable, @NotNull Class<R> cls) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(cls, "klass");
        return (List) OooO00o(iterable, new ArrayList(), cls);
    }

    public static final <T> void OooO0OO(@NotNull List<T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        Collections.reverse(list);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C OooO00o(@NotNull Iterable<?> iterable, @NotNull C c, @NotNull Class<R> cls) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> OooO00o(@NotNull Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return (SortedSet) CollectionsKt___CollectionsKt.OooO0OO((Iterable) iterable, (Collection) new TreeSet());
    }

    @NotNull
    public static final <T> SortedSet<T> OooO00o(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        return (SortedSet) CollectionsKt___CollectionsKt.OooO0OO((Iterable) iterable, (Collection) new TreeSet(comparator));
    }
}
