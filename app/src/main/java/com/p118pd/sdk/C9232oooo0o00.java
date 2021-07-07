package com.p118pd.sdk;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.collections.EmptyMap;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooo0o00  reason: case insensitive filesystem */
public class C9232oooo0o00 extends C9229oooo0Ooo {
    public static final int OooO00o = 1073741824;

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> Map<K, V> m21103OooO00o() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        if (emptyMap != null) {
            return emptyMap;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    @InlineOnly
    public static final <K, V> Map<K, V> OooO0O0() {
        return m21103OooO00o();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <K, V> Map<K, V> OooO0OO() {
        return new LinkedHashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    public static final <K, V> Map<K, V> OooO0Oo(@Nullable Map<K, ? extends V> map) {
        return map != 0 ? map : m21103OooO00o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> OooO0o(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super V, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00o0ooo.invoke((Object) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> OooO0o0(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!o00o0ooo.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<R, V> OooO0oO(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        LinkedHashMap linkedHashMap = new LinkedHashMap(OooO00o(map.size()));
        for (T t : map.entrySet()) {
            linkedHashMap.put(o00o0ooo.invoke(t), t.getValue());
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<K, R> OooO0oo(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        LinkedHashMap linkedHashMap = new LinkedHashMap(OooO00o(map.size()));
        for (T t : map.entrySet()) {
            linkedHashMap.put(t.getKey(), o00o0ooo.invoke(t));
        }
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> Map<K, V> m21104OooO00o(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        o0O0OO00.OooO0o(pairArr, "pairs");
        return pairArr.length > 0 ? OooO00o(pairArr, new LinkedHashMap(OooO00o(pairArr.length))) : m21103OooO00o();
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO0O0(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        o0O0OO00.OooO0o(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(OooO00o(pairArr.length));
        OooO0O0((Map) linkedHashMap, (Pair[]) pairArr);
        return linkedHashMap;
    }

    @InlineOnly
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final <K, V> boolean m21119OooO0OO(@NotNull Map<K, ? extends V> map, V v) {
        return map.containsValue(v);
    }

    @InlineOnly
    public static final <K, V> V OooO0Oo(@NotNull Map<? extends K, V> map, K k) {
        if (map != null) {
            return (V) C7367o0OO00oO.m18890OooO00o((Object) map).remove(k);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <K, V> HashMap<K, V> OooO00o() {
        return new HashMap<>();
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <K, V> boolean m21117OooO0O0(@Nullable Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @SinceKotlin(version = "1.1")
    public static final <K, V> V OooO0OO(@NotNull Map<K, ? extends V> map, K k) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return (V) C9228oooo0OoO.OooO00o((Map) map, (Object) k);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super R> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super K, ? super R>> M OooO0Oo(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (T t : map.entrySet()) {
            m.put(t.getKey(), o00o0ooo.invoke(t));
        }
        return m;
    }

    @NotNull
    public static final <K, V> HashMap<K, V> OooO00o(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        o0O0OO00.OooO0o(pairArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(OooO00o(pairArr.length));
        OooO0O0((Map) hashMap, (Pair[]) pairArr);
        return hashMap;
    }

    @InlineOnly
    public static final <K, V> V OooO0O0(@NotNull Map<? extends K, ? extends V> map, K k) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return (V) map.get(k);
    }

    public static final <K, V> V OooO0OO(@NotNull Map<K, V> map, K k, @NotNull O00O0000<? extends V> o00o0000) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0000, "defaultValue");
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V v2 = (V) o00o0000.invoke();
        map.put(k, v2);
        return v2;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> LinkedHashMap<K, V> m21101OooO00o() {
        return new LinkedHashMap<>();
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <K> boolean m21118OooO0O0(@NotNull Map<? extends K, ?> map, K k) {
        if (map != null) {
            return map.containsKey(k);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> OooO0o(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return new LinkedHashMap(map);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> OooO0o0(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        int size = map.size();
        if (size == 0) {
            return m21103OooO00o();
        }
        if (size != 1) {
            return OooO0o(map);
        }
        return C9229oooo0Ooo.OooO00o((Map) map);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> LinkedHashMap<K, V> m21102OooO00o(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        o0O0OO00.OooO0o(pairArr, "pairs");
        return (LinkedHashMap) OooO00o(pairArr, new LinkedHashMap(OooO00o(pairArr.length)));
    }

    @InlineOnly
    public static final <K, V> V OooO0O0(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        o0O0OO00.OooO0o(entry, "receiver$0");
        return (V) entry.getValue();
    }

    @PublishedApi
    public static final int OooO00o(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> V OooO0O0(@NotNull Map<K, ? extends V> map, K k, @NotNull O00O0000<? extends V> o00o0000) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0000, "defaultValue");
        V v = (V) map.get(k);
        return (v != null || map.containsKey(k)) ? v : (V) o00o0000.invoke();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super R, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super R, ? super V>> M OooO0OO(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (T t : map.entrySet()) {
            m.put(o00o0ooo.invoke(t), t.getValue());
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> OooO0Oo(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super K, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00o0ooo.invoke((Object) entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> boolean m21113OooO00o(@NotNull Map<? extends K, ? extends V> map) {
        return !map.isEmpty();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: M extends java.util.Map<?, ?> & R */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <M extends Map<?, ?> & R, R> R OooO00o(M m, O00O0000<? extends R> o00o0000) {
        return m.isEmpty() ? (R) o00o0000.invoke() : m;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> boolean m21114OooO00o(@NotNull Map<? extends K, ? extends V> map, K k) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return map.containsKey(k);
    }

    @InlineOnly
    @JvmName(name = "mutableIterator")
    public static final <K, V> Iterator<Map.Entry<K, V>> OooO0O0(@NotNull Map<K, V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return map.entrySet().iterator();
    }

    @InlineOnly
    public static final <K, V> void OooO00o(@NotNull Map<K, V> map, K k, V v) {
        o0O0OO00.OooO0o(map, "receiver$0");
        map.put(k, v);
    }

    public static final <K, V> void OooO0O0(@NotNull Map<? super K, ? super V> map, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((Object) pair.component1(), (Object) pair.component2());
        }
    }

    public static final <K, V> void OooO0OO(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(iterable, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put((Object) pair.component1(), (Object) pair.component2());
        }
    }

    @InlineOnly
    public static final <K, V> K OooO00o(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        o0O0OO00.OooO0o(entry, "receiver$0");
        return (K) entry.getKey();
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> Pair<K, V> m21105OooO00o(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00o0ooo.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    public static final <K, V> void OooO0OO(@NotNull Map<? super K, ? super V> map, @NotNull AbstractC7873oO0OOo00<? extends Pair<? extends K, ? extends V>> oo0ooo00) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> it = oo0ooo00.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put((Object) pair.component1(), (Object) pair.component2());
        }
    }

    @InlineOnly
    public static final <K, V> V OooO00o(@NotNull Map<K, ? extends V> map, K k, O00O0000<? extends V> o00o0000) {
        V v = (V) map.get(k);
        return v != null ? v : (V) o00o0000.invoke();
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: java.util.Iterator<java.util.Map$Entry<? extends K, ? extends V>>, java.util.Iterator<java.util.Map$Entry<K, V>> */
    @InlineOnly
    public static final <K, V> Iterator<Map.Entry<K, V>> OooO00o(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return (Iterator<Map.Entry<? extends K, ? extends V>>) map.entrySet().iterator();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> OooO0OO(@NotNull Map<? extends K, ? extends V> map, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (o00o0ooo.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull O00O0OOO<? super Map.Entry<? extends K, ? extends V>, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!o00o0ooo.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull M m) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        m.putAll(map);
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(iterable, "pairs");
        if (map.isEmpty()) {
            return OooO00o(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        OooO0OO((Map) linkedHashMap, (Iterable) iterable);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO0O0(@NotNull Map<? extends K, ? extends V> map, @NotNull AbstractC7873oO0OOo00<? extends Pair<? extends K, ? extends V>> oo0ooo00) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        OooO0OO((Map) linkedHashMap, (AbstractC7873oO0OOo00) oo0ooo00);
        return OooO0OO(linkedHashMap);
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (!(iterable instanceof Collection)) {
            return OooO0OO(OooO00o(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m21103OooO00o();
        }
        if (size != 1) {
            return OooO00o(iterable, new LinkedHashMap(OooO00o(collection.size())));
        }
        return C9229oooo0Ooo.OooO00o((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <K, V> void m21116OooO0O0(@NotNull Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        o0O0OO00.OooO0o(map, "receiver$0");
        OooO0OO((Map) map, (Iterable) iterable);
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO0OO(@NotNull Pair<? extends K, ? extends V>[] pairArr) {
        o0O0OO00.OooO0o(pairArr, "receiver$0");
        int length = pairArr.length;
        if (length == 0) {
            return m21103OooO00o();
        }
        if (length != 1) {
            return OooO00o(pairArr, new LinkedHashMap(OooO00o(pairArr.length)));
        }
        return C9229oooo0Ooo.OooO00o(pairArr[0]);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <K, V> void m21115OooO0O0(@NotNull Map<? super K, ? super V> map, AbstractC7873oO0OOo00<? extends Pair<? extends K, ? extends V>> oo0ooo00) {
        o0O0OO00.OooO0o(map, "receiver$0");
        OooO0OO((Map) map, (AbstractC7873oO0OOo00) oo0ooo00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> OooO0OO(@NotNull Map<K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        int size = map.size();
        if (size == 0) {
            return m21103OooO00o();
        }
        if (size != 1) {
            return map;
        }
        return C9229oooo0Ooo.OooO00o((Map) map);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO00o(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable, @NotNull M m) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        OooO0OO((Map) m, (Iterable) iterable);
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO00o(@NotNull Pair<? extends K, ? extends V>[] pairArr, @NotNull M m) {
        o0O0OO00.OooO0o(pairArr, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        OooO0O0((Map) m, (Pair[]) pairArr);
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull AbstractC7873oO0OOo00<? extends Pair<? extends K, ? extends V>> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        return OooO0OO(OooO00o(oo0ooo00, new LinkedHashMap()));
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO00o(@NotNull AbstractC7873oO0OOo00<? extends Pair<? extends K, ? extends V>> oo0ooo00, @NotNull M m) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        OooO0OO((Map) m, (AbstractC7873oO0OOo00) oo0ooo00);
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull Pair<? extends K, ? extends V> pair) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(pair, "pair");
        if (map.isEmpty()) {
            return C9229oooo0Ooo.OooO00o(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(pairArr, "pairs");
        if (map.isEmpty()) {
            return OooO0OO(pairArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        OooO0O0((Map) linkedHashMap, (Pair[]) pairArr);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull Map<? extends K, ? extends V> map2) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> void m21110OooO00o(@NotNull Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        o0O0OO00.OooO0o(map, "receiver$0");
        map.put((Object) pair.getFirst(), (Object) pair.getSecond());
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> void m21112OooO00o(@NotNull Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        o0O0OO00.OooO0o(map, "receiver$0");
        OooO0O0((Map) map, (Pair[]) pairArr);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> void m21109OooO00o(@NotNull Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        o0O0OO00.OooO0o(map, "receiver$0");
        map.putAll(map2);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, K k) {
        o0O0OO00.OooO0o(map, "receiver$0");
        Map OooO0o = OooO0o(map);
        OooO0o.remove(k);
        return OooO0OO(OooO0o);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends K> iterable) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(iterable, oOO0OO0O.OooO0oo);
        Map OooO0o = OooO0o(map);
        C9210oooo000O.m21078OooO0O0((Collection) OooO0o.keySet(), (Iterable) iterable);
        return OooO0OO(OooO0o);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull K[] kArr) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(kArr, oOO0OO0O.OooO0oo);
        Map OooO0o = OooO0o(map);
        C9210oooo000O.m21079OooO0O0((Collection) OooO0o.keySet(), (Object[]) kArr);
        return OooO0OO(OooO0o);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull AbstractC7873oO0OOo00<? extends K> oo0ooo00) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, oOO0OO0O.OooO0oo);
        Map OooO0o = OooO0o(map);
        C9210oooo000O.m21077OooO0O0((Collection) OooO0o.keySet(), (AbstractC7873oO0OOo00) oo0ooo00);
        return OooO0OO(OooO0o);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> void m21108OooO00o(@NotNull Map<K, V> map, K k) {
        o0O0OO00.OooO0o(map, "receiver$0");
        map.remove(k);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> void m21107OooO00o(@NotNull Map<K, V> map, Iterable<? extends K> iterable) {
        o0O0OO00.OooO0o(map, "receiver$0");
        C9210oooo000O.m21078OooO0O0((Collection) map.keySet(), (Iterable) iterable);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> void m21111OooO00o(@NotNull Map<K, V> map, K[] kArr) {
        o0O0OO00.OooO0o(map, "receiver$0");
        C9210oooo000O.m21079OooO0O0((Collection) map.keySet(), (Object[]) kArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> void m21106OooO00o(@NotNull Map<K, V> map, AbstractC7873oO0OOo00<? extends K> oo0ooo00) {
        o0O0OO00.OooO0o(map, "receiver$0");
        C9210oooo000O.m21077OooO0O0((Collection) map.keySet(), (AbstractC7873oO0OOo00) oo0ooo00);
    }
}
