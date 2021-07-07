package com.p118pd.sdk;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.o0OO  reason: case insensitive filesystem */
public class C7360o0OO {
    public AbstractC7369o0OO0O0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile AbstractRunnableC7374o0OO0o0O f20098OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7503o0OoOoO f20099OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f20100OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Future f20101OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile AtomicBoolean f20102OooO00o = new AtomicBoolean();

    public C7360o0OO(C7503o0OoOoO o0ooooo, AbstractC7369o0OO0O0 o0oo0o0) {
        this.f20099OooO00o = o0ooooo;
        this.f20100OooO00o = o0ooooo.f20342OooO00o;
        this.OooO00o = o0oo0o0;
    }

    public void OooO00o() {
        Future future = this.f20101OooO00o;
        if (future != null) {
            future.cancel(true);
            this.f20101OooO00o = null;
        }
    }

    public void OooO0O0() {
        if (this.f20098OooO00o != null) {
            this.f20098OooO00o.cancel();
            this.f20098OooO00o = null;
        }
    }
}
