package com.p118pd.sdk;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.annotations.Experimental;

/* renamed from: com.pd.sdk.il丨11  reason: invalid class name and case insensitive filesystem */
public final class C6342il11 {
    public static final AtomicReference<C6342il11> OooO00o = new AtomicReference<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f18084OooO00o;

    public C6342il11() {
        LL1LL OooO00o2 = C6379iLL.OooO00o().m17496OooO00o().m15902OooO00o();
        if (OooO00o2 != null) {
            this.f18084OooO00o = OooO00o2;
        } else {
            this.f18084OooO00o = new Liliii1l(Looper.getMainLooper());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C6342il11 m17405OooO00o() {
        C6342il11 r0;
        do {
            C6342il11 r02 = OooO00o.get();
            if (r02 != null) {
                return r02;
            }
            r0 = new C6342il11();
        } while (!OooO00o.compareAndSet(null, r0));
        return r0;
    }

    public static LL1LL OooO00o() {
        return m17405OooO00o().f18084OooO00o;
    }

    public static LL1LL OooO00o(Looper looper) {
        if (looper != null) {
            return new Liliii1l(looper);
        }
        throw new NullPointerException("looper == null");
    }

    @Experimental
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17406OooO00o() {
        OooO00o.set(null);
    }
}
