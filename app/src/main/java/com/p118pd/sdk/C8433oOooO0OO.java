package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.pd.sdk.oOooO0OO  reason: case insensitive filesystem */
public final class C8433oOooO0OO {
    public static final C8433oOooO0OO OooO00o = new C8433oOooO0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExecutorService f21569OooO00o;

    public void OooO00o(Runnable runnable) {
        ExecutorService OooO00o2 = OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.execute(runnable);
        } else {
            new Thread(runnable).start();
        }
    }

    public void OooO0O0(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    private ExecutorService OooO00o() {
        if (this.f21569OooO00o == null) {
            try {
                this.f21569OooO00o = Executors.newCachedThreadPool();
            } catch (Exception e) {
                C8425oOoo0ooo.OooO0O0("create thread service error:" + e.getMessage());
            }
        }
        return this.f21569OooO00o;
    }
}
