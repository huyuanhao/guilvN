package com.p118pd.sdk;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.oO0OOOOo */
public class oO0OOOOo {
    public static final C7696o0oo0oO<?, ?, ?> OooO00o = new C7696o0oo0oO<>(Object.class, Object.class, Object.class, Collections.singletonList(new C7683o0oo0OOO(Object.class, Object.class, Object.class, Collections.emptyList(), new C7801oO00Oo(), null)), null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6971o0000oO0<C8390oOoo0, C7696o0oo0oO<?, ?, ?>> f20944OooO00o = new C6971o0000oO0<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<C8390oOoo0> f20945OooO00o = new AtomicReference<>();

    public boolean OooO00o(@Nullable C7696o0oo0oO<?, ?, ?> o0oo0oo) {
        return OooO00o.equals(o0oo0oo);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <Data, TResource, Transcode> C7696o0oo0oO<Data, TResource, Transcode> m19559OooO00o(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C7696o0oo0oO<Data, TResource, Transcode> o0oo0oo;
        C8390oOoo0 OooO00o2 = OooO00o((Class<?>) cls, (Class<?>) cls2, (Class<?>) cls3);
        synchronized (this.f20944OooO00o) {
            o0oo0oo = (C7696o0oo0oO<Data, TResource, Transcode>) this.f20944OooO00o.get(OooO00o2);
        }
        this.f20945OooO00o.set(OooO00o2);
        return o0oo0oo;
    }

    public void OooO00o(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable C7696o0oo0oO<?, ?, ?> o0oo0oo) {
        synchronized (this.f20944OooO00o) {
            C6971o0000oO0<C8390oOoo0, C7696o0oo0oO<?, ?, ?>> o0000oo0 = this.f20944OooO00o;
            C8390oOoo0 oooo0 = new C8390oOoo0(cls, cls2, cls3);
            if (o0oo0oo == null) {
                o0oo0oo = OooO00o;
            }
            o0000oo0.put(oooo0, o0oo0oo);
        }
    }

    private C8390oOoo0 OooO00o(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C8390oOoo0 andSet = this.f20945OooO00o.getAndSet(null);
        if (andSet == null) {
            andSet = new C8390oOoo0();
        }
        andSet.OooO00o(cls, cls2, cls3);
        return andSet;
    }
}
