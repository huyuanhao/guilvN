package com.umeng.message.util;

import android.content.Context;
import com.alibaba.sdk.android.httpdns.HttpDns;
import com.alibaba.sdk.android.httpdns.HttpDnsService;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MsgConstant;

/* renamed from: com.umeng.message.util.b */
public class C3892b {

    /* renamed from: a */
    public static final String f10596a = "b";

    /* renamed from: b */
    public static final int f10597b = 100;

    /* renamed from: a */
    public static void m10699a(Context context) {
        HttpDns.getService(context, MsgConstant.ACCOUNT_ID).setExpiredIPEnabled(true);
    }

    /* renamed from: a */
    public static String m10698a(Context context, String str) {
        String str2 = null;
        try {
            HttpDnsService service = HttpDns.getService(context, MsgConstant.ACCOUNT_ID);
            do {
                str2 = service.getIpByHostAsync(str);
                Thread.sleep(100);
            } while (str2 == null);
        } catch (InterruptedException unused) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10596a, 0, "Thread interrupted exception");
        }
        return str2;
    }
}
