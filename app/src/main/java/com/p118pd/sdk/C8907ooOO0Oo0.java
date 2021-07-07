package com.p118pd.sdk;

import android.content.Context;
import android.os.Process;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOO0Oo0  reason: case insensitive filesystem */
public class C8907ooOO0Oo0 implements Thread.UncaughtExceptionHandler {
    public static final String OooO00o = "CrashHandler";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22112OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Thread.UncaughtExceptionHandler f22113OooO00o;

    /* renamed from: com.pd.sdk.ooOO0Oo0$OooO0O0 */
    public static class OooO0O0 {
        public static final C8907ooOO0Oo0 OooO00o = new C8907ooOO0Oo0();
    }

    public static C8907ooOO0Oo0 OooO00o() {
        return OooO0O0.OooO00o;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        Map<String, String> OooO00o2 = C8916ooOO0oO.OooO00o(this.f22112OooO00o, stringWriter.toString());
        OooO00o2.put("processName", C8937ooOOOO0.OooO00o(this.f22112OooO00o));
        LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
        sharedInstance.recordError(LogCategory.APPLICATION, LogApplicationType.CRASH.getValue(), true, OooO00o2);
        sharedInstance.recordInfo(LogCategory.APPLICATION, LogApplicationType.SESSION_END.getValue(), true, (Map<String, String>) null);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!C8937ooOOOO0.m20596OooO00o(this.f22112OooO00o) || (uncaughtExceptionHandler = this.f22113OooO00o) == null) {
            Process.killProcess(Process.myPid());
            System.exit(0);
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public C8907ooOO0Oo0() {
    }

    public void OooO00o(Context context) {
        this.f22112OooO00o = context;
        this.f22113OooO00o = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20543OooO00o() {
        if (this.f22112OooO00o != null) {
            this.f22112OooO00o = null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f22113OooO00o;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            this.f22113OooO00o = null;
        }
    }
}
