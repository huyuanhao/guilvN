package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC7729o0ooOoo;
import java.util.Queue;

/* renamed from: com.pd.sdk.o0ooO0O  reason: case insensitive filesystem */
public abstract class AbstractC7709o0ooO0O<T extends AbstractC7729o0ooOoo> {
    public static final int OooO00o = 20;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Queue<T> f20674OooO00o = oO0O0O00.m19524OooO00o(20);

    public abstract T OooO00o();

    public void OooO00o(T t) {
        if (this.f20674OooO00o.size() < 20) {
            this.f20674OooO00o.offer(t);
        }
    }

    public T OooO0O0() {
        T poll = this.f20674OooO00o.poll();
        return poll == null ? OooO00o() : poll;
    }
}
