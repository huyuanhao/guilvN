package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oO0O00oO */
public class oO0O00oO<T, Y> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<T, Y> f20893OooO00o = new LinkedHashMap(100, 0.75f, true);
    public long OooO0O0;
    public long OooO0OO;

    public oO0O00oO(long j) {
        this.OooO00o = j;
        this.OooO0O0 = j;
    }

    public int OooO00o(@Nullable Y y) {
        return 1;
    }

    public synchronized void OooO00o(float f) {
        if (f >= 0.0f) {
            this.OooO0O0 = (long) Math.round(((float) this.OooO00o) * f);
            OooO0O0();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19521OooO00o(@NonNull T t, @Nullable Y y) {
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized long m19523OooO0O0() {
        return this.OooO0OO;
    }

    @Nullable
    public synchronized Y OooO0O0(@NonNull T t) {
        Y remove;
        remove = this.f20893OooO00o.remove(t);
        if (remove != null) {
            this.OooO0OO -= (long) OooO00o((Object) remove);
        }
        return remove;
    }

    private void OooO0O0() {
        OooO00o(this.OooO0O0);
    }

    public synchronized int OooO00o() {
        return this.f20893OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized long m19518OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized boolean m19522OooO00o(@NonNull T t) {
        return this.f20893OooO00o.containsKey(t);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized Y m19519OooO00o(@NonNull T t) {
        return this.f20893OooO00o.get(t);
    }

    @Nullable
    public synchronized Y OooO00o(@NonNull T t, @Nullable Y y) {
        long OooO00o2 = (long) OooO00o((Object) y);
        if (OooO00o2 >= this.OooO0O0) {
            m19521OooO00o((Object) t, (Object) y);
            return null;
        }
        if (y != null) {
            this.OooO0OO += OooO00o2;
        }
        Y put = this.f20893OooO00o.put(t, y);
        if (put != null) {
            this.OooO0OO -= (long) OooO00o((Object) put);
            if (!put.equals(y)) {
                m19521OooO00o((Object) t, (Object) put);
            }
        }
        OooO0O0();
        return put;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19520OooO00o() {
        OooO00o(0L);
    }

    public synchronized void OooO00o(long j) {
        while (this.OooO0OO > j) {
            Iterator<Map.Entry<T, Y>> it = this.f20893OooO00o.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.OooO0OO -= (long) OooO00o((Object) value);
            T key = next.getKey();
            it.remove();
            m19521OooO00o((Object) key, (Object) value);
        }
    }
}
