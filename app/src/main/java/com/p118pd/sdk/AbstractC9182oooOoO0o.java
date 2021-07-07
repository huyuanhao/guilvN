package com.p118pd.sdk;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
/* renamed from: com.pd.sdk.oooOoO0o  reason: case insensitive filesystem */
public abstract class AbstractC9182oooOoO0o<K, V> extends AbstractMap<K, V> implements Map<K, V>, KMutableMap {
    public /* bridge */ int OooO00o() {
        return super.size();
    }

    public abstract Set OooO00o();

    public /* bridge */ Set OooO0O0() {
        return super.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return OooO00o();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return OooO0O0();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public abstract V put(K k, V v);

    public final /* bridge */ int size() {
        return OooO00o();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return OooO00o();
    }

    public /* bridge */ Collection OooO00o() {
        return super.values();
    }
}
