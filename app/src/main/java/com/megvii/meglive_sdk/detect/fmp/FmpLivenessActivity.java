package com.megvii.meglive_sdk.detect.fmp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.react.uimanager.ViewProps;
import com.megvii.meglive_sdk.C1503R;
import com.megvii.meglive_sdk.base.DetectBaseActivity;
import com.megvii.meglive_sdk.detect.C1526a;
import com.megvii.meglive_sdk.detect.guide.GrantActivity;
import com.megvii.meglive_sdk.detect.p099a.C1529a;
import com.megvii.meglive_sdk.p096b.C1512a;
import com.megvii.meglive_sdk.p096b.C1516c;
import com.megvii.meglive_sdk.p106f.C1564f;
import com.megvii.meglive_sdk.p106f.C1565g;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1576q;
import com.megvii.meglive_sdk.p106f.C1580u;
import com.megvii.meglive_sdk.p106f.C1583x;
import com.megvii.meglive_sdk.p106f.EnumC1568j;
import com.megvii.meglive_sdk.view.CoverView;
import com.umeng.message.common.C3777a;
import s.h.e.l.l.C;

public class FmpLivenessActivity extends DetectBaseActivity<C1531a> implements TextureView.SurfaceTextureListener, View.OnClickListener, C1526a.AbstractC1528b {

    /* renamed from: A */
    public boolean f2333A = false;

    /* renamed from: B */
    public int f2334B = -1;

    /* renamed from: a */
    public int f2335a = 1;

    /* renamed from: b */
    public String f2336b = "";

    /* renamed from: c */
    public TextureView f2337c;

    /* renamed from: d */
    public CoverView f2338d;

    /* renamed from: e */
    public LinearLayout f2339e;

    /* renamed from: f */
    public C1516c f2340f;

    /* renamed from: g */
    public String f2341g;

    /* renamed from: h */
    public int f2342h;

    /* renamed from: i */
    public volatile boolean f2343i = false;

    /* renamed from: j */
    public ValueAnimator f2344j;

    /* renamed from: k */
    public ValueAnimator f2345k;

    /* renamed from: l */
    public long f2346l;

    /* renamed from: m */
    public LinearLayout f2347m;

    /* renamed from: n */
    public ProgressBar f2348n;

    /* renamed from: o */
    public ImageView f2349o;

    /* renamed from: p */
    public ImageView f2350p;

    /* renamed from: q */
    public int f2351q;

    /* renamed from: r */
    public int f2352r;

    /* renamed from: s */
    public float f2353s = 0.0f;

    /* renamed from: t */
    public float f2354t = 0.0f;

    /* renamed from: u */
    public float f2355u = 0.0f;

    /* renamed from: v */
    public long f2356v = 0;

    /* renamed from: w */
    public final long f2357w = 500;

    /* renamed from: x */
    public int f2358x = 0;

    /* renamed from: y */
    public String f2359y = "";

