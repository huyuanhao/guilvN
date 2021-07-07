package com.p118pd.sdk;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo  reason: case insensitive filesystem */
public class C9205oooo extends C9239oooo0ooO {
    @NotNull
    public static final <T> Set<T> OooO00o(@NotNull Set<? extends T> set, T t) {
        o0O0OO00.OooO0o(set, "receiver$0");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C9232oooo0o00.OooO00o(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && o0O0OO00.OooO00o((Object) t2, (Object) t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    @InlineOnly
    public static final <T> Set<T> OooO0O0(@NotNull Set<? extends T> set, T t) {
        return OooO00o((Set) set, (Object) t);
    }

    @NotNull
    public static final <T> Set<T> OooO0OO(@NotNull Set<? extends T> set, T t) {
        o0O0OO00.OooO0o(set, "receiver$0");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C9232oooo0o00.OooO00o(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @InlineOnly
    public static final <T> Set<T> OooO0Oo(@NotNull Set<? extends T> set, T t) {
        return OooO0OO(set, t);
    }

    @NotNull
    public static final <T> Set<T> OooO0O0(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        o0O0OO00.OooO0o(set, "receiver$0");
        o0O0OO00.OooO0o(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C9232oooo0o00.OooO00o(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        C9210oooo000O.m21076OooO00o((Collection) linkedHashSet, (Object[]) tArr);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> OooO00o(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        o0O0OO00.OooO0o(set, "receiver$0");
        o0O0OO00.OooO0o(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C9210oooo000O.m21079OooO0O0((Collection) linkedHashSet, (Object[]) tArr);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> OooO0O0(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        int i;
        o0O0OO00.OooO0o(set, "receiver$0");
        o0O0OO00.OooO0o(iterable, "elements");
        Integer OooO00o = C9202oooOooo.OooO00o((Iterable) iterable);
        if (OooO00o != null) {
            i = set.size() + OooO00o.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C9232oooo0o00.OooO00o(i));
        linkedHashSet.addAll(set);
        C9210oooo000O.m21074OooO00o((Collection) linkedHashSet, (Iterable) iterable);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> OooO00o(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(set, "receiver$0");
        o0O0OO00.OooO0o(iterable, "elements");
        Collection<?> OooO00o = C9202oooOooo.OooO00o(iterable, set);
        if (OooO00o.isEmpty()) {
            return CollectionsKt___CollectionsKt.m22758OooO0O0((Iterable) set);
        }
        if (OooO00o instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!OooO00o.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(OooO00o);
        return linkedHashSet2;
    }

    @NotNull
    public static final <T> Set<T> OooO0O0(@NotNull Set<? extends T> set, @NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(set, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C9232oooo0o00.OooO00o(set.size() * 2));
        linkedHashSet.addAll(set);
        C9210oooo000O.m21073OooO00o((Collection) linkedHashSet, (AbstractC7873oO0OOo00) oo0ooo00);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> OooO00o(@NotNull Set<? extends T> set, @NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(set, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C9210oooo000O.m21077OooO0O0((Collection) linkedHashSet, (AbstractC7873oO0OOo00) oo0ooo00);
        return linkedHashSet;
    }
}
