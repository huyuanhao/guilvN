package com.p118pd.sdk;

import java.io.Closeable;

/* renamed from: com.pd.sdk.o0OOO0oo  reason: case insensitive filesystem */
public class C7388o0OOO0oo implements Closeable {
    public C7401o0OOOOoO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f20154OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f20155OooO00o;
    public boolean OooO0O0;

    public C7388o0OOO0oo(C7401o0OOOOoO o0oooooo, Runnable runnable) {
        this.OooO00o = o0oooooo;
        this.f20155OooO00o = runnable;
    }

    private void OooO0O0() {
        if (this.OooO0O0) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public void OooO00o() {
        synchronized (this.f20154OooO00o) {
            OooO0O0();
            this.f20155OooO00o.run();
            close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f20154OooO00o) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.OooO00o.OooO00o(this);
                this.OooO00o = null;
                this.f20155OooO00o = null;
            }
        }
    }
}
