package com.megvii.meglive_sdk.volley;

import android.os.SystemClock;
import android.util.Log;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.megvii.meglive_sdk.volley.u */
public class C1654u {

    /* renamed from: a */
    public static String f2956a = "Volley";

    /* renamed from: b */
    public static boolean f2957b = Log.isLoggable("Volley", 2);

    /* renamed from: a */
    public static void m2872a(String str, Object... objArr) {
        if (f2957b) {
            m2876e(str, objArr);
        }
    }

    /* renamed from: b */
    public static void m2873b(String str, Object... objArr) {
        m2876e(str, objArr);
    }

    /* renamed from: c */
    public static void m2874c(String str, Object... objArr) {
        m2876e(str, objArr);
    }

    /* renamed from: d */
    public static void m2875d(String str, Object... objArr) {
        m2876e(str, objArr);
    }

    /* renamed from: e */
    public static String m2876e(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClass().equals(C1654u.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + C9058ooOoOoOO.OooOO0 + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: com.megvii.meglive_sdk.volley.u$OooO00o */
    public static class OooO00o {
        public static final boolean OooO0O0 = C1654u.f2957b;
        public final List<C4906OooO00o> OooO00o = new ArrayList();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f15119OooO00o = false;

        /* renamed from: com.megvii.meglive_sdk.volley.u$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4906OooO00o {
            public final long OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final String f15120OooO00o;
            public final long OooO0O0;

            public C4906OooO00o(String str, long j, long j2) {
                this.f15120OooO00o = str;
                this.OooO00o = j;
                this.OooO0O0 = j2;
            }
        }

        public final synchronized void OooO00o(String str, long j) {
            if (!this.f15119OooO00o) {
                this.OooO00o.add(new C4906OooO00o(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public final void finalize() {
            if (!this.f15119OooO00o) {
                OooO00o("Request on the loose");
                C1654u.m2874c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        public final synchronized void OooO00o(String str) {
            long j;
            this.f15119OooO00o = true;
            if (this.OooO00o.size() == 0) {
                j = 0;
            } else {
                j = this.OooO00o.get(this.OooO00o.size() - 1).OooO0O0 - this.OooO00o.get(0).OooO0O0;
            }
            if (j > 0) {
                long j2 = this.OooO00o.get(0).OooO0O0;
                C1654u.m2873b("(%-4d ms) %s", Long.valueOf(j), str);
                for (C4906OooO00o oooO00o : this.OooO00o) {
                    long j3 = oooO00o.OooO0O0;
                    C1654u.m2873b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(oooO00o.OooO00o), oooO00o.f15120OooO00o);
                    j2 = j3;
                }
            }
        }
    }
}
