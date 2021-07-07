package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C7490o0OoOO0o;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzlj<K, V> implements Serializable, Map<K, V> {
    public static final Map.Entry<?, ?>[] zzacz = new Map.Entry[0];
    public transient zzll<Map.Entry<K, V>> zzada;
    public transient zzll<K> zzadb;
    public transient zzlf<V> zzadc;

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzlf) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzll<Map.Entry<K, V>> zzll = this.zzada;
        if (zzll != null) {
            return zzll;
        }
        zzll<Map.Entry<K, V>> zziq = zziq();
        this.zzada = zziq;
        return zziq;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return zzls.zzb((zzll) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzll<K> zzll = this.zzadb;
        if (zzll != null) {
            return zzll;
        }
        zzll<K> zzir = zzir();
        this.zzadb = zzir;
        return zzir;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                z = false;
                sb.append((Object) entry.getKey());
                sb.append(C7490o0OoOO0o.OooO00o);
                sb.append((Object) entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(FileAttachment.KEY_SIZE.length() + 40);
        sb2.append(FileAttachment.KEY_SIZE);
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzlf<V> zzlf = this.zzadc;
        if (zzlf != null) {
            return zzlf;
        }
        zzlf<V> zzis = zzis();
        this.zzadc = zzis;
        return zzis;
    }

    public abstract zzll<Map.Entry<K, V>> zziq();

    public abstract zzll<K> zzir();

    public abstract zzlf<V> zzis();
}
