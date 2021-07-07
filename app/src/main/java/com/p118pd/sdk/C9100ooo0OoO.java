package com.p118pd.sdk;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.netease.nis.captcha.Captcha;
import com.netease.nis.captcha.CaptchaConfiguration;
import com.netease.nis.captcha.CaptchaListener;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.util.HashMap;

/* renamed from: com.pd.sdk.ooo0OoO  reason: case insensitive filesystem */
public class C9100ooo0OoO {
    public static final String OooO00o = "CaptchaHelper";

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f22451OooO00o = 0.5f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22452OooO00o = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f22453OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Promise f22454OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CaptchaConfiguration.LangType f22455OooO00o = CaptchaConfiguration.LangType.LANG_ZH_CN;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CaptchaListener f22456OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22457OooO00o = false;

    /* renamed from: com.pd.sdk.ooo0OoO$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ Captcha OooO00o;

        public OooO00o(Captcha captcha) {
            this.OooO00o = captcha;
        }

        public void run() {
            this.OooO00o.validate();
        }
    }

    /* renamed from: com.pd.sdk.ooo0OoO$OooO0O0 */
    public class OooO0O0 implements CaptchaListener {
        public OooO0O0() {
        }

        @Override // com.netease.nis.captcha.CaptchaListener
        public void onClose(Captcha.CloseType closeType) {
            if (closeType == Captcha.CloseType.USER_CLOSE) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "点击关闭按钮");
                hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onClose");
                LogCollectorManager.sharedInstance().recordInfo(C9100ooo0OoO.OooO00o, hashMap);
                if (C9100ooo0OoO.this.f22454OooO00o != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("code", -2);
                    C9100ooo0OoO.this.f22454OooO00o.resolve(createMap);
                }
                if (C9100ooo0OoO.this.f22453OooO00o != null) {
                    C9100ooo0OoO.this.f22453OooO00o.finish();
                }
            }
        }

        @Override // com.netease.nis.captcha.CaptchaListener
        public void onError(int i, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "初始化失败");
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onError");
            hashMap.put("errCode", i + "");
            hashMap.put("errMsg", str);
            LogCollectorManager.sharedInstance().recordInfo(C9100ooo0OoO.OooO00o, hashMap);
            if (C9100ooo0OoO.this.f22454OooO00o != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", -1);
                createMap.putInt("errCode", i);
                createMap.putString("errMsg", str);
                C9100ooo0OoO.this.f22454OooO00o.resolve(createMap);
            }
            if (C9100ooo0OoO.this.f22453OooO00o != null) {
                C9100ooo0OoO.this.f22453OooO00o.finish();
            }
        }

        @Override // com.netease.nis.captcha.CaptchaListener
        public void onReady() {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "验证码准备成功");
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onReady");
            LogCollectorManager.sharedInstance().recordInfo(C9100ooo0OoO.OooO00o, hashMap);
        }

        @Override // com.netease.nis.captcha.CaptchaListener
        public void onValidate(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                if (C9100ooo0OoO.this.f22454OooO00o != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("code", 0);
                    createMap.putString(C7485o0OoO0o0.OooOO0, str2);
                    C9100ooo0OoO.this.f22454OooO00o.resolve(createMap);
                }
                if (C9100ooo0OoO.this.f22453OooO00o != null) {
                    C9100ooo0OoO.this.f22453OooO00o.finish();
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "行为校验");
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onValidate");
            hashMap.put("result", str);
            hashMap.put("msg", str3);
            hashMap.put(C7485o0OoO0o0.OooOO0, str2);
            LogCollectorManager.sharedInstance().recordInfo(C9100ooo0OoO.OooO00o, hashMap);
        }
    }

    public void OooO00o(Activity activity, Promise promise) {
        this.f22453OooO00o = activity;
        this.f22454OooO00o = promise;
    }

    public void OooO00o(String str) {
        if (this.f22453OooO00o == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "mContext为空");
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "show");
            LogCollectorManager.sharedInstance().recordInfo(OooO00o, hashMap);
            return;
        }
        this.f22453OooO00o.runOnUiThread(new OooO00o(Captcha.getInstance().init(new CaptchaConfiguration.Builder().captchaId(str).listener(this.f22456OooO00o).languageType(this.f22455OooO00o).timeout(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE).debug(false).position(-1, -1, 0, 0).backgroundDimAmount(this.f22451OooO00o).touchOutsideDisappear(this.f22457OooO00o).useDefaultFallback(true).failedMaxRetryCount(this.f22452OooO00o).build(this.f22453OooO00o))));
    }
}
