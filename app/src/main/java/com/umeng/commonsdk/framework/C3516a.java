package com.umeng.commonsdk.framework;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.C3657b;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.framework.a */
public class C3516a {

    /* renamed from: a */
    public static boolean f8987a;

    /* renamed from: a */
    public static long m9022a(Context context) {
        if (context == null) {
            return 0;
        }
        return UMFrUtils.getLastSuccessfulBuildTime(context.getApplicationContext());
    }

    /* renamed from: b */
    public static long m9029b(Context context) {
        if (context == null) {
            return 0;
        }
        return UMFrUtils.getLastInstantBuildTime(context.getApplicationContext());
    }

    /* renamed from: c */
    public static long m9032c(Context context) {
        if (context == null) {
            return 0;
        }
        return C3657b.m9776a(context.getApplicationContext());
    }

    /* renamed from: a */
    public static boolean m9027a(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        if (!m9030b()) {
            return false;
        }
        return m9028a(context, uMBusinessType, false);
    }

    /* renamed from: b */
    public static boolean m9031b(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        return m9028a(context, uMBusinessType, false);
    }

    /* renamed from: b */
    public static synchronized boolean m9030b() {
        boolean z;
        synchronized (C3516a.class) {
            z = f8987a;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m9026a() {
        return m9030b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r4, r5) != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r4, r5) != false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9028a(android.content.Context r4, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r5, boolean r6) {
        /*
            if (r4 == 0) goto L_0x003d
            android.content.Context r4 = r4.getApplicationContext()
            boolean r0 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r4)
            int r1 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r4)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0036
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r6 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            if (r5 != r6) goto L_0x001f
            boolean r4 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r4, r5)
            if (r4 == 0) goto L_0x001d
        L_0x001c:
            goto L_0x002d
        L_0x001d:
            r6 = 1
            goto L_0x0036
        L_0x001f:
            boolean r6 = com.umeng.commonsdk.framework.C3517b.m9038a()
            if (r6 == 0) goto L_0x002f
            int r4 = com.umeng.commonsdk.framework.C3517b.m9040b()
            long r4 = (long) r4
            com.umeng.commonsdk.framework.C3521c.m9059a(r4)
        L_0x002d:
            r6 = 0
            goto L_0x0036
        L_0x002f:
            boolean r4 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r4, r5)
            if (r4 == 0) goto L_0x001d
            goto L_0x001c
        L_0x0036:
            if (r0 == 0) goto L_0x003d
            if (r1 <= 0) goto L_0x003d
            com.umeng.commonsdk.framework.C3517b.m9044d()
        L_0x003d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.C3516a.m9028a(android.content.Context, com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType, boolean):boolean");
    }

    /* renamed from: a */
    public static JSONObject m9024a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONException e;
        ULog.m9817d("--->>> buildEnvelopeFile Enter.");
        if (UMGlobalContext.getInstance().isMainProcess(context)) {
            return new C3657b().mo39177a(context.getApplicationContext(), jSONObject, jSONObject2);
        }
        try {
            jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("exception", 101);
            } catch (JSONException e2) {
                e = e2;
            }
        } catch (JSONException e3) {
            jSONObject3 = null;
            e = e3;
            e.printStackTrace();
            return jSONObject3;
        }
        return jSONObject3;
    }

    /* renamed from: a */
    public static String m9023a(Context context, String str, String str2) {
        return context == null ? str2 : ImprintHandler.getImprintService(context.getApplicationContext()).mo39228c().mo39233a(str, str2);
    }

    /* renamed from: a */
    public static synchronized void m9025a(boolean z) {
        synchronized (C3516a.class) {
            f8987a = z;
        }
    }
}
