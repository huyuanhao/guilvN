package com.umeng.commonsdk.service;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.views.text.FontMetricsUtil;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.utils.UMUtils;
import com.xiaomi.mipush.sdk.Constants;

public class UMGlobalContext {
    public static final String TAG = "UMGlobalContext";
    public String mAppVersion;
    public String mAppkey;
    public Context mApplicationContext;
    public String mChannel;
    public int mDeviceType;
    public boolean mIsDebugMode;
    public boolean mIsMainProcess;
    public String mModules;
    public String mProcessName;
    public String mPushSecret;

    /* renamed from: com.umeng.commonsdk.service.UMGlobalContext$a */
    public static class C3638a {

        /* renamed from: a */
        public Context f9461a;

        /* renamed from: b */
        public int f9462b;

        /* renamed from: c */
        public String f9463c;

        /* renamed from: d */
        public String f9464d;

        /* renamed from: e */
        public String f9465e;

        /* renamed from: f */
        public String f9466f;

        /* renamed from: g */
        public boolean f9467g;

        /* renamed from: h */
        public String f9468h;

        /* renamed from: i */
        public String f9469i;

        /* renamed from: j */
        public boolean f9470j;
    }

    /* renamed from: com.umeng.commonsdk.service.UMGlobalContext$b */
    public static class C3639b {

        /* renamed from: a */
        public static final UMGlobalContext f9471a = new UMGlobalContext();
    }

    public static Context getAppContext(Context context) {
        if (context == null) {
            return C3639b.f9471a.mApplicationContext;
        }
        Context context2 = C3639b.f9471a.mApplicationContext;
        return context2 != null ? context2 : context.getApplicationContext();
    }

    public static UMGlobalContext getInstance() {
        return C3639b.f9471a;
    }

    public static UMGlobalContext newUMGlobalContext(C3638a aVar) {
        getInstance();
        C3639b.f9471a.mDeviceType = aVar.f9462b;
        C3639b.f9471a.mPushSecret = aVar.f9463c;
        C3639b.f9471a.mAppkey = aVar.f9464d;
        C3639b.f9471a.mChannel = aVar.f9465e;
        C3639b.f9471a.mModules = aVar.f9466f;
        C3639b.f9471a.mIsDebugMode = aVar.f9467g;
        C3639b.f9471a.mProcessName = aVar.f9468h;
        C3639b.f9471a.mAppVersion = aVar.f9469i;
        C3639b.f9471a.mIsMainProcess = aVar.f9470j;
        if (aVar.f9461a != null) {
            C3639b.f9471a.mApplicationContext = aVar.f9461a.getApplicationContext();
        }
        return C3639b.f9471a;
    }

    public Context getAppContextDirectly() {
        return this.mApplicationContext;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getAppkey() {
        return this.mAppkey;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public String getProcessName(Context context) {
        if (context == null) {
            return C3639b.f9471a.mProcessName;
        }
        if (C3639b.f9471a.mApplicationContext != null) {
            return this.mProcessName;
        }
        return UMFrUtils.getCurrentProcessName(context);
    }

    public String getPushSecret() {
        return this.mPushSecret;
    }

    public boolean hasAnalyticsSdk() {
        return this.mModules.contains("a");
    }

    public boolean hasErrorSdk() {
        return this.mModules.contains("e");
    }

    public boolean hasInternalModule() {
        return true;
    }

    public boolean hasOplusModule() {
        return this.mModules.contains("o");
    }

    public boolean hasPushSdk() {
        return this.mModules.contains(C3617o.f9365as);
    }

    public boolean hasShareSdk() {
        return this.mModules.contains(C3617o.f9366at);
    }

    public boolean hasVisualDebugSdk() {
        return this.mModules.contains(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
    }

    public boolean hasVisualSdk() {
        return this.mModules.contains(DispatchConstants.VERSION);
    }

    public boolean isDebugMode() {
        return this.mIsDebugMode;
    }

    public boolean isMainProcess(Context context) {
        if (context == null) {
            return C3639b.f9471a.mIsMainProcess;
        }
        if (C3639b.f9471a.mApplicationContext != null) {
            return C3639b.f9471a.mIsMainProcess;
        }
        return UMUtils.isMainProgress(context.getApplicationContext());
    }

    public String toString() {
        if (C3639b.f9471a.mApplicationContext == null) {
            return "uninitialized.";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append("devType:" + this.mDeviceType + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("appkey:" + this.mAppkey + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("channel:" + this.mChannel + Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append("procName:" + this.mProcessName + "]");
        return sb.toString();
    }

    public UMGlobalContext() {
        this.mProcessName = "unknown";
    }
}
