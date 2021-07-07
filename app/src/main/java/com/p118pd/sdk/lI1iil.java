package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.util.RxThreadFactory;

/* renamed from: com.pd.sdk.lI1i丨il  reason: invalid class name */
public final class lI1iil extends LL1LL implements AbstractC9688lLiLl {
    public static final OooO0O0 OooO00o = new OooO0O0(null, 0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final OooO0OO f18349OooO00o;
    public static final int o00oO0O;
    public static final String o0ooOOo = "rx.scheduler.max-computation-threads";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ThreadFactory f18350OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<OooO0O0> f18351OooO00o = new AtomicReference<>(OooO00o);

    /* renamed from: com.pd.sdk.lI1i丨il$OooO0OO */
    public static final class OooO0OO extends C6655liIlIl {
        public OooO0OO(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger(o0ooOOo, 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        o00oO0O = intValue;
        OooO0OO oooO0OO = new OooO0OO(RxThreadFactory.NONE);
        f18349OooO00o = oooO0OO;
        oooO0OO.unsubscribe();
    }

    public lI1iil(ThreadFactory threadFactory) {
        this.f18350OooO00o = threadFactory;
        start();
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public LL1LL.OooO00o OooO00o() {
        return new OooO00o(this.f18351OooO00o.get().OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC9688lLiLl
    public void shutdown() {
        OooO0O0 oooO0O0;
        OooO0O0 oooO0O02;
        do {
            oooO0O0 = this.f18351OooO00o.get();
            oooO0O02 = OooO00o;
            if (oooO0O0 == oooO0O02) {
                return;
            }
        } while (!this.f18351OooO00o.compareAndSet(oooO0O0, oooO0O02));
        oooO0O0.m17623OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9688lLiLl
    public void start() {
        OooO0O0 oooO0O0 = new OooO0O0(this.f18350OooO00o, o00oO0O);
        if (!this.f18351OooO00o.compareAndSet(OooO00o, oooO0O0)) {
            oooO0O0.m17623OooO00o();
        }
    }

    public LlIiLii OooO00o(liii1l r5) {
        return this.f18351OooO00o.get().OooO00o().m17746OooO00o(r5, -1L, TimeUnit.NANOSECONDS);
    }

    /* renamed from: com.pd.sdk.lI1i丨il$OooO00o */
    public static final class OooO00o extends LL1LL.OooO00o {
        public final IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0OO f18352OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9862ll f18353OooO00o = new C9862ll();
        public final C9862ll OooO0O0;

        /* renamed from: com.pd.sdk.lI1i丨il$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4948OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ liii1l f18354OooO00o;

            public C4948OooO00o(liii1l r2) {
                this.f18354OooO00o = r2;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                if (!OooO00o.this.isUnsubscribed()) {
                    this.f18354OooO00o.call();
                }
            }
        }

        /* renamed from: com.pd.sdk.lI1i丨il$OooO00o$OooO0O0 */
        public class OooO0O0 implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ liii1l f18355OooO00o;

            public OooO0O0(liii1l r2) {
                this.f18355OooO00o = r2;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                if (!OooO00o.this.isUnsubscribed()) {
                    this.f18355OooO00o.call();
                }
            }
        }

        public OooO00o(OooO0OO oooO0OO) {
            IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
            this.OooO00o = iIlIIiI1;
            this.OooO0O0 = new C9862ll(this.f18353OooO00o, iIlIIiI1);
            this.f18352OooO00o = oooO0OO;
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r7) {
            if (isUnsubscribed()) {
                return C9638ill.OooO0O0();
            }
            return this.f18352OooO00o.OooO00o(new C4948OooO00o(r7), 0, (TimeUnit) null, this.f18353OooO00o);
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO0O0.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.OooO0O0.unsubscribe();
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r7, long j, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return C9638ill.OooO0O0();
            }
            return this.f18352OooO00o.OooO00o(new OooO0O0(r7), j, timeUnit, this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.lI1i丨il$OooO0O0 */
    public static final class OooO0O0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f18356OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0OO[] f18357OooO00o;

        public OooO0O0(ThreadFactory threadFactory, int i) {
            this.OooO00o = i;
            this.f18357OooO00o = new OooO0OO[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f18357OooO00o[i2] = new OooO0OO(threadFactory);
            }
        }

        public OooO0OO OooO00o() {
            int i = this.OooO00o;
            if (i == 0) {
                return lI1iil.f18349OooO00o;
            }
            OooO0OO[] oooO0OOArr = this.f18357OooO00o;
            long j = this.f18356OooO00o;
            this.f18356OooO00o = 1 + j;
            return oooO0OOArr[(int) (j % ((long) i))];
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m17623OooO00o() {
            for (OooO0OO oooO0OO : this.f18357OooO00o) {
                oooO0OO.unsubscribe();
            }
        }
    }
}
