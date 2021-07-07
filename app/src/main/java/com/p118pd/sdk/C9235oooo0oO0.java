package com.p118pd.sdk;

import com.taobao.accs.AccsClientConfig;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooo0oO0  reason: case insensitive filesystem */
public final class C9235oooo0oO0<K, V> implements AbstractC9230oooo0o<K, V> {
    public final O00O0OOO<K, V> OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<K, V> f22636OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9235oooo0oO0(@NotNull Map<K, V> map, @NotNull O00O0OOO<? super K, ? extends V> o00o0ooo) {
        o0O0OO00.OooO0o(map, "map");
        o0O0OO00.OooO0o(o00o0ooo, AccsClientConfig.DEFAULT_CONFIGTAG);
        this.f22636OooO00o = map;
        this.OooO00o = o00o0ooo;
    }

    @Override // com.p118pd.sdk.AbstractC9230oooo0o, com.p118pd.sdk.AbstractC9225oooo0OOo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<K, V> m21121OooO00o() {
        return this.f22636OooO00o;
    }

    @NotNull
    public Set<K> OooO0O0() {
        return m21121OooO00o().keySet();
    }

    public void clear() {
        m21121OooO00o().clear();
    }

    public boolean containsKey(Object obj) {
        return m21121OooO00o().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return m21121OooO00o().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m21122OooO00o();
    }

    public boolean equals(@Nullable Object obj) {
        return m21121OooO00o().equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return m21121OooO00o().get(obj);
    }

    public int hashCode() {
        return m21121OooO00o().hashCode();
    }

    public boolean isEmpty() {
        return m21121OooO00o().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return OooO0O0();
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        return m21121OooO00o().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        o0O0OO00.OooO0o(map, "from");
        m21121OooO00o().putAll(map);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        return m21121OooO00o().remove(obj);
    }

    public final /* bridge */ int size() {
        return OooO00o();
    }

    @NotNull
    public String toString() {
        return m21121OooO00o().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m21120OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9230oooo0o, com.p118pd.sdk.AbstractC9225oooo0OOo
    public int OooO00o() {
        return m21121OooO00o().size();
    }

    @Override // com.p118pd.sdk.AbstractC9230oooo0o, com.p118pd.sdk.AbstractC9225oooo0OOo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<V> m21120OooO00o() {
        return m21121OooO00o().values();
    }

    @Override // com.p118pd.sdk.AbstractC9230oooo0o, com.p118pd.sdk.AbstractC9225oooo0OOo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<Map.Entry<K, V>> m21122OooO00o() {
        return m21121OooO00o().entrySet();
    }

    @Override // com.p118pd.sdk.AbstractC9225oooo0OOo
    public V OooO00o(K k) {
        Map<K, V> OooO00o2 = m21121OooO00o();
        V v = OooO00o2.get(k);
        return (v != null || OooO00o2.containsKey(k)) ? v : this.OooO00o.invoke(k);
    }
}
