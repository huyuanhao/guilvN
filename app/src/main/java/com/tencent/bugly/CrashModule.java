package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.C3287c;
import com.tencent.bugly.proguard.C3321an;

public class CrashModule extends AbstractC3215a {
    public static final int MODULE_ID = 1004;

    /* renamed from: c */
    public static int f7316c;

    /* renamed from: e */
    public static CrashModule f7317e = new CrashModule();

    /* renamed from: a */
    public long f7318a;

    /* renamed from: b */
    public BuglyStrategy.C3214a f7319b;

    /* renamed from: d */
    public boolean f7320d = false;

    /* renamed from: a */
    private synchronized void m7738a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy != null) {
            String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
            if (!TextUtils.isEmpty(libBuglySOFilePath)) {
                C3269a.m7965a(context).f7695s = libBuglySOFilePath;
                C3321an.m8349a("setted libBugly.so file path :%s", libBuglySOFilePath);
            }
            if (buglyStrategy.getCrashHandleCallback() != null) {
                this.f7319b = buglyStrategy.getCrashHandleCallback();
                C3321an.m8349a("setted CrashHanldeCallback", new Object[0]);
            }
            if (buglyStrategy.getAppReportDelay() > 0) {
                long appReportDelay = buglyStrategy.getAppReportDelay();
                this.f7318a = appReportDelay;
                C3321an.m8349a("setted delay: %d", Long.valueOf(appReportDelay));
            }
        }
    }

    public static CrashModule getInstance() {
        CrashModule crashModule = f7317e;
        crashModule.f7321id = 1004;
        return crashModule;
    }

    @Override // com.tencent.bugly.AbstractC3215a
    public String[] getTables() {
        return new String[]{"t_cr"};
    }

    public synchronized boolean hasInitialized() {
        return this.f7320d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    @Override // com.tencent.bugly.AbstractC3215a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void init(android.content.Context r12, boolean r13, com.tencent.bugly.BuglyStrategy r14) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.CrashModule.init(android.content.Context, boolean, com.tencent.bugly.BuglyStrategy):void");
    }

    @Override // com.tencent.bugly.AbstractC3215a
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        C3287c a;
        if (strategyBean != null && (a = C3287c.m8145a()) != null) {
            a.mo38254a(strategyBean);
        }
    }
}
