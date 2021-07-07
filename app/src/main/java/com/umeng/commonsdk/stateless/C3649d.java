package com.umeng.commonsdk.stateless;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;

/* renamed from: com.umeng.commonsdk.stateless.d */
public class C3649d {

    /* renamed from: a */
    public static final int f9538a = 273;

    /* renamed from: b */
    public static Context f9539b = null;

    /* renamed from: c */
    public static HandlerThread f9540c = null;

    /* renamed from: d */
    public static Handler f9541d = null;

    /* renamed from: e */
    public static Object f9542e = new Object();

    /* renamed from: f */
    public static final int f9543f = 512;

    /* renamed from: g */
    public static IntentFilter f9544g;

    /* renamed from: h */
    public static boolean f9545h;

    /* renamed from: i */
    public static BroadcastReceiver f9546i = new BroadcastReceiver() {
        /* class com.umeng.commonsdk.stateless.C3649d.C36501 */

        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager;
            if (context != null && intent != null) {
                try {
                    if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        Context unused = C3649d.f9539b = context.getApplicationContext();
                        if (C3649d.f9539b != null && (connectivityManager = (ConnectivityManager) C3649d.f9539b.getSystemService("connectivity")) != null) {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                                ULog.m9832i("walle", "[stateless] net reveiver disconnected --->>>");
                                boolean unused2 = C3649d.f9545h = false;
                                return;
                            }
                            boolean unused3 = C3649d.f9545h = true;
                            ULog.m9832i("walle", "[stateless] net reveiver ok --->>>");
                            C3649d.m9753b(273);
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    };

    public C3649d(Context context) {
        synchronized (f9542e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    f9539b = applicationContext;
                    if (applicationContext != null && f9540c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        f9540c = handlerThread;
                        handlerThread.start();
                        if (f9541d == null) {
                            f9541d = new Handler(f9540c.getLooper()) {
                                /* class com.umeng.commonsdk.stateless.C3649d.HandlerC36512 */

                                public void handleMessage(Message message) {
                                    int i = message.what;
                                    if (i == 273) {
                                        C3649d.m9756e();
                                    } else if (i == 512) {
                                        C3649d.m9757f();
                                    }
                                }
                            };
                        }
                        if (DeviceConfig.checkPermission(f9539b, "android.permission.ACCESS_NETWORK_STATE")) {
                            ULog.m9832i("walle", "[stateless] begin register receiver");
                            if (f9544g == null) {
                                IntentFilter intentFilter = new IntentFilter();
                                f9544g = intentFilter;
                                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                if (f9546i != null) {
                                    ULog.m9832i("walle", "[stateless] register receiver ok");
                                    f9539b.registerReceiver(f9546i, f9544g);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    }

    /* renamed from: e */
    public static void m9756e() {
        Context context;
        if (f9545h && (context = f9539b) != null) {
            try {
                File a = C3653f.m9763a(context);
                if (a != null && a.getParentFile() != null && !TextUtils.isEmpty(a.getParentFile().getName())) {
                    C3652e eVar = new C3652e(f9539b);
                    String str = new String(Base64.decode(a.getParentFile().getName(), 0));
                    ULog.m9832i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                    byte[] bArr = null;
                    try {
                        bArr = C3653f.m9767a(a.getAbsolutePath());
                    } catch (Exception unused) {
                    }
                    if (eVar.mo39171a(bArr, str)) {
                        ULog.m9832i("walle", "[stateless] Send envelope file success, delete it.");
                        File file = new File(a.getAbsolutePath());
                        if (!file.delete()) {
                            ULog.m9832i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                            file.delete();
                        }
                        m9753b(273);
                        return;
                    }
                    ULog.m9832i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f9539b, th);
            }
        }
    }

    /* renamed from: f */
    public static void m9757f() {
        if (f9544g != null) {
            BroadcastReceiver broadcastReceiver = f9546i;
            if (broadcastReceiver != null) {
                Context context = f9539b;
                if (context != null) {
                    context.unregisterReceiver(broadcastReceiver);
                }
                f9546i = null;
            }
            f9544g = null;
        }
        HandlerThread handlerThread = f9540c;
        if (handlerThread != null) {
            handlerThread.quit();
            if (f9540c != null) {
                f9540c = null;
            }
            if (f9541d != null) {
                f9541d = null;
            }
        }
    }

    /* renamed from: b */
    public static void m9753b(int i) {
        try {
            if (f9545h && f9541d != null && !f9541d.hasMessages(i)) {
                ULog.m9832i("walle", "[stateless] sendMsgOnce !!!!");
                Message obtainMessage = f9541d.obtainMessage();
                obtainMessage.what = i;
                f9541d.sendMessage(obtainMessage);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9539b, th);
        }
    }

    /* renamed from: a */
    public static void m9750a(int i) {
        Handler handler;
        if (f9545h && (handler = f9541d) != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i;
            f9541d.sendMessage(obtainMessage);
        }
    }

    /* renamed from: a */
    public static void m9749a() {
        m9753b(512);
    }
}
