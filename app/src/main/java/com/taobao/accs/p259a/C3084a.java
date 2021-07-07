package com.taobao.accs.p259a;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3194w;

/* renamed from: com.taobao.accs.a.a */
public class C3084a {
    public static final String TAG = "a";

    /* renamed from: a */
    public static void m7226a(Context context, Intent intent) {
        if (context == null || intent == null) {
            ALog.m7599e(TAG, "dispatchIntent context or intent is null", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (C3194w.m7715a(applicationContext)) {
                ALog.m7600i(TAG, "dispatchIntent bind service start", "intent", intent.toString());
                applicationContext.bindService(intent, new ServiceConnectionC3085b(intent, applicationContext), 1);
                return;
            }
            ALog.m7600i(TAG, "dispatchIntent start service ", new Object[0]);
            applicationContext.startService(intent);
        } catch (Exception e) {
            ALog.m7599e(TAG, "dispatchIntent method call with exception ", e.toString());
            e.printStackTrace();
        }
    }
}
