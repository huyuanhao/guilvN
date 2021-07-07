package com.megvii.meglive_sdk.detect.guide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.megvii.meglive_sdk.C1503R;
import com.megvii.meglive_sdk.detect.agreement.UserAgreementActivity;
import com.megvii.meglive_sdk.p098d.C1525e;
import com.megvii.meglive_sdk.p106f.C1555ab;
import com.megvii.meglive_sdk.p106f.C1565g;
import com.megvii.meglive_sdk.p106f.C1574o;
import com.megvii.meglive_sdk.p106f.C1580u;
import com.megvii.meglive_sdk.p106f.C1582w;
import com.megvii.meglive_sdk.p106f.EnumC1568j;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import s.h.e.l.l.C;

public class GrantActivity extends Activity implements View.OnClickListener {

    /* renamed from: a */
    public Button f2380a;

    /* renamed from: b */
    public CheckBox f2381b;

    /* renamed from: c */
    public LinearLayout f2382c;

    /* renamed from: d */
    public TextView f2383d;

    /* renamed from: e */
    public LinearLayout f2384e;

    /* renamed from: f */
    public TextView f2385f;

    /* renamed from: g */
    public LinearLayout f2386g;

    /* renamed from: h */
    public TextView f2387h;

    /* renamed from: i */
    public TextView f2388i;

    /* renamed from: j */
    public RelativeLayout f2389j;

    /* renamed from: k */
    public RelativeLayout f2390k;

    /* renamed from: l */
    public ImageView f2391l;

    /* renamed from: m */
    public ImageView f2392m;

    /* renamed from: n */
    public String f2393n = "";

    /* renamed from: o */
    public GLSurfaceView f2394o;

    /* renamed from: p */
    public C1555ab f2395p;

    /* renamed from: q */
    public String f2396q;

    /* renamed from: r */
    public boolean f2397r = false;

    /* renamed from: s */
    public int f2398s;

    /* renamed from: t */
    public int f2399t;

    /* renamed from: u */
    public String f2400u = "";

