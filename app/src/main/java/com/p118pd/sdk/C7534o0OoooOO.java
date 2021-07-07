package com.p118pd.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import exocr.idcard.CameraManager;

/* renamed from: com.pd.sdk.o0OoooOO  reason: case insensitive filesystem */
public class C7534o0OoooOO {
    public static final String OooO0O0 = "正在加载";
    public static final String OooO0OO = "去支付宝付款";
    public static final String OooO0Oo = "去支付宝授权";
    public static String OooO0o0 = "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";
    public final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f20400OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f20401OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f20402OooO00o = new HandlerC7536o0Ooooo(this, Looper.getMainLooper());

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f20403OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20404OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20405OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final long f20406OooO0O0 = 15000;

    public C7534o0OoooOO(Activity activity) {
        this.f20401OooO00o = activity;
    }

    public void OooO0O0() {
        Activity activity = this.f20401OooO00o;
        if (activity != null) {
            activity.runOnUiThread(new RunnableC7537o0Ooooo0(this));
        }
    }

    public void OooO0OO() {
        this.f20401OooO00o = null;
        this.f20403OooO00o = null;
    }

    public void OooO00o(boolean z) {
        this.f20405OooO00o = z;
    }

    public C7534o0OoooOO(Activity activity, String str) {
        this.f20401OooO00o = activity;
        this.f20404OooO00o = str;
    }

    public void OooO00o(String str) {
        this.f20404OooO00o = str;
    }

    public String OooO00o() {
        return this.f20404OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19201OooO00o() {
        Activity activity = this.f20401OooO00o;
        if (activity != null) {
            activity.runOnUiThread(new RunnableC7535o0OoooOo(this));
        }
    }

    /* renamed from: com.pd.sdk.o0OoooOO$OooO00o */
    public class OooO00o extends AlertDialog {
        public OooO00o(Context context) {
            super(context);
        }

        private View OooO00o(Context context) {
            LinearLayout linearLayout = new LinearLayout(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, OooO00o(context, 50.0f));
            layoutParams.gravity = 17;
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-450944201);
            gradientDrawable.setCornerRadius((float) OooO00o(context, 5.0f));
            linearLayout.setBackgroundDrawable(gradientDrawable);
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(OooO00o(context, 20.0f), OooO00o(context, 20.0f));
            layoutParams2.gravity = 16;
            layoutParams2.setMargins(OooO00o(C7534o0OoooOO.this.f20401OooO00o, 17.0f), OooO00o(C7534o0OoooOO.this.f20401OooO00o, 10.0f), OooO00o(C7534o0OoooOO.this.f20401OooO00o, 8.0f), OooO00o(C7534o0OoooOO.this.f20401OooO00o, 10.0f));
            imageView.setLayoutParams(layoutParams2);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageDrawable(OooO00o(context, C7534o0OoooOO.OooO0o0, CameraManager.OooO0O0));
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(900);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            imageView.startAnimation(rotateAnimation);
            TextView textView = new TextView(context);
            textView.setText(TextUtils.isEmpty(C7534o0OoooOO.this.f20404OooO00o) ? C7534o0OoooOO.OooO0O0 : C7534o0OoooOO.this.f20404OooO00o);
            textView.setTextSize(16.0f);
            textView.setTextColor(-1);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            layoutParams3.setMargins(0, 0, OooO00o(context, 17.0f), 0);
            textView.setLayoutParams(layoutParams3);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.addView(linearLayout);
            return frameLayout;
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(OooO00o(getContext()));
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[SYNTHETIC, Splitter:B:18:0x003c] */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.graphics.drawable.Drawable OooO00o(android.content.Context r3, java.lang.String r4, int r5) {
            /*
                r2 = this;
                r0 = 0
                java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0035 }
                byte[] r4 = com.p118pd.sdk.C7490o0OoOO0o.OooO00o(r4)     // Catch:{ all -> 0x0035 }
                r1.<init>(r4)     // Catch:{ all -> 0x0035 }
                android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0033 }
                r4.<init>()     // Catch:{ all -> 0x0033 }
                if (r5 > 0) goto L_0x0013
                r5 = 240(0xf0, float:3.36E-43)
            L_0x0013:
                r4.inDensity = r5     // Catch:{ all -> 0x0033 }
                android.content.res.Resources r5 = r3.getResources()     // Catch:{ all -> 0x0033 }
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()     // Catch:{ all -> 0x0033 }
                int r5 = r5.densityDpi     // Catch:{ all -> 0x0033 }
                r4.inTargetDensity = r5     // Catch:{ all -> 0x0033 }
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r1, r0, r4)     // Catch:{ all -> 0x0033 }
                android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0033 }
                android.content.res.Resources r3 = r3.getResources()     // Catch:{ all -> 0x0033 }
                r5.<init>(r3, r4)     // Catch:{ all -> 0x0033 }
                r1.close()     // Catch:{ Exception -> 0x0031 }
            L_0x0031:
                r0 = r5
                goto L_0x003f
            L_0x0033:
                r3 = move-exception
                goto L_0x0037
            L_0x0035:
                r3 = move-exception
                r1 = r0
            L_0x0037:
                com.p118pd.sdk.C7620o0oOOOoo.m19257OooO00o(r3)     // Catch:{ all -> 0x0040 }
                if (r1 == 0) goto L_0x003f
                r1.close()     // Catch:{ Exception -> 0x003f }
            L_0x003f:
                return r0
            L_0x0040:
                r3 = move-exception
                if (r1 == 0) goto L_0x0046
                r1.close()     // Catch:{ Exception -> 0x0046 }
            L_0x0046:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7534o0OoooOO.OooO00o.OooO00o(android.content.Context, java.lang.String, int):android.graphics.drawable.Drawable");
        }

        private int OooO00o(Context context, float f) {
            return (int) (f * (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics().density);
        }
    }
}
