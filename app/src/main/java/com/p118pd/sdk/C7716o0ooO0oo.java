package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.pd.sdk.o0ooO0oo  reason: case insensitive filesystem */
public final class C7716o0ooO0oo implements AbstractC7707o0ooO00O {
    public static final int OooO0Oo = 4194304;
    public static final int OooO0o = 2;
    @VisibleForTesting
    public static final int OooO0o0 = 8;
    public final C7713o0ooO0o<OooO00o, Object> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f20678OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f20679OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Map<Class<?>, AbstractC7705o0ooO00<?>> f20680OooO0O0;
    public int OooO0OO;

    /* renamed from: com.pd.sdk.o0ooO0oo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC7709o0ooO0O<OooO00o> {
        public OooO00o OooO00o(int i, Class<?> cls) {
            OooO00o oooO00o = (OooO00o) OooO0O0();
            oooO00o.OooO00o(i, cls);
            return oooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7709o0ooO0O
        public OooO00o OooO00o() {
            return new OooO00o(this);
        }
    }

    @VisibleForTesting
    public C7716o0ooO0oo() {
        this.OooO00o = new C7713o0ooO0o<>();
        this.f20678OooO00o = new OooO0O0();
        this.f20679OooO00o = new HashMap();
        this.f20680OooO0O0 = new HashMap();
        this.OooO0O0 = 4194304;
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    @Deprecated
    public <T> void OooO00o(T t, Class<T> cls) {
        m19360OooO00o((Object) t);
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    public synchronized <T> T OooO0O0(int i, Class<T> cls) {
        OooO00o oooO00o;
        Integer ceilingKey = m19355OooO00o((Class<?>) cls).ceilingKey(Integer.valueOf(i));
        if (OooO00o(i, ceilingKey)) {
            oooO00o = this.f20678OooO00o.OooO00o(ceilingKey.intValue(), cls);
        } else {
            oooO00o = this.f20678OooO00o.OooO00o(i, cls);
        }
        return (T) OooO00o(oooO00o, (Class) cls);
    }

    /* renamed from: com.pd.sdk.o0ooO0oo$OooO00o */
    public static final class OooO00o implements AbstractC7729o0ooOoo {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0 f20681OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Class<?> f20682OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f20681OooO00o = oooO0O0;
        }

        public void OooO00o(int i, Class<?> cls) {
            this.OooO00o = i;
            this.f20682OooO00o = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (this.OooO00o == oooO00o.OooO00o && this.f20682OooO00o == oooO00o.f20682OooO00o) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.OooO00o * 31;
            Class<?> cls = this.f20682OooO00o;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.OooO00o + "array=" + this.f20682OooO00o + '}';
        }

