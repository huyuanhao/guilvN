package com.umeng.commonsdk.framework;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.framework.c */
public class C3521c {

    /* renamed from: a */
    public static final String f9013a = "content";

    /* renamed from: b */
    public static final String f9014b = "header";

    /* renamed from: c */
    public static final String f9015c = "exception";

    /* renamed from: d */
    public static HandlerThread f9016d = null;

    /* renamed from: e */
    public static Handler f9017e = null;

    /* renamed from: f */
    public static C3517b f9018f = null;

    /* renamed from: g */
    public static Object f9019g = new Object();

    /* renamed from: h */
    public static final int f9020h = 768;

    /* renamed from: i */
    public static final int f9021i = 769;

    /* renamed from: j */
    public static final int f9022j = 770;

    /* renamed from: k */
    public static final int f9023k = 784;

    /* renamed from: d */
    public static void m9067d() {
        JSONObject buildEnvelopeWithExtHeader;
        ULog.m9817d("--->>> delayProcess Enter...");
        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> delayProcess Enter...");
        Context appContext = UMModuleRegister.getAppContext();
        if (appContext != null && UMFrUtils.isOnline(appContext)) {
            long maxDataSpace = UMEnvelopeBuild.maxDataSpace(appContext);
            UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName("analytics");
            JSONObject jSONObject = null;
            if (callbackFromModuleName != null) {
                try {
                    jSONObject = callbackFromModuleName.setupReportData(maxDataSpace);
                    if (jSONObject == null) {
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> analyticsCB.setupReportData() return null");
                        return;
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                    return;
                }
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.opt("header");
                JSONObject jSONObject3 = (JSONObject) jSONObject.opt("content");
                if (appContext != null && jSONObject2 != null && jSONObject3 != null && (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(appContext, jSONObject2, jSONObject3)) != null) {
                    try {
                        if (buildEnvelopeWithExtHeader.has("exception")) {
                            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> autoProcess: Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                        }
                    } catch (Throwable unused) {
                    }
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> autoProcess: removeCacheData ... ");
                    callbackFromModuleName.removeCacheData(buildEnvelopeWithExtHeader);
                }
            }
        }
    }

    /* renamed from: e */
    public static synchronized void m9068e() {
        synchronized (C3521c.class) {
            ULog.m9817d("--->>> Dispatch: init Enter...");
            try {
                if (f9016d == null) {
                    HandlerThread handlerThread = new HandlerThread("work_thread");
                    f9016d = handlerThread;
                    handlerThread.start();
                    if (f9017e == null) {
                        f9017e = new Handler(f9016d.getLooper()) {
                            /* class com.umeng.commonsdk.framework.C3521c.HandlerC35221 */

                            public void handleMessage(Message message) {
                                int i = message.what;
                                if (i == 768) {
                                    C3521c.m9065b(message);
                                } else if (i == 770) {
                                    C3521c.m9067d();
                                } else if (i == 784) {
                                    C3521c.m9070g();
                                }
                            }
                        };
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
            ULog.m9817d("--->>> Dispatch: init Exit...");
        }
    }

    /* renamed from: f */
    public static void m9069f() {
        if (f9016d != null) {
            f9016d = null;
        }
        if (f9017e != null) {
            f9017e = null;
        }
        if (f9018f != null) {
            f9018f = null;
        }
    }

    /* renamed from: g */
    public static void m9070g() {
        if (f9018f != null && f9016d != null) {
            C3517b.m9042c();
            ULog.m9817d("--->>> handleQuit: Quit dispatch thread.");
            f9016d.quit();
            m9069f();
        }
    }

    /* renamed from: a */
    public static void m9062a(UMSenderStateNotify uMSenderStateNotify) {
        if (f9018f != null) {
            C3517b.m9037a(uMSenderStateNotify);
        }
    }

    /* renamed from: b */
    public static void m9065b(Message message) {
        int i = message.arg1;
        Object obj = message.obj;
        UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName(UMModuleRegister.eventType2ModuleName(i));
        if (callbackFromModuleName != null) {
            ULog.m9817d("--->>> dispatch:handleEvent: call back workEvent with msg type [ 0x" + Integer.toHexString(i) + "]");
            callbackFromModuleName.workEvent(obj, i);
        }
    }

    /* renamed from: a */
    public static void m9060a(Context context, int i, UMLogDataProtocol uMLogDataProtocol, Object obj) {
        if (context == null || uMLogDataProtocol == null) {
            ULog.m9817d("--->>> Context or UMLogDataProtocol parameter cannot be null!");
            return;
        }
        UMModuleRegister.registerAppContext(context.getApplicationContext());
        if (UMModuleRegister.registerCallback(i, uMLogDataProtocol)) {
            if (f9016d == null || f9017e == null) {
                m9068e();
            }
            try {
                if (f9017e != null) {
                    if (UMGlobalContext.getInstance().isMainProcess(context)) {
                        synchronized (f9019g) {
                            if (f9018f == null) {
                                UMFrUtils.syncLegacyEnvelopeIfNeeded(context);
                                f9018f = new C3517b(context, f9017e);
                            }
                        }
                    }
                    Message obtainMessage = f9017e.obtainMessage();
                    obtainMessage.what = 768;
                    obtainMessage.arg1 = i;
                    obtainMessage.obj = obj;
                    f9017e.sendMessage(obtainMessage);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    /* renamed from: a */
    public static void m9059a(long j) {
        Handler handler = f9017e;
        if (handler == null) {
            return;
        }
        if (handler.hasMessages(770)) {
            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> MSG_DELAY_PROCESS has exist. do nothing.");
            return;
        }
        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> MSG_DELAY_PROCESS not exist. send it.");
        Message obtainMessage = f9017e.obtainMessage();
        obtainMessage.what = 770;
        f9017e.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: a */
    public static synchronized boolean m9063a(int i) {
        synchronized (C3521c.class) {
            if (f9017e == null) {
                return false;
            }
            return f9017e.hasMessages(i);
        }
    }

    /* renamed from: a */
    public static void m9058a() {
        Handler handler = f9017e;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 784;
            f9017e.sendMessage(obtainMessage);
        }
    }
}
