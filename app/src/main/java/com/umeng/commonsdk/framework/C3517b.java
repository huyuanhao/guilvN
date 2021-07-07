package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C3524b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.C3658c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.umeng.commonsdk.framework.b */
public class C3517b implements UMImprintChangeCallback {

    /* renamed from: a */
    public static HandlerThread f8988a = null;

    /* renamed from: b */
    public static Handler f8989b = null;

    /* renamed from: c */
    public static Handler f8990c = null;

    /* renamed from: d */
    public static final int f8991d = 200;

    /* renamed from: e */
    public static final int f8992e = 273;

    /* renamed from: f */
    public static final int f8993f = 274;

    /* renamed from: g */
    public static final int f8994g = 512;

    /* renamed from: h */
    public static final int f8995h = 769;

    /* renamed from: i */
    public static FileObserverC3520a f8996i = null;

    /* renamed from: j */
    public static ConnectivityManager f8997j = null;

    /* renamed from: k */
    public static NetworkInfo f8998k = null;

    /* renamed from: l */
    public static IntentFilter f8999l = null;

    /* renamed from: m */
    public static boolean f9000m = false;

    /* renamed from: n */
    public static ArrayList<UMSenderStateNotify> f9001n = null;

    /* renamed from: o */
    public static Object f9002o = new Object();

    /* renamed from: p */
    public static final String f9003p = "report_policy";

    /* renamed from: q */
    public static final String f9004q = "report_interval";

    /* renamed from: r */
    public static boolean f9005r = false;

    /* renamed from: s */
    public static final int f9006s = 15000;

    /* renamed from: t */
    public static final int f9007t = 15;

    /* renamed from: u */
    public static final int f9008u = 90;

    /* renamed from: v */
    public static int f9009v = 15000;

    /* renamed from: w */
    public static Object f9010w = new Object();

