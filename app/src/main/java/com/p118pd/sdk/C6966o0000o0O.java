package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000o0O  reason: case insensitive filesystem */
public class C6966o0000o0O<K, V> implements Iterable<Map.Entry<K, V>> {
    public OooO0OO<K, V> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakHashMap<OooO0o<K, V>, Boolean> f19169OooO00o = new WeakHashMap<>();
    public OooO0OO<K, V> OooO0O0;
    public int o00oO0O = 0;

    /* renamed from: com.pd.sdk.o0000o0O$OooO00o */
    public static class OooO00o<K, V> extends AbstractC6968OooO0o0<K, V> {
        public OooO00o(OooO0OO<K, V> oooO0OO, OooO0OO<K, V> oooO0OO2) {
            super(oooO0OO, oooO0OO2);
        }

        @Override // com.p118pd.sdk.C6966o0000o0O.OooO0o, com.p118pd.sdk.C6966o0000o0O.AbstractC6968OooO0o0, com.p118pd.sdk.C6966o0000o0O.AbstractC6968OooO0o0
        public OooO0OO<K, V> OooO00o(OooO0OO<K, V> oooO0OO) {
            return oooO0OO.OooO0O0;
        }

        @Override // com.p118pd.sdk.C6966o0000o0O.AbstractC6968OooO0o0
        public OooO0OO<K, V> OooO0O0(OooO0OO<K, V> oooO0OO) {
            return oooO0OO.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.o0000o0O$OooO0O0 */
    public static class OooO0O0<K, V> extends AbstractC6968OooO0o0<K, V> {
        public OooO0O0(OooO0OO<K, V> oooO0OO, OooO0OO<K, V> oooO0OO2) {
            super(oooO0OO, oooO0OO2);
        }

        @Override // com.p118pd.sdk.C6966o0000o0O.OooO0o, com.p118pd.sdk.C6966o0000o0O.AbstractC6968OooO0o0, com.p118pd.sdk.C6966o0000o0O.AbstractC6968OooO0o0
        public OooO0OO<K, V> OooO00o(OooO0OO<K, V> oooO0OO) {
            return oooO0OO.OooO00o;
        }

        @Override // com.p118pd.sdk.C6966o0000o0O.AbstractC6968OooO0o0
        public OooO0OO<K, V> OooO0O0(OooO0OO<K, V> oooO0OO) {
            return oooO0OO.OooO0O0;
        }
    }

    /* renamed from: com.pd.sdk.o0000o0O$OooO0OO */
    public static class OooO0OO<K, V> implements Map.Entry<K, V> {
        public OooO0OO<K, V> OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final K f19170OooO00o;
        public OooO0OO<K, V> OooO0O0;
        @NonNull

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final V f19171OooO0O0;

        public OooO0OO(@NonNull K k, @NonNull V v) {
            this.f19170OooO00o = k;
            this.f19171OooO0O0 = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (!this.f19170OooO00o.equals(oooO0OO.f19170OooO00o) || !this.f19171OooO0O0.equals(oooO0OO.f19171OooO0O0)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f19170OooO00o;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f19171OooO0O0;
        }

        public int hashCode() {
            return this.f19170OooO00o.hashCode() ^ this.f19171OooO0O0.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f19170OooO00o) + C8932ooOOO0o.OooO0Oo + ((Object) this.f19171OooO0O0);
        }
    }

    /* renamed from: com.pd.sdk.o0000o0O$OooO0o */
    public interface OooO0o<K, V> {
        void OooO00o(@NonNull OooO0OO<K, V> oooO0OO);
    }

    public OooO0OO<K, V> OooO00o(K k) {
        OooO0OO<K, V> oooO0OO = this.OooO00o;
        while (oooO0OO != null && !oooO0OO.f19170OooO00o.equals(k)) {
            oooO0OO = oooO0OO.OooO00o;
        }
        return oooO0OO;
    }

    public Map.Entry<K, V> OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6966o0000o0O)) {
            return false;
        }
        C6966o0000o0O o0000o0o = (C6966o0000o0O) obj;
        if (size() != o0000o0o.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = o0000o0o.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        OooO00o oooO00o = new OooO00o(this.OooO00o, this.OooO0O0);
        this.f19169OooO00o.put(oooO00o, false);
        return oooO00o;
    }

