package com.alibaba.sdk.android.utils;

import android.app.Application;
import com.ut.mini.IUTApplication;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.core.sign.IUTRequestAuthentication;
import com.ut.mini.core.sign.UTBaseRequestAuthentication;
import com.ut.mini.crashhandler.IUTCrashCaughtListner;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.utils.c */
public class C0330c {

    /* renamed from: b */
    public boolean f739b = true;

    /* renamed from: d */
    public Map<String, String> f740d;

    /* renamed from: b */
    private boolean m608b() {
        try {
            Class.forName("com.ut.mini.UTAnalytics");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo4074a(Application application, Map<String, String> map) {
        this.f740d = map;
        boolean b = m608b();
        this.f739b = b;
        if (b) {
            try {
                UTAnalytics.getInstance().setAppApplicationInstance4sdk(application, new IUTApplication() {
                    /* class com.alibaba.sdk.android.utils.C0330c.C03311 */

                    public String getUTAppVersion() {
                        return null;
                    }

                    public String getUTChannel() {
                        return null;
                    }

                    public IUTCrashCaughtListner getUTCrashCraughtListener() {
                        return null;
                    }

                    public IUTRequestAuthentication getUTRequestAuthInstance() {
                        return new UTBaseRequestAuthentication("24527540", "56fc10fbe8c6ae7d0d895f49c4fb6838");
                    }

                    public boolean isAliyunOsSystem() {
                        return false;
                    }

                    public boolean isUTCrashHandlerDisable() {
                        return true;
                    }

                    public boolean isUTLogEnable() {
                        return C0340d.m635c();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public void sendCustomHit(String str, long j, Map<String, String> map) {
        if (this.f739b) {
            try {
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
                uTCustomHitBuilder.setDurationOnEvent(j);
                uTCustomHitBuilder.setProperties(map);
                uTCustomHitBuilder.setProperties(this.f740d);
                UTAnalytics.getInstance().getTrackerByAppkey("24527540").send(uTCustomHitBuilder.build());
            } catch (Throwable unused) {
            }
        }
    }
}
