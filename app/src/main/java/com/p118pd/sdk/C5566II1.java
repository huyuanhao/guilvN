package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p293rx.internal.schedulers.ScheduledAction;

/* renamed from: com.pd.sdk.I丨丨I1  reason: invalid class name and case insensitive filesystem */
public final class C5566II1 extends LL1LL {
    public final Executor OooO00o;

    public C5566II1(Executor executor) {
        this.OooO00o = executor;
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public LL1LL.OooO00o OooO00o() {
        return new OooO00o(this.OooO00o);
    }

    /* renamed from: com.pd.sdk.I丨丨I1$OooO00o */
    public static final class OooO00o extends LL1LL.OooO00o implements Runnable {
        public final IIlIIiI1 OooO00o = new IIlIIiI1();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ConcurrentLinkedQueue<ScheduledAction> f16101OooO00o = new ConcurrentLinkedQueue<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Executor f16102OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ScheduledExecutorService f16103OooO00o = C6547lL1LLLi.OooO00o();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f16104OooO00o = new AtomicInteger();

        /* renamed from: com.pd.sdk.I丨丨I1$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4916OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C5659LLLiL f16105OooO00o;

            public C4916OooO00o(C5659LLLiL lLLiL) {
                this.f16105OooO00o = lLLiL;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o.this.OooO00o.OooO0O0(this.f16105OooO00o);
            }
        }

        /* renamed from: com.pd.sdk.I丨丨I1$OooO00o$OooO0O0 */
        public class OooO0O0 implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C5659LLLiL f16106OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ LlIiLii f16107OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ liii1l f16108OooO00o;

            public OooO0O0(C5659LLLiL lLLiL, liii1l r3, LlIiLii llIiLii) {
                this.f16106OooO00o = lLLiL;
                this.f16108OooO00o = r3;
                this.f16107OooO00o = llIiLii;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                if (!this.f16106OooO00o.isUnsubscribed()) {
                    LlIiLii OooO00o2 = OooO00o.this.OooO00o(this.f16108OooO00o);
                    this.f16106OooO00o.OooO00o(OooO00o2);
                    if (OooO00o2.getClass() == ScheduledAction.class) {
                        ((ScheduledAction) OooO00o2).add(this.f16107OooO00o);
                    }
                }
            }
        }

        public OooO00o(Executor executor) {
            this.f16102OooO00o = executor;
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r3) {
            if (isUnsubscribed()) {
                return C9638ill.OooO0O0();
            }
            ScheduledAction scheduledAction = new ScheduledAction(C9714lli.OooO00o(r3), this.OooO00o);
            this.OooO00o.OooO00o(scheduledAction);
            this.f16101OooO00o.offer(scheduledAction);
            if (this.f16104OooO00o.getAndIncrement() == 0) {
                try {
                    this.f16102OooO00o.execute(this);
                } catch (RejectedExecutionException e) {
                    this.OooO00o.OooO0O0(scheduledAction);
                    this.f16104OooO00o.decrementAndGet();
                    C9714lli.m21756OooO00o((Throwable) e);
                    throw e;
                }
            }
            return scheduledAction;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO00o.isUnsubscribed();
        }

        public void run() {
            while (!this.OooO00o.isUnsubscribed()) {
                ScheduledAction poll = this.f16101OooO00o.poll();
                if (poll != null) {
                    if (!poll.isUnsubscribed()) {
                        if (!this.OooO00o.isUnsubscribed()) {
                            poll.run();
                        } else {
                            this.f16101OooO00o.clear();
                            return;
                        }
                    }
                    if (this.f16104OooO00o.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f16101OooO00o.clear();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.OooO00o.unsubscribe();
            this.f16101OooO00o.clear();
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r6, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return OooO00o(r6);
            }
            if (isUnsubscribed()) {
                return C9638ill.OooO0O0();
            }
            liii1l OooO00o2 = C9714lli.OooO00o(r6);
            C5659LLLiL lLLiL = new C5659LLLiL();
            C5659LLLiL lLLiL2 = new C5659LLLiL();
            lLLiL2.OooO00o(lLLiL);
            this.OooO00o.OooO00o(lLLiL2);
            LlIiLii OooO00o3 = C9638ill.OooO00o(new C4916OooO00o(lLLiL2));
            ScheduledAction scheduledAction = new ScheduledAction(new OooO0O0(lLLiL2, OooO00o2, OooO00o3));
            lLLiL.OooO00o(scheduledAction);
            try {
                scheduledAction.add(this.f16103OooO00o.schedule(scheduledAction, j, timeUnit));
                return OooO00o3;
            } catch (RejectedExecutionException e) {
                C9714lli.m21756OooO00o((Throwable) e);
                throw e;
            }
        }
    }
}