    /* renamed from: x */
    public static BroadcastReceiver f9011x = new BroadcastReceiver() {
        /* class com.umeng.commonsdk.framework.C3517b.C35181 */

        public void onReceive(Context context, Intent intent) {
            int size;
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context appContext = UMModuleRegister.getAppContext();
                try {
                    if (C3517b.f8997j != null) {
                        NetworkInfo unused = C3517b.f8998k = C3517b.f8997j.getActiveNetworkInfo();
                        if (C3517b.f8998k == null || !C3517b.f8998k.isAvailable()) {
                            ULog.m9829i("--->>> network disconnected.");
                            boolean unused2 = C3517b.f9000m = false;
                            return;
                        }
                        ULog.m9829i("--->>> network isAvailable, check if there are any files to send.");
                        boolean unused3 = C3517b.f9000m = true;
                        synchronized (C3517b.f9002o) {
                            if (C3517b.f9001n != null && (size = C3517b.f9001n.size()) > 0) {
                                for (int i = 0; i < size; i++) {
                                    ((UMSenderStateNotify) C3517b.f9001n.get(i)).onConnectionAvailable();
                                }
                            }
                        }
                        C3517b.m9043c(273);
                        if (C3517b.f8998k.getType() == 1 && context != null) {
                            try {
                                if (!UMWorkDispatch.eventHasExist(32774)) {
                                    UMWorkDispatch.sendEvent(context, 32774, C3524b.m9071a(context).mo38849a(), null);
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
        }
    };

    /* renamed from: com.umeng.commonsdk.framework.b$a */
    public static class FileObserverC3520a extends FileObserver {
        public FileObserverC3520a(String str) {
            super(str);
        }

        public void onEvent(int i, String str) {
            if ((i & 8) == 8) {
                ULog.m9817d("--->>> envelope file created >>> " + str);
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
                C3517b.m9043c(273);
            }
        }
    }

    public C3517b(Context context, Handler handler) {
        Context appContext = UMModuleRegister.getAppContext();
        f8997j = (ConnectivityManager) appContext.getSystemService("connectivity");
        f8990c = handler;
        try {
            if (f8988a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f8988a = handlerThread;
                handlerThread.start();
                if (f8996i == null) {
                    FileObserverC3520a aVar = new FileObserverC3520a(UMFrUtils.getEnvelopeDirPath(context));
                    f8996i = aVar;
                    aVar.startWatching();
                    ULog.m9817d("--->>> FileMonitor has already started!");
                }
                if (DeviceConfig.checkPermission(appContext, "android.permission.ACCESS_NETWORK_STATE") && f8997j != null && f8999l == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    f8999l = intentFilter;
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    if (f9011x != null) {
                        appContext.registerReceiver(f9011x, f8999l);
                    }
                }
                m9053m();
                if (f8989b == null) {
                    f8989b = new Handler(f8988a.getLooper()) {
                        /* class com.umeng.commonsdk.framework.C3517b.HandlerC35192 */

                        public void handleMessage(Message message) {
                            int i = message.what;
                            if (i == 273) {
                                ULog.m9817d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                                C3517b.m9057q();
                            } else if (i == 274) {
                                C3517b.m9055o();
                            } else if (i == 512) {
                                C3517b.m9056p();
                            }
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f9003p, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f9004q, this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: b */
    public static int m9040b() {
        int i;
        synchronized (f9010w) {
            i = f9009v;
        }
        return i;
    }

    /* renamed from: c */
    public static void m9042c() {
    }

    /* renamed from: c */
    public static void m9043c(int i) {
        Handler handler;
        if (f9000m && (handler = f8989b) != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i;
            f8989b.sendMessage(obtainMessage);
        }
    }

    /* renamed from: d */
    public static void m9044d() {
        m9041b(273);
    }

    /* renamed from: e */
    public static void m9045e() {
        m9035a(274, 3000);
    }

    /* renamed from: m */
    private void m9053m() {
        synchronized (f9010w) {
            if (AgooConstants.ACK_BODY_NULL.equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f9003p, ""))) {
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f9005r = true;
                f9009v = f9006s;
                int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f9004q, AgooConstants.ACK_PACK_ERROR)).intValue();
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + intValue);
                if (intValue >= 15) {
                    if (intValue <= 90) {
                        f9009v = intValue * 1000;
                    }
                }
                f9009v = f9006s;
            } else {
                f9005r = false;
            }
        }
    }

    /* renamed from: n */
    public static void m9054n() {
        if (f8988a != null) {
            f8988a = null;
        }
        if (f8989b != null) {
            f8989b = null;
        }
        if (f8990c != null) {
            f8990c = null;
        }
    }

    /* renamed from: o */
    public static void m9055o() {
        int size;
        synchronized (f9002o) {
            if (f9001n != null && (size = f9001n.size()) > 0) {
                for (int i = 0; i < size; i++) {
                    f9001n.get(i).onSenderIdle();
                }
            }
        }
    }

    /* renamed from: p */
    public static void m9056p() {
    }

    /* renamed from: q */
    public static void m9057q() {
        ULog.m9817d("--->>> handleProcessNext: Enter...");
        if (f9000m) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                    ULog.m9817d("--->>> The envelope file exists.");
                    if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                        ULog.m9817d("--->>> Number of envelope files is greater than 200, remove old files first.");
                        UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                    }
                    File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                    if (envelopeFile != null) {
                        String path = envelopeFile.getPath();
                        ULog.m9817d("--->>> Ready to send envelope file [" + path + "].");
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> send envelope file [ " + path + "].");
                        if (new C3658c(appContext).mo39178a(envelopeFile)) {
                            ULog.m9817d("--->>> Send envelope file success, delete it.");
                            if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                                ULog.m9817d("--->>> Failed to delete already processed file. We try again after delete failed.");
                                UMFrUtils.removeEnvelopeFile(envelopeFile);
                            }
                            m9043c(273);
                            return;
                        }
                        ULog.m9817d("--->>> Send envelope file failed, abandon and wait next trigger!");
                        return;
                    }
                }
                m9045e();
            } catch (Throwable th) {
                UMCrashManager.reportCrash(appContext, th);
            }
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        synchronized (f9010w) {
            if (f9003p.equals(str)) {
                if (AgooConstants.ACK_BODY_NULL.equals(str2)) {
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f9005r = true;
                } else {
                    f9005r = false;
                }
            }
            if (f9004q.equals(str)) {
                int intValue = Integer.valueOf(str2).intValue();
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + intValue);
                if (intValue >= 15) {
                    if (intValue <= 90) {
                        f9009v = intValue * 1000;
                    }
                }
                f9009v = f9006s;
            }
        }
    }

    /* renamed from: a */
    public static void m9037a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f9002o) {
            try {
                if (f9001n == null) {
                    f9001n = new ArrayList<>();
                }
                if (uMSenderStateNotify != null) {
                    for (int i = 0; i < f9001n.size(); i++) {
                        if (uMSenderStateNotify == f9001n.get(i)) {
                            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f9001n.add(uMSenderStateNotify);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    /* renamed from: b */
    public static void m9041b(int i) {
        Handler handler;
        if (f9000m && (handler = f8989b) != null && !handler.hasMessages(i)) {
            Message obtainMessage = f8989b.obtainMessage();
            obtainMessage.what = i;
            f8989b.sendMessage(obtainMessage);
        }
    }

    /* renamed from: a */
    public static boolean m9038a() {
        boolean z;
        synchronized (f9010w) {
            z = f9005r;
        }
        return z;
    }

    /* renamed from: a */
    public static void m9036a(int i, long j) {
        Handler handler;
        if (f9000m && (handler = f8989b) != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i;
            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> sendMsgDelayed: " + j);
            f8989b.sendMessageDelayed(obtainMessage, j);
        }
    }

    /* renamed from: a */
    public static void m9035a(int i, int i2) {
        Handler handler;
        if (f9000m && (handler = f8989b) != null) {
            handler.removeMessages(i);
            Message obtainMessage = f8989b.obtainMessage();
            obtainMessage.what = i;
            f8989b.sendMessageDelayed(obtainMessage, (long) i2);
        }
    }
}
