package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p118pd.sdk.C8912ooOO0o0;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3524b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.c */
public class C3535c {

    /* renamed from: a */
    public static final String f9081a = "BatteryUtils";

    /* renamed from: b */
    public static boolean f9082b;

    /* renamed from: c */
    public static Context f9083c;

    /* renamed from: d */
    public BroadcastReceiver f9084d;

    /* renamed from: com.umeng.commonsdk.internal.utils.c$a */
    public static class C3537a {

        /* renamed from: a */
        public static final C3535c f9086a = new C3535c();
    }

    /* renamed from: a */
    public static C3535c m9148a(Context context) {
        if (f9083c == null && context != null) {
            f9083c = context.getApplicationContext();
        }
        return C3537a.f9086a;
    }

    /* renamed from: b */
    public synchronized void mo38856b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f9083c.registerReceiver(this.f9084d, intentFilter);
            f9082b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9083c, th);
        }
        return;
    }

    /* renamed from: c */
    public synchronized void mo38857c() {
        try {
            f9083c.unregisterReceiver(this.f9084d);
            f9082b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9083c, th);
        }
        return;
    }

    public C3535c() {
        this.f9084d = new BroadcastReceiver() {
            /* class com.umeng.commonsdk.internal.utils.C3535c.C35361 */

            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("le", intent.getIntExtra(C8912ooOO0o0.OooO0O0, 0));
                        } catch (Exception unused) {
                        }
                        try {
                            jSONObject.put("vol", intent.getIntExtra("voltage", 0));
                        } catch (Exception unused2) {
                        }
                        try {
                            jSONObject.put("temp", intent.getIntExtra("temperature", 0));
                            jSONObject.put("ts", System.currentTimeMillis());
                        } catch (Exception unused3) {
                        }
                        int intExtra = intent.getIntExtra("status", 0);
                        int i = -1;
                        int i2 = 2;
                        if (intExtra != 1) {
                            if (intExtra == 2) {
                                i = 1;
                            } else if (intExtra == 4) {
                                i = 0;
                            } else if (intExtra == 5) {
                                i = 2;
                            }
                        }
                        try {
                            jSONObject.put("st", i);
                        } catch (Exception unused4) {
                        }
                        int intExtra2 = intent.getIntExtra("plugged", 0);
                        if (intExtra2 == 1) {
                            i2 = 1;
                        } else if (intExtra2 != 2) {
                            i2 = 0;
                        }
                        try {
                            jSONObject.put("ct", i2);
                            jSONObject.put("ts", System.currentTimeMillis());
                        } catch (Exception unused5) {
                        }
                        ULog.m9832i(C3535c.f9081a, jSONObject.toString());
                        UMWorkDispatch.sendEvent(context, 32771, C3524b.m9071a(C3535c.f9083c).mo38849a(), jSONObject.toString());
                        C3535c.this.mo38857c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(C3535c.f9083c, th);
                }
            }
        };
    }

    /* renamed from: a */
    public synchronized boolean mo38855a() {
        return f9082b;
    }
}
