package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.o0000oO0  reason: case insensitive filesystem */
public class C6971o0000oO0<K, V> extends C6987o000O0o<K, V> implements Map<K, V> {
    @Nullable
    public AbstractC7005o000OoO<K, V> OooO00o;

    /* renamed from: com.pd.sdk.o0000oO0$OooO00o */
    public class OooO00o extends AbstractC7005o000OoO<K, V> {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO
        public int OooO00o() {
            return C6971o0000oO0.this.o00oO0O;
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public int OooO0O0(Object obj) {
            return C6971o0000oO0.this.OooO0O0(obj);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public Object OooO00o(int i, int i2) {
            return ((C6987o000O0o) C6971o0000oO0.this).f19192OooO00o[(i << 1) + i2];
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public int OooO00o(Object obj) {
            return C6971o0000oO0.this.OooO00o(obj);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Map<K, V> m18172OooO00o() {
            return C6971o0000oO0.this;
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public void OooO00o(K k, V v) {
            C6971o0000oO0.this.put(k, v);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public V OooO00o(int i, V v) {
            return (V) C6971o0000oO0.this.OooO00o(i, v);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO
        public void OooO00o(int i) {
            C6971o0000oO0.this.m18207OooO0O0(i);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18173OooO00o() {
            C6971o0000oO0.this.clear();
        }
    }

    public C6971o0000oO0() {
    }

    @Override // com.p118pd.sdk.C6987o000O0o
    private AbstractC7005o000OoO<K, V> OooO00o() {
        if (this.OooO00o == null) {
            this.OooO00o = new OooO00o();
        }
        return this.OooO00o;
    }

    public boolean OooO0O0(@NonNull Collection<?> collection) {
        return AbstractC7005o000OoO.OooO0O0(this, collection);
    }

    public boolean OooO0OO(@NonNull Collection<?> collection) {
        return AbstractC7005o000OoO.OooO0OO(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return OooO00o().m18252OooO00o();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return OooO00o().OooO0O0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.o0000oO0<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m18206OooO00o(this.o00oO0O + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return OooO00o().m18250OooO00o();
    }

    public C6971o0000oO0(int i) {
        super(i);
    }

    public C6971o0000oO0(C6987o000O0o o000o0o) {
        super(o000o0o);
    }

    public boolean OooO00o(@NonNull Collection<?> collection) {
        return AbstractC7005o000OoO.OooO00o((Map) this, collection);
    }
}
