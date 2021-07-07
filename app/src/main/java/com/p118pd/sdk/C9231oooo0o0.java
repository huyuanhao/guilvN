package com.p118pd.sdk;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooo0o0  reason: case insensitive filesystem */
public class C9231oooo0o0 extends C9232oooo0o00 {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M OooO(@NotNull M m, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(m, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "action");
        for (Map.Entry<K, V> entry : m.entrySet()) {
            o00o0ooo.invoke(entry);
        }
        return m;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> List<Pair<K, V>> m21093OooO00o(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        if (map.size() == 0) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return C9201oooOooOo.OooO00o(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    @NotNull
    public static final <K, V, R> List<R> OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            arrayList.add(o00o0ooo.invoke(entry));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, R> List<R> OooO0OO(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            Object invoke = o00o0ooo.invoke(entry);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <K, V> boolean OooO0Oo(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return map.isEmpty();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <K, V> boolean m21099OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00o0ooo.invoke(entry).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C OooO0OO(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            c.add(o00o0ooo.invoke(entry));
        }
        return c;
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m21098OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        T t;
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            T next = it.next();
            Comparable comparable = (Comparable) o00o0ooo.invoke(next);
            while (it.hasNext()) {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) o00o0ooo.invoke(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            }
            t = next;
        }
        return t;
    }

    public static final <K, V> boolean OooO0OO(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return !map.isEmpty();
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final <K, V> boolean m21100OooO0OO(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00o0ooo.invoke(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V, R> List<R> m21094OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) o00o0ooo.invoke(entry));
        }
        return arrayList;
    }

    @Nullable
    public static final <K, V> Map.Entry<K, V> OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.OooO0O0((Iterable) map.entrySet(), (Comparator) comparator);
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            C9210oooo000O.m21074OooO00o((Collection) c, (Iterable) o00o0ooo.invoke(entry));
        }
        return c;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            Object invoke = o00o0ooo.invoke(entry);
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> boolean m21097OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!o00o0ooo.invoke(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InlineOnly
    public static final <K, V> int OooO00o(@NotNull Map<? extends K, ? extends V> map) {
        return map.size();
    }

    public static final <K, V> int OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00o0ooo.invoke(entry).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @HidesMembers
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> void m21096OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "action");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            o00o0ooo.invoke(entry);
        }
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m21095OooO00o(@NotNull Map<? extends K, ? extends V> map, O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        T t;
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            T next = it.next();
            Comparable comparable = (Comparable) o00o0ooo.invoke(next);
            while (it.hasNext()) {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) o00o0ooo.invoke(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            }
            t = next;
        }
        return t;
    }

    @InlineOnly
    public static final <K, V> Map.Entry<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        return (Map.Entry) CollectionsKt___CollectionsKt.OooO00o((Iterable) map.entrySet(), (Comparator) comparator);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> Iterable<Map.Entry<K, V>> m21092OooO00o(@NotNull Map<? extends K, ? extends V> map) {
        return map.entrySet();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> AbstractC7873oO0OOo00<Map.Entry<K, V>> m21091OooO00o(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return CollectionsKt___CollectionsKt.m22707OooO00o((Iterable) map.entrySet());
    }
}