    public int size() {
        return this.o00oO0O;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: com.pd.sdk.o0000o0O$OooO0Oo  reason: case insensitive filesystem */
    public class C6967OooO0Oo implements Iterator<Map.Entry<K, V>>, OooO0o<K, V> {
        public OooO0OO<K, V> OooO00o;
        public boolean OooO0O0 = true;

        public C6967OooO0Oo() {
        }

        @Override // com.p118pd.sdk.C6966o0000o0O.OooO0o
        public void OooO00o(@NonNull OooO0OO<K, V> oooO0OO) {
            OooO0OO<K, V> oooO0OO2 = this.OooO00o;
            if (oooO0OO == oooO0OO2) {
                OooO0OO<K, V> oooO0OO3 = oooO0OO2.OooO0O0;
                this.OooO00o = oooO0OO3;
                this.OooO0O0 = oooO0OO3 == null;
            }
        }

        public boolean hasNext() {
            if (!this.OooO0O0) {
                OooO0OO<K, V> oooO0OO = this.OooO00o;
                if (oooO0OO == null || oooO0OO.OooO00o == null) {
                    return false;
                }
                return true;
            } else if (C6966o0000o0O.this.OooO00o != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: OooO00o */
        public Map.Entry<K, V> next() {
            if (this.OooO0O0) {
                this.OooO0O0 = false;
                this.OooO00o = C6966o0000o0O.this.OooO00o;
            } else {
                OooO0OO<K, V> oooO0OO = this.OooO00o;
                this.OooO00o = oooO0OO != null ? oooO0OO.OooO00o : null;
            }
            return this.OooO00o;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public V m18155OooO00o(@NonNull K k, @NonNull V v) {
        OooO0OO<K, V> OooO00o2 = OooO00o((Object) k);
        if (OooO00o2 != null) {
            return OooO00o2.f19171OooO0O0;
        }
        OooO00o((Object) k, (Object) v);
        return null;
    }

    /* renamed from: com.pd.sdk.o0000o0O$OooO0o0  reason: case insensitive filesystem */
    public static abstract class AbstractC6968OooO0o0<K, V> implements Iterator<Map.Entry<K, V>>, OooO0o<K, V> {
        public OooO0OO<K, V> OooO00o;
        public OooO0OO<K, V> OooO0O0;

        public AbstractC6968OooO0o0(OooO0OO<K, V> oooO0OO, OooO0OO<K, V> oooO0OO2) {
            this.OooO00o = oooO0OO2;
            this.OooO0O0 = oooO0OO;
        }

        @Override // com.p118pd.sdk.C6966o0000o0O.OooO0o
        public abstract OooO0OO<K, V> OooO00o(OooO0OO<K, V> oooO0OO);

        @Override // com.p118pd.sdk.C6966o0000o0O.OooO0o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18159OooO00o(@NonNull OooO0OO<K, V> oooO0OO) {
            if (this.OooO00o == oooO0OO && oooO0OO == this.OooO0O0) {
                this.OooO0O0 = null;
                this.OooO00o = null;
            }
            OooO0OO<K, V> oooO0OO2 = this.OooO00o;
            if (oooO0OO2 == oooO0OO) {
                this.OooO00o = OooO00o((OooO0OO) oooO0OO2);
            }
            if (this.OooO0O0 == oooO0OO) {
                this.OooO0O0 = OooO00o();
            }
        }

        public abstract OooO0OO<K, V> OooO0O0(OooO0OO<K, V> oooO0OO);

        public boolean hasNext() {
            return this.OooO0O0 != null;
        }

        private OooO0OO<K, V> OooO00o() {
            OooO0OO<K, V> oooO0OO = this.OooO0O0;
            OooO0OO<K, V> oooO0OO2 = this.OooO00o;
            if (oooO0OO == oooO0OO2 || oooO0OO2 == null) {
                return null;
            }
            return OooO0O0(oooO0OO);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Map.Entry<K, V> next() {
            OooO0OO<K, V> oooO0OO = this.OooO0O0;
            this.OooO0O0 = OooO00o();
            return oooO0OO;
        }
    }

    public OooO0OO<K, V> OooO00o(@NonNull K k, @NonNull V v) {
        OooO0OO<K, V> oooO0OO = new OooO0OO<>(k, v);
        this.o00oO0O++;
        OooO0OO<K, V> oooO0OO2 = this.OooO0O0;
        if (oooO0OO2 == null) {
            this.OooO00o = oooO0OO;
            this.OooO0O0 = oooO0OO;
            return oooO0OO;
        }
        oooO0OO2.OooO00o = oooO0OO;
        oooO0OO.OooO0O0 = oooO0OO2;
        this.OooO0O0 = oooO0OO;
        return oooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public V m18154OooO00o(@NonNull K k) {
        OooO0OO<K, V> OooO00o2 = OooO00o((Object) k);
        if (OooO00o2 == null) {
            return null;
        }
        this.o00oO0O--;
        if (!this.f19169OooO00o.isEmpty()) {
            for (OooO0o<K, V> oooO0o : this.f19169OooO00o.keySet()) {
                oooO0o.OooO00o(OooO00o2);
            }
        }
        OooO0OO<K, V> oooO0OO = OooO00o2.OooO0O0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o = OooO00o2.OooO00o;
        } else {
            this.OooO00o = OooO00o2.OooO00o;
        }
        OooO0OO<K, V> oooO0OO2 = OooO00o2.OooO00o;
        if (oooO0OO2 != null) {
            oooO0OO2.OooO0O0 = OooO00o2.OooO0O0;
        } else {
            this.OooO0O0 = OooO00o2.OooO0O0;
        }
        OooO00o2.OooO00o = null;
        OooO00o2.OooO0O0 = null;
        return OooO00o2.f19171OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterator<Map.Entry<K, V>> m18156OooO00o() {
        OooO0O0 oooO0O0 = new OooO0O0(this.OooO0O0, this.OooO00o);
        this.f19169OooO00o.put(oooO0O0, false);
        return oooO0O0;
    }

    public C6966o0000o0O<K, V>.C6967OooO0Oo OooO00o() {
        C6966o0000o0O<K, V>.C6967OooO0Oo oooO0Oo = new C6967OooO0Oo();
        this.f19169OooO00o.put(oooO0Oo, false);
        return oooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map.Entry<K, V> m18157OooO00o() {
        return this.OooO00o;
    }
}
