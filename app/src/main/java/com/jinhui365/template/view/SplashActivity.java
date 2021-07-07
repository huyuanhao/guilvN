package com.jinhui365.template.view;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.jinhui365.template.C1423R;
import com.p118pd.sdk.AbstractC8728oo0oO000;
import com.p118pd.sdk.AbstractC9096ooo0000O;
import com.p118pd.sdk.C8646oo0OOoO;
import com.p118pd.sdk.C8653oo0Oo0;
import com.p118pd.sdk.C8655oo0Oo000;
import com.p118pd.sdk.C8659oo0Oo0OO;
import com.p118pd.sdk.C8691oo0o0000;
import com.p118pd.sdk.C8701oo0o0O;
import com.p118pd.sdk.C8703oo0o0O00;
import com.p118pd.sdk.C8715oo0o0o00;
import com.p118pd.sdk.C8726oo0oO;
import com.p118pd.sdk.C8731oo0oOO00;
import com.p118pd.sdk.C8741oo0oOo0;
import com.p118pd.sdk.C8914ooOO0o0O;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9041ooOoOO0;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.android_log_sdk.LogPageType;
import com.umeng.message.UmengNotifyClickActivity;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;
import s.h.e.l.l.C;

public abstract class SplashActivity extends UmengNotifyClickActivity implements AbstractC8728oo0oO000 {
    public static final String o000OOo = "APP_VERSIONCODE_KEY";
    public static final String o0O0O00 = "1";
    public static final int o0OO00O = 600;