    /* renamed from: z */
    public Handler f2360z = new OooO00o();

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 100:
                    Bundle data = message.getData();
                    FmpLivenessActivity.this.f2337c.setLayoutParams(FmpLivenessActivity.this.f2338d.mo17241a(data.getInt("cameraWidth"), data.getInt("cameraHeight")));
                    float mCenterY = FmpLivenessActivity.this.f2338d.getMCenterY();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(14);
                    layoutParams.setMargins(0, (int) (mCenterY - ((float) (((int) FmpLivenessActivity.this.getResources().getDimension(C1503R.dimen.liveness_progress_maxsize)) / 2))), 0, 0);
                    FmpLivenessActivity.this.f2347m.setLayoutParams(layoutParams);
                    return;
                case 101:
                    FmpLivenessActivity.this.f2338d.setMode(message.getData().getInt("corverViewMode"));
                    return;
                case 102:
                    Bundle data2 = message.getData();
                    FmpLivenessActivity.m2477a(FmpLivenessActivity.this, data2.getInt("curStep"), data2.getFloat(ViewProps.START), data2.getFloat(ViewProps.END));
                    return;
                case 103:
                    FmpLivenessActivity.this.m2490f();
                    return;
                case 104:
                    Bundle data3 = message.getData();
                    FmpLivenessActivity.m2479a(FmpLivenessActivity.this, data3.getInt("curStep"), data3.getInt("qualityResult"), data3.getInt("detectResult"));
                    return;
                case 105:
                    Bundle data4 = message.getData();
                    FmpLivenessActivity.m2478a(FmpLivenessActivity.this, data4.getInt("tipsType"), data4.getInt("qualityResult"));
                    return;
                case 106:
                    FmpLivenessActivity.this.f2347m.setVisibility(0);
                    FmpLivenessActivity.this.f2356v = System.currentTimeMillis();
                    return;
                case 107:
                    Bundle data5 = message.getData();
                    String string = data5.getString(C3777a.f10015C);
                    FmpLivenessActivity.this.m2482a((FmpLivenessActivity) ((EnumC1568j) data5.getSerializable("failedType")), (EnumC1568j) string);
                    return;
                case 108:
                    Bundle data6 = message.getData();
                    FmpLivenessActivity.m2480a(FmpLivenessActivity.this, data6.getInt("resultCode"), data6.getString("resultMsg"), "");
                    return;
                case 109:
                    Bundle data7 = message.getData();
                    int i = data7.getInt("resultCode");
                    String string2 = data7.getString("resultMsg");
                    String string3 = data7.getString("retryText");
                    FmpLivenessActivity fmpLivenessActivity = FmpLivenessActivity.this;
                    C1512a.m2287a(fmpLivenessActivity.f2336b);
                    C1583x.m2690a(C1512a.m2289a("retry_popup_window", C1565g.m2630a(fmpLivenessActivity.mManagerImpl.f2160a), fmpLivenessActivity.f2335a));
                    fmpLivenessActivity.alertDialog = fmpLivenessActivity.mDialogUtil.mo17183a(string3, new OooO0O0(i, string2));
                    return;
                case 110:
                    FmpLivenessActivity.this.m2492g();
                    return;
                case 111:
                    FmpLivenessActivity.this.f2347m.setVisibility(8);
                    return;
                case 112:
                    if (!((C1531a) FmpLivenessActivity.this.getPresenter()).mo17109e()) {
                        FmpLivenessActivity.this.m2482a((FmpLivenessActivity) EnumC1568j.DEVICE_NOT_SUPPORT, (EnumC1568j) "");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ String o0ooOOo;

        public OooO0O0(int i, String str) {
            this.o00oO0O = i;
            this.o0ooOOo = str;
        }

        public final void onClick(View view) {
            if (view.getId() == C1503R.C1506id.tv_megvii_retry_dialog_left) {
                AlertDialog alertDialog = FmpLivenessActivity.this.alertDialog;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                C1564f.m2628a(FmpLivenessActivity.this);
                C1512a.f2087a++;
                C1512a.m2287a(FmpLivenessActivity.this.f2336b);
                C1583x.m2690a(C1512a.m2289a("retry_click_confirm", C1565g.m2630a(FmpLivenessActivity.this.mManagerImpl.f2160a), FmpLivenessActivity.this.f2335a));
                FmpLivenessActivity fmpLivenessActivity = FmpLivenessActivity.this;
                GrantActivity.m2536a(fmpLivenessActivity, fmpLivenessActivity.f2335a, FmpLivenessActivity.this.f2342h, FmpLivenessActivity.this.f2359y, FmpLivenessActivity.this.language);
                FmpLivenessActivity.this.overridePendingTransition(C1503R.anim.mg_slide_in_right, C1503R.anim.mg_slide_out_right);
                FmpLivenessActivity.this.finish();
            } else if (view.getId() == C1503R.C1506id.tv_megvii_retry_dialog_right) {
                AlertDialog alertDialog2 = FmpLivenessActivity.this.alertDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                C1512a.m2287a(FmpLivenessActivity.this.f2336b);
                C1583x.m2690a(C1512a.m2289a("retry_click_quit", C1565g.m2630a(FmpLivenessActivity.this.mManagerImpl.f2160a), FmpLivenessActivity.this.f2335a));
                FmpLivenessActivity.m2480a(FmpLivenessActivity.this, this.o00oO0O, this.o0ooOOo, "");
            }
        }
    }

