package p293rx.internal.schedulers;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC6473l1II;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C5468IllIL;
import com.p118pd.sdk.C5876LlIl;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.liii1l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.operators.BufferUntilSubscriber;
import p293rx.subjects.PublishSubject;

/* renamed from: rx.internal.schedulers.SchedulerWhen */
public class SchedulerWhen extends LL1LL implements LlIiLii {
    public static final LlIiLii OooO0O0 = new OooO0OO();
    public static final LlIiLii OooO0OO = C9638ill.OooO0O0();
    public final AbstractC5477Il11<C9349III<C5876LlIl>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f24150OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlIiLii f24151OooO00o;

    /* renamed from: rx.internal.schedulers.SchedulerWhen$DelayedAction */
    public static class DelayedAction extends ScheduledAction {
        public final liii1l action;
        public final long delayTime;
        public final TimeUnit unit;

        public DelayedAction(liii1l r1, long j, TimeUnit timeUnit) {
            this.action = r1;
            this.delayTime = j;
            this.unit = timeUnit;
        }

        @Override // p293rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public LlIiLii callActual(LL1LL.OooO00o oooO00o, AbstractC6473l1II r5) {
            return oooO00o.OooO00o(new C9967OooO0Oo(this.action, r5), this.delayTime, this.unit);
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$ImmediateAction */
    public static class ImmediateAction extends ScheduledAction {
        public final liii1l action;

        public ImmediateAction(liii1l r1) {
            this.action = r1;
        }

        @Override // p293rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public LlIiLii callActual(LL1LL.OooO00o oooO00o, AbstractC6473l1II r4) {
            return oooO00o.OooO00o(new C9967OooO0Oo(this.action, r4));
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$OooO00o */
    public class OooO00o implements AbstractC9847l1<ScheduledAction, C5876LlIl> {
        public final /* synthetic */ LL1LL.OooO00o OooO00o;

        /* renamed from: rx.internal.schedulers.SchedulerWhen$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4990OooO00o implements C5876LlIl.AbstractC5898Oooo0O0 {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ ScheduledAction f24153OooO00o;

            public C4990OooO00o(ScheduledAction scheduledAction) {
                this.f24153OooO00o = scheduledAction;
            }

            /* renamed from: OooO00o */
            public void call(AbstractC6473l1II r3) {
                r3.onSubscribe(this.f24153OooO00o);
                this.f24153OooO00o.OooO00o(OooO00o.this.OooO00o, r3);
            }
        }

        public OooO00o(LL1LL.OooO00o oooO00o) {
            this.OooO00o = oooO00o;
        }

        /* renamed from: OooO00o */
        public C5876LlIl call(ScheduledAction scheduledAction) {
            return C5876LlIl.OooO00o((C5876LlIl.AbstractC5898Oooo0O0) new C4990OooO00o(scheduledAction));
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$OooO0OO */
    public static class OooO0OO implements LlIiLii {
        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$OooO0Oo  reason: case insensitive filesystem */
    public static class C9967OooO0Oo implements liii1l {
        public AbstractC6473l1II OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public liii1l f24157OooO00o;

        public C9967OooO0Oo(liii1l r1, AbstractC6473l1II r2) {
            this.f24157OooO00o = r1;
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            try {
                this.f24157OooO00o.call();
            } finally {
                this.OooO00o.onCompleted();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$ScheduledAction */
    public static abstract class ScheduledAction extends AtomicReference<LlIiLii> implements LlIiLii {
        public ScheduledAction() {
            super(SchedulerWhen.OooO0O0);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void OooO00o(LL1LL.OooO00o oooO00o, AbstractC6473l1II r4) {
            LlIiLii llIiLii = (LlIiLii) get();
            if (llIiLii != SchedulerWhen.OooO0OO && llIiLii == SchedulerWhen.OooO0O0) {
                LlIiLii callActual = callActual(oooO00o, r4);
                if (!compareAndSet(SchedulerWhen.OooO0O0, callActual)) {
                    callActual.unsubscribe();
                }
            }
        }

        public abstract LlIiLii callActual(LL1LL.OooO00o oooO00o, AbstractC6473l1II v);

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return ((LlIiLii) get()).isUnsubscribed();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            LlIiLii llIiLii;
            LlIiLii llIiLii2 = SchedulerWhen.OooO0OO;
            do {
                llIiLii = (LlIiLii) get();
                if (llIiLii == SchedulerWhen.OooO0OO) {
                    return;
                }
            } while (!compareAndSet(llIiLii, llIiLii2));
            if (llIiLii != SchedulerWhen.OooO0O0) {
                llIiLii.unsubscribe();
            }
        }
    }

    public SchedulerWhen(AbstractC9847l1<C9349III<C9349III<C5876LlIl>>, C5876LlIl> r2, LL1LL ll1ll) {
        this.f24150OooO00o = ll1ll;
        PublishSubject OooO00o2 = PublishSubject.OooO00o();
        this.OooO00o = new C5468IllIL(OooO00o2);
        this.f24151OooO00o = r2.call(OooO00o2.OooOOO()).OooO00o();
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public LL1LL.OooO00o OooO00o() {
        LL1LL.OooO00o OooO00o2 = this.f24150OooO00o.m16172OooO00o();
        BufferUntilSubscriber OooO00o3 = BufferUntilSubscriber.OooO00o();
        C5468IllIL r2 = new C5468IllIL(OooO00o3);
        C9349III<C5876LlIl> OooOOoo = OooO00o3.OooOOoo(new OooO00o(OooO00o2));
        OooO0O0 oooO0O0 = new OooO0O0(OooO00o2, r2);
        this.OooO00o.onNext(OooOOoo);
        return oooO0O0;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.f24151OooO00o.isUnsubscribed();
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        this.f24151OooO00o.unsubscribe();
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$OooO0O0 */
    public class OooO0O0 extends LL1LL.OooO00o {
        public final /* synthetic */ AbstractC5477Il11 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL.OooO00o f24154OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f24155OooO00o = new AtomicBoolean();

        public OooO0O0(LL1LL.OooO00o oooO00o, AbstractC5477Il11 r3) {
            this.f24154OooO00o = oooO00o;
            this.OooO00o = r3;
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r2, long j, TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(r2, j, timeUnit);
            this.OooO00o.onNext(delayedAction);
            return delayedAction;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.f24155OooO00o.get();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (this.f24155OooO00o.compareAndSet(false, true)) {
                this.f24154OooO00o.unsubscribe();
                this.OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r2) {
            ImmediateAction immediateAction = new ImmediateAction(r2);
            this.OooO00o.onNext(immediateAction);
            return immediateAction;
        }
    }
}
