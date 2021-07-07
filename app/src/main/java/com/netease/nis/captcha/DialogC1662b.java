package com.netease.nis.captcha;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import com.netease.nis.captcha.Captcha;
import com.netease.nis.captcha.CaptchaConfiguration;
import com.p118pd.sdk.C7753o0oooo0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.netease.nis.captcha.b */
public class DialogC1662b extends Dialog {

    /* renamed from: A */
    public String f3014A;

    /* renamed from: B */
    public String f3015B;

    /* renamed from: C */
    public String f3016C;

    /* renamed from: D */
    public boolean f3017D;

    /* renamed from: E */
    public String f3018E;

    /* renamed from: a */
    public boolean f3019a = false;

    /* renamed from: b */
    public boolean f3020b;

    /* renamed from: c */
    public final String f3021c;

    /* renamed from: d */
    public final Context f3022d;

    /* renamed from: e */
    public final String f3023e;

    /* renamed from: f */
    public final CaptchaConfiguration.ModeType f3024f;

    /* renamed from: g */
    public final CaptchaConfiguration.LangType f3025g;

    /* renamed from: h */
    public final float f3026h;

    /* renamed from: i */
    public final String f3027i;

    /* renamed from: j */
    public final String f3028j;

    /* renamed from: k */
    public final String f3029k;

    /* renamed from: l */
    public final int f3030l;

    /* renamed from: m */
    public final int f3031m;

    /* renamed from: n */
    public final int f3032n;

    /* renamed from: o */
    public final boolean f3033o = true;

    /* renamed from: p */
    public final boolean f3034p;

    /* renamed from: q */
    public final boolean f3035q;

    /* renamed from: r */
    public final long f3036r;

    /* renamed from: s */
    public final int f3037s;

    /* renamed from: t */
    public final int f3038t = 270;

    /* renamed from: u */
    public final CaptchaListener f3039u;

    /* renamed from: v */
    public CaptchaWebView f3040v;

    /* renamed from: w */
    public View f3041w;

    /* renamed from: x */
    public String f3042x;

    /* renamed from: y */
    public String f3043y;

    /* renamed from: z */
    public boolean f3044z;

    /* renamed from: com.netease.nis.captcha.b$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public final /* synthetic */ Dialog OooO00o;

        public OooO00o(Dialog dialog) {
            this.OooO00o = dialog;
        }

