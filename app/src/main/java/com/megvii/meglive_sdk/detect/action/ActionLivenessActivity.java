package com.megvii.meglive_sdk.detect.action;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import com.megvii.meglive_sdk.C1503R;
import com.megvii.meglive_sdk.base.DetectBaseActivity;
import com.megvii.meglive_sdk.detect.C1526a;
import com.megvii.meglive_sdk.detect.guide.GrantActivity;
import com.megvii.meglive_sdk.detect.p099a.C1529a;
import com.megvii.meglive_sdk.p096b.C1512a;
import com.megvii.meglive_sdk.p096b.C1516c;
import com.megvii.meglive_sdk.p106f.C1559c;
import com.megvii.meglive_sdk.p106f.C1564f;
import com.megvii.meglive_sdk.p106f.C1565g;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1572n;
import com.megvii.meglive_sdk.p106f.C1576q;
import com.megvii.meglive_sdk.p106f.C1580u;
import com.megvii.meglive_sdk.p106f.C1583x;
import com.megvii.meglive_sdk.p106f.EnumC1568j;
import com.megvii.meglive_sdk.view.CoverView;
import com.megvii.meglive_sdk.volley.p107a.p114f.C1613c;
import com.umeng.message.common.C3777a;
import java.util.Arrays;
import java.util.Random;
import s.h.e.l.l.C;

public class ActionLivenessActivity extends DetectBaseActivity<C1530a> implements TextureView.SurfaceTextureListener, View.OnClickListener, C1526a.AbstractC1527a {

    /* renamed from: A */
    public long f2180A = 0;

    /* renamed from: B */
    public final long f2181B = 500;

    /* renamed from: C */
    public Handler f2182C = new OooO00o();

    /* renamed from: D */
    public boolean f2183D = false;

    /* renamed from: E */
    public int f2184E = -1;

    /* renamed from: a */
    public int f2185a = 2;

    /* renamed from: b */
    public String f2186b = "";

    /* renamed from: c */
    public TextureView f2187c;

    /* renamed from: d */
    public CoverView f2188d;

    /* renamed from: e */
    public LinearLayout f2189e;

    /* renamed from: f */
    public C1516c f2190f;

    /* renamed from: g */
    public String f2191g;

    /* renamed from: h */
    public int f2192h;

    /* renamed from: i */
    public LinearLayout f2193i;

    /* renamed from: j */
    public ProgressBar f2194j;

    /* renamed from: k */
    public ImageView f2195k;

    /* renamed from: l */
    public ImageView f2196l;

    /* renamed from: m */
    public ImageView f2197m;

    /* renamed from: n */
    public int f2198n;

    /* renamed from: o */
    public int f2199o;

    /* renamed from: p */
    public int[] f2200p;

    /* renamed from: q */
    public int f2201q = 0;

    /* renamed from: r */
    public int f2202r = 0;

    /* renamed from: s */
    public String f2203s = "";

    /* renamed from: t */
    public AnimationDrawable f2204t;

    /* renamed from: u */
    public AnimationDrawable f2205u;

    /* renamed from: v */
    public AnimationDrawable f2206v;

    /* renamed from: w */
    public AnimationDrawable f2207w;

    /* renamed from: x */
    public AnimationDrawable f2208x;

    /* renamed from: y */
    public C1559c f2209y;

