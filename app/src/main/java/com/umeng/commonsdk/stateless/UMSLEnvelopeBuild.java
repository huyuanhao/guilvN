package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.framework.C3516a;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.C3555ac;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.C3676e;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONObject;

public class UMSLEnvelopeBuild {
    public static final String TAG = "UMSLEnvelopeBuild";
    public static String cacheSystemheader;
    public static boolean isEncryptEnabled;
    public static Context mContext;
    public static String module;

    private synchronized C3648c constructEnvelope(Context context, byte[] bArr) {
        C3648c cVar;
        int i = -1;
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "slcodex", null);
        ULog.m9832i("walle", "[stateless] build envelope, codexStr is " + imprintProperty);
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e) {
            UMCrashManager.reportCrash(context, e);
        }
        if (i == 0) {
            ULog.m9832i("walle", "[stateless] build envelope, codexValue is 0");
            cVar = C3648c.m9740a(context, UMUtils.getAppkey(context), bArr);
        } else if (i == 1) {
            ULog.m9832i("walle", "[stateless] build envelope, codexValue is 1");
            cVar = C3648c.m9742b(context, UMUtils.getAppkey(context), bArr);
        } else if (isEncryptEnabled) {
            ULog.m9832i("walle", "[stateless] build envelope, isEncryptEnabled is true");
            cVar = C3648c.m9742b(context, UMUtils.getAppkey(context), bArr);
        } else {
            ULog.m9832i("walle", "[stateless] build envelope, isEncryptEnabled is false");
            cVar = C3648c.m9740a(context, UMUtils.getAppkey(context), bArr);
        }
        return cVar;
    }

    public static boolean isReadyBuildNew(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        return C3516a.m9030b();
    }

    private synchronized JSONObject makeErrorResult(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    public static void setEncryptEnabled(boolean z) {
        isEncryptEnabled = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONObject buildSLBaseHeader(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 706
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.UMSLEnvelopeBuild.buildSLBaseHeader(android.content.Context):org.json.JSONObject");
    }

    public synchronized JSONObject buildSLEnvelope(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        C3648c cVar;
        String str2;
        ULog.m9832i("walle", "[stateless] build envelope, heade is " + jSONObject.toString());
        ULog.m9832i("walle", "[stateless] build envelope, body is " + jSONObject2.toString());
        ULog.m9832i("walle", "[stateless] build envelope, thread is " + Thread.currentThread());
        if (context == null || jSONObject == null || jSONObject2 == null || str == null) {
            ULog.m9832i("walle", "[stateless] build envelope, context is null or header is null or body is null");
            return makeErrorResult(110, null);
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (!(jSONObject == null || jSONObject2 == null)) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!(next == null || !(next instanceof String) || (str2 = next) == null || jSONObject2.opt(str2) == null)) {
                        try {
                            jSONObject.put(str2, jSONObject2.opt(str2));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (jSONObject != null) {
                try {
                    C3676e a = C3676e.m9914a(applicationContext);
                    if (a != null) {
                        a.mo39246a();
                        String encodeToString = Base64.encodeToString(new C3555ac().mo38869a(a.mo39248b()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("header");
                            jSONObject3.put(C3617o.f9335V, encodeToString);
                            jSONObject.put("header", jSONObject3);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject == null || !C3653f.m9765a((long) jSONObject.toString().getBytes().length, C3640a.f9474c)) {
                ULog.m9832i("walle", "[stateless] build envelope, json size is " + jSONObject.toString().getBytes().length);
                if (jSONObject != null) {
                    cVar = constructEnvelope(applicationContext, jSONObject.toString().getBytes());
                    if (cVar == null) {
                        ULog.m9832i("walle", "[stateless] build envelope, envelope is null !!!!");
                        return makeErrorResult(111, jSONObject);
                    }
                } else {
                    cVar = null;
                }
                if (cVar == null || !C3653f.m9765a((long) cVar.mo39168b().length, C3640a.f9475d)) {
                    if (!C3653f.m9766a(applicationContext, Base64.encodeToString(str.getBytes(), 0), Base64.encodeToString((str + "_" + System.currentTimeMillis()).getBytes(), 0), cVar.mo39168b())) {
                        ULog.m9832i("walle", "[stateless] build envelope, save fail ----->>>>>");
                        return makeErrorResult(101, jSONObject);
                    }
                    ULog.m9832i("walle", "[stateless] build envelope, save ok ----->>>>>");
                    ULog.m9832i("walle", "[stateless] envelope file size is " + jSONObject.toString().getBytes().length);
                    new C3649d(applicationContext);
                    C3649d.m9753b(273);
                    ULog.m9832i("walle", "[stateless] build envelope end, thread is " + Thread.currentThread());
                    return jSONObject;
                }
                ULog.m9832i("walle", "[stateless] build envelope, envelope overstep!!!! size is " + cVar.mo39168b().length);
                return makeErrorResult(114, jSONObject);
            }
            ULog.m9832i("walle", "[stateless] build envelope, json overstep!!!! size is " + jSONObject.toString().getBytes().length);
            return makeErrorResult(113, jSONObject);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            ULog.m9832i("walle", "build envelope end, thread is " + Thread.currentThread());
            return makeErrorResult(110, null);
        }
    }
}
