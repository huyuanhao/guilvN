package com.netease.nis.captcha;

import android.content.DialogInterface;
import com.netease.nis.captcha.CaptchaConfiguration;

public class Captcha {
    public static final int NO_NETWORK = 2001;
    public static final int SDK_INTERNAL_ERROR = 2000;
    public static final String SDK_VERSION = "3.2.1";
    public static final String TAG = "Captcha";
    public static final int WEB_VIEW_HTTPS_ERROR = 2004;
    public static final int WEB_VIEW_HTTP_ERROR = 2003;
    public static final int WEB_VIEW_REQUEST_ERROR = 2002;

    /* renamed from: a */
    public static Captcha f2958a;

    /* renamed from: b */
    public CaptchaConfiguration f2959b;

    /* renamed from: c */
    public DialogC1663c f2960c;

    /* renamed from: d */
    public DialogC1662b f2961d;

    /* renamed from: e */
    public boolean f2962e = true;

    /* renamed from: f */
    public boolean f2963f;

    /* renamed from: g */
    public boolean f2964g;
    public long startTime;

    public enum CloseType {
        UNDEFINE_CLOSE,
        USER_CLOSE,
        VERIFY_SUCCESS_CLOSE,
        TIP_CLOSE
    }

    public class OooO00o implements DialogInterface.OnDismissListener {
        public OooO00o() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (Captcha.this.f2964g) {
                Captcha.this.f2959b.f2979m.onClose(CloseType.TIP_CLOSE);
            }
        }
    }

    public class OooO0O0 implements DialogInterface.OnCancelListener {
        public OooO0O0() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C1664d.m2931a("TipDialog cancel", new Object[0]);
            Captcha.this.f2964g = true;
            if (Captcha.this.f2961d != null) {
                Captcha.this.f2961d.mo17666d().stopLoading();
            }
        }
    }

    public class OooO0OO implements DialogInterface.OnDismissListener {
        public OooO0OO() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (Captcha.this.f2962e) {
                if (Captcha.this.f2961d != null && !Captcha.this.f2963f) {
                    Captcha.this.f2961d.mo17663a(true);
                } else {
                    return;
                }
            } else if (Captcha.this.f2963f || Captcha.this.f2959b == null) {
                return;
            }
            Captcha.this.f2959b.f2979m.onClose(CloseType.USER_CLOSE);
        }
    }

    /* renamed from: f */
    private void m2885f() {
        DialogC1663c cVar = new DialogC1663c(this.f2959b.f2967a);
        this.f2960c = cVar;
        cVar.mo17675a(this.f2959b.f2992z);
        this.f2960c.mo17674a(this.f2959b.f2965A);
        this.f2960c.mo17676b(this.f2959b.f2966B);
        this.f2960c.setCanceledOnTouchOutside(this.f2959b.f2982p);
        this.f2960c.setOnDismissListener(new OooO00o());
        this.f2960c.show();
    }

    /* renamed from: g */
    private void m2886g() {
        DialogC1663c cVar = this.f2960c;
        if (cVar != null) {
            cVar.setOnCancelListener(new OooO0O0());
        }
        DialogC1662b bVar = this.f2961d;
        if (bVar != null) {
            bVar.setOnDismissListener(new OooO0OO());
        }
    }

    public static Captcha getInstance() {
        if (f2958a == null) {
            synchronized (Captcha.class) {
                if (f2958a == null) {
                    f2958a = new Captcha();
                }
            }
        }
        return f2958a;
    }

    /* renamed from: a */
    public void mo17609a() {
        if (this.f2961d == null) {
            DialogC1662b bVar = new DialogC1662b(this.f2959b);
            this.f2961d = bVar;
            bVar.mo17662a();
        }
        this.f2961d.mo17664b();
        m2886g();
    }

    /* renamed from: a */
    public void mo17610a(boolean z) {
        this.f2963f = z;
    }

    /* renamed from: b */
    public DialogC1663c mo17611b() {
        return this.f2960c;
    }

    /* renamed from: b */
    public void mo17612b(boolean z) {
        this.f2964g = z;
    }

    /* renamed from: c */
    public DialogC1662b mo17613c() {
        return this.f2961d;
    }

    /* renamed from: d */
    public boolean mo17614d() {
        return this.f2964g;
    }

    public void destroy() {
        DialogC1663c cVar = this.f2960c;
        if (cVar != null) {
            if (cVar.isShowing()) {
                this.f2960c.dismiss();
            }
            this.f2960c = null;
        }
        DialogC1662b bVar = this.f2961d;
        if (bVar != null) {
            if (bVar.isShowing()) {
                this.f2961d.dismiss();
            }
            this.f2961d = null;
        }
        if (this.f2959b != null) {
            this.f2959b = null;
        }
    }

    public void destroy(boolean z) {
        DialogC1663c cVar = this.f2960c;
        if (cVar != null) {
            if (cVar.isShowing()) {
                this.f2960c.dismiss();
            }
            this.f2960c = null;
        }
        DialogC1662b bVar = this.f2961d;
        if (bVar != null) {
            if (bVar.isShowing()) {
                this.f2961d.dismiss();
            }
            if (z) {
                this.f2961d.mo17666d().pauseTimers();
            }
            this.f2961d = null;
        }
        if (this.f2959b != null) {
            this.f2959b = null;
        }
    }

    /* renamed from: e */
    public CaptchaConfiguration mo17617e() {
        return this.f2959b;
    }

    public Captcha init(CaptchaConfiguration captchaConfiguration) {
        if (captchaConfiguration == null) {
            throw new IllegalArgumentException("CaptchaConfiguration  is not allowed to be null");
        } else if (captchaConfiguration.f2979m != null) {
            this.f2959b = captchaConfiguration;
            C1664d.m2929a(captchaConfiguration.f2967a, captchaConfiguration.f2971e);
            this.f2962e = captchaConfiguration.f2970d == CaptchaConfiguration.ModeType.MODE_INTELLIGENT_NO_SENSE;
            DialogC1662b bVar = new DialogC1662b(this.f2959b);
            this.f2961d = bVar;
            bVar.mo17662a();
            return this;
        } else {
            throw new IllegalStateException("you must set a CaptchaListener before use it");
        }
    }

    public void validate() {
        this.startTime = System.currentTimeMillis();
        if (!C1664d.m2934a(this.f2959b.f2967a)) {
            m2885f();
            m2886g();
            this.f2960c.mo17678c(C1657R.string.tip_no_network);
            this.f2959b.f2979m.onError(NO_NETWORK, "no network,please check your network");
            return;
        }
        DialogC1662b bVar = this.f2961d;
        if (bVar == null || !bVar.f3019a || this.f2963f) {
            this.f2963f = false;
            DialogC1662b bVar2 = new DialogC1662b(this.f2959b);
            this.f2961d = bVar2;
            bVar2.mo17662a();
            m2885f();
            mo17609a();
        } else {
            bVar.show();
            this.f2963f = false;
        }
        this.f2964g = false;
    }
}
