package com.netease.nis.captcha;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C7009o000OoOo;

/* renamed from: com.netease.nis.captcha.c */
public class DialogC1663c extends Dialog {

    /* renamed from: a */
    public Context f3045a;

    /* renamed from: b */
    public TextView f3046b;

    /* renamed from: c */
    public ImageView f3047c;

    /* renamed from: d */
    public RelativeLayout f3048d;

    /* renamed from: e */
    public ImageView f3049e;

    /* renamed from: f */
    public boolean f3050f = false;

    /* renamed from: g */
    public int f3051g;

    /* renamed from: h */
    public String f3052h;

    /* renamed from: i */
    public int f3053i;

    /* renamed from: com.netease.nis.captcha.c$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        public void onClick(View view) {
            if (C1664d.m2934a(DialogC1663c.this.f3045a)) {
                if (DialogC1663c.this.f3050f) {
                    Captcha.getInstance().mo17609a();
                } else {
                    DialogC1662b c = Captcha.getInstance().mo17613c();
                    if (c != null) {
                        c.mo17665c();
                    }
                }
                DialogC1663c.this.m2915b();
            }
        }
    }

    /* renamed from: com.netease.nis.captcha.c$OooO0O0 */
    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            DialogC1663c.this.dismiss();
        }
    }

    public DialogC1663c(@NonNull Context context) {
        super(context, C1657R.style.CaptchaDialogStyle);
        this.f3045a = context;
    }

    /* renamed from: a */
    private void m2914a() {
        setContentView(C1657R.layout.dialog_captcha_tip);
        this.f3046b = (TextView) findViewById(C1657R.C1660id.tv_status);
        this.f3047c = (ImageView) findViewById(C1657R.C1660id.iv_loading);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1657R.C1660id.tip_dialog_rl);
        this.f3048d = relativeLayout;
        relativeLayout.setOnClickListener(new OooO00o());
        ImageView imageView = (ImageView) findViewById(C1657R.C1660id.img_btn_close);
        this.f3049e = imageView;
        imageView.setOnClickListener(new OooO0O0());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m2915b() {
        int i = this.f3051g;
        if (i == 0) {
            if (!TextUtils.isEmpty(this.f3052h)) {
                mo17677b(this.f3052h);
                return;
            }
            i = C1657R.string.tip_loading;
        }
        mo17678c(i);
    }

    /* renamed from: c */
    private void m2917c() {
        Context context;
        int i = this.f3053i;
        if (i == 0 || (context = this.f3045a) == null) {
            this.f3047c.setImageResource(C1657R.C1659drawable.nis_captcha_anim_loading);
        } else {
            this.f3047c.setImageDrawable(C7009o000OoOo.m18256OooO00o(context, i));
        }
        ((AnimationDrawable) this.f3047c.getDrawable()).start();
    }

    /* renamed from: d */
    private void m2919d() {
        try {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.f3047c.getDrawable();
            if (animationDrawable != null) {
                animationDrawable.stop();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m2920e() {
        ImageView imageView = this.f3049e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: f */
    private void m2921f() {
        ImageView imageView = this.f3049e;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    /* renamed from: a */
    public void mo17674a(int i) {
        this.f3051g = i;
    }

    /* renamed from: a */
    public void mo17675a(String str) {
        this.f3052h = str;
    }

    /* renamed from: b */
    public void mo17676b(int i) {
        this.f3053i = i;
    }

    /* renamed from: b */
    public void mo17677b(String str) {
        this.f3046b.setText(str);
        if (!TextUtils.isEmpty(this.f3052h) && this.f3052h.equals(str)) {
            m2917c();
        }
    }

    /* renamed from: c */
    public void mo17678c(int i) {
        TextView textView = this.f3046b;
        if (textView != null) {
            textView.setText(i);
            if (i == C1657R.string.tip_init_timeout || i == C1657R.string.tip_load_failed || i == C1657R.string.tip_no_network) {
                this.f3047c.setImageResource(C1657R.mipmap.ic_error);
                m2920e();
                if (i == C1657R.string.tip_no_network) {
                    this.f3050f = true;
                }
            } else if (i == C1657R.string.tip_loading || i == this.f3051g) {
                m2917c();
                m2921f();
            }
        }
    }

    public void dismiss() {
        try {
            if (this.f3045a != null && !((Activity) this.f3045a).isFinishing()) {
                super.dismiss();
            }
        } catch (Exception e) {
            C1664d.m2936b(Captcha.TAG, "Captcha Tip Dialog dismiss Error: %s", e.toString());
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Captcha.getInstance().mo17612b(true);
        dismiss();
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        m2914a();
    }

    public void onStart() {
        super.onStart();
        m2917c();
        m2915b();
        this.f3050f = false;
    }

    public void onStop() {
        m2919d();
        super.onStop();
    }

    public void show() {
        try {
            if (this.f3045a != null && !((Activity) this.f3045a).isFinishing()) {
                super.show();
            }
        } catch (Exception e) {
            C1664d.m2936b("Captcha Tip Dialog show Error:%s", e.toString());
        }
    }
}
