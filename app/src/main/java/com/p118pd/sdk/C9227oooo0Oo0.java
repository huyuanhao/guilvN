package com.p118pd.sdk;

import com.taobao.accs.AccsClientConfig;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooo0Oo0  reason: case insensitive filesystem */
public final class C9227oooo0Oo0<K, V> implements AbstractC9225oooo0OOo<K, V> {
    public final O00O0OOO<K, V> OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<K, V> f22635OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9227oooo0Oo0(@NotNull Map<K, ? extends V> map, @NotNull O00O0OOO<? super K, ? extends V> o00o0ooo) {
        o0O0OO00.OooO0o(map, "map");
        o0O0OO00.OooO0o(o00o0ooo, AccsClientConfig.DEFAULT_CONFIGTAG);
        this.f22635OooO00o = map;
        this.OooO00o = o00o0ooo;
    }

    @Override // com.p118pd.sdk.AbstractC9225oooo0OOo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<K, V> m21087OooO00o() {
        return this.f22635OooO00o;
    }

    @NotNull
    public Set<K> OooO0O0() {
        return m21087OooO00o().keySet();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return m21087OooO00o().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return m21087OooO00o().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m21088OooO00o();
    }

    public boolean equals(@Nullable Object obj) {
        return m21087OooO00o().equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return m21087OooO00o().get(obj);
    }

    public int hashCode() {
        return m21087OooO00o().hashCode();
    }

    public boolean isEmpty() {
        return m21087OooO00o().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return OooO0O0();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return OooO00o();
    }

    @NotNull
    public String toString() {
        return m21087OooO00o().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m21086OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9225oooo0OOo
    public int OooO00o() {
        return m21087OooO00o().size();
    }

    @Override // com.p118pd.sdk.AbstractC9225oooo0OOo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<V> m21086OooO00o() {
        return m21087OooO00o().values();
    }

    @Override // com.p118pd.sdk.AbstractC9225oooo0OOo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<Map.Entry<K, V>> m21088OooO00o() {
        return m21087OooO00o().entrySet();
    }

    @Override // com.p118pd.sdk.AbstractC9225oooo0OOo
    public V OooO00o(K k) {
        Map<K, V> OooO00o2 = m21087OooO00o();
        V v = OooO00o2.get(k);
        return (v != null || OooO00o2.containsKey(k)) ? v : this.OooO00o.invoke(k);
    }
}
