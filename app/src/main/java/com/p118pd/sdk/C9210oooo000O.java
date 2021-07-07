package com.p118pd.sdk;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo000O  reason: case insensitive filesystem */
public class C9210oooo000O extends C9209oooo0000 {
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> boolean m21075OooO00o(@NotNull Collection<? extends T> collection, T t) {
        if (collection != null) {
            return C7367o0OO00oO.m18880OooO00o((Object) collection).remove(t);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @InlineOnly
    public static final <T> boolean OooO0O0(@NotNull Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection != null) {
            return C7367o0OO00oO.m18880OooO00o((Object) collection).removeAll(collection2);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @InlineOnly
    public static final <T> boolean OooO0OO(@NotNull Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection != null) {
            return C7367o0OO00oO.m18880OooO00o((Object) collection).retainAll(collection2);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    public static final boolean OooO0Oo(@NotNull Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @ReplaceWith(expression = "removeAt(index)", imports = {}))
    @InlineOnly
    public static final <T> T OooO00o(@NotNull List<T> list, int i) {
        return list.remove(i);
    }

    @InlineOnly
    public static final <T> void OooO0O0(@NotNull Collection<? super T> collection, T t) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        collection.add(t);
    }

    public static final <T> boolean OooO0OO(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(iterable, "elements");
        return C7367o0OO00oO.m18880OooO00o((Object) collection).retainAll(C9202oooOooo.OooO00o(iterable, collection));
    }

    @InlineOnly
    public static final <T> void OooO00o(@NotNull Collection<? super T> collection, T t) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        collection.remove(t);
    }

    @InlineOnly
    public static final <T> void OooO0O0(@NotNull Collection<? super T> collection, Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        m21074OooO00o((Collection) collection, (Iterable) iterable);
    }

    public static final <T> boolean OooO0OO(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(tArr, "elements");
        if (!(tArr.length == 0)) {
            return collection.retainAll(ArraysKt___ArraysKt.m22195OooO00o((Object[]) tArr));
        }
        return OooO0Oo(collection);
    }

    @InlineOnly
    public static final <T> void OooO00o(@NotNull Collection<? super T> collection, Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        m21078OooO0O0((Collection) collection, (Iterable) iterable);
    }

    @InlineOnly
    public static final <T> void OooO0O0(@NotNull Collection<? super T> collection, T[] tArr) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        m21076OooO00o((Collection) collection, (Object[]) tArr);
    }

    @InlineOnly
    public static final <T> void OooO00o(@NotNull Collection<? super T> collection, T[] tArr) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        m21079OooO0O0((Collection) collection, (Object[]) tArr);
    }

    @InlineOnly
    public static final <T> void OooO0O0(@NotNull Collection<? super T> collection, AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        m21073OooO00o((Collection) collection, (AbstractC7873oO0OOo00) oo0ooo00);
    }

    @InlineOnly
    public static final <T> void OooO00o(@NotNull Collection<? super T> collection, AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        m21077OooO0O0((Collection) collection, (AbstractC7873oO0OOo00) oo0ooo00);
    }

    public static final <T> boolean OooO0O0(@NotNull Iterable<? extends T> iterable, @NotNull O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        return OooO00o((Iterable) iterable, (O00O0OOO) o00o0ooo, false);
    }

    public static final <T> boolean OooO0OO(@NotNull Collection<? super T> collection, @NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "elements");
        HashSet OooO00o = SequencesKt___SequencesKt.m22840OooO00o((AbstractC7873oO0OOo00) oo0ooo00);
        if (!OooO00o.isEmpty()) {
            return collection.retainAll(OooO00o);
        }
        return OooO0Oo(collection);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> boolean m21074OooO00o(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean OooO0O0(@NotNull List<T> list, @NotNull O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        return OooO00o((List) list, (O00O0OOO) o00o0ooo, false);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <T> boolean m21078OooO0O0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(iterable, "elements");
        return C7367o0OO00oO.m18880OooO00o((Object) collection).removeAll(C9202oooOooo.OooO00o(iterable, collection));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <T> boolean m21077OooO0O0(@NotNull Collection<? super T> collection, @NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "elements");
        HashSet OooO00o = SequencesKt___SequencesKt.m22840OooO00o((AbstractC7873oO0OOo00) oo0ooo00);
        return (OooO00o.isEmpty() ^ true) && collection.removeAll(OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> boolean m21073OooO00o(@NotNull Collection<? super T> collection, @NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "elements");
        Iterator<? extends T> it = oo0ooo00.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <T> boolean m21079OooO0O0(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(tArr, "elements");
        return ((tArr.length == 0) ^ true) && collection.removeAll(ArraysKt___ArraysKt.m22195OooO00o(tArr));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> boolean m21076OooO00o(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(tArr, "elements");
        return collection.addAll(C9188oooOoOoo.OooO00o((Object[]) tArr));
    }

    public static final <T> boolean OooO00o(@NotNull Iterable<? extends T> iterable, @NotNull O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        return OooO00o((Iterable) iterable, (O00O0OOO) o00o0ooo, true);
    }

    public static final <T> boolean OooO00o(@NotNull Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (o00o0ooo.invoke((Object) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> boolean OooO00o(@NotNull List<T> list, @NotNull O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        return OooO00o((List) list, (O00O0OOO) o00o0ooo, true);
    }

    public static final <T> boolean OooO00o(@NotNull List<T> list, O00O0OOO<? super T, Boolean> o00o0ooo, boolean z) {
        int i;
        if (list instanceof RandomAccess) {
            int OooO00o = CollectionsKt__CollectionsKt.OooO00o((List) list);
            if (OooO00o >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    T t = list.get(i2);
                    if (o00o0ooo.invoke(t).booleanValue() != z) {
                        if (i != i2) {
                            list.set(i, t);
                        }
                        i++;
                    }
                    if (i2 == OooO00o) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            int OooO00o2 = CollectionsKt__CollectionsKt.OooO00o((List) list);
            if (OooO00o2 < i) {
                return true;
            }
            while (true) {
                list.remove(OooO00o2);
                if (OooO00o2 == i) {
                    return true;
                }
                OooO00o2--;
            }
        } else if (list != null) {
            return OooO00o(C7367o0OO00oO.m18879OooO00o((Object) list), o00o0ooo, z);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }

    @SinceKotlin(version = "1.3")
    public static final <T> void OooO00o(@NotNull List<T> list, @NotNull Random oo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        for (int OooO00o = CollectionsKt__CollectionsKt.OooO00o((List) list); OooO00o >= 1; OooO00o--) {
            int OooO0O0 = oo.OooO0O0(OooO00o + 1);
            T t = list.get(OooO00o);
            list.set(OooO00o, list.get(OooO0O0));
            list.set(OooO0O0, t);
        }
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> List<T> OooO00o(@NotNull Iterable<? extends T> iterable, @NotNull Random oo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        List<T> OooOO0 = CollectionsKt___CollectionsKt.OooOO0(iterable);
        OooO00o((List) OooOO0, oo);
        return OooOO0;
    }
}
