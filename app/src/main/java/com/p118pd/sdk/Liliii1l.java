package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;
import p293rx.exceptions.OnErrorNotImplementedException;

/* renamed from: com.pd.sdk.Liliii1l */
public class Liliii1l extends LL1LL {
    public final Handler OooO00o;

    /* renamed from: com.pd.sdk.Liliii1l$OooO0O0 */
    public static final class OooO0O0 implements Runnable, LlIiLii {
        public final Handler OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final liii1l f16655OooO00o;
        public volatile boolean OooO0O0;

        public OooO0O0(liii1l r1, Handler handler) {
            this.f16655OooO00o = r1;
            this.OooO00o = handler;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO0O0;
        }

        public void run() {
            IllegalStateException illegalStateException;
            try {
                this.f16655OooO00o.call();
            } catch (Throwable th) {
                if (th instanceof OnErrorNotImplementedException) {
                    illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
                } else {
                    illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                }
                ilL1l.OooO00o().m17361OooO00o().OooO00o((Throwable) illegalStateException);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.OooO0O0 = true;
            this.OooO00o.removeCallbacks(this);
        }
    }

    public Liliii1l(Looper looper) {
        this.OooO00o = new Handler(looper);
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public LL1LL.OooO00o OooO00o() {
        return new OooO00o(this.OooO00o);
    }

    public Liliii1l(Handler handler) {
        this.OooO00o = handler;
    }

    /* renamed from: com.pd.sdk.Liliii1l$OooO00o */
    public static class OooO00o extends LL1LL.OooO00o {
        public final Handler OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final L1Il f16654OooO00o = C6379iLL.OooO00o().m17496OooO00o();
        public volatile boolean OooO0O0;

        public OooO00o(Handler handler) {
            this.OooO00o = handler;
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r3, long j, TimeUnit timeUnit) {
            if (this.OooO0O0) {
                return C9638ill.OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0(this.f16654OooO00o.OooO00o(r3), this.OooO00o);
            Message obtain = Message.obtain(this.OooO00o, oooO0O0);
            obtain.obj = this;
            this.OooO00o.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.OooO0O0) {
                return oooO0O0;
            }
            this.OooO00o.removeCallbacks(oooO0O0);
            return C9638ill.OooO0O0();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO0O0;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.OooO0O0 = true;
            this.OooO00o.removeCallbacksAndMessages(this);
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r4) {
            return OooO00o(r4, 0, TimeUnit.MILLISECONDS);
        }
    }
}
