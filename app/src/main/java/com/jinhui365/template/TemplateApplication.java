package com.jinhui365.template;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Process;
import android.widget.Toast;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.jinhui365.hotsources.bean.ServerTimeVO;
import com.p118pd.sdk.AbstractC8629oo0OO0O0;
import com.p118pd.sdk.AbstractC8712oo0o0Ooo;
import com.p118pd.sdk.AbstractC8723oo0o0oo0;
import com.p118pd.sdk.C8609oo0O0OoO;
import com.p118pd.sdk.C8610oo0O0Ooo;
import com.p118pd.sdk.C8625oo0OO00;
import com.p118pd.sdk.C8645oo0OOo0o;
import com.p118pd.sdk.C8654oo0Oo00;
import com.p118pd.sdk.C8707oo0o0OOO;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.UpgradeInfo;
import com.tencent.bugly.beta.upgrade.UpgradeStateListener;
import com.umeng.analytics.MobclickAgent;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import s.h.e.l.l.C;

public abstract class TemplateApplication extends Application {
    public static TemplateApplication OooO00o = null;
    public static final long OooO0O0 = 3000;
    public static String o0ooOOo = "internal";

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f14980OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14981OooO0O0 = false;

    public class OooO00o implements UpgradeStateListener {
        public OooO00o() {
        }

        @Override // com.tencent.bugly.beta.upgrade.UpgradeStateListener
        public void onDownloadCompleted(boolean z) {
        }

        @Override // com.tencent.bugly.beta.upgrade.UpgradeStateListener
        public void onUpgradeFailed(boolean z) {
            Toast.makeText(TemplateApplication.this.getApplicationContext(), Beta.strToastCheckUpgradeError, 0).show();
        }

        @Override // com.tencent.bugly.beta.upgrade.UpgradeStateListener
        public void onUpgradeNoVersion(boolean z) {
            if (z) {
                Toast.makeText(TemplateApplication.this.getApplicationContext(), Beta.strToastYourAreTheLatestVersion, 0).show();
            }
        }

        @Override // com.tencent.bugly.beta.upgrade.UpgradeStateListener
        public void onUpgradeSuccess(boolean z) {
        }

        @Override // com.tencent.bugly.beta.upgrade.UpgradeStateListener
        public void onUpgrading(boolean z) {
            if (z) {
                Toast.makeText(TemplateApplication.this.getApplicationContext(), Beta.strToastCheckingUpgrade, 0).show();
            }
        }
    }

    public class OooO0O0 extends AbstractC8629oo0OO0O0<ServerTimeVO> {
        public OooO0O0(Context context) {
            super(context);
        }

        /* renamed from: OooO00o */
        public void onNext(ServerTimeVO serverTimeVO) {
            if (serverTimeVO != null) {
                long currentTime = serverTimeVO.getCurrentTime();
                if (currentTime > 0) {
                    C8645oo0OOo0o.OooO00o(currentTime);
                    C8625oo0OO00.OooO00o().OooO00o(currentTime);
                    LogCollectorManager.sharedInstance().setServerTime(currentTime - C8645oo0OOo0o.OooO00o());
                }
                unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC8629oo0OO0O0
        public void OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC8629oo0OO0O0, com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            unsubscribe();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            C8707oo0o0OOO.m20329OooO00o();
            try {
                MobclickAgent.onKillProcess(TemplateApplication.this.getApplicationContext());
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "MobclickAgent kill exception");
                hashMap.put("message", e.getLocalizedMessage());
                LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), true, (Map<String, String>) hashMap);
            }
            Process.killProcess(Process.myPid());
        }
    }

    static {
        C.i(18);
    }

    public static native TemplateApplication OooO00o();

    private native void OooOOO0();

    public native void OooO();

    public abstract C8625oo0OO00 OooO00o(C8625oo0OO00 oo0oo00);

    public abstract C8654oo0Oo00 OooO00o(C8654oo0Oo00 oo0oo00);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC8712oo0o0Ooo m15112OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC8723oo0o0oo0 m15113OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract Map<String, Object> m15114OooO00o();

    public abstract Map<String, Object> OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public native void m15117OooO0O0();

    public native void OooO0OO();

    public native void OooO0Oo();

    public native void OooO0o();

    public native void OooO0o0();

    public native void OooO0oO();

    public native void OooO0oo();

    public native void OooOO0();

    public native void OooOO0O();

    public native void OooOO0o();

    public native Resources getResources();

    public native void onConfigurationChanged(Configuration configuration);

    public native void onCreate();

    public WritableMap OooO00o(Map<String, Object> map) {
        UpgradeInfo upgradeInfo = Beta.getUpgradeInfo();
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("update", upgradeInfo != null ? 1 : 0);
        createMap.putString("version", upgradeInfo != null ? upgradeInfo.versionName : "");
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "检查APP是否有更新");
        hashMap.putAll(C8609oo0O0OoO.OooO00o((ReadableMap) createMap));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, "checkAppVersion", hashMap);
        return createMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15116OooO00o(Map<String, Object> map) {
        UpgradeInfo upgradeInfo = Beta.getUpgradeInfo();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        HashMap hashMap = new HashMap();
        if (timeInMillis - this.f14980OooO00o > 3000) {
            this.f14980OooO00o = timeInMillis;
            if (upgradeInfo == null) {
                Toast.makeText(this, "当前是最新版本", 0).show();
            } else {
                Beta.checkUpgrade();
                hashMap.put("message", "调用更新");
            }
            hashMap.put("desc", "APP版本更新");
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, "updateAppVersion", hashMap);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15115OooO00o() {
        try {
            LogCollectorManager.sharedInstance().release(this);
            C8610oo0O0Ooo.OooO00o().OooO00o((Map) null);
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.CLOSE.getValue(), false, (Map<String, String>) null);
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.SESSION_END.getValue(), true, (Map<String, String>) null);
            new Handler().postDelayed(new OooO0OO(), 200);
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "退出APP异常");
            hashMap.put("message", e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), true, (Map<String, String>) hashMap);
        }
    }

    private void chs_init_d1(Context context) {
        try {
            Class<?> cls = Class.forName("cn.ijiami.callm.j.H");
            cls.getDeclaredMethod("registerHijack", Context.class).invoke(cls, context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