    /* renamed from: o0OO00O  reason: collision with other field name */
    public static final String f14983o0OO00O = "SplashActivity";
    public static final int o0OOO0o = 1;
    public static final int o0Oo0oo = 0;
    public static final int o0ooOO0 = 1000;
    public static final int o0ooOOo = 1001;
    public static final int o0ooOoO = 1002;
    public static final String oo0o0Oo = "__from_foreground__";
    public Handler OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8653oo0Oo0 f14984OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8726oo0oO f14985OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9096ooo0000O f14986OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public HashMap<String, String> f14987OooO00o = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f14988OooO00o;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;
    public boolean OooO0o = false;
    public boolean OooO0o0 = false;
    public int o00oO0O = 1000;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public String f14989o0OOO0o = "";

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public String f14990o0Oo0oo = "";

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f14991o0ooOOo = "template_hotSource";

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public String f14992o0ooOoO = "last_bundle_path";

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0 || i == 1) {
                LogCollectorManager.sharedInstance().noticeReport();
                return;
            }
            switch (i) {
                case 1000:
                    SplashActivity.this.m15119OooO00o();
                    return;
                case 1001:
                    SplashActivity splashActivity = SplashActivity.this;
                    splashActivity.OooO00o((long) splashActivity.o00oO0O);
                    return;
                case 1002:
                    int i2 = message.arg1;
                    SplashActivity.this.OooO00o(i2);
                    if (100 == i2) {
                        SplashActivity splashActivity2 = SplashActivity.this;
                        splashActivity2.OooO0OO = true;
                        splashActivity2.m15119OooO00o();
                        return;
                    }
                    SplashActivity.this.OooO0OO = false;
                    return;
                default:
                    return;
            }
        }
    }

    public class OooO0O0 implements AbstractC9096ooo0000O {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.AbstractC9096ooo0000O
        public void OooO00o(boolean z, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "RN热更资源解压完成");
            hashMap.put("isSuccess", z + "");
            hashMap.put("path", str);
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
            if (z) {
                C8655oo0Oo000.OooO00o(str);
                C8659oo0Oo0OO.m20291OooO00o();
            }
            SplashActivity.this.f14985OooO00o.OooO0O0(C8653oo0Oo0.OooO0oO, 100);
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.OooO00o((long) splashActivity.o00oO0O);
        }
    }

    public class OooO0OO implements Runnable {
        public final /* synthetic */ long OooO00o;

        public OooO0OO(long j) {
            this.OooO00o = j;
        }

        public void run() {
            C8655oo0Oo000.m20279OooO00o();
            try {
                C8659oo0Oo0OO.OooO00o(SplashActivity.this, C8646oo0OOoO.OooO00o);
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "预加载模板异常");
                hashMap.put("error", OooO0OO.class.getName() + ": react native preloader error;" + e.getLocalizedMessage());
                LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
            }
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.OooO0O0 = true;
            splashActivity.OooO00o.sendEmptyMessageDelayed(1000, this.OooO00o);
        }
    }

    static {
        C.i(16777255);
    }

    private native void OooO0o();

    public abstract int OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public native void m15119OooO00o();

    public abstract void OooO00o(int i);

    public native void OooO00o(long j);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public native boolean m15120OooO00o();

    public native void OooO0O0();

    public abstract void OooO0OO();

    public void OooO0Oo() {
        String OooO00o2 = C8703oo0o0O00.OooO00o().OooO00o((Activity) this);
        Map<String, Object> OooO00o3 = C8701oo0o0O.m20318OooO00o(OooO00o2);
        C8914ooOO0o0O logParamsManager = LogCollectorManager.sharedInstance().getLogParamsManager();
        logParamsManager.OooO0O0(logParamsManager.OooO0oo());
        logParamsManager.OooO00o(logParamsManager.m20562OooO0O0());
        logParamsManager.OooO0oO(C8741oo0oOo0.OooO0Oo(OooO00o2) ? C8701oo0o0O.OooO00o(Uri.parse(OooO00o2)) : getClass().getSimpleName());
        logParamsManager.OooO0O0(C8691oo0o0000.OooO00o(OooO00o3));
        this.f14987OooO00o.put("name", getClass().getSimpleName());
        this.f14987OooO00o.put("desc", "启动页");
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.PAGE, LogPageType.PAGE_IN.getValue(), this.f14987OooO00o);
        this.OooO00o.sendEmptyMessageDelayed(0, 600);
    }

    public void OooO0o0() {
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.PAGE, LogPageType.PAGE_OUT.getValue(), this.f14987OooO00o);
        this.OooO00o.sendEmptyMessageDelayed(1, 600);
    }

    public native void onBackPressed();

    @Override // com.taobao.agoo.BaseNotifyClickActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if ((getIntent().getFlags() & 4194304) == 4194304) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "FLAG_ACTIVITY_BROUGHT_TO_FRONT");
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
            finish();
            return;
        }
        int OooO00o2 = OooO00o();
        if (OooO00o2 <= 0) {
            OooO00o2 = C1423R.layout.ac_splash_template;
        }
        boolean hasExtra = getIntent().hasExtra(oo0o0Oo);
        this.OooO0o0 = hasExtra;
        if (!hasExtra) {
            C8653oo0Oo0.OooO00o(this).OooO00o();
            C8659oo0Oo0OO.m20291OooO00o();
        }
        C8731oo0oOO00.OooO00o().OooO00o(this.OooO0o0);
        setContentView(OooO00o2);
        OooO0Oo();
        OooO0O0();
    }

    public native void onDestroy();

    @Override // com.taobao.agoo.BaseNotifyClickActivity, com.umeng.message.UmengNotifyClickActivity
    public void onMessage(Intent intent) {
        super.onMessage(intent);
        if (intent == null || !intent.hasExtra(AgooConstants.MESSAGE_BODY)) {
            this.OooO0o = false;
            return;
        }
        this.OooO0o = true;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra(AgooConstants.MESSAGE_BODY));
            if (jSONObject.has("extra") && jSONObject.getString("extra") != null) {
                this.f14988OooO00o = C9041ooOoOO0.OooO00o(jSONObject.getString("extra"), String.class, String.class);
            }
            if (jSONObject.has(AgooConstants.MESSAGE_BODY) && jSONObject.getString(AgooConstants.MESSAGE_BODY) != null) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString(AgooConstants.MESSAGE_BODY));
                if (jSONObject2.has("title") && jSONObject2.getString("title") != null) {
                    this.f14989o0OOO0o = jSONObject2.getString("title");
                }
                if (jSONObject2.has("text") && jSONObject2.getString("text") != null) {
                    this.f14990o0Oo0oo = jSONObject2.getString("text");
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "接收离线推送消息");
        hashMap.put("hasPush", this.OooO0o + "");
        hashMap.put("titlePush", this.f14989o0OOO0o);
        hashMap.put("textPush", this.f14990o0Oo0oo);
        hashMap.put("extraPush", C9041ooOoOO0.OooO00o(this.f14988OooO00o));
        LogCollectorManager.sharedInstance().recordInfo("splash_onMessage", hashMap);
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity
    public native void onStart();

    public native void onStop();

    public void OooO00o(Map<String, Object> map) {
        if (map == null) {
            map = this.OooO0o ? C8715oo0o0o00.OooO00o(this).OooO00o(this.f14989o0OOO0o, this.f14990o0Oo0oo, this.f14988OooO00o) : new HashMap<>();
        }
        C8703oo0o0O00.OooO00o().OooO00o(C8932ooOOO0o.OooO0OO).OooO00o(map).OooO00o(0, 0).OooO00o(this);
        overridePendingTransition(0, 0);
        finish();
    }
}