    /* renamed from: v */
    public String f2401v;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public final void run() {
            if (GrantActivity.this.f2380a.getTop() < GrantActivity.this.f2386g.getBottom()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) GrantActivity.this.f2390k.getLayoutParams();
                layoutParams.addRule(3, C1503R.C1506id.tv_megvii_liveness_guide_title);
                layoutParams.topMargin = C1582w.m2687a(GrantActivity.this, 10.0f);
                GrantActivity.this.f2390k.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) GrantActivity.this.f2391l.getLayoutParams();
                layoutParams2.width = (int) (((float) layoutParams2.width) * 0.9f);
                layoutParams2.height = (int) (((float) layoutParams2.height) * 0.9f);
                GrantActivity.this.f2391l.setLayoutParams(layoutParams2);
                GrantActivity.this.f2389j.requestLayout();
            }
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public final /* synthetic */ Intent OooO00o;

        public OooO0O0(Intent intent) {
            this.OooO00o = intent;
        }

        public final void onClick(View view) {
            GrantActivity.this.startActivity(this.OooO00o);
        }
    }

    public class OooO0OO implements GLSurfaceView.Renderer {
        public OooO0OO() {
        }

        public final void onDrawFrame(GL10 gl10) {
            gl10.glClear(16640);
        }

        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            gl10.glViewport(0, 0, i, i2);
        }

        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            GrantActivity.this.f2393n = GLES20.glGetString(7939);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.guide.GrantActivity$a */
    public class C1532a extends ClickableSpan {

        /* renamed from: b */
        public final View.OnClickListener f2403b;

        public C1532a(View.OnClickListener onClickListener) {
            this.f2403b = onClickListener;
        }

        public final void onClick(View view) {
            this.f2403b.onClick(view);
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(GrantActivity.this.getResources().getColor(C1503R.C1504color.blue));
            textPaint.setUnderlineText(false);
        }
    }

    static {
        C.i(50331743);
    }

    public native void onClick(View view);

    public void onCreate(Bundle bundle) {
        int d;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("language");
        if (stringExtra != null && !"".equals(stringExtra) && !"zh".equals(stringExtra) && !SocializeProtocolConstants.PROTOCOL_KEY_EN.equals(stringExtra)) {
            stringExtra = SocializeProtocolConstants.PROTOCOL_KEY_EN;
        }
        C1574o.m2661a(this, stringExtra);
        setContentView(C1503R.layout.megvii_liveness_guide_activity);
        this.f2397r = getIntent().getBooleanExtra("protocol_status", false);
        this.f2398s = getIntent().getIntExtra("liveness_type", 2);
        this.f2399t = getIntent().getIntExtra("verticalCheckType", 0);
        this.f2400u = getIntent().getStringExtra("logoFileName");
        this.f2401v = getIntent().getStringExtra("language");
        this.f2389j = (RelativeLayout) findViewById(C1503R.C1506id.rl_megvii_liveness_guide_main);
        this.f2381b = (CheckBox) findViewById(C1503R.C1506id.cb_megvii_liveness_user_agreement);
        Button button = (Button) findViewById(C1503R.C1506id.bt_megvii_liveness_begin_detect);
        this.f2380a = button;
        button.setOnClickListener(this);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int color = getResources().getColor(C1580u.m2676a(this).mo17202e(getResources().getString(C1503R.string.key_liveness_detect_button_normal_bg_color)));
        float a = (float) C1582w.m2687a(this, 40.0f);
        float[] fArr = {a, a, a, a, a, a, a, a};
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape2 = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(color);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(roundRectShape2);
        shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable2.getPaint().setColor(Color.parseColor("#05E0E3E5"));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, 0, 0, 0, C1582w.m2687a(this, 11.0f));
        stateListDrawable.addState(new int[]{-16843518}, layerDrawable);
        stateListDrawable.addState(new int[]{16842919}, m2532a(getResources().getColor(C1580u.m2676a(this).mo17202e(getResources().getString(C1503R.string.key_liveness_detect_button_highlight_bg_color)))));
        stateListDrawable.addState(new int[0], m2532a(getResources().getColor(C1580u.m2676a(this).mo17202e(getResources().getString(C1503R.string.key_liveness_detect_button_selected_bg_color)))));
        this.f2380a.setBackground(stateListDrawable);
        this.f2380a.setTextColor(getResources().getColor(C1580u.m2676a(this).mo17202e(getResources().getString(C1503R.string.key_liveness_detect_button_text_color))));
        LinearLayout linearLayout = (LinearLayout) findViewById(C1503R.C1506id.linearlayout_checkbox_hot_area);
        this.f2382c = linearLayout;
        linearLayout.setOnClickListener(this);
        TextView textView = (TextView) findViewById(C1503R.C1506id.tv_user_agreement);
        this.f2383d = textView;
        textView.setHighlightColor(getResources().getColor(17170445));
        this.f2383d.setTextColor(getResources().getColor(C1580u.m2676a(this).mo17202e(getResources().getString(C1503R.string.key_liveness_guide_read_color))));
        TextView textView2 = this.f2383d;
        String charSequence = textView2.getText().toString();
        int i = getIntent().getStringExtra("language").equals(SocializeProtocolConstants.PROTOCOL_KEY_EN) ? 9 : 8;
        SpannableString spannableString = new SpannableString(charSequence);
        Intent intent = new Intent();
        intent.setClass(this, UserAgreementActivity.class);
        intent.putExtra("language", this.f2401v);
        spannableString.setSpan(new C1532a(new OooO0O0(intent)), i, charSequence.length(), 33);
        textView2.setText(spannableString);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C1503R.C1506id.ll_bar_left);
        this.f2384e = linearLayout2;
        linearLayout2.setOnClickListener(this);
        TextView textView3 = (TextView) findViewById(C1503R.C1506id.tv_bar_title);
        this.f2385f = textView3;
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(C1503R.C1506id.tv_megvii_liveness_guide_tips);
        this.f2387h = textView4;
        textView4.setTextColor(getResources().getColor(C1580u.m2676a(this).mo17202e(getResources().getString(C1503R.string.key_liveness_guide_remindtext_color))));
        TextView textView5 = (TextView) findViewById(C1503R.C1506id.tv_verify_title);
        this.f2388i = textView5;
        textView5.setText(getResources().getString(C1503R.string.grant_title));
        this.f2390k = (RelativeLayout) findViewById(C1503R.C1506id.rl_megvii_liveness_image);
        ImageView imageView = (ImageView) findViewById(C1503R.C1506id.iv_megvii_liveness_image);
        this.f2391l = imageView;
        imageView.setImageDrawable(getResources().getDrawable(C1580u.m2676a(this).mo17198a(getResources().getString(C1503R.string.key_agreement_image_center))));
        this.f2380a.setActivated(this.f2397r);
        this.f2381b.setChecked(this.f2397r);
        this.f2386g = (LinearLayout) findViewById(C1503R.C1506id.ll_megvii_liveness_agreement);
        this.f2392m = (ImageView) findViewById(C1503R.C1506id.iv_megvii_powerby);
        int f = C1565g.m2637f(this);
        if (f == 1) {
            this.f2392m.setVisibility(8);
        } else if (f == 2 && !"".equals(this.f2400u) && (d = C1580u.m2676a(this).mo17201d(this.f2400u)) != -1) {
            this.f2392m.setImageDrawable(getResources().getDrawable(d));
        }
        this.f2395p = new C1555ab(this);
        this.f2396q = C1565g.m2630a(this);
        if (Build.VERSION.SDK_INT >= 18) {
            GLSurfaceView gLSurfaceView = new GLSurfaceView(this);
            this.f2394o = gLSurfaceView;
            gLSurfaceView.setRenderer(new OooO0OO());
            ((RelativeLayout) findViewById(C1503R.C1506id.rl_megvii_liveness_guide_main)).addView(this.f2394o);
            float applyDimension = TypedValue.applyDimension(5, 0.1f, getResources().getDisplayMetrics());
            ViewGroup.LayoutParams layoutParams = this.f2394o.getLayoutParams();
            int i2 = (int) applyDimension;
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.f2394o.setLayoutParams(layoutParams);
        }
    }

    public native void onDestroy();

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    public native void onResume();

    /* renamed from: a */
    public static void m2536a(Context context, int i, int i2, String str, String str2) {
        Intent intent = new Intent(context, GrantActivity.class);
        intent.addFlags(CommonNetImpl.FLAG_AUTH);
        intent.putExtra("protocol_status", true);
        intent.putExtra("liveness_type", i);
        intent.putExtra("verticalCheckType", i2);
        intent.putExtra("logoFileName", str);
        intent.putExtra("language", str2);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private void m2537a(EnumC1568j jVar) {
        C1525e.m2307a().mo17004a(jVar, "");
        finish();
    }

    /* renamed from: a */
    private void m2535a() {
        m2537a(EnumC1568j.USER_CANCEL);
        finish();
    }

    /* renamed from: a */
    private Drawable m2532a(int i) {
        float a = (float) C1582w.m2687a(this, 40.0f);
        float[] fArr = {a, a, a, a, a, a, a, a};
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape2 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape3 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape4 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape5 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape6 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape7 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape8 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape9 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape10 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape11 = new RoundRectShape(fArr, null, null);
        RoundRectShape roundRectShape12 = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(Color.parseColor("#05E0E3E5"));
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(roundRectShape2);
        shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable2.getPaint().setColor(Color.parseColor("#1FE0E3E5"));
        ShapeDrawable shapeDrawable3 = new ShapeDrawable();
        shapeDrawable3.setShape(roundRectShape3);
        shapeDrawable3.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable3.getPaint().setColor(Color.parseColor("#42E0E3E5"));
        ShapeDrawable shapeDrawable4 = new ShapeDrawable();
        shapeDrawable4.setShape(roundRectShape4);
        shapeDrawable4.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable4.getPaint().setColor(Color.parseColor("#61E0E3E5"));
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape5);
        shapeDrawable5.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable5.getPaint().setColor(Color.parseColor("#7AE0E3E5"));
        ShapeDrawable shapeDrawable6 = new ShapeDrawable();
        shapeDrawable6.setShape(roundRectShape6);
        shapeDrawable6.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable6.getPaint().setColor(Color.parseColor("#8AE0E3E5"));
        ShapeDrawable shapeDrawable7 = new ShapeDrawable();
        shapeDrawable7.setShape(roundRectShape7);
        shapeDrawable7.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable7.getPaint().setColor(Color.parseColor("#A3E0E3E5"));
        ShapeDrawable shapeDrawable8 = new ShapeDrawable();
        shapeDrawable8.setShape(roundRectShape8);
        shapeDrawable8.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable8.getPaint().setColor(Color.parseColor("#B8E0E3E5"));
        ShapeDrawable shapeDrawable9 = new ShapeDrawable();
        shapeDrawable9.setShape(roundRectShape9);
        shapeDrawable9.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable9.getPaint().setColor(Color.parseColor("#CCE0E3E5"));
        ShapeDrawable shapeDrawable10 = new ShapeDrawable();
        shapeDrawable10.setShape(roundRectShape10);
        shapeDrawable10.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable10.getPaint().setColor(Color.parseColor("#E0E0E3E5"));
        ShapeDrawable shapeDrawable11 = new ShapeDrawable();
        shapeDrawable11.setShape(roundRectShape11);
        shapeDrawable11.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable11.getPaint().setColor(Color.parseColor("#F5E0E3E5"));
        ShapeDrawable shapeDrawable12 = new ShapeDrawable();
        shapeDrawable12.setShape(roundRectShape12);
        shapeDrawable12.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable12.getPaint().setColor(i);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2, shapeDrawable3, shapeDrawable4, shapeDrawable5, shapeDrawable6, shapeDrawable7, shapeDrawable8, shapeDrawable9, shapeDrawable10, shapeDrawable11, shapeDrawable12});
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, 0, 0, 0, C1582w.m2687a(this, 1.0f));
        layerDrawable.setLayerInset(2, 0, 0, 0, C1582w.m2687a(this, 2.0f));
        layerDrawable.setLayerInset(3, 0, 0, 0, C1582w.m2687a(this, 3.0f));
        layerDrawable.setLayerInset(4, 0, 0, 0, C1582w.m2687a(this, 4.0f));
        layerDrawable.setLayerInset(5, 0, 0, 0, C1582w.m2687a(this, 5.0f));
        layerDrawable.setLayerInset(6, 0, 0, 0, C1582w.m2687a(this, 6.0f));
        layerDrawable.setLayerInset(7, 0, 0, 0, C1582w.m2687a(this, 7.0f));
        layerDrawable.setLayerInset(8, 0, 0, 0, C1582w.m2687a(this, 8.0f));
        layerDrawable.setLayerInset(9, 0, 0, 0, C1582w.m2687a(this, 9.0f));
        layerDrawable.setLayerInset(10, 0, 0, 0, C1582w.m2687a(this, 10.0f));
        layerDrawable.setLayerInset(11, 0, 0, 0, C1582w.m2687a(this, 11.0f));
        return layerDrawable;
    }
}
