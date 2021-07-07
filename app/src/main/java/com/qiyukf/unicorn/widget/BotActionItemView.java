package com.qiyukf.unicorn.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;

public class BotActionItemView extends LinearLayout {

    /* renamed from: a */
    public TextView f6549a;

    /* renamed from: b */
    public ImageView f6550b;

    /* renamed from: c */
    public ValueAnimator f6551c;

    /* renamed from: d */
    public float f6552d;

    /* renamed from: e */
    public float f6553e;

    /* renamed from: f */
    public Long f6554f;

    /* renamed from: g */
    public Long f6555g;

    /* renamed from: h */
    public Boolean f6556h;

    /* renamed from: i */
    public View f6557i;

    /* renamed from: j */
    public Context f6558j;

    public BotActionItemView(Context context) {
        this(context, null);
    }

    public BotActionItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6552d = 0.1f;
        this.f6553e = (float) C1862c.m3540a(350.0f);
        this.f6554f = 1000L;
        this.f6555g = 100L;
        this.f6556h = false;
        this.f6558j = context;
        View inflate = LayoutInflater.from(context).inflate(C2364R.layout.ysf_message_quick_entry_item, this);
        this.f6557i = inflate;
        this.f6549a = (TextView) inflate.findViewById(C2364R.C2367id.ysf_quick_entry_text);
        this.f6550b = (ImageView) this.f6557i.findViewById(C2364R.C2367id.ysf_quick_entry_icon);
    }

    /* renamed from: a */
    public final TextView mo36837a() {
        return this.f6549a;
    }

    /* renamed from: a */
    public final void mo36838a(float f) {
        this.f6549a.setTextSize(0, f);
    }

    /* renamed from: a */
    public final void mo36839a(Boolean bool) {
        this.f6556h = bool;
        if (bool.booleanValue() && Build.VERSION.SDK_INT >= 11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f6551c = ofFloat;
            ofFloat.setDuration(this.f6554f.longValue());
            this.f6551c.setStartDelay(this.f6555g.longValue());
            this.f6551c.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f6551c.setTarget(this);
            this.f6551c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.qiyukf.unicorn.widget.BotActionItemView.C30071 */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BotActionItemView botActionItemView = BotActionItemView.this;
                    botActionItemView.setAlpha(botActionItemView.f6552d + ((1.0f - BotActionItemView.this.f6552d) * floatValue));
                    BotActionItemView botActionItemView2 = BotActionItemView.this;
                    botActionItemView2.setTranslationX(botActionItemView2.f6553e - (BotActionItemView.this.f6553e * floatValue));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36840a(Long l) {
        this.f6555g = l;
    }

    /* renamed from: a */
    public final void mo36841a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f6550b.setVisibility(0);
            C1870a.m3567a(str, this.f6550b);
        }
        this.f6549a.setText(str2);
    }

    public View getRootView() {
        return this.f6557i;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (!this.f6556h.booleanValue()) {
            return;
        }
        if (i == 0) {
            if (Build.VERSION.SDK_INT >= 11) {
                setAlpha(this.f6552d);
                setTranslationX(this.f6553e);
                this.f6551c.start();
            }
        } else if (Build.VERSION.SDK_INT >= 11) {
            this.f6551c.end();
        }
    }
}
