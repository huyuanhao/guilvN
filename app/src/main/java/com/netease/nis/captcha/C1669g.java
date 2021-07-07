package com.netease.nis.captcha;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.netease.nis.captcha.Captcha;
import com.netease.nis.captcha.CaptchaConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.netease.nis.captcha.g */
public class C1669g {

    /* renamed from: a */
    public Captcha f3058a;

    /* renamed from: b */
    public Context f3059b;

    /* renamed from: c */
    public final DialogC1662b f3060c;

    /* renamed from: d */
    public final CaptchaConfiguration f3061d;

    /* renamed from: e */
    public final CaptchaListener f3062e;

    /* renamed from: f */
    public final CaptchaWebView f3063f;

    /* renamed from: g */
    public final DialogC1663c f3064g;

    /* renamed from: h */
    public boolean f3065h = false;

    /* renamed from: com.netease.nis.captcha.g$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C1669g.this.f3063f.loadUrl("javascript:popupCaptcha()");
        }
    }

    /* renamed from: com.netease.nis.captcha.g$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            if (!C1669g.this.f3064g.isShowing()) {
                C1669g.this.f3064g.show();
            }
            C1669g.this.f3064g.mo17678c(C1657R.string.tip_load_failed);
        }
    }

    /* renamed from: com.netease.nis.captcha.g$OooO0OO */
    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            if (!C1669g.this.f3060c.isShowing()) {
                C1669g.this.f3060c.show();
            }
        }
    }

    /* renamed from: com.netease.nis.captcha.g$OooO0Oo  reason: case insensitive filesystem */
    public class RunnableC5157OooO0Oo implements Runnable {
        public RunnableC5157OooO0Oo() {
        }

        public void run() {
            C1669g.this.f3063f.loadUrl("javascript:captchaVerify()");
        }
    }

    /* renamed from: com.netease.nis.captcha.g$OooO0o0  reason: case insensitive filesystem */
    public class RunnableC5158OooO0o0 implements Runnable {
        public RunnableC5158OooO0o0() {
        }

        public void run() {
            if (C1669g.this.f3060c != null) {
                if (C1669g.this.f3061d.f2970d == CaptchaConfiguration.ModeType.MODE_INTELLIGENT_NO_SENSE && !((Activity) C1669g.this.f3059b).isFinishing()) {
                    C1669g.this.f3060c.getWindow().setDimAmount(C1669g.this.f3061d.f2972f);
                }
                if (C1669g.this.f3060c.mo17669e().getVisibility() == 4) {
                    C1664d.m2931a("%s", "显示验证码视图");
                    C1669g.this.f3060c.mo17669e().setVisibility(0);
                }
            }
        }
    }

    public C1669g(Context context) {
        this.f3059b = context;
        Captcha instance = Captcha.getInstance();
        this.f3058a = instance;
        this.f3060c = instance.mo17613c();
        CaptchaConfiguration e = this.f3058a.mo17617e();
        this.f3061d = e;
        this.f3062e = e.f2979m;
        this.f3063f = (CaptchaWebView) this.f3060c.mo17666d();
        this.f3064g = this.f3058a.mo17611b();
    }

    /* renamed from: a */
    private void m2953a() {
        ((Activity) this.f3059b).runOnUiThread(new OooO0OO());
    }

    /* renamed from: b */
    private void m2955b() {
        if (this.f3063f != null) {
            C1664d.m2931a("%s", "智能无感知调用captchaVerify");
            ((Activity) this.f3059b).runOnUiThread(new RunnableC5157OooO0Oo());
        }
    }

    /* renamed from: c */
    private void m2957c() {
        ((Activity) this.f3059b).runOnUiThread(new RunnableC5158OooO0o0());
    }

    /* renamed from: d */
    private void m2959d() {
        if (this.f3058a.mo17611b() != null) {
            this.f3058a.mo17611b().dismiss();
        }
    }

    /* renamed from: e */
    private boolean m2961e() {
        return this.f3061d.f2970d == CaptchaConfiguration.ModeType.MODE_INTELLIGENT_NO_SENSE;
    }

    @JavascriptInterface
    public void onError(String str) {
        C1664d.m2931a("%s", "onError is callback" + str);
        if (!this.f3058a.mo17614d()) {
            this.f3060c.dismiss();
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = jSONObject.getInt("code");
                String string = jSONObject.getString("message");
                if (this.f3062e != null) {
                    this.f3062e.onError(i, string);
                }
            } catch (JSONException e) {
                e.printStackTrace();
                C1664d.m2931a("%s", "onError is callback" + str);
                CaptchaListener captchaListener = this.f3062e;
                if (captchaListener != null) {
                    captchaListener.onError(2000, e.toString());
                }
            }
            if (this.f3064g != null) {
                ((Activity) this.f3059b).runOnUiThread(new OooO0O0());
            }
        }
    }

    @JavascriptInterface
    public void onLoad() {
        C1664d.m2931a("%s", "onLoad is callback");
        if (!this.f3058a.mo17614d() && this.f3061d.f2970d == CaptchaConfiguration.ModeType.MODE_CAPTCHA) {
            ((Activity) this.f3059b).runOnUiThread(new OooO00o());
        }
    }

    @JavascriptInterface
    public void onReady(int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis() - this.f3058a.startTime;
        C1664d.m2931a("%s %d", "加载总耗时为:", Long.valueOf(currentTimeMillis));
        C1664d.m2931a("%s", "onReady is callback");
        C1670h.m2962a().mo17705a(this.f3061d.f2968b, System.currentTimeMillis(), currentTimeMillis);
        C1670h.m2962a().mo17704a(this.f3059b);
        m2959d();
        if (!this.f3058a.mo17614d()) {
            m2953a();
            CaptchaListener captchaListener = this.f3062e;
            if (captchaListener != null) {
                captchaListener.onReady();
            }
            if (m2961e()) {
                m2955b();
            } else {
                m2957c();
            }
        }
    }

    @JavascriptInterface
    public void onValidate(String str, String str2, String str3, String str4) {
        C1664d.m2931a("result=%s validate =%s message =%s next=%s", str, str2, str3, str4);
        if (!this.f3058a.mo17614d()) {
            if (!TextUtils.isEmpty(str4) && str4.equals("true")) {
                m2957c();
                this.f3065h = true;
            } else if (!TextUtils.isEmpty(str2)) {
                this.f3058a.mo17610a(true);
                if (this.f3058a.mo17613c() != null) {
                    this.f3058a.mo17613c().dismiss();
                }
                if (this.f3062e != null && ((m2961e() && this.f3065h) || !m2961e())) {
                    this.f3062e.onClose(Captcha.CloseType.VERIFY_SUCCESS_CLOSE);
                    this.f3065h = false;
                }
            }
            if (this.f3062e != null && !str4.equals("true")) {
                DialogC1663c cVar = this.f3064g;
                if (cVar != null && !cVar.isShowing()) {
                    this.f3064g.dismiss();
                }
                this.f3062e.onValidate(str, str2, str3);
            }
            DialogC1663c cVar2 = this.f3064g;
            if (cVar2 != null && cVar2.isShowing()) {
                this.f3064g.dismiss();
            }
        }
    }
}
