package com.umeng.message.inapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MsgConstant;
import com.umeng.message.UTrack;
import com.umeng.message.common.C3780d;
import com.umeng.message.common.impl.json.JUtrack;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.C3819h;
import java.io.File;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.message.inapp.d */
public class C3807d {

    /* renamed from: a */
    public static final String f10283a = "com.umeng.message.inapp.d";

    /* renamed from: c */
    public static boolean f10284c;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    public static C3807d f10285d;

    /* renamed from: b */
    public Context f10286b;

    public C3807d(Context context) {
        this.f10286b = context.getApplicationContext();
    }

    /* renamed from: c */
    private void m10470c() {
        if (f10284c) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10283a, 2, "sendInAppCacheLog已经在队列里，忽略该请求");
            return;
        }
        f10284c = true;
        UMLog uMLog2 = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f10283a, 2, "sendInAppCacheLog开始");
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.inapp.C3807d.RunnableC38114 */

            public void run() {
                try {
                    Iterator<C3803a> it = InAppMessageManager.getInstance(C3807d.this.f10286b).mo39808j().iterator();
                    while (it.hasNext()) {
                        C3803a next = it.next();
                        JSONObject b = C3807d.this.m10469b(next.f10257b, next.f10258c, next.f10259d, next.f10260e, next.f10261f, next.f10262g, next.f10263h, next.f10264i, next.f10265j);
                        if (b != null && TextUtils.equals(b.getString("success"), "ok")) {
                            InAppMessageManager.getInstance(C3807d.this.f10286b).mo39805h(next.f10257b);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    boolean unused = C3807d.f10284c = false;
                    throw th;
                }
                boolean unused2 = C3807d.f10284c = false;
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private JSONObject m10468b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", UTrack.getInstance(this.f10286b).getHeader());
        if (InAppMessageManager.f10168a) {
            jSONObject.put(MsgConstant.KEY_INAPP_PMODE, "0");
        } else {
            jSONObject.put(MsgConstant.KEY_INAPP_PMODE, "1");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C3807d m10462a(Context context) {
        if (f10285d == null) {
            synchronized (C3807d.class) {
                if (f10285d == null) {
                    f10285d = new C3807d(context.getApplicationContext());
                }
            }
        }
        return f10285d;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private JSONObject m10469b(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", UTrack.getInstance(this.f10286b).getHeader());
        jSONObject.put("msg_id", str);
        jSONObject.put(MsgConstant.INAPP_MSG_TYPE, i);
        jSONObject.put(MsgConstant.INAPP_NUM_DISPLAY, i2);
        jSONObject.put(MsgConstant.INAPP_NUM_OPEN_FULL, i3);
        jSONObject.put(MsgConstant.INAPP_NUM_OPEN_TOP, i4);
        jSONObject.put(MsgConstant.INAPP_NUM_OPEN_BUTTOM, i5);
        jSONObject.put(MsgConstant.INAPP_NUM_CLOSE, i6);
        jSONObject.put(MsgConstant.INAPP_NUM_DURATION, i7);
        jSONObject.put(MsgConstant.INAPP_NUM_CUSTOM, i8);
        return JUtrack.sendRequest(jSONObject, MsgConstant.STATS_ENDPOINT);
    }

    /* renamed from: a */
    public void mo39862a(final IUmengInAppMessageCallback iUmengInAppMessageCallback) {
        m10470c();
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.inapp.C3807d.RunnableC38081 */

            public void run() {
                UInAppMessage uInAppMessage;
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(C3807d.f10283a, 2, "get splash message begin");
                try {
                    JSONObject sendRequest = JUtrack.sendRequest(C3807d.this.m10468b(), MsgConstant.SPLASH_MSG_ENDPOINT);
                    if (sendRequest != null && TextUtils.equals(sendRequest.getString("success"), "ok")) {
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(C3807d.f10283a, 2, "get splash message success" + sendRequest);
                        JSONObject jSONObject = sendRequest.getJSONObject("data");
                        InAppMessageManager.f10169b = jSONObject.getInt("pduration") * 1000;
                        InAppMessageManager.f10170c = jSONObject.getInt("sduration") * 1000;
                        iUmengInAppMessageCallback.onSplashMessage(new UInAppMessage(jSONObject.getJSONObject("launch")));
                        InAppMessageManager.getInstance(C3807d.this.f10286b).mo39793c();
                    } else if (sendRequest == null || !TextUtils.equals(sendRequest.getString("success"), "fail") || !TextUtils.equals(sendRequest.getString("error"), "no message")) {
                        iUmengInAppMessageCallback.onSplashMessage(null);
                    } else {
                        String e = InAppMessageManager.getInstance(C3807d.this.f10286b).mo39797e();
                        if (!TextUtils.isEmpty(e)) {
                            try {
                                uInAppMessage = new UInAppMessage(new JSONObject(e));
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                                uInAppMessage = null;
                            }
                            if (uInAppMessage != null) {
                                InAppMessageManager.getInstance(C3807d.this.f10286b).mo39785a(new File(C3819h.m10564d(C3807d.this.f10286b, uInAppMessage.msg_id)));
                                InAppMessageManager.getInstance(C3807d.this.f10286b).mo39783a((UInAppMessage) null);
                            }
                        }
                    }
                } catch (Exception e3) {
                    iUmengInAppMessageCallback.onSplashMessage(null);
                    e3.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo39864a(final String str, final IUmengInAppMessageCallback iUmengInAppMessageCallback) {
        m10470c();
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.inapp.C3807d.RunnableC38092 */

            public void run() {
                UInAppMessage uInAppMessage;
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(C3807d.f10283a, 2, "get card message begin");
                try {
                    JSONObject b = C3807d.this.m10468b();
                    b.put("label", str);
                    JSONObject sendRequest = JUtrack.sendRequest(b, MsgConstant.CARD_MSG_ENDPOINT);
                    if (sendRequest != null && TextUtils.equals(sendRequest.getString("success"), "ok")) {
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(C3807d.f10283a, 2, "get card message success" + sendRequest);
                        JSONObject jSONObject = sendRequest.getJSONObject("data");
                        InAppMessageManager.f10169b = jSONObject.getInt("pduration") * 1000;
                        InAppMessageManager.f10170c = jSONObject.getInt("sduration") * 1000;
                        iUmengInAppMessageCallback.onCardMessage(new UInAppMessage(jSONObject.getJSONObject("card")));
                        InAppMessageManager.getInstance(C3807d.this.f10286b).mo39786a(b.optString("label", ""));
                    } else if (sendRequest == null || !TextUtils.equals(sendRequest.getString("success"), "fail") || !TextUtils.equals(sendRequest.getString("error"), "no message")) {
                        iUmengInAppMessageCallback.onCardMessage(null);
                    } else {
                        String c = InAppMessageManager.getInstance(C3807d.this.f10286b).mo39792c(str);
                        if (!TextUtils.isEmpty(c)) {
                            try {
                                uInAppMessage = new UInAppMessage(new JSONObject(c));
                            } catch (JSONException e) {
                                e.printStackTrace();
                                uInAppMessage = null;
                            }
                            if (uInAppMessage != null) {
                                InAppMessageManager.getInstance(C3807d.this.f10286b).mo39785a(new File(C3819h.m10564d(C3807d.this.f10286b, uInAppMessage.msg_id)));
                                InAppMessageManager.getInstance(C3807d.this.f10286b).mo39784a((UInAppMessage) null, str);
                            }
                        }
                    }
                } catch (Exception e2) {
                    iUmengInAppMessageCallback.onCardMessage(null);
                    e2.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo39863a(final String str, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7, final int i8) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.inapp.C3807d.RunnableC38103 */

            public void run() {
                try {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(C3807d.f10283a, 2, "track in app msg begin");
                    JSONObject b = C3807d.this.m10469b(str, i, i2, i3, i4, i5, i6, i7, i8);
                    if (b != null && TextUtils.equals(b.getString("success"), "ok")) {
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(C3807d.f10283a, 2, "track in app msg success");
                    }
                } catch (Exception e) {
                    InAppMessageManager.getInstance(C3807d.this.f10286b).mo39788a(str, i, i2, i3, i4, i5, i6, i7, i8);
                    e.printStackTrace();
                }
            }
        });
    }
}