    public class OooO0OO implements ValueAnimator.AnimatorUpdateListener {
        public OooO0OO() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FmpLivenessActivity.this.f2338d.mo17242a(((Float) valueAnimator.getAnimatedValue()).floatValue(), FmpLivenessActivity.this.f2351q);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.fmp.FmpLivenessActivity$OooO0Oo  reason: case insensitive filesystem */
    public class C5144OooO0Oo extends AnimatorListenerAdapter {
        public final /* synthetic */ int o00oO0O;

        public C5144OooO0Oo(int i) {
            this.o00oO0O = i;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.o00oO0O == 1 && !FmpLivenessActivity.this.f2343i) {
                FmpLivenessActivity fmpLivenessActivity = FmpLivenessActivity.this;
                FmpLivenessActivity.m2476a(fmpLivenessActivity, fmpLivenessActivity.f2355u);
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.fmp.FmpLivenessActivity$OooO0o0  reason: case insensitive filesystem */
    public class C5145OooO0o0 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float OooO0Oo;

        public C5145OooO0o0(float f) {
            this.OooO0Oo = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FmpLivenessActivity fmpLivenessActivity = FmpLivenessActivity.this;
            float f = this.OooO0Oo;
            fmpLivenessActivity.f2353s = (floatValue * (360.0f - f)) + f;
            FmpLivenessActivity.this.f2338d.mo17242a(FmpLivenessActivity.this.f2353s, FmpLivenessActivity.this.f2351q);
        }
    }

    static {
        C.i(50331742);
    }

