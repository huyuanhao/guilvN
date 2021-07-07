package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LLil11;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p293rx.Notification;
import p293rx.exceptions.CompositeException;
import p293rx.functions.Actions;
import p293rx.internal.operators.CompletableFromEmitter;
import p293rx.internal.operators.CompletableOnSubscribeConcat;
import p293rx.internal.operators.CompletableOnSubscribeConcatArray;
import p293rx.internal.operators.CompletableOnSubscribeConcatIterable;
import p293rx.internal.util.UtilityFunctions;

/* renamed from: com.pd.sdk.L丨lI丨l  reason: invalid class name and case insensitive filesystem */
public class C5876LlIl {
    public static final C5876LlIl OooO00o = new C5876LlIl(new OooOO0O(), false);
    public static final C5876LlIl OooO0O0 = new C5876LlIl(new C5887OooOo0O(), false);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5898Oooo0O0 f16849OooO00o;

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO */
    public class OooO implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16850OooO00o;

        public OooO(AbstractC6153iL1l il1l) {
            this.f16850OooO00o = il1l;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            this.f16850OooO00o.call(Notification.OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO00o */
    public static class OooO00o implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ C9349III OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4923OooO00o extends AbstractC9508LiLi<Object> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16851OooO00o;

            public C4923OooO00o(AbstractC6473l1II r2) {
                this.f16851OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                this.f16851OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                this.f16851OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(Object obj) {
            }
        }

        public OooO00o(C9349III r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r2) {
            C4923OooO00o oooO00o = new C4923OooO00o(r2);
            r2.onSubscribe(oooO00o);
            this.OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO0O0 */
    public static class OooO0O0 implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ LLil11 OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooO0O0$OooO00o */
        public class OooO00o extends AbstractC93021L<Object> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16852OooO00o;

            public OooO00o(AbstractC6473l1II r2) {
                this.f16852OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void OooO00o(Object obj) {
                this.f16852OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void onError(Throwable th) {
                this.f16852OooO00o.onError(th);
            }
        }

        public OooO0O0(LLil11 r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r2) {
            OooO00o oooO00o = new OooO00o(r2);
            r2.onSubscribe(oooO00o);
            this.OooO00o.OooO00o((AbstractC93021L) oooO00o);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO0OO */
    public static class OooO0OO implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL f16853OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ TimeUnit f16854OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooO0OO$OooO00o */
        public class OooO00o implements liii1l {
            public final /* synthetic */ LL1LL.OooO00o OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16856OooO00o;

            public OooO00o(AbstractC6473l1II r2, LL1LL.OooO00o oooO00o) {
                this.f16856OooO00o = r2;
                this.OooO00o = oooO00o;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                try {
                    this.f16856OooO00o.onCompleted();
                } finally {
                    this.OooO00o.unsubscribe();
                }
            }
        }

        public OooO0OO(LL1LL ll1ll, long j, TimeUnit timeUnit) {
            this.f16853OooO00o = ll1ll;
            this.OooO00o = j;
            this.f16854OooO00o = timeUnit;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r5) {
            C5659LLLiL lLLiL = new C5659LLLiL();
            r5.onSubscribe(lLLiL);
            if (!lLLiL.isUnsubscribed()) {
                LL1LL.OooO00o OooO00o2 = this.f16853OooO00o.m16172OooO00o();
                lLLiL.OooO00o(OooO00o2);
                OooO00o2.OooO00o(new OooO00o(r5, OooO00o2), this.OooO00o, this.f16854OooO00o);
            }
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO0Oo  reason: case insensitive filesystem */
    public static class C5877OooO0Oo implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ LiLIll OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16857OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9847l1 f16858OooO00o;
        public final /* synthetic */ boolean OooO0O0;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooO0Oo$OooO00o */
        public class OooO00o implements AbstractC6473l1II {
            public LlIiLii OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16860OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Object f16861OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AtomicBoolean f16862OooO00o;

            /* renamed from: com.pd.sdk.L丨lI丨l$OooO0Oo$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4924OooO00o implements liii1l {
                public C4924OooO00o() {
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    OooO00o.this.OooO00o();
                }
            }

            public OooO00o(AtomicBoolean atomicBoolean, Object obj, AbstractC6473l1II r4) {
                this.f16862OooO00o = atomicBoolean;
                this.f16861OooO00o = obj;
                this.f16860OooO00o = r4;
            }

            public void OooO00o() {
                this.OooO00o.unsubscribe();
                if (this.f16862OooO00o.compareAndSet(false, true)) {
                    try {
                        C5877OooO0Oo.this.f16857OooO00o.call(this.f16861OooO00o);
                    } catch (Throwable th) {
                        C9714lli.m21756OooO00o(th);
                    }
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                if (C5877OooO0Oo.this.OooO0O0 && this.f16862OooO00o.compareAndSet(false, true)) {
                    try {
                        C5877OooO0Oo.this.f16857OooO00o.call(this.f16861OooO00o);
                    } catch (Throwable th) {
                        this.f16860OooO00o.onError(th);
                        return;
                    }
                }
                this.f16860OooO00o.onCompleted();
                if (!C5877OooO0Oo.this.OooO0O0) {
                    OooO00o();
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                if (C5877OooO0Oo.this.OooO0O0 && this.f16862OooO00o.compareAndSet(false, true)) {
                    try {
                        C5877OooO0Oo.this.f16857OooO00o.call(this.f16861OooO00o);
                    } catch (Throwable th2) {
                        th = new CompositeException(Arrays.asList(th, th2));
                    }
                }
                this.f16860OooO00o.onError(th);
                if (!C5877OooO0Oo.this.OooO0O0) {
                    OooO00o();
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.OooO00o = llIiLii;
                this.f16860OooO00o.onSubscribe(C9638ill.OooO00o(new C4924OooO00o()));
            }
        }

        public C5877OooO0Oo(LiLIll r1, AbstractC9847l1 r2, AbstractC6153iL1l il1l, boolean z) {
            this.OooO00o = r1;
            this.f16858OooO00o = r2;
            this.f16857OooO00o = il1l;
            this.OooO0O0 = z;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r8) {
            try {
                Object call = this.OooO00o.call();
                try {
                    C5876LlIl r5 = (C5876LlIl) this.f16858OooO00o.call(call);
                    if (r5 == null) {
                        try {
                            this.f16857OooO00o.call(call);
                            r8.onSubscribe(C9638ill.OooO0O0());
                            r8.onError(new NullPointerException("The completable supplied is null"));
                        } catch (Throwable th) {
                            IIl11.m15447OooO00o(th);
                            r8.onSubscribe(C9638ill.OooO0O0());
                            r8.onError(new CompositeException(Arrays.asList(new NullPointerException("The completable supplied is null"), th)));
                        }
                    } else {
                        r5.OooO0O0(new OooO00o(new AtomicBoolean(), call, r8));
                    }
                } catch (Throwable th2) {
                    IIl11.m15447OooO00o(th);
                    IIl11.m15447OooO00o(th2);
                    r8.onSubscribe(C9638ill.OooO0O0());
                    r8.onError(new CompositeException(Arrays.asList(th, th2)));
                }
            } catch (Throwable th3) {
                r8.onSubscribe(C9638ill.OooO0O0());
                r8.onError(th3);
            }
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO0o */
    public class OooO0o implements AbstractC6473l1II {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f16863OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Throwable[] f16864OooO00o;

        public OooO0o(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f16863OooO00o = countDownLatch;
            this.f16864OooO00o = thArr;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            this.f16863OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.f16864OooO00o[0] = th;
            this.f16863OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO0o0  reason: case insensitive filesystem */
    public class C5878OooO0o0 implements AbstractC6473l1II {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f16865OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Throwable[] f16866OooO00o;

        public C5878OooO0o0(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f16865OooO00o = countDownLatch;
            this.f16866OooO00o = thArr;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            this.f16865OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.f16866OooO00o[0] = th;
            this.f16865OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO0oO  reason: case insensitive filesystem */
    public class C5879OooO0oO implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL f16867OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ TimeUnit f16869OooO00o;
        public final /* synthetic */ boolean OooO0O0;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooO0oO$OooO00o */
        public class OooO00o implements AbstractC6473l1II {
            public final /* synthetic */ IIlIIiI1 OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ LL1LL.OooO00o f16870OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16872OooO00o;

            /* renamed from: com.pd.sdk.L丨lI丨l$OooO0oO$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4925OooO00o implements liii1l {
                public C4925OooO00o() {
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    try {
                        OooO00o.this.f16872OooO00o.onCompleted();
                    } finally {
                        OooO00o.this.f16870OooO00o.unsubscribe();
                    }
                }
            }

            /* renamed from: com.pd.sdk.L丨lI丨l$OooO0oO$OooO00o$OooO0O0 */
            public class OooO0O0 implements liii1l {

                /* renamed from: OooO00o  reason: collision with other field name */
                public final /* synthetic */ Throwable f16873OooO00o;

                public OooO0O0(Throwable th) {
                    this.f16873OooO00o = th;
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    try {
                        OooO00o.this.f16872OooO00o.onError(this.f16873OooO00o);
                    } finally {
                        OooO00o.this.f16870OooO00o.unsubscribe();
                    }
                }
            }

            public OooO00o(IIlIIiI1 iIlIIiI1, LL1LL.OooO00o oooO00o, AbstractC6473l1II r4) {
                this.OooO00o = iIlIIiI1;
                this.f16870OooO00o = oooO00o;
                this.f16872OooO00o = r4;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                IIlIIiI1 iIlIIiI1 = this.OooO00o;
                LL1LL.OooO00o oooO00o = this.f16870OooO00o;
                C4925OooO00o oooO00o2 = new C4925OooO00o();
                C5879OooO0oO oooO0oO = C5879OooO0oO.this;
                iIlIIiI1.OooO00o(oooO00o.OooO00o(oooO00o2, oooO0oO.OooO00o, oooO0oO.f16869OooO00o));
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                if (C5879OooO0oO.this.OooO0O0) {
                    IIlIIiI1 iIlIIiI1 = this.OooO00o;
                    LL1LL.OooO00o oooO00o = this.f16870OooO00o;
                    OooO0O0 oooO0O0 = new OooO0O0(th);
                    C5879OooO0oO oooO0oO = C5879OooO0oO.this;
                    iIlIIiI1.OooO00o(oooO00o.OooO00o(oooO0O0, oooO0oO.OooO00o, oooO0oO.f16869OooO00o));
                    return;
                }
                this.f16872OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.OooO00o.OooO00o(llIiLii);
                this.f16872OooO00o.onSubscribe(this.OooO00o);
            }
        }

        public C5879OooO0oO(LL1LL ll1ll, long j, TimeUnit timeUnit, boolean z) {
            this.f16867OooO00o = ll1ll;
            this.OooO00o = j;
            this.f16869OooO00o = timeUnit;
            this.OooO0O0 = z;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r5) {
            IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
            LL1LL.OooO00o OooO00o2 = this.f16867OooO00o.m16172OooO00o();
            iIlIIiI1.OooO00o(OooO00o2);
            C5876LlIl.this.OooO0O0(new OooO00o(iIlIIiI1, OooO00o2, r5));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooO0oo  reason: case insensitive filesystem */
    public class C5880OooO0oo implements AbstractC6153iL1l<Throwable> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16874OooO00o;

        public C5880OooO0oo(AbstractC6153iL1l il1l) {
            this.f16874OooO00o = il1l;
        }

        /* renamed from: OooO00o */
        public void call(Throwable th) {
            this.f16874OooO00o.call(Notification.OooO00o(th));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOO0 */
    public class OooOO0 implements AbstractC5898Oooo0O0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16875OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f16876OooO00o;
        public final /* synthetic */ AbstractC6153iL1l OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ liii1l f16877OooO0O0;
        public final /* synthetic */ liii1l OooO0OO;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOO0$OooO00o */
        public class OooO00o implements AbstractC6473l1II {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16878OooO00o;

            /* renamed from: com.pd.sdk.L丨lI丨l$OooOO0$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4926OooO00o implements liii1l {
                public final /* synthetic */ LlIiLii OooO00o;

                public C4926OooO00o(LlIiLii llIiLii) {
                    this.OooO00o = llIiLii;
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    try {
                        OooOO0.this.OooO0OO.call();
                    } catch (Throwable th) {
                        C9714lli.m21756OooO00o(th);
                    }
                    this.OooO00o.unsubscribe();
                }
            }

            public OooO00o(AbstractC6473l1II r2) {
                this.f16878OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                try {
                    OooOO0.this.f16876OooO00o.call();
                    this.f16878OooO00o.onCompleted();
                    try {
                        OooOO0.this.f16877OooO0O0.call();
                    } catch (Throwable th) {
                        C9714lli.m21756OooO00o(th);
                    }
                } catch (Throwable th2) {
                    this.f16878OooO00o.onError(th2);
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                try {
                    OooOO0.this.f16875OooO00o.call(th);
                } catch (Throwable th2) {
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                this.f16878OooO00o.onError(th);
                try {
                    OooOO0.this.f16877OooO0O0.call();
                } catch (Throwable th3) {
                    C9714lli.m21756OooO00o(th3);
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                try {
                    OooOO0.this.OooO0O0.call(llIiLii);
                    this.f16878OooO00o.onSubscribe(C9638ill.OooO00o(new C4926OooO00o(llIiLii)));
                } catch (Throwable th) {
                    llIiLii.unsubscribe();
                    this.f16878OooO00o.onSubscribe(C9638ill.OooO0O0());
                    this.f16878OooO00o.onError(th);
                }
            }
        }

        public OooOO0(liii1l r2, liii1l r3, AbstractC6153iL1l il1l, AbstractC6153iL1l il1l2, liii1l r6) {
            this.f16876OooO00o = r2;
            this.f16877OooO0O0 = r3;
            this.f16875OooO00o = il1l;
            this.OooO0O0 = il1l2;
            this.OooO0OO = r6;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r3) {
            C5876LlIl.this.OooO0O0(new OooO00o(r3));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOO0O */
    public static class OooOO0O implements AbstractC5898Oooo0O0 {
        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r2) {
            r2.onSubscribe(C9638ill.OooO0O0());
            r2.onCompleted();
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOO0o  reason: case insensitive filesystem */
    public class C5881OooOO0o implements AbstractC6153iL1l<Throwable> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f16880OooO00o;

        public C5881OooOO0o(liii1l r2) {
            this.f16880OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(Throwable th) {
            this.f16880OooO00o.call();
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOOO */
    public class OooOOO implements AbstractC6473l1II {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f16881OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Throwable[] f16882OooO00o;

        public OooOOO(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f16881OooO00o = countDownLatch;
            this.f16882OooO00o = thArr;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            this.f16881OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.f16882OooO00o[0] = th;
            this.f16881OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOOO0 */
    public class OooOOO0 implements AbstractC6473l1II {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CountDownLatch f16883OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Throwable[] f16884OooO00o;

        public OooOOO0(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f16883OooO00o = countDownLatch;
            this.f16884OooO00o = thArr;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            this.f16883OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.f16884OooO00o[0] = th;
            this.f16883OooO00o.countDown();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOOOO */
    public class OooOOOO implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ AbstractC5899Oooo0OO OooO00o;

        public OooOOOO(AbstractC5899Oooo0OO oooo0OO) {
            this.OooO00o = oooo0OO;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r2) {
            try {
                C5876LlIl.this.OooO0O0((AbstractC6473l1II) C9714lli.OooO00o(this.OooO00o).call(r2));
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                throw C5876LlIl.m16471OooO00o(th);
            }
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOOOo  reason: case insensitive filesystem */
    public class C5882OooOOOo implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ LL1LL OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOOOo$OooO00o */
        public class OooO00o implements AbstractC6473l1II {
            public final /* synthetic */ LL1LL.OooO00o OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16888OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C9862ll f16889OooO00o;

            /* renamed from: com.pd.sdk.L丨lI丨l$OooOOOo$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4927OooO00o implements liii1l {
                public C4927OooO00o() {
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    try {
                        OooO00o.this.f16888OooO00o.onCompleted();
                    } finally {
                        OooO00o.this.f16889OooO00o.unsubscribe();
                    }
                }
            }

            /* renamed from: com.pd.sdk.L丨lI丨l$OooOOOo$OooO00o$OooO0O0 */
            public class OooO0O0 implements liii1l {

                /* renamed from: OooO00o  reason: collision with other field name */
                public final /* synthetic */ Throwable f16890OooO00o;

                public OooO0O0(Throwable th) {
                    this.f16890OooO00o = th;
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    try {
                        OooO00o.this.f16888OooO00o.onError(this.f16890OooO00o);
                    } finally {
                        OooO00o.this.f16889OooO00o.unsubscribe();
                    }
                }
            }

            public OooO00o(LL1LL.OooO00o oooO00o, AbstractC6473l1II r3, C9862ll r4) {
                this.OooO00o = oooO00o;
                this.f16888OooO00o = r3;
                this.f16889OooO00o = r4;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                this.OooO00o.OooO00o(new C4927OooO00o());
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                this.OooO00o.OooO00o(new OooO0O0(th));
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.f16889OooO00o.OooO00o(llIiLii);
            }
        }

        public C5882OooOOOo(LL1LL ll1ll) {
            this.OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r5) {
            C9862ll r0 = new C9862ll();
            LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
            r0.OooO00o(OooO00o2);
            r5.onSubscribe(r0);
            C5876LlIl.this.OooO0O0(new OooO00o(OooO00o2, r5, r0));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOOo  reason: case insensitive filesystem */
    public class C5883OooOOo implements AbstractC5898Oooo0O0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9847l1 f16891OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOOo$OooO00o */
        public class OooO00o implements AbstractC6473l1II {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ iLIiLILI f16892OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16893OooO00o;

            /* renamed from: com.pd.sdk.L丨lI丨l$OooOOo$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4928OooO00o implements AbstractC6473l1II {
                public C4928OooO00o() {
                }

                @Override // com.p118pd.sdk.AbstractC6473l1II
                public void onCompleted() {
                    OooO00o.this.f16893OooO00o.onCompleted();
                }

                @Override // com.p118pd.sdk.AbstractC6473l1II
                public void onError(Throwable th) {
                    OooO00o.this.f16893OooO00o.onError(th);
                }

                @Override // com.p118pd.sdk.AbstractC6473l1II
                public void onSubscribe(LlIiLii llIiLii) {
                    OooO00o.this.f16892OooO00o.OooO00o(llIiLii);
                }
            }

            public OooO00o(AbstractC6473l1II r2, iLIiLILI iliilili) {
                this.f16893OooO00o = r2;
                this.f16892OooO00o = iliilili;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                this.f16893OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                try {
                    C5876LlIl r3 = (C5876LlIl) C5883OooOOo.this.f16891OooO00o.call(th);
                    if (r3 == null) {
                        this.f16893OooO00o.onError(new CompositeException(Arrays.asList(th, new NullPointerException("The completable returned is null"))));
                        return;
                    }
                    r3.OooO0O0(new C4928OooO00o());
                } catch (Throwable th2) {
                    this.f16893OooO00o.onError(new CompositeException(Arrays.asList(th, th2)));
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.f16892OooO00o.OooO00o(llIiLii);
            }
        }

        public C5883OooOOo(AbstractC9847l1 r2) {
            this.f16891OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r4) {
            iLIiLILI iliilili = new iLIiLILI();
            r4.onSubscribe(iliilili);
            C5876LlIl.this.OooO0O0(new OooO00o(r4, iliilili));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOOo0  reason: case insensitive filesystem */
    public class C5884OooOOo0 implements AbstractC5898Oooo0O0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9847l1 f16894OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOOo0$OooO00o */
        public class OooO00o implements AbstractC6473l1II {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16895OooO00o;

            public OooO00o(AbstractC6473l1II r2) {
                this.f16895OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                this.f16895OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                boolean z = false;
                try {
                    z = ((Boolean) C5884OooOOo0.this.f16894OooO00o.call(th)).booleanValue();
                } catch (Throwable th2) {
                    IIl11.m15447OooO00o(th2);
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                if (z) {
                    this.f16895OooO00o.onCompleted();
                } else {
                    this.f16895OooO00o.onError(th);
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.f16895OooO00o.onSubscribe(llIiLii);
            }
        }

        public C5884OooOOo0(AbstractC9847l1 r2) {
            this.f16894OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r3) {
            C5876LlIl.this.OooO0O0(new OooO00o(r3));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOOoo  reason: case insensitive filesystem */
    public class C5885OooOOoo implements AbstractC6473l1II {
        public final /* synthetic */ C5659LLLiL OooO00o;

        public C5885OooOOoo(C5659LLLiL lLLiL) {
            this.OooO00o = lLLiL;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            this.OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            C9714lli.m21756OooO00o(th);
            this.OooO00o.unsubscribe();
            C5876LlIl.m16472OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.OooO00o(llIiLii);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOo */
    public class OooOo implements AbstractC6473l1II {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16897OooO00o;

        public OooOo(AbstractC9508LiLi r2) {
            this.f16897OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            this.f16897OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.f16897OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.f16897OooO00o.add(llIiLii);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOo0  reason: case insensitive filesystem */
    public class C5886OooOo0 implements AbstractC6473l1II {
        public final /* synthetic */ C5659LLLiL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16899OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f16900OooO00o;
        public boolean OooO0O0;

        public C5886OooOo0(liii1l r2, C5659LLLiL lLLiL, AbstractC6153iL1l il1l) {
            this.f16900OooO00o = r2;
            this.OooO00o = lLLiL;
            this.f16899OooO00o = il1l;
        }

        public void OooO00o(Throwable th) {
            try {
                this.f16899OooO00o.call(th);
            } catch (Throwable th2) {
                this.OooO00o.unsubscribe();
                throw th2;
            }
            this.OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                try {
                    this.f16900OooO00o.call();
                    this.OooO00o.unsubscribe();
                } catch (Throwable th) {
                    OooO00o(th);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                OooO00o(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
            C5876LlIl.m16472OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.OooO00o(llIiLii);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOo00 */
    public class OooOo00 implements AbstractC6473l1II {
        public final /* synthetic */ C5659LLLiL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f16902OooO00o;
        public boolean OooO0O0;

        public OooOo00(liii1l r2, C5659LLLiL lLLiL) {
            this.f16902OooO00o = r2;
            this.OooO00o = lLLiL;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                try {
                    this.f16902OooO00o.call();
                } catch (Throwable th) {
                    this.OooO00o.unsubscribe();
                    throw th;
                }
                this.OooO00o.unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            C9714lli.m21756OooO00o(th);
            this.OooO00o.unsubscribe();
            C5876LlIl.m16472OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.OooO00o(llIiLii);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOo0O  reason: case insensitive filesystem */
    public static class C5887OooOo0O implements AbstractC5898Oooo0O0 {
        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r2) {
            r2.onSubscribe(C9638ill.OooO0O0());
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOo0o  reason: case insensitive filesystem */
    public static class C5888OooOo0o implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ C5876LlIl[] OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOo0o$OooO00o */
        public class OooO00o implements AbstractC6473l1II {
            public final /* synthetic */ IIlIIiI1 OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16904OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AtomicBoolean f16905OooO00o;

            public OooO00o(AtomicBoolean atomicBoolean, IIlIIiI1 iIlIIiI1, AbstractC6473l1II r4) {
                this.f16905OooO00o = atomicBoolean;
                this.OooO00o = iIlIIiI1;
                this.f16904OooO00o = r4;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                if (this.f16905OooO00o.compareAndSet(false, true)) {
                    this.OooO00o.unsubscribe();
                    this.f16904OooO00o.onCompleted();
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                if (this.f16905OooO00o.compareAndSet(false, true)) {
                    this.OooO00o.unsubscribe();
                    this.f16904OooO00o.onError(th);
                    return;
                }
                C9714lli.m21756OooO00o(th);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.OooO00o.OooO00o(llIiLii);
            }
        }

        public C5888OooOo0o(C5876LlIl[] r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r10) {
            IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
            r10.onSubscribe(iIlIIiI1);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            OooO00o oooO00o = new OooO00o(atomicBoolean, iIlIIiI1, r10);
            C5876LlIl[] r3 = this.OooO00o;
            for (C5876LlIl r7 : r3) {
                if (iIlIIiI1.isUnsubscribed()) {
                    return;
                }
                if (r7 == null) {
                    Throwable nullPointerException = new NullPointerException("One of the sources is null");
                    if (atomicBoolean.compareAndSet(false, true)) {
                        iIlIIiI1.unsubscribe();
                        r10.onError(nullPointerException);
                        return;
                    }
                    C9714lli.m21756OooO00o(nullPointerException);
                    return;
                } else if (!atomicBoolean.get() && !iIlIIiI1.isUnsubscribed()) {
                    r7.OooO0O0(oooO00o);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOoO  reason: case insensitive filesystem */
    public class C5889OooOoO implements C9349III.OooO00o<T> {
        public C5889OooOoO() {
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r2) {
            C5876LlIl.this.OooO0O0(r2);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOoO0  reason: case insensitive filesystem */
    public class C5890OooOoO0 implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ LL1LL OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOoO0$OooO00o */
        public class OooO00o implements liii1l {
            public final /* synthetic */ LL1LL.OooO00o OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16908OooO00o;

            public OooO00o(AbstractC6473l1II r2, LL1LL.OooO00o oooO00o) {
                this.f16908OooO00o = r2;
                this.OooO00o = oooO00o;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                try {
                    C5876LlIl.this.OooO0O0(this.f16908OooO00o);
                } finally {
                    this.OooO00o.unsubscribe();
                }
            }
        }

        public C5890OooOoO0(LL1LL ll1ll) {
            this.OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r3) {
            LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
            OooO00o2.OooO00o(new OooO00o(r3, OooO00o2));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOoOO  reason: case insensitive filesystem */
    public class C5891OooOoOO implements LLil11.OooOo00<T> {
        public final /* synthetic */ LiLIll OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOoOO$OooO00o */
        public class OooO00o implements AbstractC6473l1II {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC93021L f16910OooO00o;

            public OooO00o(AbstractC93021L r2) {
                this.f16910OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                try {
                    Object call = C5891OooOoOO.this.OooO00o.call();
                    if (call == null) {
                        this.f16910OooO00o.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        this.f16910OooO00o.OooO00o(call);
                    }
                } catch (Throwable th) {
                    this.f16910OooO00o.onError(th);
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                this.f16910OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.f16910OooO00o.OooO00o(llIiLii);
            }
        }

        public C5891OooOoOO(LiLIll r2) {
            this.OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r3) {
            C5876LlIl.this.OooO0O0(new OooO00o(r3));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOoo  reason: case insensitive filesystem */
    public class C5892OooOoo implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ LL1LL OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOoo$OooO00o */
        public class OooO00o implements AbstractC6473l1II {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16912OooO00o;

            /* renamed from: com.pd.sdk.L丨lI丨l$OooOoo$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4929OooO00o implements liii1l {
                public final /* synthetic */ LlIiLii OooO00o;

                /* renamed from: com.pd.sdk.L丨lI丨l$OooOoo$OooO00o$OooO00o$OooO00o  reason: collision with other inner class name */
                public class C4930OooO00o implements liii1l {
                    public final /* synthetic */ LL1LL.OooO00o OooO00o;

                    public C4930OooO00o(LL1LL.OooO00o oooO00o) {
                        this.OooO00o = oooO00o;
                    }

                    @Override // com.p118pd.sdk.liii1l
                    public void call() {
                        try {
                            C4929OooO00o.this.OooO00o.unsubscribe();
                        } finally {
                            this.OooO00o.unsubscribe();
                        }
                    }
                }

                public C4929OooO00o(LlIiLii llIiLii) {
                    this.OooO00o = llIiLii;
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    LL1LL.OooO00o OooO00o2 = C5892OooOoo.this.OooO00o.m16172OooO00o();
                    OooO00o2.OooO00o(new C4930OooO00o(OooO00o2));
                }
            }

            public OooO00o(AbstractC6473l1II r2) {
                this.f16912OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                this.f16912OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                this.f16912OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.f16912OooO00o.onSubscribe(C9638ill.OooO00o(new C4929OooO00o(llIiLii)));
            }
        }

        public C5892OooOoo(LL1LL ll1ll) {
            this.OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r3) {
            C5876LlIl.this.OooO0O0(new OooO00o(r3));
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOoo0  reason: case insensitive filesystem */
    public class C5893OooOoo0 implements LiLIll<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f16915OooO00o;

        public C5893OooOoo0(Object obj) {
            this.f16915OooO00o = obj;
        }

        @Override // java.util.concurrent.Callable, com.p118pd.sdk.LiLIll
        public T call() {
            return (T) this.f16915OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOooO  reason: case insensitive filesystem */
    public static class C5894OooOooO implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ Iterable OooO00o;

        /* renamed from: com.pd.sdk.L丨lI丨l$OooOooO$OooO00o */
        public class OooO00o implements AbstractC6473l1II {
            public final /* synthetic */ IIlIIiI1 OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC6473l1II f16917OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AtomicBoolean f16918OooO00o;

            public OooO00o(AtomicBoolean atomicBoolean, IIlIIiI1 iIlIIiI1, AbstractC6473l1II r4) {
                this.f16918OooO00o = atomicBoolean;
                this.OooO00o = iIlIIiI1;
                this.f16917OooO00o = r4;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                if (this.f16918OooO00o.compareAndSet(false, true)) {
                    this.OooO00o.unsubscribe();
                    this.f16917OooO00o.onCompleted();
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                if (this.f16918OooO00o.compareAndSet(false, true)) {
                    this.OooO00o.unsubscribe();
                    this.f16917OooO00o.onError(th);
                    return;
                }
                C9714lli.m21756OooO00o(th);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.OooO00o.OooO00o(llIiLii);
            }
        }

        public C5894OooOooO(Iterable iterable) {
            this.OooO00o = iterable;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r9) {
            IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
            r9.onSubscribe(iIlIIiI1);
            try {
                Iterator it = this.OooO00o.iterator();
                if (it == null) {
                    r9.onError(new NullPointerException("The iterator returned is null"));
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                OooO00o oooO00o = new OooO00o(atomicBoolean, iIlIIiI1, r9);
                boolean z = true;
                while (!atomicBoolean.get() && !iIlIIiI1.isUnsubscribed()) {
                    try {
                        if (!it.hasNext()) {
                            if (z) {
                                r9.onCompleted();
                                return;
                            }
                            return;
                        } else if (!atomicBoolean.get() && !iIlIIiI1.isUnsubscribed()) {
                            try {
                                C5876LlIl r6 = (C5876LlIl) it.next();
                                if (r6 == null) {
                                    Throwable nullPointerException = new NullPointerException("One of the sources is null");
                                    if (atomicBoolean.compareAndSet(false, true)) {
                                        iIlIIiI1.unsubscribe();
                                        r9.onError(nullPointerException);
                                        return;
                                    }
                                    C9714lli.m21756OooO00o(nullPointerException);
                                    return;
                                } else if (!atomicBoolean.get() && !iIlIIiI1.isUnsubscribed()) {
                                    r6.OooO0O0(oooO00o);
                                    z = false;
                                } else {
                                    return;
                                }
                            } catch (Throwable th) {
                                if (atomicBoolean.compareAndSet(false, true)) {
                                    iIlIIiI1.unsubscribe();
                                    r9.onError(th);
                                    return;
                                }
                                C9714lli.m21756OooO00o(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            iIlIIiI1.unsubscribe();
                            r9.onError(th2);
                            return;
                        }
                        C9714lli.m21756OooO00o(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                r9.onError(th3);
            }
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$OooOooo  reason: case insensitive filesystem */
    public static class C5895OooOooo implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ LiLIll OooO00o;

        public C5895OooOooo(LiLIll r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r3) {
            try {
                C5876LlIl r0 = (C5876LlIl) this.OooO00o.call();
                if (r0 == null) {
                    r3.onSubscribe(C9638ill.OooO0O0());
                    r3.onError(new NullPointerException("The completable returned is null"));
                    return;
                }
                r0.OooO0O0(r3);
            } catch (Throwable th) {
                r3.onSubscribe(C9638ill.OooO0O0());
                r3.onError(th);
            }
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$Oooo0 */
    public static class Oooo0 implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ Callable OooO00o;

        public Oooo0(Callable callable) {
            this.OooO00o = callable;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r3) {
            i1i11IL i1i11il = new i1i11IL();
            r3.onSubscribe(i1i11il);
            try {
                this.OooO00o.call();
                if (!i1i11il.isUnsubscribed()) {
                    r3.onCompleted();
                }
            } catch (Throwable th) {
                if (!i1i11il.isUnsubscribed()) {
                    r3.onError(th);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$Oooo000 */
    public static class Oooo000 implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ LiLIll OooO00o;

        public Oooo000(LiLIll r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r3) {
            Throwable th;
            r3.onSubscribe(C9638ill.OooO0O0());
            try {
                th = (Throwable) this.OooO00o.call();
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                th = new NullPointerException("The error supplied is null");
            }
            r3.onError(th);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$Oooo00O  reason: case insensitive filesystem */
    public static class C5896Oooo00O implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ Throwable OooO00o;

        public C5896Oooo00O(Throwable th) {
            this.OooO00o = th;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r2) {
            r2.onSubscribe(C9638ill.OooO0O0());
            r2.onError(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$Oooo00o  reason: case insensitive filesystem */
    public static class C5897Oooo00o implements AbstractC5898Oooo0O0 {
        public final /* synthetic */ liii1l OooO00o;

        public C5897Oooo00o(liii1l r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC6473l1II r3) {
            i1i11IL i1i11il = new i1i11IL();
            r3.onSubscribe(i1i11il);
            try {
                this.OooO00o.call();
                if (!i1i11il.isUnsubscribed()) {
                    r3.onCompleted();
                }
            } catch (Throwable th) {
                if (!i1i11il.isUnsubscribed()) {
                    r3.onError(th);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$Oooo0O0  reason: case insensitive filesystem */
    public interface AbstractC5898Oooo0O0 extends AbstractC6153iL1l<AbstractC6473l1II> {
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$Oooo0OO  reason: case insensitive filesystem */
    public interface AbstractC5899Oooo0OO extends AbstractC9847l1<AbstractC6473l1II, AbstractC6473l1II> {
    }

    /* renamed from: com.pd.sdk.L丨lI丨l$Oooo0o0  reason: case insensitive filesystem */
    public interface AbstractC5900Oooo0o0 extends AbstractC9847l1<C5876LlIl, C5876LlIl> {
    }

    public C5876LlIl(AbstractC5898Oooo0O0 oooo0O0) {
        this.f16849OooO00o = C9714lli.OooO00o(oooo0O0);
    }

    public static C5876LlIl OooO00o(C5876LlIl... r2) {
        OooO00o((Object) r2);
        if (r2.length == 0) {
            return OooO0Oo();
        }
        if (r2.length == 1) {
            return r2[0];
        }
        return OooO00o((AbstractC5898Oooo0O0) new C5888OooOo0o(r2));
    }

    public static C5876LlIl OooO0O0(C5876LlIl... r2) {
        OooO00o((Object) r2);
        if (r2.length == 0) {
            return OooO0Oo();
        }
        if (r2.length == 1) {
            return r2[0];
        }
        return OooO00o((AbstractC5898Oooo0O0) new CompletableOnSubscribeConcatArray(r2));
    }

    public static C5876LlIl OooO0OO(C5876LlIl... r2) {
        OooO00o((Object) r2);
        if (r2.length == 0) {
            return OooO0Oo();
        }
        if (r2.length == 1) {
            return r2[0];
        }
        return OooO00o((AbstractC5898Oooo0O0) new C5327IL1(r2));
    }

    public static C5876LlIl OooO0Oo() {
        AbstractC5898Oooo0O0 OooO00o2 = C9714lli.OooO00o(OooO00o.f16849OooO00o);
        C5876LlIl r1 = OooO00o;
        if (OooO00o2 == r1.f16849OooO00o) {
            return r1;
        }
        return new C5876LlIl(OooO00o2, false);
    }

    public static C5876LlIl OooO0o0(liii1l r1) {
        OooO00o((Object) r1);
        return OooO00o((AbstractC5898Oooo0O0) new C5897Oooo00o(r1));
    }

    public C5876LlIl(AbstractC5898Oooo0O0 oooo0O0, boolean z) {
        this.f16849OooO00o = z ? C9714lli.OooO00o(oooo0O0) : oooo0O0;
    }

    public static C5876LlIl OooO0o0() {
        AbstractC5898Oooo0O0 OooO00o2 = C9714lli.OooO00o(OooO0O0.f16849OooO00o);
        C5876LlIl r1 = OooO0O0;
        if (OooO00o2 == r1.f16849OooO00o) {
            return r1;
        }
        return new C5876LlIl(OooO00o2, false);
    }

    public static C5876LlIl OooO0Oo(AbstractC6153iL1l<AbstractC6521lIlii> il1l) {
        return OooO00o((AbstractC5898Oooo0O0) new CompletableFromEmitter(il1l));
    }

    public static C5876LlIl OooO0Oo(C5876LlIl... r1) {
        OooO00o((Object) r1);
        return OooO00o((AbstractC5898Oooo0O0) new C6763llL1(r1));
    }

    public final C5876LlIl OooO0o0(C5876LlIl r3) {
        OooO00o((Object) r3);
        return OooO0O0(r3, this);
    }

    public static C5876LlIl OooO00o(Iterable<? extends C5876LlIl> iterable) {
        OooO00o((Object) iterable);
        return OooO00o((AbstractC5898Oooo0O0) new C5894OooOooO(iterable));
    }

    public static C5876LlIl OooO0O0(Iterable<? extends C5876LlIl> iterable) {
        OooO00o((Object) iterable);
        return OooO00o((AbstractC5898Oooo0O0) new CompletableOnSubscribeConcatIterable(iterable));
    }

    public static C5876LlIl OooO0OO(Iterable<? extends C5876LlIl> iterable) {
        OooO00o((Object) iterable);
        return OooO00o((AbstractC5898Oooo0O0) new lI1L1(iterable));
    }

    public static C5876LlIl OooO0Oo(Iterable<? extends C5876LlIl> iterable) {
        OooO00o((Object) iterable);
        return OooO00o((AbstractC5898Oooo0O0) new C1LlIILi(iterable));
    }

    public static C5876LlIl OooO00o(C9349III<? extends C5876LlIl> r1) {
        return OooO00o(r1, 2);
    }

    public static C5876LlIl OooO0O0(LiLIll<? extends Throwable> r1) {
        OooO00o((Object) r1);
        return OooO00o((AbstractC5898Oooo0O0) new Oooo000(r1));
    }

    public static C5876LlIl OooO0OO(C9349III<? extends C5876LlIl> r2) {
        return OooO00o(r2, Integer.MAX_VALUE, false);
    }

    public static C5876LlIl OooO0Oo(C9349III<? extends C5876LlIl> r2) {
        return OooO00o(r2, Integer.MAX_VALUE, true);
    }

    public static C5876LlIl OooO00o(C9349III<? extends C5876LlIl> r2, int i) {
        OooO00o((Object) r2);
        if (i >= 1) {
            return OooO00o((AbstractC5898Oooo0O0) new CompletableOnSubscribeConcat(r2, i));
        }
        throw new IllegalArgumentException("prefetch > 0 required but it was " + i);
    }

    public static C5876LlIl OooO0OO(C9349III<? extends C5876LlIl> r1, int i) {
        return OooO00o(r1, i, true);
    }

    public final C5876LlIl OooO0Oo(liii1l r7) {
        return OooO00o(Actions.m22996OooO00o(), Actions.m22996OooO00o(), Actions.m22996OooO00o(), Actions.m22996OooO00o(), r7);
    }

    public static C5876LlIl OooO0O0(C9349III<?> r1) {
        OooO00o((Object) r1);
        return OooO00o((AbstractC5898Oooo0O0) new OooO00o(r1));
    }

    public static C5876LlIl OooO0OO(long j, TimeUnit timeUnit) {
        return OooO0OO(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final C5876LlIl OooO0Oo(C5876LlIl r3) {
        OooO00o((Object) r3);
        return OooO0OO(this, r3);
    }

    public static C5876LlIl OooO0OO(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        OooO00o((Object) timeUnit);
        OooO00o((Object) ll1ll);
        return OooO00o((AbstractC5898Oooo0O0) new OooO0OO(ll1ll, j, timeUnit));
    }

    public static C5876LlIl OooO00o(AbstractC5898Oooo0O0 oooo0O0) {
        OooO00o((Object) oooo0O0);
        try {
            return new C5876LlIl(oooo0O0);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9714lli.m21756OooO00o(th);
            throw m16471OooO00o(th);
        }
    }

    public static C5876LlIl OooO0O0(C9349III<? extends C5876LlIl> r1, int i) {
        return OooO00o(r1, i, false);
    }

    public final C5876LlIl OooO0Oo(AbstractC9847l1<? super C9349III<? extends Throwable>, ? extends C9349III<?>> r2) {
        return OooO0O0((C9349III<?>) m16479OooO00o().OooOoO0(r2));
    }

    public final C5876LlIl OooO0O0(C5876LlIl r1) {
        return OooO0OO(r1);
    }

    public final C5876LlIl OooO0O0(liii1l r7) {
        return OooO00o(Actions.m22996OooO00o(), Actions.m22996OooO00o(), r7, Actions.m22996OooO00o(), Actions.m22996OooO00o());
    }

    public final C5876LlIl OooO0OO(C5876LlIl r3) {
        OooO00o((Object) r3);
        return OooO0O0(this, r3);
    }

    public final C5876LlIl OooO0O0(AbstractC6153iL1l<? super Throwable> il1l) {
        return OooO00o(Actions.m22996OooO00o(), il1l, Actions.m22996OooO00o(), Actions.m22996OooO00o(), Actions.m22996OooO00o());
    }

    public final C5876LlIl OooO0O0(AbstractC9847l1<? super Throwable, ? extends C5876LlIl> r2) {
        OooO00o((Object) r2);
        return OooO00o((AbstractC5898Oooo0O0) new C5883OooOOo(r2));
    }

    public final C5876LlIl OooO0OO(AbstractC6153iL1l<? super LlIiLii> il1l) {
        return OooO00o(il1l, Actions.m22996OooO00o(), Actions.m22996OooO00o(), Actions.m22996OooO00o(), Actions.m22996OooO00o());
    }

    public static C5876LlIl OooO00o(LiLIll<? extends C5876LlIl> r1) {
        OooO00o((Object) r1);
        return OooO00o((AbstractC5898Oooo0O0) new C5895OooOooo(r1));
    }

    public final C5876LlIl OooO0OO(liii1l r7) {
        return OooO00o(Actions.m22996OooO00o(), new C5881OooOO0o(r7), r7, Actions.m22996OooO00o(), Actions.m22996OooO00o());
    }

    public final C5876LlIl OooO0O0() {
        return OooO0O0((C9349III<?>) m16479OooO00o().OooOOo());
    }

    public final C5876LlIl OooO0OO(AbstractC9847l1<? super C9349III<? extends Void>, ? extends C9349III<?>> r2) {
        OooO00o((Object) r2);
        return OooO0O0((C9349III<?>) m16479OooO00o().OooOo0o(r2));
    }

    public static C5876LlIl OooO00o(Throwable th) {
        OooO00o((Object) th);
        return OooO00o((AbstractC5898Oooo0O0) new C5896Oooo00O(th));
    }

    public final C5876LlIl OooO0O0(long j) {
        return OooO0O0((C9349III<?>) m16479OooO00o().OooO0OO(j));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final <T> C9349III<T> m16486OooO0O0(C9349III<T> r2) {
        OooO00o((Object) r2);
        return m16479OooO00o().OooOO0(r2);
    }

    public final C5876LlIl OooO0OO() {
        return OooO0O0((C9349III<?>) m16479OooO00o().OooOOoo());
    }

    public static C5876LlIl OooO00o(Callable<?> callable) {
        OooO00o((Object) callable);
        return OooO00o((AbstractC5898Oooo0O0) new Oooo0(callable));
    }

    public final C5876LlIl OooO0OO(LL1LL ll1ll) {
        OooO00o((Object) ll1ll);
        return OooO00o((AbstractC5898Oooo0O0) new C5892OooOoo(ll1ll));
    }

    public final void OooO0O0(AbstractC6473l1II r2) {
        OooO00o((Object) r2);
        try {
            C9714lli.OooO00o(this, this.f16849OooO00o).call(r2);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            Throwable OooO00o2 = C9714lli.OooO00o(th);
            C9714lli.m21756OooO00o(OooO00o2);
            throw m16471OooO00o(OooO00o2);
        }
    }

    public static C5876LlIl OooO00o(Future<?> future) {
        OooO00o((Object) future);
        return OooO0O0((C9349III<?>) C9349III.OooO00o((Future) future));
    }

    public static C5876LlIl OooO00o(LLil11<?> r1) {
        OooO00o((Object) r1);
        return OooO00o((AbstractC5898Oooo0O0) new OooO0O0(r1));
    }

    public static C5876LlIl OooO00o(C9349III<? extends C5876LlIl> r1, int i, boolean z) {
        OooO00o((Object) r1);
        if (i >= 1) {
            return OooO00o((AbstractC5898Oooo0O0) new i11IL(r1, i, z));
        }
        throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
    }

    public static <T> T OooO00o(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public final <T> void OooO0O0(AbstractC9508LiLi<T> r2) {
        OooO00o((AbstractC9508LiLi) r2, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static NullPointerException m16471OooO00o(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public final C5876LlIl OooO0O0(LL1LL ll1ll) {
        OooO00o((Object) ll1ll);
        return OooO00o((AbstractC5898Oooo0O0) new C5890OooOoO0(ll1ll));
    }

    public static <R> C5876LlIl OooO00o(LiLIll<R> r1, AbstractC9847l1<? super R, ? extends C5876LlIl> r2, AbstractC6153iL1l<? super R> il1l) {
        return OooO00o((LiLIll) r1, (AbstractC9847l1) r2, (AbstractC6153iL1l) il1l, true);
    }

    public final C5876LlIl OooO0O0(long j, TimeUnit timeUnit) {
        return OooO0O0(j, timeUnit, C6261iii1I1.OooO00o(), null);
    }

    public static <R> C5876LlIl OooO00o(LiLIll<R> r1, AbstractC9847l1<? super R, ? extends C5876LlIl> r2, AbstractC6153iL1l<? super R> il1l, boolean z) {
        OooO00o((Object) r1);
        OooO00o((Object) r2);
        OooO00o((Object) il1l);
        return OooO00o((AbstractC5898Oooo0O0) new C5877OooO0Oo(r1, r2, il1l, z));
    }

    public final C5876LlIl OooO0O0(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0O0(j, timeUnit, ll1ll, null);
    }

    public final C5876LlIl OooO0O0(long j, TimeUnit timeUnit, LL1LL ll1ll, C5876LlIl r13) {
        OooO00o((Object) timeUnit);
        OooO00o((Object) ll1ll);
        return OooO00o((AbstractC5898Oooo0O0) new C9658l1i(this, j, timeUnit, ll1ll, r13));
    }

    public final C5876LlIl OooO00o(C5876LlIl r3) {
        OooO00o((Object) r3);
        return OooO00o(this, r3);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m16484OooO00o() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        OooO0O0(new C5878OooO0o0(countDownLatch, thArr));
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
                if (thArr[0] != null) {
                    IIl11.OooO00o(thArr[0]);
                }
            } catch (InterruptedException e) {
                throw IIl11.OooO00o((Throwable) e);
            }
        } else if (thArr[0] != null) {
            IIl11.OooO00o(thArr[0]);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m16485OooO00o(long j, TimeUnit timeUnit) {
        OooO00o((Object) timeUnit);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        OooO0O0(new OooO0o(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            if (thArr[0] != null) {
                IIl11.OooO00o(thArr[0]);
            }
            return true;
        }
        try {
            boolean await = countDownLatch.await(j, timeUnit);
            if (await && thArr[0] != null) {
                IIl11.OooO00o(thArr[0]);
            }
            return await;
        } catch (InterruptedException e) {
            throw IIl11.OooO00o((Throwable) e);
        }
    }

    public final C5876LlIl OooO00o(AbstractC5900Oooo0o0 oooo0o0) {
        return (C5876LlIl) m16481OooO00o((AbstractC9847l1) oooo0o0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <T> C9349III<T> m16480OooO00o(C9349III<T> r2) {
        OooO00o((Object) r2);
        return r2.OooO0Oo((C9349III) m16479OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <T> LLil11<T> m16473OooO00o(LLil11<T> r2) {
        OooO00o((Object) r2);
        return r2.m16256OooO00o(m16479OooO00o());
    }

    public final C5876LlIl OooO00o(long j, TimeUnit timeUnit) {
        return OooO00o(j, timeUnit, C6261iii1I1.OooO00o(), false);
    }

    public final C5876LlIl OooO00o(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o(j, timeUnit, ll1ll, false);
    }

    public final C5876LlIl OooO00o(long j, TimeUnit timeUnit, LL1LL ll1ll, boolean z) {
        OooO00o((Object) timeUnit);
        OooO00o((Object) ll1ll);
        return OooO00o((AbstractC5898Oooo0O0) new C5879OooO0oO(ll1ll, j, timeUnit, z));
    }

    public final C5876LlIl OooO00o(AbstractC6153iL1l<Notification<Object>> il1l) {
        if (il1l != null) {
            return OooO00o(Actions.m22996OooO00o(), new C5880OooO0oo(il1l), new OooO(il1l), Actions.m22996OooO00o(), Actions.m22996OooO00o());
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final C5876LlIl OooO00o(AbstractC6153iL1l<? super LlIiLii> il1l, AbstractC6153iL1l<? super Throwable> il1l2, liii1l r11, liii1l r12, liii1l r13) {
        OooO00o((Object) il1l);
        OooO00o((Object) il1l2);
        OooO00o((Object) r11);
        OooO00o((Object) r12);
        OooO00o((Object) r13);
        return OooO00o((AbstractC5898Oooo0O0) new OooOO0(r11, r12, il1l2, il1l, r13));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C5876LlIl m16477OooO00o(liii1l r7) {
        return OooO00o(Actions.m22996OooO00o(), Actions.m22996OooO00o(), Actions.m22996OooO00o(), r7, Actions.m22996OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Throwable m16482OooO00o() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        OooO0O0(new OooOOO0(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            countDownLatch.await();
            return thArr[0];
        } catch (InterruptedException e) {
            throw IIl11.OooO00o((Throwable) e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Throwable m16483OooO00o(long j, TimeUnit timeUnit) {
        OooO00o((Object) timeUnit);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        OooO0O0(new OooOOO(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            if (countDownLatch.await(j, timeUnit)) {
                return thArr[0];
            }
            IIl11.OooO00o((Throwable) new TimeoutException());
            return null;
        } catch (InterruptedException e) {
            throw IIl11.OooO00o((Throwable) e);
        }
    }

    public final C5876LlIl OooO00o(AbstractC5899Oooo0OO oooo0OO) {
        OooO00o((Object) oooo0OO);
        return OooO00o((AbstractC5898Oooo0O0) new OooOOOO(oooo0OO));
    }

    public final C5876LlIl OooO00o(LL1LL ll1ll) {
        OooO00o((Object) ll1ll);
        return OooO00o((AbstractC5898Oooo0O0) new C5882OooOOOo(ll1ll));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C5876LlIl m16476OooO00o() {
        return OooO00o(UtilityFunctions.OooO0O0());
    }

    public final C5876LlIl OooO00o(AbstractC9847l1<? super Throwable, Boolean> r2) {
        OooO00o((Object) r2);
        return OooO00o((AbstractC5898Oooo0O0) new C5884OooOOo0(r2));
    }

    public final C5876LlIl OooO00o(long j) {
        return OooO0O0((C9349III<?>) m16479OooO00o().m21409OooO0O0(j));
    }

    public final C5876LlIl OooO00o(AbstractC5189I1l1l<Integer, Throwable, Boolean> r2) {
        return OooO0O0((C9349III<?>) m16479OooO00o().OooO0OO(r2));
    }

    public final LlIiLii OooO00o() {
        C5659LLLiL lLLiL = new C5659LLLiL();
        OooO0O0(new C5885OooOOoo(lLLiL));
        return lLLiL;
    }

    public final LlIiLii OooO00o(liii1l r3) {
        OooO00o((Object) r3);
        C5659LLLiL lLLiL = new C5659LLLiL();
        OooO0O0(new OooOo00(r3, lLLiL));
        return lLLiL;
    }

    public final LlIiLii OooO00o(liii1l r3, AbstractC6153iL1l<? super Throwable> il1l) {
        OooO00o((Object) r3);
        OooO00o((Object) il1l);
        C5659LLLiL lLLiL = new C5659LLLiL();
        OooO0O0(new C5886OooOo0(r3, lLLiL, il1l));
        return lLLiL;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m16472OooO00o(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public final void OooO00o(AbstractC6473l1II r2) {
        if (!(r2 instanceof C6220ii1ILi)) {
            r2 = new C6220ii1ILi(r2);
        }
        OooO0O0(r2);
    }

    private <T> void OooO00o(AbstractC9508LiLi<T> r1, boolean z) {
        OooO00o((Object) r1);
        if (z) {
            try {
                r1.onStart();
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                Throwable OooO0O02 = C9714lli.OooO0O0(th);
                C9714lli.m21756OooO00o(OooO0O02);
                throw m16471OooO00o(OooO0O02);
            }
        }
        OooO0O0(new OooOo(r1));
        C9714lli.OooO00o(r1);
    }

    public final <T> void OooO00o(AbstractC9508LiLi<T> r2) {
        r2.onStart();
        if (!(r2 instanceof C6158iLI)) {
            r2 = new C6158iLI(r2);
        }
        OooO00o((AbstractC9508LiLi) r2, false);
    }

    public final C5876LlIl OooO00o(long j, TimeUnit timeUnit, C5876LlIl r10) {
        OooO00o((Object) r10);
        return OooO0O0(j, timeUnit, C6261iii1I1.OooO00o(), r10);
    }

    public final C5876LlIl OooO00o(long j, TimeUnit timeUnit, LL1LL ll1ll, C5876LlIl r5) {
        OooO00o((Object) r5);
        return OooO0O0(j, timeUnit, ll1ll, r5);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <R> R m16481OooO00o(AbstractC9847l1<? super C5876LlIl, R> r1) {
        return r1.call(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <T> C9349III<T> m16479OooO00o() {
        return C9349III.OooO0O0((C9349III.OooO00o) new C5889OooOoO());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <T> LLil11<T> m16474OooO00o(LiLIll<? extends T> r2) {
        OooO00o((Object) r2);
        return LLil11.OooO00o((LLil11.OooOo00) new C5891OooOoOO(r2));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <T> LLil11<T> m16475OooO00o(T t) {
        OooO00o((Object) t);
        return m16474OooO00o((LiLIll) new C5893OooOoo0(t));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C11LlIl1<Void> m16478OooO00o() {
        ili1Il OooO00o2 = ili1Il.OooO00o(Long.MAX_VALUE);
        OooO00o((AbstractC9508LiLi) OooO00o2);
        return OooO00o2;
    }
}
