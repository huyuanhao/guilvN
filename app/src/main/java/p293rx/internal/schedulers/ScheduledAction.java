package p293rx.internal.schedulers;

import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.C9862ll;
import com.p118pd.sdk.IIlIIiI1;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.liii1l;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.OnErrorNotImplementedException;

/* renamed from: rx.internal.schedulers.ScheduledAction */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, LlIiLii {
    public static final long serialVersionUID = -3962399486978279857L;
    public final liii1l action;
    public final C9862ll cancel;

    /* renamed from: rx.internal.schedulers.ScheduledAction$OooO00o */
    public final class OooO00o implements LlIiLii {
        public final Future<?> OooO00o;

        public OooO00o(Future<?> future) {
            this.OooO00o = future;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO00o.isCancelled();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.OooO00o.cancel(true);
            } else {
                this.OooO00o.cancel(false);
            }
        }
    }

    /* renamed from: rx.internal.schedulers.ScheduledAction$Remover */
    public static final class Remover extends AtomicBoolean implements LlIiLii {
        public static final long serialVersionUID = 247232374289553518L;
        public final IIlIIiI1 parent;

        /* renamed from: s */
        public final ScheduledAction f13524s;

        public Remover(ScheduledAction scheduledAction, IIlIIiI1 iIlIIiI1) {
            this.f13524s = scheduledAction;
            this.parent = iIlIIiI1;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.f13524s.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.OooO0O0(this.f13524s);
            }
        }
    }

    /* renamed from: rx.internal.schedulers.ScheduledAction$Remover2 */
    public static final class Remover2 extends AtomicBoolean implements LlIiLii {
        public static final long serialVersionUID = 247232374289553518L;
        public final C9862ll parent;

        /* renamed from: s */
        public final ScheduledAction f13525s;

        public Remover2(ScheduledAction scheduledAction, C9862ll r2) {
            this.f13525s = scheduledAction;
            this.parent = r2;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.f13525s.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.OooO0O0(this.f13525s);
            }
        }
    }

    public ScheduledAction(liii1l r1) {
        this.action = r1;
        this.cancel = new C9862ll();
    }

    public void add(LlIiLii llIiLii) {
        this.cancel.OooO00o(llIiLii);
    }

    public void addParent(IIlIIiI1 iIlIIiI1) {
        this.cancel.OooO00o(new Remover(this, iIlIIiI1));
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.cancel.isUnsubscribed();
    }

    public void run() {
        try {
            lazySet(Thread.currentThread());
            this.action.call();
        } catch (OnErrorNotImplementedException e) {
            signalError(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th) {
            unsubscribe();
            throw th;
        }
        unsubscribe();
    }

    public void signalError(Throwable th) {
        C9714lli.m21756OooO00o(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        if (!this.cancel.isUnsubscribed()) {
            this.cancel.unsubscribe();
        }
    }

    public void add(Future<?> future) {
        this.cancel.OooO00o(new OooO00o(future));
    }

    public void addParent(C9862ll r3) {
        this.cancel.OooO00o(new Remover2(this, r3));
    }

    public ScheduledAction(liii1l r2, IIlIIiI1 iIlIIiI1) {
        this.action = r2;
        this.cancel = new C9862ll(new Remover(this, iIlIIiI1));
    }

    public ScheduledAction(liii1l r2, C9862ll r3) {
        this.action = r2;
        this.cancel = new C9862ll(new Remover2(this, r3));
    }
}