    /* Return type fixed from 'com.megvii.meglive_sdk.base.DetectBasePresenter' to match base method */
    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public /* synthetic */ C1531a createPresenter() {
        return new C1531a();
    }

    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public native int getLayoutResId();

    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public void initData() {
        int d;
        this.f2354t = 198.0f;
        this.f2355u = 270.0f;
        C1516c d2 = C1565g.m2635d(getContext());
        this.f2340f = d2;
        this.f2346l = ((long) d2.f2119e) * 1000;
        this.f2341g = C1565g.m2630a(getContext());
        int g = C1565g.m2638g(getContext());
        this.f2358x = g;
        this.f2336b = g == 1 ? "liveness-sdk" : "FaceIDZFAC";
        this.f2342h = getIntent().getIntExtra("verticalCheckType", 0);
        this.f2351q = getResources().getColor(C1580u.m2676a(this).mo17202e(getString(C1503R.string.key_liveness_home_processBar_color)));
        this.f2352r = getResources().getColor(C1580u.m2676a(this).mo17202e(getString(C1503R.string.key_liveness_home_validationFailProcessBar_color)));
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, C1503R.anim.mg_liveness_progress_circle_shape);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f2348n.setIndeterminateDrawable(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_liveness_home_loadingIcon_material))));
        this.f2348n.startAnimation(rotateAnimation);
        this.f2349o.setImageBitmap(BitmapFactory.decodeResource(getResources(), C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_liveness_home_closeIcon_material))));
        int f = C1565g.m2637f(this);
        if (f == 1) {
            this.f2350p.setVisibility(8);
        } else if (f == 2) {
            String stringExtra = getIntent().getStringExtra("logoFileName");
            this.f2359y = stringExtra;
            if (!"".equals(stringExtra) && (d = C1580u.m2676a(this).mo17201d(this.f2359y)) != -1) {
                this.f2350p.setImageDrawable(getResources().getDrawable(d));
            }
        }
    }

    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public void initView() {
        this.f2338d = (CoverView) findViewById(C1503R.C1506id.livess_layout_coverview);
        TextureView textureView = (TextureView) findViewById(C1503R.C1506id.liveness_layout_textureview);
        this.f2337c = textureView;
        textureView.setSurfaceTextureListener(this);
        this.f2337c.setVisibility(0);
        this.f2347m = (LinearLayout) findViewById(C1503R.C1506id.ll_progress_bar);
        this.f2348n = (ProgressBar) findViewById(C1503R.C1506id.pb_megvii_load);
        this.f2350p = (ImageView) findViewById(C1503R.C1506id.iv_megvii_powerby);
        this.f2349o = (ImageView) findViewById(C1503R.C1506id.iv_liveness_homepage_close);
        LinearLayout linearLayout = (LinearLayout) findViewById(C1503R.C1506id.ll_detect_close);
        this.f2339e = linearLayout;
        linearLayout.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (!isFinishing()) {
            if (view.getId() == C1503R.C1506id.ll_detect_close) {
                AlertDialog alertDialog = this.alertDialog;
                if (alertDialog == null || !alertDialog.isShowing()) {
                    this.alertDialog = this.mDialogUtil.mo17182a(this);
                    m2492g();
                    C1512a.m2287a(this.f2336b);
                    C1583x.m2690a(C1512a.m2289a("click_quit_icon", C1565g.m2630a(this.mManagerImpl.f2160a), this.f2335a));
                }
            } else if (view.getId() == C1503R.C1506id.tv_megvii_dialog_left) {
                AlertDialog alertDialog2 = this.alertDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                C1531a aVar = (C1531a) getPresenter();
                try {
                    C1571m.m2655a("FMPDetect", "resetDetect...");
                    aVar.getModel();
                    FmpDetectModelImpl.m2471d();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                ((C1531a) getPresenter()).mo17105a();
                ((C1531a) getPresenter()).mo17107c();
                C1564f.m2628a(this);
                C1512a.m2287a(this.f2336b);
                C1583x.m2690a(C1512a.m2289a("click_cancel_quit", C1565g.m2630a(this.mManagerImpl.f2160a), this.f2335a));
            } else if (view.getId() == C1503R.C1506id.tv_megvii_dialog_right) {
                AlertDialog alertDialog3 = this.alertDialog;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                m2482a(EnumC1568j.USER_CANCEL, "");
                C1512a.m2287a(this.f2336b);
                C1583x.m2690a(C1512a.m2289a("click_confirm_quit", C1565g.m2630a(this.mManagerImpl.f2160a), this.f2335a));
            }
        }
    }

    public native void onDestroy();

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public void onPause() {
        try {
            if (!isFinishing()) {
                m2482a(EnumC1568j.GO_TO_BACKGROUND, ((C1531a) getPresenter()).mo17104a(-1));
                C1512a.m2287a(this.f2336b);
                C1583x.m2690a(C1512a.m2289a("fail_liveness:go_to_background", C1565g.m2630a(this.mManagerImpl.f2160a), this.f2335a));
            }
            if (isFinishing()) {
                m2487e();
            }
            super.onPause();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public native void onStop();

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!((C1531a) getPresenter()).openCamera() || !((C1531a) getPresenter()).mo17105a()) {
            m2482a(EnumC1568j.DEVICE_NOT_SUPPORT, (String) null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("cameraWidth", ((C1531a) getPresenter()).getCameraWidth());
        bundle.putInt("cameraHeight", ((C1531a) getPresenter()).getCameraHeight());
        m2474a(100, bundle);
        ((C1531a) getPresenter()).mo17107c();
        this.f2338d.setMode(0);
        m2475a(112, new Bundle(), 1000);
    }

    public native boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture);

    public native void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2);

    public native void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    /* renamed from: e */
    private void m2487e() {
        if (!this.f2333A) {
            ((C1531a) getPresenter()).mo17108d();
            ((C1531a) getPresenter()).closeCamera();
            ((C1531a) getPresenter()).detach();
            Handler handler = this.f2360z;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f2333A = true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m2490f() {
        ValueAnimator valueAnimator = this.f2344j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f2345k;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private void m2492g() {
        ((C1531a) getPresenter()).mo17108d();
        ((C1531a) getPresenter()).mo17106b();
        m2490f();
        this.f2338d.setMode(-1);
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: c */
    public final void mo17021c() {
        m2474a(103, new Bundle());
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: d */
    public final void mo17023d() {
        m2474a(106, new Bundle());
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: b */
    public final C1529a mo17019b() {
        C1529a aVar = new C1529a();
        aVar.f2170b = this.f2341g;
        aVar.f2169a = this.f2340f.f2115a;
        aVar.f2175g = C1576q.m2667a(this, C1503R.raw.meg_facerect);
        aVar.f2176h = C1576q.m2667a(this, C1503R.raw.meg_facelandmark);
        aVar.f2177i = C1576q.m2667a(this, C1503R.raw.meg_action);
        aVar.f2171c = this.f2340f.f2117c;
        aVar.f2174f = this.f2346l;
        aVar.f2178j = this.f2342h;
        aVar.f2179k = this.f2358x;
        return aVar;
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: c */
    public final void mo17022c(int i) {
        EnumC1568j jVar;
        m2474a(110, new Bundle());
        String a = ((C1531a) getPresenter()).mo17104a(i);
        Bundle bundle = new Bundle();
        bundle.putString(C3777a.f10015C, a);
        if (i == C1512a.EnumC1514b.f2108b - 1) {
            jVar = EnumC1568j.LIVENESS_TIME_OUT;
        } else if (i == C1512a.EnumC1514b.f2107a - 1) {
            jVar = EnumC1568j.LIVENESS_FINISH;
        } else {
            jVar = EnumC1568j.LIVENESS_FAILURE;
        }
        bundle.putSerializable("failedType", jVar);
        long currentTimeMillis = System.currentTimeMillis() - this.f2356v;
        if (currentTimeMillis >= 500) {
            m2474a(107, bundle);
        } else {
            m2475a(107, bundle, 500 - currentTimeMillis);
        }
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: a */
    public final SurfaceTexture mo17015a() {
        TextureView textureView = this.f2337c;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: a */
    public final void mo17016a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("corverViewMode", i);
        m2474a(101, bundle);
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: a */
    public final void mo17018a(int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("curStep", i);
        bundle.putInt("qualityResult", i2);
        bundle.putInt("detectResult", i3);
        m2474a(104, bundle);
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: a */
    public final void mo17017a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("tipsType", i);
        bundle.putInt("qualityResult", i2);
        m2474a(105, bundle);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m2482a(EnumC1568j jVar, String str) {
        if (!isFinishing()) {
            this.mManagerImpl.mo17004a(jVar, str);
            finish();
        }
    }

    /* renamed from: a */
    private void m2474a(int i, Bundle bundle) {
        Message message = new Message();
        message.what = i;
        message.setData(bundle);
        this.f2360z.sendMessage(message);
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1528b
    /* renamed from: b */
    public final void mo17020b(int i) {
        int i2;
        int i3 = 0;
        if (i == 0) {
            float f = this.f2353s;
            if (f == 0.0f) {
                f = this.f2355u;
            }
            i3 = (int) f;
        } else if (i == 1) {
            i3 = (int) this.f2354t;
            i2 = (int) this.f2355u;
            Bundle bundle = new Bundle();
            bundle.putInt("curStep", i);
            bundle.putFloat(ViewProps.START, (float) i3);
            bundle.putFloat(ViewProps.END, (float) i2);
            m2474a(102, bundle);
        }
        i2 = 0;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("curStep", i);
        bundle2.putFloat(ViewProps.START, (float) i3);
        bundle2.putFloat(ViewProps.END, (float) i2);
        m2474a(102, bundle2);
    }

    /* renamed from: a */
    private void m2475a(int i, Bundle bundle, long j) {
        Message message = new Message();
        message.what = i;
        message.setData(bundle);
        this.f2360z.sendMessageDelayed(message, j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2477a(FmpLivenessActivity fmpLivenessActivity, int i, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        fmpLivenessActivity.f2344j = ofFloat;
        ofFloat.setDuration(200L);
        fmpLivenessActivity.f2344j.setRepeatCount(0);
        fmpLivenessActivity.f2344j.addUpdateListener(new OooO0OO());
        fmpLivenessActivity.f2344j.addListener(new C5144OooO0Oo(i));
        fmpLivenessActivity.f2344j.start();
    }

    /* renamed from: a */
    public static /* synthetic */ void m2479a(FmpLivenessActivity fmpLivenessActivity, int i, int i2, int i3) {
        float f;
        CoverView coverView;
        int i4;
        if (i == 0) {
            if (i2 > 3 && i2 < 13) {
                coverView = fmpLivenessActivity.f2338d;
                f = fmpLivenessActivity.f2354t;
                i4 = fmpLivenessActivity.f2351q;
            } else if (i2 == 13) {
                coverView = fmpLivenessActivity.f2338d;
                f = fmpLivenessActivity.f2355u;
                i4 = fmpLivenessActivity.f2351q;
            } else {
                coverView = fmpLivenessActivity.f2338d;
                f = 0.0f;
                i4 = fmpLivenessActivity.f2351q;
            }
        } else if (i == 2) {
            coverView = fmpLivenessActivity.f2338d;
            f = 360.0f;
            i4 = i3 == 0 ? fmpLivenessActivity.f2351q : fmpLivenessActivity.f2352r;
        } else {
            return;
        }
        coverView.mo17242a(f, i4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2478a(FmpLivenessActivity fmpLivenessActivity, int i, int i2) {
        String str;
        if (i == 1) {
            str = fmpLivenessActivity.getResources().getString(C1580u.m2676a(fmpLivenessActivity).mo17199b(fmpLivenessActivity.getString(C1503R.string.key_livenessHomePromptVerticalText)));
            if (fmpLivenessActivity.f2334B != i) {
                C1512a.m2287a(fmpLivenessActivity.f2336b);
                C1583x.m2690a(C1512a.m2289a("fail_mirror:vertical_detection_failed", fmpLivenessActivity.f2341g, fmpLivenessActivity.f2335a));
            }
        } else {
            str = i == 2 ? fmpLivenessActivity.getMirroFailedMsg(i2) : i == 4 ? fmpLivenessActivity.getResources().getString(C1580u.m2676a(fmpLivenessActivity).mo17199b(fmpLivenessActivity.getString(C1503R.string.key_liveness_home_promptWait_text))) : i == 3 ? fmpLivenessActivity.getResources().getString(C1580u.m2676a(fmpLivenessActivity).mo17199b(fmpLivenessActivity.getString(C1503R.string.key_liveness_home_promptStayStill_text))) : null;
        }
        fmpLivenessActivity.f2334B = i;
        if (!TextUtils.isEmpty(str)) {
            fmpLivenessActivity.f2338d.setTips(str);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2480a(FmpLivenessActivity fmpLivenessActivity, int i, String str, String str2) {
        if (!fmpLivenessActivity.isFinishing()) {
            fmpLivenessActivity.mManagerImpl.mo17001a(i, str, str2);
            fmpLivenessActivity.finish();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2476a(FmpLivenessActivity fmpLivenessActivity, float f) {
        ValueAnimator valueAnimator = fmpLivenessActivity.f2345k;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            fmpLivenessActivity.f2345k = ofFloat;
            ofFloat.setDuration(fmpLivenessActivity.f2346l);
            fmpLivenessActivity.f2345k.setRepeatCount(0);
            fmpLivenessActivity.f2345k.setInterpolator(new LinearInterpolator());
            fmpLivenessActivity.f2345k.addUpdateListener(new C5145OooO0o0(f));
            fmpLivenessActivity.f2345k.start();
        }
    }
}
