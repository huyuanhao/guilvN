package com.facebook.common.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap<K, V> extends HashMap<K, V> {
    public ImmutableMap(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return new ImmutableMap<>(map);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m844of() {
        return Collections.unmodifiableMap(new HashMap());
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m845of(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m846of(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m847of(K k, V v, K k2, V v2, K k3, V v3) {
        HashMap hashMap = new HashMap(3);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m848of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m849of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        HashMap hashMap = new HashMap(5);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v5);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m850of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        HashMap hashMap = new HashMap(6);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v5);
        hashMap.put(k6, v6);
        return Collections.unmodifiableMap(hashMap);
    }
}
