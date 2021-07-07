package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.oO00o0OO  reason: case insensitive filesystem */
public class C7819oO00o0OO {
    public final C6971o0000oO0<C8390oOoo0, List<Class<?>>> OooO00o = new C6971o0000oO0<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<C8390oOoo0> f20873OooO00o = new AtomicReference<>();

    @Nullable
    public List<Class<?>> OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        List<Class<?>> list;
        C8390oOoo0 andSet = this.f20873OooO00o.getAndSet(null);
        if (andSet == null) {
            andSet = new C8390oOoo0(cls, cls2);
        } else {
            andSet.OooO00o(cls, cls2);
        }
        synchronized (this.OooO00o) {
            list = this.OooO00o.get(andSet);
        }
        this.f20873OooO00o.set(andSet);
        return list;
    }

    public void OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull List<Class<?>> list) {
        synchronized (this.OooO00o) {
            this.OooO00o.put(new C8390oOoo0(cls, cls2), list);
        }
    }

    public void OooO00o() {
        synchronized (this.OooO00o) {
            this.OooO00o.clear();
        }
    }
}