        public void onClick(View view) {
            if (DialogC1662b.this.f3017D) {
                this.OooO00o.hide();
                DialogC1662b bVar = DialogC1662b.this;
                bVar.f3019a = true;
                bVar.f3039u.onClose(Captcha.CloseType.USER_CLOSE);
                return;
            }
            this.OooO00o.dismiss();
        }
    }

    public DialogC1662b(CaptchaConfiguration captchaConfiguration) {
        super(captchaConfiguration.f2967a, C1657R.style.CaptchaDialogStyle);
        boolean z = true;
        this.f3022d = captchaConfiguration.f2967a;
        this.f3023e = captchaConfiguration.f2968b;
        this.f3021c = captchaConfiguration.f2969c;
        this.f3024f = captchaConfiguration.f2970d;
        this.f3025g = captchaConfiguration.f2971e;
        this.f3026h = captchaConfiguration.f2972f;
        this.f3027i = captchaConfiguration.f2973g;
        this.f3028j = captchaConfiguration.f2974h;
        this.f3029k = captchaConfiguration.f2975i;
        this.f3030l = captchaConfiguration.f2976j;
        this.f3031m = captchaConfiguration.f2977k;
        int i = captchaConfiguration.f2978l;
        this.f3032n = i == 0 ? m2901a(0) : i;
        this.f3034p = captchaConfiguration.f2982p;
        this.f3035q = captchaConfiguration.f2983q;
        this.f3036r = captchaConfiguration.f2980n;
        this.f3037s = captchaConfiguration.f2984r;
        this.f3039u = captchaConfiguration.f2979m;
        this.f3042x = captchaConfiguration.f2985s;
        this.f3043y = captchaConfiguration.f2986t;
        this.f3044z = captchaConfiguration.f2988v;
        this.f3014A = captchaConfiguration.f2989w;
        this.f3015B = captchaConfiguration.f2990x;
        this.f3016C = captchaConfiguration.f2991y;
        this.f3017D = captchaConfiguration.f2970d != CaptchaConfiguration.ModeType.MODE_INTELLIGENT_NO_SENSE ? false : z;
        this.f3020b = captchaConfiguration.f2981o;
        this.f3018E = captchaConfiguration.f2987u;
        m2905g();
    }

    /* renamed from: a */
    private int m2901a(int i) {
        DisplayMetrics displayMetrics = this.f3022d.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        if (i >= 270) {
            return i;
        }
        if (i3 < i2) {
            i2 = (i3 * 3) / 4;
        }
        int i4 = (i2 * 4) / 5;
        return ((int) (((float) i4) / f)) < 270 ? (int) (f * 270.0f) : i4;
    }

    /* renamed from: f */
    private void m2904f() {
        float f;
        Window window;
        C1664d.m2931a("%s", "设置ContentView");
        View view = this.f3041w;
        if (view != null) {
            setContentView(view);
        } else {
            setContentView(C1657R.layout.dailog_captcha);
        }
        if (this.f3040v == null) {
            CaptchaWebView captchaWebView = (CaptchaWebView) findViewById(C1657R.C1660id.web_view);
            this.f3040v = captchaWebView;
            captchaWebView.setCaptchaListener(this.f3039u);
        }
        findViewById(C1657R.C1660id.img_btn_close).setOnClickListener(new OooO00o(this));
        this.f3041w.setVisibility(4);
        if (this.f3020b) {
            findViewById(C1657R.C1660id.img_btn_close).setVisibility(4);
        }
        if (this.f3024f == CaptchaConfiguration.ModeType.MODE_INTELLIGENT_NO_SENSE) {
            window = getWindow();
            f = 0.0f;
        } else {
            window = getWindow();
            f = this.f3026h;
        }
        window.setDimAmount(f);
        setCanceledOnTouchOutside(this.f3034p);
    }

    /* renamed from: g */
    private void m2905g() {
        C1664d.m2931a("set dialog position x:%d y:%d width:%d", Integer.valueOf(this.f3030l), Integer.valueOf(this.f3031m), Integer.valueOf(this.f3032n));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        int i = this.f3030l;
        if (i != -1) {
            attributes.gravity = 3 | attributes.gravity;
            attributes.x = i;
        }
        int i2 = this.f3031m;
        if (i2 != -1) {
            attributes.gravity |= 48;
            attributes.y = i2;
        }
        int i3 = this.f3032n;
        if (i3 != 0) {
            attributes.width = i3;
        }
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
    }

    /* renamed from: h */
    private String m2906h() {
        float f = getContext().getResources().getDisplayMetrics().density;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C7753o0oooo0.OooO0O0 + C1661a.m2899a(this.f3022d).mo17661a());
        stringBuffer.append("?captchaId=" + this.f3023e);
        if (this.f3024f == CaptchaConfiguration.ModeType.MODE_INTELLIGENT_NO_SENSE) {
            stringBuffer.append("&mode=bind");
        }
        stringBuffer.append("&os=android");
        stringBuffer.append("&osVer=" + Build.VERSION.RELEASE);
        stringBuffer.append("&sdkVer=3.2.1");
        float f2 = ((float) this.f3032n) / f;
        try {
            stringBuffer.append("&popupStyles.width=" + URLEncoder.encode(String.valueOf(f2), "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            stringBuffer.append("&popupStyles.width=" + f2);
        }
        String a = C1664d.m2928a(this.f3025g);
        if (!TextUtils.isEmpty(a)) {
            stringBuffer.append("&lang=" + a);
        }
        if (!TextUtils.isEmpty(this.f3028j)) {
            stringBuffer.append("&customStyles.icon.slider=" + this.f3028j);
        }
        stringBuffer.append("&defaultFallback=" + this.f3035q);
        stringBuffer.append("&errorFallbackCount=" + this.f3037s);
        stringBuffer.append("&mobileTimeout=" + this.f3036r);
        if (this.f3044z) {
            stringBuffer.append("&ipv6=true");
            this.f3015B = "ac-v6.dun.163yun.com";
            this.f3014A = "ac-v6.dun.163yun.com";
            this.f3016C = "acstatic-dun-v6.126.net";
            if (TextUtils.isEmpty(this.f3042x)) {
                this.f3042x = "c-v6.dun.163.com";
            }
            if (TextUtils.isEmpty(this.f3043y)) {
                this.f3043y = "cstaticdun-v6.126.net";
            }
        }
        if (!TextUtils.isEmpty(this.f3042x)) {
            stringBuffer.append("&apiServer=" + this.f3042x);
        }
        if (!TextUtils.isEmpty(this.f3043y)) {
            stringBuffer.append("&staticServer=" + this.f3043y);
        }
        if (!TextUtils.isEmpty(this.f3018E)) {
            stringBuffer.append("&protocol=" + this.f3018E);
        }
        if (!TextUtils.isEmpty(this.f3014A)) {
            stringBuffer.append("&wmServerConfig.configServer=");
            stringBuffer.append(this.f3014A);
        }
        if (!TextUtils.isEmpty(this.f3015B)) {
            stringBuffer.append("&wmServerConfig.apiServer=");
            stringBuffer.append(this.f3015B);
        }
        if (!TextUtils.isEmpty(this.f3016C)) {
            stringBuffer.append("&wmServerConfig.staticServer=");
            stringBuffer.append(this.f3016C);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo17662a() {
        View inflate = LayoutInflater.from(this.f3022d).inflate(C1657R.layout.dailog_captcha, (ViewGroup) null);
        this.f3041w = inflate;
        this.f3040v = (CaptchaWebView) inflate.findViewById(C1657R.C1660id.web_view);
    }

    /* renamed from: a */
    public void mo17663a(boolean z) {
        this.f3019a = z;
    }

    /* renamed from: b */
    public void mo17664b() {
        ViewGroup.LayoutParams layoutParams = this.f3040v.getLayoutParams();
        int i = this.f3032n;
        if (i != 0) {
            layoutParams.width = i;
        }
        layoutParams.height = -2;
        this.f3040v.setLayoutParams(layoutParams);
        C1664d.m2931a("%s", "request url is:" + m2906h());
        this.f3040v.addJavascriptInterface(new C1669g(this.f3022d), "JSInterface");
        this.f3040v.loadUrl(m2906h());
    }

    /* renamed from: c */
    public void mo17665c() {
        String h = m2906h();
        C1664d.m2931a("%s", "reload url is:" + h);
        this.f3040v.loadUrl(h);
    }

    /* renamed from: d */
    public WebView mo17666d() {
        return this.f3040v;
    }

    public void dismiss() {
        try {
            if (this.f3022d != null && !((Activity) this.f3022d).isFinishing()) {
                super.dismiss();
            }
        } catch (Exception e) {
            C1664d.m2936b(Captcha.TAG, "Captcha  Dialog dismiss Error: %s", e.toString());
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3020b || keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: e */
    public View mo17669e() {
        return this.f3041w;
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.f3017D) {
            hide();
            this.f3019a = true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        m2904f();
    }

    public void show() {
        try {
            if (this.f3022d != null && !((Activity) this.f3022d).isFinishing()) {
                super.show();
            }
        } catch (Exception e) {
            C1664d.m2936b("Captcha  Dialog show Error:%s", e.toString());
        }
    }
}
