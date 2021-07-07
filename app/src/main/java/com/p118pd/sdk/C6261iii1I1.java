package com.p118pd.sdk;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.iii1丨I1  reason: invalid class name and case insensitive filesystem */
public final class C6261iii1I1 {
    public static final AtomicReference<C6261iii1I1> OooO00o = new AtomicReference<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f17900OooO00o;
    public final LL1LL OooO0O0;
    public final LL1LL OooO0OO;

    public C6261iii1I1() {
        C6657liILIL OooO00o2 = ilL1l.OooO00o().m17365OooO00o();
        LL1LL OooO00o3 = OooO00o2.m17748OooO00o();
        if (OooO00o3 != null) {
            this.f17900OooO00o = OooO00o3;
        } else {
            this.f17900OooO00o = C6657liILIL.OooO0Oo();
        }
        LL1LL OooO0O02 = OooO00o2.OooO0O0();
        if (OooO0O02 != null) {
            this.OooO0O0 = OooO0O02;
        } else {
            this.OooO0O0 = C6657liILIL.OooO0o0();
        }
        LL1LL OooO0OO2 = OooO00o2.OooO0OO();
        if (OooO0OO2 != null) {
            this.OooO0OO = OooO0OO2;
        } else {
            this.OooO0OO = C6657liILIL.OooO0o();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C6261iii1I1 m17268OooO00o() {
        while (true) {
            C6261iii1I1 r0 = OooO00o.get();
            if (r0 != null) {
                return r0;
            }
            C6261iii1I1 r02 = new C6261iii1I1();
            if (OooO00o.compareAndSet(null, r02)) {
                return r02;
            }
            r02.m17273OooO00o();
        }
    }

    public static LL1LL OooO0O0() {
        return LllL1Ll.OooO00o;
    }

    public static LL1LL OooO0OO() {
        return C9714lli.OooO0O0(m17268OooO00o().OooO0O0);
    }

    public static LL1LL OooO0Oo() {
        return C9714lli.OooO0OO(m17268OooO00o().OooO0OO);
    }

    public static LL1LL OooO0o0() {
        return C5610LI1liI.OooO00o;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m17270OooO0OO() {
        C6261iii1I1 andSet = OooO00o.getAndSet(null);
        if (andSet != null) {
            andSet.m17273OooO00o();
        }
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static void m17271OooO0Oo() {
        C6261iii1I1 OooO00o2 = m17268OooO00o();
        OooO00o2.m17273OooO00o();
        synchronized (OooO00o2) {
            C6547lL1LLLi.OooO00o.shutdown();
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static void m17272OooO0o0() {
        C6261iii1I1 OooO00o2 = m17268OooO00o();
        OooO00o2.m17274OooO0O0();
        synchronized (OooO00o2) {
            C6547lL1LLLi.OooO00o.start();
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized void m17274OooO0O0() {
        if (this.f17900OooO00o instanceof AbstractC9688lLiLl) {
            ((AbstractC9688lLiLl) this.f17900OooO00o).start();
        }
        if (this.OooO0O0 instanceof AbstractC9688lLiLl) {
            ((AbstractC9688lLiLl) this.OooO0O0).start();
        }
        if (this.OooO0OO instanceof AbstractC9688lLiLl) {
            ((AbstractC9688lLiLl) this.OooO0OO).start();
        }
    }

    public static LL1LL OooO00o() {
        return C9714lli.OooO00o(m17268OooO00o().f17900OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C6308ilI1I m17269OooO00o() {
        return new C6308ilI1I();
    }

    public static LL1LL OooO00o(Executor executor) {
        return new C5566II1(executor);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m17273OooO00o() {
        if (this.f17900OooO00o instanceof AbstractC9688lLiLl) {
            ((AbstractC9688lLiLl) this.f17900OooO00o).shutdown();
        }
        if (this.OooO0O0 instanceof AbstractC9688lLiLl) {
            ((AbstractC9688lLiLl) this.OooO0O0).shutdown();
        }
        if (this.OooO0OO instanceof AbstractC9688lLiLl) {
            ((AbstractC9688lLiLl) this.OooO0OO).shutdown();
        }
    }
}
