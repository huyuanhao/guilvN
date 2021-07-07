package com.p118pd.sdk;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0Ooo  reason: case insensitive filesystem */
public class C9229oooo0Ooo extends C9228oooo0OoO {
    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Pair<? extends K, ? extends V> pair) {
        o0O0OO00.OooO0o(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        o0O0OO00.OooO00o((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    @InlineOnly
    public static final <K, V> Map<K, V> OooO0O0(@NotNull Map<K, ? extends V> map) {
        return OooO00o((Map) map);
    }

    public static final <K, V> V OooO00o(@NotNull ConcurrentMap<K, V> concurrentMap, K k, @NotNull O00O0000<? extends V> o00o0000) {
        o0O0OO00.OooO0o(concurrentMap, "receiver$0");
        o0O0OO00.OooO0o(o00o0000, "defaultValue");
        V v = concurrentMap.get(k);
        if (v != null) {
            return v;
        }
        V v2 = (V) o00o0000.invoke();
        V putIfAbsent = concurrentMap.putIfAbsent(k, v2);
        return putIfAbsent != null ? putIfAbsent : v2;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m21090OooO00o(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return new TreeMap(map);
    }

    @NotNull
    public static final <K, V> SortedMap<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map, @NotNull Comparator<? super K> comparator) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> OooO00o(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        o0O0OO00.OooO0o(pairArr, "pairs");
        TreeMap treeMap = new TreeMap();
        C9232oooo0o00.OooO0O0((Map) treeMap, (Pair[]) pairArr);
        return treeMap;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Properties m21089OooO00o(@NotNull Map<String, String> map) {
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "receiver$0");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        o0O0OO00.OooO00o((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        o0O0OO00.OooO00o((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
