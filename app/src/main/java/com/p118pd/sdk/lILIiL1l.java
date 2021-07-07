package com.p118pd.sdk;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.lILIiL1l */
public abstract class lILIiL1l implements LlIiLii {
    public final AtomicBoolean OooO00o = new AtomicBoolean();

    /* renamed from: com.pd.sdk.lILIiL1l$OooO00o */
    public class OooO00o implements liii1l {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            lILIiL1l.this.OooO00o();
        }
    }

    public static void OooO0O0() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
        }
    }

    public abstract void OooO00o();

    @Override // com.p118pd.sdk.LlIiLii
    public final boolean isUnsubscribed() {
        return this.OooO00o.get();
    }

    @Override // com.p118pd.sdk.LlIiLii
    public final void unsubscribe() {
        if (!this.OooO00o.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            OooO00o();
        } else {
            C6342il11.OooO00o().m16172OooO00o().OooO00o(new OooO00o());
        }
    }
}
