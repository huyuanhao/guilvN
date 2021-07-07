package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.alibaba.sdk.android.httpdns.m */
public class CallableC0304m implements Callable<String[]> {

    /* renamed from: a */
    public static Context f658a;

    /* renamed from: a */
    public static final Object f659a = new Object();
    public static C0271d hostManager = C0271d.mo3973a();

    /* renamed from: a */
    public EnumC0312o f660a;

    /* renamed from: d */
    public int f661d = 1;

    /* renamed from: d */
    public long f662d = 0;

    /* renamed from: e */
    public String f663e = null;

    /* renamed from: e */
    public boolean f664e = false;

    /* renamed from: e */
    public String[] f665e = C0296f.f647d;
    public String hostName;

    public CallableC0304m(String str, EnumC0312o oVar) {
        this.hostName = str;
        this.f660a = oVar;
    }

    public static void setContext(Context context) {
        f658a = context;
    }

    /* renamed from: a */
    public void mo4025a(int i) {
        if (i >= 0) {
            this.f661d = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x03c8 A[Catch:{ all -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03d1 A[Catch:{ all -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x03e6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] call() {
        /*
        // Method dump skipped, instructions count: 1041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.CallableC0304m.call():java.lang.String[]");
    }
}
