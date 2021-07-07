package com.qiyukf.unicorn.p232k;

import android.content.Context;
import android.util.Log;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.analytics.C2379a;
import java.lang.Thread;

/* renamed from: com.qiyukf.unicorn.k.j */
public final class C2711j {
    /* renamed from: a */
    public static void m6271a(final Context context) {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            /* class com.qiyukf.unicorn.p232k.C2711j.C27121 */

            public final void uncaughtException(Thread thread, Throwable th) {
                try {
                    if (Log.getStackTraceString(th).contains("com.qiyukf")) {
                        C1709a.m3015b("APP", "************* crash *************\n** Thread: " + context.getPackageName() + C8932ooOOO0o.OooO0OO + thread.getName() + " **", th);
                        C2379a.m5204b(th);
                    }
                } catch (Throwable unused) {
                }
                defaultUncaughtExceptionHandler.uncaughtException(thread, th);
            }
        });
    }
}
