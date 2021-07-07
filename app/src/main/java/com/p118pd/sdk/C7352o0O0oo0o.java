package com.p118pd.sdk;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.o0O0oo0o  reason: case insensitive filesystem */
public class C7352o0O0oo0o<T> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SparseArray<OooO00o<T>> f20082OooO00o = new SparseArray<>(10);

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o<T> f20083OooO00o;

    /* renamed from: com.pd.sdk.o0O0oo0o$OooO00o */
    public static class OooO00o<T> {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO00o<T> f20084OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T[] f20085OooO00o;
        public int OooO0O0;

        public OooO00o(Class<T> cls, int i) {
            this.f20085OooO00o = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18861OooO00o(int i) {
            int i2 = this.OooO00o;
            return i2 <= i && i < i2 + this.OooO0O0;
        }

        public T OooO00o(int i) {
            return this.f20085OooO00o[i - this.OooO00o];
        }
    }

    public C7352o0O0oo0o(int i) {
        this.OooO00o = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m18859OooO00o(int i) {
        OooO00o<T> oooO00o = this.f20083OooO00o;
        if (oooO00o == null || !oooO00o.m18861OooO00o(i)) {
            int indexOfKey = this.f20082OooO00o.indexOfKey(i - (i % this.OooO00o));
            if (indexOfKey < 0) {
                return null;
            }
            this.f20083OooO00o = this.f20082OooO00o.valueAt(indexOfKey);
        }
        return this.f20083OooO00o.OooO00o(i);
    }

    public OooO00o<T> OooO0O0(int i) {
        OooO00o<T> oooO00o = this.f20082OooO00o.get(i);
        if (this.f20083OooO00o == oooO00o) {
            this.f20083OooO00o = null;
        }
        this.f20082OooO00o.delete(i);
        return oooO00o;
    }

    public int OooO00o() {
        return this.f20082OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18860OooO00o() {
        this.f20082OooO00o.clear();
    }

    public OooO00o<T> OooO00o(int i) {
        return this.f20082OooO00o.valueAt(i);
    }

    public OooO00o<T> OooO00o(OooO00o<T> oooO00o) {
        int indexOfKey = this.f20082OooO00o.indexOfKey(oooO00o.OooO00o);
        if (indexOfKey < 0) {
            this.f20082OooO00o.put(oooO00o.OooO00o, oooO00o);
            return null;
        }
        OooO00o<T> valueAt = this.f20082OooO00o.valueAt(indexOfKey);
        this.f20082OooO00o.setValueAt(indexOfKey, oooO00o);
        if (this.f20083OooO00o == valueAt) {
            this.f20083OooO00o = oooO00o;
        }
        return valueAt;
    }
}