        @Override // com.p118pd.sdk.AbstractC7729o0ooOoo
        public void OooO00o() {
            this.f20681OooO00o.OooO00o(this);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized <T> void m19360OooO00o(T t) {
        Class<?> cls = t.getClass();
        AbstractC7705o0ooO00<T> OooO00o2 = OooO00o((Class) cls);
        int OooO00o3 = OooO00o2.OooO00o(t);
        int OooO00o4 = OooO00o2.OooO00o() * OooO00o3;
        if (OooO00o(OooO00o4)) {
            OooO00o OooO00o5 = this.f20678OooO00o.OooO00o(OooO00o3, cls);
            this.OooO00o.OooO00o(OooO00o5, t);
            NavigableMap<Integer, Integer> OooO00o6 = m19355OooO00o(cls);
            Integer num = (Integer) OooO00o6.get(Integer.valueOf(OooO00o5.OooO00o));
            Integer valueOf = Integer.valueOf(OooO00o5.OooO00o);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            OooO00o6.put(valueOf, Integer.valueOf(i));
            this.OooO0OO += OooO00o4;
            OooO0O0();
        }
    }

    private void OooO0O0() {
        OooO0O0(this.OooO0O0);
    }

    public C7716o0ooO0oo(int i) {
        this.OooO00o = new C7713o0ooO0o<>();
        this.f20678OooO00o = new OooO0O0();
        this.f20679OooO00o = new HashMap();
        this.f20680OooO0O0 = new HashMap();
        this.OooO0O0 = i;
    }

    private void OooO0O0(int i) {
        while (this.OooO0OO > i) {
            Object OooO00o2 = this.OooO00o.OooO00o();
            C7842oO0O0.OooO00o(OooO00o2);
            AbstractC7705o0ooO00 OooO00o3 = OooO00o(OooO00o2);
            this.OooO0OO -= OooO00o3.OooO00o(OooO00o2) * OooO00o3.OooO00o();
            OooO00o(OooO00o3.OooO00o(OooO00o2), OooO00o2.getClass());
            if (Log.isLoggable(OooO00o3.getTag(), 2)) {
                OooO00o3.getTag();
                String str = "evicted: " + OooO00o3.OooO00o(OooO00o2);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized <T> T m19357OooO00o(int i, Class<T> cls) {
        return (T) OooO00o(this.f20678OooO00o.OooO00o(i, cls), (Class) cls);
    }

    private <T> T OooO00o(OooO00o oooO00o, Class<T> cls) {
        AbstractC7705o0ooO00<T> OooO00o2 = OooO00o((Class) cls);
        T t = (T) OooO00o(oooO00o);
        if (t != null) {
            this.OooO0OO -= OooO00o2.OooO00o(t) * OooO00o2.OooO00o();
            OooO00o(OooO00o2.OooO00o(t), (Class<?>) cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(OooO00o2.getTag(), 2)) {
            OooO00o2.getTag();
            String str = "Allocated " + oooO00o.OooO00o + " bytes";
        }
        return OooO00o2.OooO00o(oooO00o.OooO00o);
    }

    @Nullable
    private <T> T OooO00o(OooO00o oooO00o) {
        return (T) this.OooO00o.OooO00o(oooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    private boolean OooO00o(int i) {
        return i <= this.OooO0O0 / 2;
    }

    private boolean OooO00o(int i, Integer num) {
        return num != null && (OooO00o() || num.intValue() <= i * 8);
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    private boolean OooO00o() {
        int i = this.OooO0OO;
        return i == 0 || this.OooO0O0 / i >= 2;
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m19358OooO00o() {
        OooO0O0(0);
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m19359OooO00o(int i) {
        if (i >= 40) {
            try {
                m19358OooO00o();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            OooO0O0(this.OooO0O0 / 2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    private void OooO00o(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> OooO00o2 = m19355OooO00o(cls);
        Integer num = (Integer) OooO00o2.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            OooO00o2.remove(Integer.valueOf(i));
        } else {
            OooO00o2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private NavigableMap<Integer, Integer> m19355OooO00o(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f20679OooO00o.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f20679OooO00o.put(cls, treeMap);
        return treeMap;
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    private <T> AbstractC7705o0ooO00<T> OooO00o(T t) {
        return OooO00o((Class) t.getClass());
    }

    private <T> AbstractC7705o0ooO00<T> OooO00o(Class<T> cls) {
        C7714o0ooO0o0 o0ooo0o0 = (AbstractC7705o0ooO00<T>) this.f20680OooO0O0.get(cls);
        if (o0ooo0o0 == null) {
            if (cls.equals(int[].class)) {
                o0ooo0o0 = new C7715o0ooO0oO();
            } else if (cls.equals(byte[].class)) {
                o0ooo0o0 = new C7714o0ooO0o0();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f20680OooO0O0.put(cls, o0ooo0o0);
        }
        return o0ooo0o0;
    }

    @Override // com.p118pd.sdk.AbstractC7707o0ooO00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19356OooO00o() {
        int i = 0;
        for (Class<?> cls : this.f20679OooO00o.keySet()) {
            for (Integer num : this.f20679OooO00o.get(cls).keySet()) {
                i += num.intValue() * ((Integer) this.f20679OooO00o.get(cls).get(num)).intValue() * OooO00o((Class) cls).OooO00o();
            }
        }
        return i;
    }
}
