package com.tencent.bugly.beta.p267ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.ResBean;
import com.tencent.bugly.beta.global.View$OnTouchListenerC3224c;
import com.tencent.bugly.beta.utils.C3254e;

/* renamed from: com.tencent.bugly.beta.ui.a */
public abstract class AbstractC3234a extends AbstractC3238b {

    /* renamed from: a */
    public Context f7418a;

    /* renamed from: b */
    public View f7419b;

    /* renamed from: c */
    public FrameLayout f7420c;

    /* renamed from: d */
    public LinearLayout f7421d;

    /* renamed from: e */
    public ImageView f7422e;

    /* renamed from: f */
    public TextView f7423f;

    /* renamed from: g */
    public TextView f7424g;

    /* renamed from: h */
    public TextView f7425h;

    /* renamed from: i */
    public LinearLayout f7426i;

    /* renamed from: j */
    public ResBean f7427j;

    /* renamed from: k */
    public int f7428k;

    /* renamed from: l */
    public int f7429l;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7418a = getActivity();
        this.f7427j = ResBean.f7346a;
        int i = this.f7429l;
        if (i == 0) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f7418a);
            this.f7419b = relativeLayout;
            relativeLayout.setGravity(17);
            this.f7419b.setBackgroundColor(Color.argb(100, 0, 0, 0));
            this.f7420c = new FrameLayout(this.f7418a);
            this.f7420c.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            LinearLayout linearLayout = new LinearLayout(this.f7418a);
            this.f7421d = linearLayout;
            linearLayout.setBackgroundColor(-1);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            this.f7421d.setGravity(17);
            this.f7421d.setLayoutParams(layoutParams);
            this.f7421d.setMinimumWidth(C3222a.m7752a(this.f7418a, 280.0f));
            this.f7421d.setOrientation(1);
            if (this.f7428k == 2) {
                float a = (float) C3222a.m7752a(this.f7418a, 6.0f);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{a, a, a, a, a, a, a, a}, null, null));
                shapeDrawable.getPaint().setColor(-1);
                shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                this.f7421d.setBackgroundDrawable(shapeDrawable);
            }
            TextView textView = new TextView(this.f7418a);
            this.f7423f = textView;
            textView.setGravity(16);
            this.f7423f.setSingleLine();
            TextView textView2 = this.f7423f;
            this.f7427j.getClass();
            textView2.setTextColor(Color.parseColor("#273238"));
            this.f7423f.setTextSize(18.0f);
            this.f7423f.setLayoutParams(layoutParams);
            this.f7423f.setOnClickListener(null);
            this.f7423f.setEllipsize(TextUtils.TruncateAt.END);
            int a2 = C3222a.m7752a(this.f7418a, 16.0f);
            this.f7423f.setPadding(a2, 0, a2, 0);
            this.f7423f.setTypeface(null, 1);
            this.f7423f.setHeight(C3222a.m7752a(this.f7418a, 42.0f));
            this.f7423f.setTag(Beta.TAG_TITLE);
            TextView textView3 = new TextView(this.f7418a);
            textView3.setBackgroundColor(-3355444);
            textView3.setHeight(1);
            ScrollView scrollView = new ScrollView(this.f7418a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, 0, 0, C3222a.m7752a(this.f7418a, 52.0f));
            scrollView.setLayoutParams(layoutParams2);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setHorizontalScrollBarEnabled(false);
            this.f7426i = new LinearLayout(this.f7418a);
            this.f7426i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f7426i.setOrientation(1);
            this.f7426i.setPadding(a2, C3222a.m7752a(this.f7418a, 10.0f), a2, 0);
            LinearLayout linearLayout2 = new LinearLayout(this.f7418a);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setGravity(17);
            linearLayout2.setOrientation(0);
            int i2 = a2 / 2;
            linearLayout2.setPadding(i2, a2, i2, a2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams4.setMargins(i2, 0, i2, 0);
            TextView textView4 = new TextView(this.f7418a);
            this.f7424g = textView4;
            textView4.setSingleLine();
            this.f7424g.setGravity(17);
            this.f7424g.setTag(Beta.TAG_CANCEL_BUTTON);
            new RelativeLayout.LayoutParams(-2, -2);
            int a3 = C3222a.m7752a(this.f7418a, 30.0f);
            if (this.f7428k == 2) {
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(a3, a3);
                layoutParams5.gravity = 53;
                this.f7424g.setLayoutParams(layoutParams5);
                TextView textView5 = this.f7424g;
                double d = (double) a3;
                Double.isNaN(d);
                textView5.setTextSize((float) (d * 0.3d));
            } else {
                this.f7424g.setLayoutParams(layoutParams4);
                this.f7424g.setTextSize((float) 16);
                TextView textView6 = this.f7424g;
                this.f7427j.getClass();
                textView6.setTextColor(Color.parseColor("#757575"));
                this.f7424g.setPadding(C3222a.m7752a(this.f7418a, 10.0f), C3222a.m7752a(this.f7418a, 5.0f), C3222a.m7752a(this.f7418a, 10.0f), C3222a.m7752a(this.f7418a, 5.0f));
            }
            TextView textView7 = new TextView(this.f7418a);
            this.f7425h = textView7;
            textView7.setLayoutParams(layoutParams4);
            this.f7425h.setGravity(17);
            this.f7425h.setTextSize((float) 16);
            TextView textView8 = this.f7425h;
            this.f7427j.getClass();
            textView8.setTextColor(Color.parseColor("#273238"));
            this.f7425h.setSingleLine();
            this.f7425h.setPadding(C3222a.m7752a(this.f7418a, 10.0f), C3222a.m7752a(this.f7418a, 5.0f), C3222a.m7752a(this.f7418a, 10.0f), C3222a.m7752a(this.f7418a, 5.0f));
            this.f7425h.setTypeface(null, 1);
            this.f7425h.setTag(Beta.TAG_CONFIRM_BUTTON);
            int a4 = C3222a.m7752a(this.f7418a, 40.0f);
            scrollView.addView(this.f7426i);
            if (this.f7428k == 2) {
                FrameLayout frameLayout = new FrameLayout(this.f7418a);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                int i3 = a3 / 2;
                int i4 = i3 - 5;
                this.f7420c.setPadding(i3, i4, i4, i3);
                frameLayout.addView(this.f7420c);
                frameLayout.addView(this.f7424g);
                ((RelativeLayout) this.f7419b).addView(frameLayout);
            } else {
                this.f7419b.setPadding(a4, a4, a4, a4);
                ((RelativeLayout) this.f7419b).addView(this.f7420c);
                linearLayout2.addView(this.f7424g);
            }
            this.f7421d.addView(this.f7423f);
            this.f7421d.addView(textView3);
            this.f7421d.addView(scrollView);
            this.f7420c.addView(this.f7421d);
            linearLayout2.addView(this.f7425h);
            this.f7420c.addView(linearLayout2);
            if (this.f7428k == 2) {
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                Bitmap createBitmap = Bitmap.createBitmap(a3, a3, Bitmap.Config.ARGB_8888);
                int i5 = a3 / 2;
                Canvas canvas = new Canvas(createBitmap);
                paint.setColor(-3355444);
                float f = (float) i5;
                canvas.drawCircle(f, f, f, paint);
                canvas.rotate(45.0f, f, f);
                paint.setColor(-7829368);
                int a5 = C3222a.m7752a(this.f7418a, 0.8f);
                float f2 = f * 0.4f;
                float f3 = (float) (i5 - a5);
                float f4 = f * 1.6f;
                float f5 = (float) (i5 + a5);
                canvas.drawRect(f2, f3, f4, f5, paint);
                canvas.drawRect(f3, f2, f5, f4, paint);
                canvas.rotate(-45.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(a3, a3, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                paint.setColor(-7829368);
                canvas2.drawCircle(f, f, f, paint);
                canvas2.rotate(45.0f, f, f);
                paint.setColor(-3355444);
                canvas2.drawRect(f2, f3, f4, f5, paint);
                canvas2.drawRect(f3, f2, f5, f4, paint);
                canvas2.rotate(-45.0f);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(createBitmap2);
                this.f7424g.setBackgroundDrawable(bitmapDrawable);
                this.f7424g.setOnTouchListener(new View$OnTouchListenerC3224c(1, bitmapDrawable2, bitmapDrawable));
            }
            this.f7419b.setOnClickListener(null);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            this.f7419b.startAnimation(alphaAnimation);
        } else {
            View inflate = layoutInflater.inflate(i, (ViewGroup) null);
            this.f7419b = inflate;
            this.f7422e = (ImageView) inflate.findViewWithTag(Beta.TAG_IMG_BANNER);
            this.f7423f = (TextView) this.f7419b.findViewWithTag(Beta.TAG_TITLE);
            this.f7424g = (TextView) this.f7419b.findViewWithTag(Beta.TAG_CANCEL_BUTTON);
            this.f7425h = (TextView) this.f7419b.findViewWithTag(Beta.TAG_CONFIRM_BUTTON);
        }
        this.f7424g.setVisibility(8);
        this.f7425h.setVisibility(8);
        this.f7424g.setFocusable(true);
        this.f7425h.setFocusable(true);
        this.f7425h.requestFocus();
        return this.f7419b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f7418a = null;
        this.f7419b = null;
        this.f7420c = null;
        this.f7421d = null;
        this.f7423f = null;
        this.f7422e = null;
        this.f7424g = null;
        this.f7425h = null;
        this.f7426i = null;
    }

    /* renamed from: a */
    public void mo38010a(final String str, final View.OnClickListener onClickListener, final String str2, final View.OnClickListener onClickListener2) {
        C3254e.m7893a(new Runnable() {
            /* class com.tencent.bugly.beta.p267ui.AbstractC3234a.RunnableC32351 */

            public void run() {
                AbstractC3234a aVar = AbstractC3234a.this;
                TextView textView = aVar.f7424g;
                if (textView != null && aVar.f7425h != null) {
                    if (str != null) {
                        textView.setVisibility(0);
                        AbstractC3234a aVar2 = AbstractC3234a.this;
                        if (aVar2.f7428k != 2) {
                            aVar2.f7424g.setText(str);
                            AbstractC3234a aVar3 = AbstractC3234a.this;
                            if (aVar3.f7429l == 0) {
                                aVar3.f7424g.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC3240d(2, Integer.valueOf(AbstractC3234a.this.f7428k), AbstractC3234a.this.f7424g, 1));
                            }
                        }
                        AbstractC3234a.this.f7424g.setOnClickListener(onClickListener);
                    }
                    if (str2 != null) {
                        AbstractC3234a.this.f7425h.setVisibility(0);
                        AbstractC3234a.this.f7425h.setText(str2);
                        AbstractC3234a.this.f7425h.setOnClickListener(onClickListener2);
                        AbstractC3234a aVar4 = AbstractC3234a.this;
                        if (aVar4.f7429l == 0) {
                            aVar4.f7425h.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC3240d(2, Integer.valueOf(AbstractC3234a.this.f7428k), AbstractC3234a.this.f7425h, 1));
                        }
                        AbstractC3234a.this.f7425h.requestFocus();
                    }
                }
            }
        });
    }

    @Override // com.tencent.bugly.beta.p267ui.AbstractC3238b
    /* renamed from: a */
    public void mo38009a() {
        if (this.f7419b == null) {
            super.mo38009a();
            return;
        }
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        C3254e.m7893a(new Runnable() {
            /* class com.tencent.bugly.beta.p267ui.AbstractC3234a.RunnableC32362 */

            public void run() {
                View view = AbstractC3234a.this.f7419b;
                if (view != null) {
                    view.startAnimation(alphaAnimation);
                }
            }
        });
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.tencent.bugly.beta.p267ui.AbstractC3234a.animationAnimation$AnimationListenerC32373 */

            public void onAnimationEnd(Animation animation) {
                View view = AbstractC3234a.this.f7419b;
                if (view != null) {
                    view.setVisibility(8);
                }
                AbstractC3234a.super.mo38009a();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
    }
}
