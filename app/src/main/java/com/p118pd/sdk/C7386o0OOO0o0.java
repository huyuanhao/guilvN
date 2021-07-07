package com.p118pd.sdk;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.pd.sdk.o0OOO0o0  reason: case insensitive filesystem */
public final class C7386o0OOO0o0 {
    public static final C7386o0OOO0o0 OooO00o = new C7386o0OOO0o0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Executor f20151OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ExecutorService f20152OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ScheduledExecutorService f20153OooO00o;

    /* renamed from: com.pd.sdk.o0OOO0o0$OooO0O0 */
    public static class OooO0O0 implements Executor {
        public static final int o00oO0O = 15;
        public ThreadLocal<Integer> OooO00o;

        public OooO0O0() {
            this.OooO00o = new ThreadLocal<>();
        }

        private int OooO00o() {
            Integer num = this.OooO00o.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.OooO00o.remove();
            } else {
                this.OooO00o.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int OooO0O0() {
            Integer num = this.OooO00o.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.OooO00o.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (OooO0O0() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    OooO00o();
                    throw th;
                }
            } else {
                C7386o0OOO0o0.m18915OooO00o().execute(runnable);
            }
            OooO00o();
        }
    }

    public C7386o0OOO0o0() {
        this.f20152OooO00o = !m18917OooO00o() ? Executors.newCachedThreadPool() : C7384o0OOO0Oo.m18912OooO00o();
        this.f20153OooO00o = Executors.newSingleThreadScheduledExecutor();
        this.f20151OooO00o = new OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18917OooO00o() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ExecutorService m18915OooO00o() {
        return OooO00o.f20152OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ScheduledExecutorService m18916OooO00o() {
        return OooO00o.f20153OooO00o;
    }

    public static Executor OooO00o() {
        return OooO00o.f20151OooO00o;
    }
}
