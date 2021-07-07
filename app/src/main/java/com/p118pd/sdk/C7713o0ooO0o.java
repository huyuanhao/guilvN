package com.p118pd.sdk;

import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7729o0ooOoo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0ooO0o  reason: case insensitive filesystem */
public class C7713o0ooO0o<K extends AbstractC7729o0ooOoo, V> {
    public final OooO00o<K, V> OooO00o = new OooO00o<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<K, OooO00o<K, V>> f20675OooO00o = new HashMap();

    /* renamed from: com.pd.sdk.o0ooO0o$OooO00o */
    public static class OooO00o<K, V> {
        public OooO00o<K, V> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final K f20676OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<V> f20677OooO00o;
        public OooO00o<K, V> OooO0O0;

        public OooO00o() {
            this(null);
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public V m19354OooO00o() {
            int OooO00o2 = OooO00o();
            if (OooO00o2 > 0) {
                return this.f20677OooO00o.remove(OooO00o2 - 1);
            }
            return null;
        }

        public OooO00o(K k) {
            this.OooO0O0 = this;
            this.OooO00o = this;
            this.f20676OooO00o = k;
        }

        public int OooO00o() {
            List<V> list = this.f20677OooO00o;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void OooO00o(V v) {
            if (this.f20677OooO00o == null) {
                this.f20677OooO00o = new ArrayList();
            }
            this.f20677OooO00o.add(v);
        }
    }

    private void OooO0O0(OooO00o<K, V> oooO00o) {
        OooO0OO(oooO00o);
        OooO00o<K, V> oooO00o2 = this.OooO00o;
        oooO00o.OooO0O0 = oooO00o2.OooO0O0;
        oooO00o.OooO00o = oooO00o2;
        OooO0Oo(oooO00o);
    }

    public static <K, V> void OooO0OO(OooO00o<K, V> oooO00o) {
        OooO00o<K, V> oooO00o2 = oooO00o.OooO0O0;
        oooO00o2.OooO00o = oooO00o.OooO00o;
        oooO00o.OooO00o.OooO0O0 = oooO00o2;
    }

    public static <K, V> void OooO0Oo(OooO00o<K, V> oooO00o) {
        oooO00o.OooO00o.OooO0O0 = oooO00o;
        oooO00o.OooO0O0.OooO00o = oooO00o;
    }

    public void OooO00o(K k, V v) {
        OooO00o<K, V> oooO00o = this.f20675OooO00o.get(k);
        if (oooO00o == null) {
            oooO00o = new OooO00o<>(k);
            OooO0O0(oooO00o);
            this.f20675OooO00o.put(k, oooO00o);
        } else {
            k.OooO00o();
        }
        oooO00o.OooO00o(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (OooO00o<K, V> oooO00o = this.OooO00o.OooO00o; !oooO00o.equals(this.OooO00o); oooO00o = oooO00o.OooO00o) {
            z = true;
            sb.append('{');
            sb.append((Object) oooO00o.f20676OooO00o);
            sb.append(':');
            sb.append(oooO00o.OooO00o());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    @Nullable
    public V OooO00o(K k) {
        OooO00o<K, V> oooO00o = this.f20675OooO00o.get(k);
        if (oooO00o == null) {
            oooO00o = new OooO00o<>(k);
            this.f20675OooO00o.put(k, oooO00o);
        } else {
            k.OooO00o();
        }
        OooO00o(oooO00o);
        return oooO00o.m19354OooO00o();
    }

    @Nullable
    public V OooO00o() {
        for (OooO00o<K, V> oooO00o = this.OooO00o.OooO0O0; !oooO00o.equals(this.OooO00o); oooO00o = oooO00o.OooO0O0) {
            V OooO00o2 = oooO00o.m19354OooO00o();
            if (OooO00o2 != null) {
                return OooO00o2;
            }
            OooO0OO(oooO00o);
            this.f20675OooO00o.remove(oooO00o.f20676OooO00o);
            oooO00o.f20676OooO00o.OooO00o();
        }
        return null;
    }

    private void OooO00o(OooO00o<K, V> oooO00o) {
        OooO0OO(oooO00o);
        OooO00o<K, V> oooO00o2 = this.OooO00o;
        oooO00o.OooO0O0 = oooO00o2;
        oooO00o.OooO00o = oooO00o2.OooO00o;
        OooO0Oo(oooO00o);
    }
}
