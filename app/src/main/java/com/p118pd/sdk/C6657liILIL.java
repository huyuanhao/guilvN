package com.p118pd.sdk;

import java.util.concurrent.ThreadFactory;
import p293rx.internal.util.RxThreadFactory;

/* renamed from: com.pd.sdk.liI丨LIL  reason: invalid class name and case insensitive filesystem */
public class C6657liILIL {
    public static final C6657liILIL OooO00o = new C6657liILIL();

    public static LL1LL OooO00o(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new lI1iil(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static LL1LL OooO0O0(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C9848l1i(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static LL1LL OooO0OO(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new i1iI1iI(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static LL1LL OooO0Oo() {
        return OooO00o(new RxThreadFactory("RxComputationScheduler-"));
    }

    public static LL1LL OooO0o() {
        return OooO0OO(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    public static LL1LL OooO0o0() {
        return OooO0O0(new RxThreadFactory("RxIoScheduler-"));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LL1LL m17748OooO00o() {
        return null;
    }

    @Deprecated
    public liii1l OooO00o(liii1l r1) {
        return r1;
    }

    public LL1LL OooO0O0() {
        return null;
    }

    public LL1LL OooO0OO() {
        return null;
    }

    public static C6657liILIL OooO00o() {
        return OooO00o;
    }
}
