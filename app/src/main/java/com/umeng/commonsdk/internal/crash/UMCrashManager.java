package com.umeng.commonsdk.internal.crash;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.commonsdk.internal.C3523a;
import com.umeng.commonsdk.stateless.C3640a;
import com.umeng.commonsdk.stateless.C3653f;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class UMCrashManager {
    public static boolean isReportCrash;
    public static Object mObject = new Object();

    public static void reportCrash(final Context context, final Throwable th) {
        if (!isReportCrash) {
            ULog.m9832i("walle-crash", "report is " + isReportCrash);
            new Thread(new Runnable() {
                /* class com.umeng.commonsdk.internal.crash.UMCrashManager.RunnableC35261 */

                public void run() {
                    try {
                        synchronized (UMCrashManager.mObject) {
                            if (!(context == null || th == null || UMCrashManager.isReportCrash)) {
                                boolean unused = UMCrashManager.isReportCrash = true;
                                ULog.m9832i("walle-crash", "report thread is " + UMCrashManager.isReportCrash);
                                String a = C3527a.m9076a(th);
                                if (!TextUtils.isEmpty(a)) {
                                    C3653f.m9764a(context, context.getFilesDir() + C8932ooOOO0o.OooO0OO + C3640a.f9476e + C8932ooOOO0o.OooO0OO + Base64.encodeToString(C3523a.f9024a.getBytes(), 0), 10);
                                    UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                                    JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(context);
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("content", a);
                                        jSONObject.put("ts", System.currentTimeMillis());
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("crash", jSONObject);
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(SocializeProtocolConstants.PROTOCOL_KEY_REQUEST_TYPE, jSONObject2);
                                        JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(context, buildSLBaseHeader, jSONObject3, C3523a.f9024a);
                                        if (buildSLEnvelope != null) {
                                            buildSLEnvelope.has("exception");
                                        }
                                    } catch (JSONException unused2) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }).start();
        }
    }
}