    /* renamed from: z */
    public C1572n f2210z;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 100:
                    Bundle data = message.getData();
                    ActionLivenessActivity.this.f2187c.setLayoutParams(ActionLivenessActivity.this.f2188d.mo17241a(data.getInt("cameraWidth"), data.getInt("cameraHeight")));
                    float mCenterY = ActionLivenessActivity.this.f2188d.getMCenterY();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(14);
                    layoutParams.setMargins(0, (int) (mCenterY - ((float) (((int) ActionLivenessActivity.this.getResources().getDimension(C1503R.dimen.liveness_progress_maxsize)) / 2))), 0, 0);
                    ActionLivenessActivity.this.f2193i.setLayoutParams(layoutParams);
                    return;
                case 101:
                    ActionLivenessActivity.this.f2188d.setMode(message.getData().getInt("corverViewMode"));
                    return;
                case 102:
                    Bundle data2 = message.getData();
                    ActionLivenessActivity.m2345a(ActionLivenessActivity.this, data2.getInt("actionIndex"), data2.getInt("currentAction"));
                    return;
                case 103:
                    Bundle data3 = message.getData();
                    int i = data3.getInt("resultCode");
                    String string = data3.getString("resultMsg");
                    String string2 = data3.getString("retryText");
                    ActionLivenessActivity actionLivenessActivity = ActionLivenessActivity.this;
                    C1512a.m2287a(actionLivenessActivity.f2186b);
                    C1583x.m2690a(C1512a.m2289a("retry_popup_window", C1565g.m2630a(actionLivenessActivity.mManagerImpl.f2160a), actionLivenessActivity.f2185a));
                    actionLivenessActivity.alertDialog = actionLivenessActivity.mDialogUtil.mo17183a(string2, new OooO0O0(i, string));
                    return;
                case 104:
                    Bundle data4 = message.getData();
                    ActionLivenessActivity.m2346a(ActionLivenessActivity.this, data4.getInt("curStep"), data4.getInt("actionIndex"), data4.getInt("detectResult"));
                    return;
                case 105:
                    Bundle data5 = message.getData();
                    ActionLivenessActivity.m2351b(ActionLivenessActivity.this, data5.getInt("tipsType"), data5.getInt("qualityResult"));
                    return;
                case 106:
                    ActionLivenessActivity.this.f2193i.setVisibility(0);
                    ActionLivenessActivity.this.f2180A = System.currentTimeMillis();
                    return;
                case 107:
                    Bundle data6 = message.getData();
                    String string3 = data6.getString(C3777a.f10015C);
                    ActionLivenessActivity.this.m2349a((ActionLivenessActivity) ((EnumC1568j) data6.getSerializable("failedType")), (EnumC1568j) string3);
                    return;
                case 108:
                    Bundle data7 = message.getData();
                    ActionLivenessActivity.m2347a(ActionLivenessActivity.this, data7.getInt("resultCode"), data7.getString("resultMsg"), "");
                    return;
                case 109:
                    ActionLivenessActivity.this.f2193i.setVisibility(8);
                    return;
                case 110:
                    ActionLivenessActivity.this.m2358g();
                    return;
                case 111:
                    if (!((C1530a) ActionLivenessActivity.this.getPresenter()).mo17039e()) {
                        ActionLivenessActivity.this.m2349a((ActionLivenessActivity) EnumC1568j.DEVICE_NOT_SUPPORT, (EnumC1568j) "");
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
                AlertDialog alertDialog = ActionLivenessActivity.this.alertDialog;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                C1564f.m2628a(ActionLivenessActivity.this);
                C1512a.f2087a++;
                C1512a.m2287a(ActionLivenessActivity.this.f2186b);
                C1583x.m2690a(C1512a.m2289a("retry_click_confirm", C1565g.m2630a(ActionLivenessActivity.this.mManagerImpl.f2160a), ActionLivenessActivity.this.f2185a));
                ActionLivenessActivity actionLivenessActivity = ActionLivenessActivity.this;
                GrantActivity.m2536a(actionLivenessActivity, actionLivenessActivity.f2185a, ActionLivenessActivity.this.f2192h, ActionLivenessActivity.this.f2203s, ActionLivenessActivity.this.language);
                ActionLivenessActivity.this.overridePendingTransition(C1503R.anim.mg_slide_in_right, C1503R.anim.mg_slide_out_right);
                ActionLivenessActivity.this.finish();
            } else if (view.getId() == C1503R.C1506id.tv_megvii_retry_dialog_right) {
                AlertDialog alertDialog2 = ActionLivenessActivity.this.alertDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                C1512a.m2287a(ActionLivenessActivity.this.f2186b);
                C1583x.m2690a(C1512a.m2289a("retry_click_quit", C1565g.m2630a(ActionLivenessActivity.this.mManagerImpl.f2160a), ActionLivenessActivity.this.f2185a));
                ActionLivenessActivity.m2347a(ActionLivenessActivity.this, this.o00oO0O, this.o0ooOOo, "");
            }
        }
    }

    static {
        C.i(50331739);
    }

    /* Return type fixed from 'com.megvii.meglive_sdk.base.DetectBasePresenter' to match base method */
    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public /* synthetic */ C1530a createPresenter() {
        return new C1530a();
    }

    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public native int getLayoutResId();

    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public void initData() {
        int d;
        this.f2210z = new C1572n(this);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        this.f2204t = animationDrawable;
        animationDrawable.addFrame(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_mouth_close))), 500);
        this.f2204t.addFrame(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_mouth_open))), 500);
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        this.f2205u = animationDrawable2;
        animationDrawable2.addFrame(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_eye_open))), 500);
        this.f2205u.addFrame(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_eye_close))), 500);
        AnimationDrawable animationDrawable3 = new AnimationDrawable();
        this.f2206v = animationDrawable3;
        animationDrawable3.addFrame(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_nod_up))), 500);
        this.f2206v.addFrame(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_nod_down))), 500);
        AnimationDrawable animationDrawable4 = new AnimationDrawable();
        this.f2207w = animationDrawable4;
        animationDrawable4.addFrame(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_shakehead_left))), 500);
        this.f2207w.addFrame(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_shakehead_right))), 500);
        this.f2190f = C1565g.m2635d(getContext());
        int g = C1565g.m2638g(getContext());
        this.f2202r = g;
        this.f2186b = g == 1 ? "liveness-sdk" : "FaceIDZFAC";
        this.f2200p = this.f2190f.f2118d;
        this.f2191g = C1565g.m2630a(getContext());
        this.f2192h = getIntent().getIntExtra("verticalCheckType", 0);
        this.f2198n = getResources().getColor(C1580u.m2676a(this).mo17202e(getString(C1503R.string.key_liveness_home_processBar_color)));
        this.f2199o = getResources().getColor(C1580u.m2676a(this).mo17202e(getString(C1503R.string.key_liveness_home_validationFailProcessBar_color)));
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, C1503R.anim.mg_liveness_progress_circle_shape);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f2194j.setIndeterminateDrawable(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_liveness_home_loadingIcon_material))));
        this.f2194j.startAnimation(rotateAnimation);
        ImageView imageView = (ImageView) findViewById(C1503R.C1506id.image_animation);
        this.f2197m = imageView;
        this.f2209y = new C1559c(this, imageView);
        this.f2195k.setImageBitmap(BitmapFactory.decodeResource(getResources(), C1580u.m2676a(this).mo17198a(getString(C1503R.string.key_liveness_home_closeIcon_material))));
        int f = C1565g.m2637f(this);
        if (f == 1) {
            this.f2196l.setVisibility(8);
        } else if (f == 2) {
            String stringExtra = getIntent().getStringExtra("logoFileName");
            this.f2203s = stringExtra;
            if (!"".equals(stringExtra) && (d = C1580u.m2676a(this).mo17201d(this.f2203s)) != -1) {
                this.f2196l.setImageDrawable(getResources().getDrawable(d));
            }
        }
    }

    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public void initView() {
        this.f2188d = (CoverView) findViewById(C1503R.C1506id.livess_layout_coverview);
        TextureView textureView = (TextureView) findViewById(C1503R.C1506id.liveness_layout_textureview);
        this.f2187c = textureView;
        textureView.setSurfaceTextureListener(this);
        this.f2187c.setVisibility(0);
        this.f2193i = (LinearLayout) findViewById(C1503R.C1506id.ll_progress_bar);
        this.f2194j = (ProgressBar) findViewById(C1503R.C1506id.pb_megvii_load);
        this.f2196l = (ImageView) findViewById(C1503R.C1506id.iv_megvii_powerby);
        this.f2195k = (ImageView) findViewById(C1503R.C1506id.iv_liveness_homepage_close);
        LinearLayout linearLayout = (LinearLayout) findViewById(C1503R.C1506id.ll_action_close);
        this.f2189e = linearLayout;
        linearLayout.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (!isFinishing()) {
            if (view.getId() == C1503R.C1506id.ll_action_close) {
                AlertDialog alertDialog = this.alertDialog;
                if (alertDialog == null || !alertDialog.isShowing()) {
                    this.alertDialog = this.mDialogUtil.mo17182a(this);
                    m2358g();
                    C1512a.m2287a(this.f2186b);
                    C1583x.m2690a(C1512a.m2289a("click_quit_icon", this.f2191g, this.f2185a));
                }
            } else if (view.getId() == C1503R.C1506id.tv_megvii_dialog_left) {
                AlertDialog alertDialog2 = this.alertDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                this.f2201q++;
                C1559c cVar = this.f2209y;
                ((Activity) cVar.f2560b).runOnUiThread(new Runnable() {
                    /* class com.megvii.meglive_sdk.p106f.C1559c.RunnableC15613 */

                    public final void run() {
                        if (C1559c.this.f2561c.getVisibility() == 0) {
                            C1559c.this.f2561c.setVisibility(8);
                        }
                    }
                });
                C1571m.m2655a("actionQueue", Arrays.toString(this.f2200p));
                int[] iArr = this.f2200p;
                if (iArr != null && iArr.length > 1) {
                    int length = iArr.length;
                    while (length > 1) {
                        int i = length - 1;
                        int nextInt = new Random().nextInt(length);
                        int i2 = iArr[nextInt];
                        iArr[nextInt] = iArr[i];
                        iArr[i] = i2;
                        length = i;
                    }
                }
                C1571m.m2655a("actionQueue", Arrays.toString(this.f2200p));
                C1530a aVar = (C1530a) getPresenter();
                int[] iArr2 = this.f2200p;
                try {
                    C1571m.m2655a("ActionDetect", "resetDetect...");
                    aVar.f2211a = -1;
                    aVar.f2213c = -1;
                    aVar.f2212b = -1;
                    aVar.f2214d = -1;
                    aVar.f2215e.f2173e = iArr2;
                    aVar.getModel();
                    ActionDetectModeImpl.m2338a(iArr2);
                    aVar.getModel();
                    ActionDetectModeImpl.m2340b();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ((C1530a) getPresenter()).mo17035a();
                ((C1530a) getPresenter()).mo17037c();
                C1564f.m2628a(this);
                C1512a.m2287a(this.f2186b);
                C1583x.m2690a(C1512a.m2289a("click_cancel_quit", this.f2191g, this.f2185a));
            } else if (view.getId() == C1503R.C1506id.tv_megvii_dialog_right) {
                AlertDialog alertDialog3 = this.alertDialog;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                m2349a(EnumC1568j.USER_CANCEL, "");
                C1512a.m2287a(this.f2186b);
                C1583x.m2690a(C1512a.m2289a("click_confirm_quit", this.f2191g, this.f2185a));
            }
        }
    }

    public native void onDestroy();

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    @Override // com.megvii.meglive_sdk.base.DetectBaseActivity
    public void onPause() {
        try {
            if (!isFinishing()) {
                m2349a(EnumC1568j.GO_TO_BACKGROUND, ((C1530a) getPresenter()).mo17034a(-1));
                C1512a.m2287a(this.f2186b);
                C1583x.m2690a(C1512a.m2289a("fail_liveness:go_to_background", this.f2191g, this.f2185a));
            }
            if (isFinishing()) {
                m2356f();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onPause();
    }

    public native void onStop();

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!((C1530a) getPresenter()).openCamera() || !((C1530a) getPresenter()).mo17035a()) {
            m2349a(EnumC1568j.DEVICE_NOT_SUPPORT, "");
            C1571m.m2655a("onSurfaceTextureAvailable", "相机开启失败");
            return;
        }
        C1571m.m2655a("onSurfaceTextureAvailable", "相机开启成功");
        Bundle bundle = new Bundle();
        bundle.putInt("cameraWidth", ((C1530a) getPresenter()).getCameraWidth());
        bundle.putInt("cameraHeight", ((C1530a) getPresenter()).getCameraHeight());
        m2343a(100, bundle);
        ((C1530a) getPresenter()).mo17037c();
        this.f2188d.setMode(0);
        m2344a(111, new Bundle(), 1000);
    }

    public native boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture);

    public native void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2);

    public native void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    /* renamed from: f */
    private void m2356f() {
        if (!this.f2183D) {
            ((C1530a) getPresenter()).mo17038d();
            ((C1530a) getPresenter()).closeCamera();
            ((C1530a) getPresenter()).detach();
            Handler handler = this.f2182C;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C1572n nVar = this.f2210z;
            if (nVar != null) {
                nVar.mo17190a();
            }
            this.f2183D = true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private void m2358g() {
        ((C1530a) getPresenter()).mo17038d();
        ((C1530a) getPresenter()).mo17036b();
        this.f2209y.mo17178a();
        this.f2188d.setMode(-1);
        this.f2210z.mo17192b();
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: b */
    public final C1529a mo17010b() {
        C1529a aVar = new C1529a();
        C1516c cVar = this.f2190f;
        aVar.f2169a = cVar.f2115a;
        aVar.f2170b = this.f2191g;
        aVar.f2171c = cVar.f2117c;
        aVar.f2175g = C1576q.m2667a(this, C1503R.raw.meg_facerect);
        aVar.f2176h = C1576q.m2667a(this, C1503R.raw.meg_facelandmark);
        aVar.f2177i = C1576q.m2667a(this, C1503R.raw.meg_action);
        C1516c cVar2 = this.f2190f;
        aVar.f2172d = cVar2.f2116b;
        aVar.f2173e = cVar2.f2118d;
        aVar.f2178j = this.f2192h;
        aVar.f2179k = this.f2202r;
        return aVar;
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: c */
    public final void mo17012c() {
        Bundle bundle = new Bundle();
        bundle.putInt("corverViewMode", 0);
        m2343a(101, bundle);
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: d */
    public final void mo17013d() {
        m2343a(106, new Bundle());
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: e */
    public final int mo17014e() {
        return this.f2201q;
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: a */
    public final SurfaceTexture mo17006a() {
        TextureView textureView = this.f2187c;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: a */
    public final void mo17009a(int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("curStep", i);
        bundle.putInt("actionIndex", i2);
        bundle.putInt("detectResult", i3);
        m2343a(104, bundle);
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: a */
    public final void mo17008a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("tipsType", i);
        bundle.putInt("qualityResult", i2);
        m2343a(105, bundle);
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: a */
    public final void mo17007a(int i) {
        EnumC1568j jVar;
        m2343a(110, new Bundle());
        String a = ((C1530a) getPresenter()).mo17034a(i);
        Bundle bundle = new Bundle();
        bundle.putString(C3777a.f10015C, a);
        if (i == C1512a.EnumC1513a.f2098d - 1) {
            jVar = EnumC1568j.LIVENESS_TIME_OUT;
        } else if (i == C1512a.EnumC1513a.f2095a - 1) {
            jVar = EnumC1568j.LIVENESS_FINISH;
        } else {
            jVar = EnumC1568j.LIVENESS_FAILURE;
        }
        bundle.putSerializable("failedType", jVar);
        if (System.currentTimeMillis() - this.f2180A >= 500) {
            m2343a(107, bundle);
        } else {
            m2344a(107, bundle, 500 - System.currentTimeMillis());
        }
    }

    @Override // com.megvii.meglive_sdk.detect.C1526a.AbstractC1527a
    /* renamed from: b */
    public final void mo17011b(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("actionIndex", i);
        bundle.putInt("currentAction", i2);
        m2343a(102, bundle);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m2349a(EnumC1568j jVar, String str) {
        if (!isFinishing()) {
            this.mManagerImpl.mo17004a(jVar, str);
            finish();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m2351b(ActionLivenessActivity actionLivenessActivity, int i, int i2) {
        String str;
        if (i == 1) {
            str = actionLivenessActivity.getResources().getString(C1580u.m2676a(actionLivenessActivity).mo17199b(actionLivenessActivity.getString(C1503R.string.key_livenessHomePromptVerticalText)));
            if (actionLivenessActivity.f2184E != i) {
                C1512a.m2287a(actionLivenessActivity.f2186b);
                C1583x.m2690a(C1512a.m2289a("fail_mirror:vertical_detection_failed", actionLivenessActivity.f2191g, actionLivenessActivity.f2185a));
            }
        } else {
            str = i == 4 ? actionLivenessActivity.getResources().getString(C1580u.m2676a(actionLivenessActivity).mo17199b(actionLivenessActivity.getString(C1503R.string.key_liveness_home_promptWait_text))) : i == 2 ? actionLivenessActivity.getMirroFailedMsg(i2) : null;
        }
        actionLivenessActivity.f2184E = i;
        if (!C1613c.m2776a(str)) {
            actionLivenessActivity.f2188d.setTips(str);
        }
    }

    /* renamed from: a */
    private void m2343a(int i, Bundle bundle) {
        Message message = new Message();
        message.what = i;
        message.setData(bundle);
        this.f2182C.sendMessage(message);
    }

    /* renamed from: a */
    private void m2344a(int i, Bundle bundle, long j) {
        Message message = new Message();
        message.what = i;
        message.setData(bundle);
        this.f2182C.sendMessageDelayed(message, j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2346a(ActionLivenessActivity actionLivenessActivity, int i, int i2, int i3) {
        if (i == 1) {
            actionLivenessActivity.f2188d.mo17242a(((162.0f / ((float) actionLivenessActivity.f2190f.f2116b)) * ((float) i2)) + 198.0f, actionLivenessActivity.f2198n);
        } else if (i == 2) {
            actionLivenessActivity.f2188d.mo17242a(360.0f, i3 == 0 ? actionLivenessActivity.f2198n : actionLivenessActivity.f2199o);
        } else if (i == 0) {
            actionLivenessActivity.f2188d.mo17242a(0.0f, actionLivenessActivity.f2198n);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2345a(ActionLivenessActivity actionLivenessActivity, int i, int i2) {
        int i3;
        String str;
        C1572n nVar;
        MediaPlayer mediaPlayer;
        actionLivenessActivity.f2210z.mo17192b();
        if (1 == i2) {
            i3 = C1580u.m2676a(actionLivenessActivity).mo17200c(actionLivenessActivity.getResources().getString(C1503R.string.key_meglive_eye_blink_m4a));
            str = actionLivenessActivity.getResources().getString(C1580u.m2676a(actionLivenessActivity).mo17199b(actionLivenessActivity.getString(C1503R.string.key_liveness_home_promptBlink_text)));
            actionLivenessActivity.f2208x = actionLivenessActivity.f2205u;
        } else if (2 == i2) {
            i3 = C1580u.m2676a(actionLivenessActivity).mo17200c(actionLivenessActivity.getResources().getString(C1503R.string.key_meglive_mouth_open_m4a));
            str = actionLivenessActivity.getResources().getString(C1580u.m2676a(actionLivenessActivity).mo17199b(actionLivenessActivity.getString(C1503R.string.key_liveness_home_promptOpenMouth_text)));
            actionLivenessActivity.f2208x = actionLivenessActivity.f2204t;
        } else if (3 == i2) {
            i3 = C1580u.m2676a(actionLivenessActivity).mo17200c(actionLivenessActivity.getResources().getString(C1503R.string.key_meglive_yaw_m4a));
            str = actionLivenessActivity.getResources().getString(C1580u.m2676a(actionLivenessActivity).mo17199b(actionLivenessActivity.getString(C1503R.string.key_liveness_home_promptShakeHead_text)));
            actionLivenessActivity.f2208x = actionLivenessActivity.f2207w;
        } else if (4 == i2) {
            i3 = C1580u.m2676a(actionLivenessActivity).mo17200c(actionLivenessActivity.getResources().getString(C1503R.string.key_meglive_pitch_down_m4a));
            str = actionLivenessActivity.getResources().getString(C1580u.m2676a(actionLivenessActivity).mo17199b(actionLivenessActivity.getString(C1503R.string.key_liveness_home_promptNod_text)));
            actionLivenessActivity.f2208x = actionLivenessActivity.f2206v;
        } else {
            str = "";
            i3 = -1;
        }
        C1559c cVar = actionLivenessActivity.f2209y;
        ((Activity) cVar.f2560b).runOnUiThread(new Runnable(actionLivenessActivity.f2208x, actionLivenessActivity.f2188d.getImageY()) {
            /* class com.megvii.meglive_sdk.p106f.C1559c.RunnableC15601 */

            /* renamed from: a */
            public final /* synthetic */ AnimationDrawable f2563a;

            /* renamed from: b */
            public final /* synthetic */ float f2564b;

            {
                this.f2563a = r2;
                this.f2564b = r3;
            }

            public final void run() {
                if (this.f2563a != null) {
                    AnimationDrawable animationDrawable = C1559c.this.f2559a;
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                    }
                    C1559c.this.f2561c.setY(this.f2564b);
                    C1559c.this.f2561c.setBackgroundDrawable(this.f2563a);
                    C1559c.this.f2561c.setVisibility(0);
                    C1559c cVar = C1559c.this;
                    cVar.f2559a = (AnimationDrawable) cVar.f2561c.getBackground();
                    C1559c.this.f2559a.start();
                }
            }
        });
        if (i != 0) {
            actionLivenessActivity.f2210z.mo17191a(C1580u.m2676a(actionLivenessActivity).mo17200c(actionLivenessActivity.getResources().getString(C1503R.string.key_meglive_well_done_m4a)));
            if (!(i3 == -1 || (mediaPlayer = (nVar = actionLivenessActivity.f2210z).f2609a) == null)) {
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(i3) {
                    /* class com.megvii.meglive_sdk.p106f.C1572n.C15732 */

                    /* renamed from: a */
                    public final /* synthetic */ int f2611a;

                    {
                        this.f2611a = r2;
                    }

                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        try {
                            C1572n.this.mo17191a(this.f2611a);
                            if (C1572n.this.f2609a != null) {
                                C1572n.this.f2609a.setOnCompletionListener(null);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } else if (i3 != -1) {
            actionLivenessActivity.f2210z.mo17191a(i3);
        }
        actionLivenessActivity.f2188d.setTips(str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2347a(ActionLivenessActivity actionLivenessActivity, int i, String str, String str2) {
        if (!actionLivenessActivity.isFinishing()) {
            actionLivenessActivity.mManagerImpl.mo17001a(i, str, str2);
            actionLivenessActivity.finish();
        }
    }
}
