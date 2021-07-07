package com.p118pd.sdk;

import android.content.Context;
import android.util.Log;
import java.lang.Thread;

/* renamed from: com.pd.sdk.ooO0oO  reason: case insensitive filesystem */
public class C8869ooO0oO {

    /* renamed from: com.pd.sdk.ooO0oO$OooO00o */
    public static class OooO00o implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f22077OooO00o;

        public OooO00o(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.OooO00o = context;
            this.f22077OooO00o = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            try {
                String stackTraceString = Log.getStackTraceString(th);
                if (stackTraceString.contains("com.netease") && stackTraceString.contains("nim")) {
                    AbstractC8796ooO0000o.OooO0O0("APP", "************* crash *************\n** Thread: " + this.OooO00o.getPackageName() + C8932ooOOO0o.OooO0OO + thread.getName() + " **", th);
                }
            } catch (Throwable unused) {
            }
            this.f22077OooO00o.uncaughtException(thread, th);
        }
    }

    public static void OooO00o(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new OooO00o(context, Thread.getDefaultUncaughtExceptionHandler()));
    }
}
