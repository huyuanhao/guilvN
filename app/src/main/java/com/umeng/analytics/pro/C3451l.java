package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread;

/* renamed from: com.umeng.analytics.pro.l */
public class C3451l implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f8760a;

    /* renamed from: b */
    public AbstractC3459p f8761b;

    public C3451l() {
        if (Thread.getDefaultUncaughtExceptionHandler() != this) {
            this.f8760a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* renamed from: a */
    public void mo38759a(AbstractC3459p pVar) {
        this.f8761b = pVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        m8853a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8760a;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != Thread.getDefaultUncaughtExceptionHandler()) {
            this.f8760a.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private void m8853a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f8761b.mo38648a(th);
        } else {
            this.f8761b.mo38648a(null);
        }
    }
}
