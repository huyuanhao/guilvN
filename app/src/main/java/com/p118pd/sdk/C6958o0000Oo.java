package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000Oo  reason: case insensitive filesystem */
public class C6958o0000Oo extends AbstractC6960o0000OoO {
    @Nullable
    public volatile Handler OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f19153OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ExecutorService f19154OooO00o = Executors.newFixedThreadPool(2, new OooO00o());

    /* renamed from: com.pd.sdk.o0000Oo$OooO00o */
    public class OooO00o implements ThreadFactory {
        public static final String o0ooOOo = "arch_disk_io_%d";

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f19155OooO00o = new AtomicInteger(0);

        public OooO00o() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(o0ooOOo, Integer.valueOf(this.f19155OooO00o.getAndIncrement())));
            return thread;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6960o0000OoO
    public void OooO00o(Runnable runnable) {
        this.f19154OooO00o.execute(runnable);
    }

    @Override // com.p118pd.sdk.AbstractC6960o0000OoO
    public void OooO0OO(Runnable runnable) {
        if (this.OooO00o == null) {
            synchronized (this.f19153OooO00o) {
                if (this.OooO00o == null) {
                    this.OooO00o = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.OooO00o.post(runnable);
    }

    @Override // com.p118pd.sdk.AbstractC6960o0000OoO
    public boolean OooO00o() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
