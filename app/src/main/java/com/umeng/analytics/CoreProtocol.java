package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.C3445k;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

public class CoreProtocol implements UMLogDataProtocol, UMSenderStateNotify {

    /* renamed from: a */
    public static Context f8360a;

    /* renamed from: com.umeng.analytics.CoreProtocol$a */
    public static class C3401a {

        /* renamed from: a */
        public static final CoreProtocol f8361a = new CoreProtocol();
    }

    public static CoreProtocol getInstance(Context context) {
        if (f8360a == null && context != null) {
            f8360a = context.getApplicationContext();
        }
        return C3401a.f8361a;
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onConnectionAvailable() {
        C3445k.m8798a(f8360a).mo38734a();
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onSenderIdle() {
        C3445k.m8798a(f8360a).mo38741b();
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        C3445k.m8798a(f8360a).mo38735a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return C3445k.m8798a(f8360a).mo38733a(j);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        C3445k.m8798a(f8360a).mo38736a(obj, i);
    }

    public CoreProtocol() {
    }
}
