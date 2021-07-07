package com.p118pd.sdk;

import java.util.concurrent.atomic.AtomicReference;
import p293rx.annotations.Experimental;

/* renamed from: com.pd.sdk.i丨LL  reason: invalid class name and case insensitive filesystem */
public final class C6379iLL {
    public static final C6379iLL OooO00o = new C6379iLL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<L1Il> f18167OooO00o = new AtomicReference<>();

    public static C6379iLL OooO00o() {
        return OooO00o;
    }

    @Experimental
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17497OooO00o() {
        this.f18167OooO00o.set(null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public L1Il m17496OooO00o() {
        if (this.f18167OooO00o.get() == null) {
            this.f18167OooO00o.compareAndSet(null, L1Il.OooO00o());
        }
        return this.f18167OooO00o.get();
    }

    public void OooO00o(L1Il l1Il) {
        if (!this.f18167OooO00o.compareAndSet(null, l1Il)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.f18167OooO00o.get());
        }
    }
}
