package com.qiyukf.unicorn.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p118pd.sdk.C7009o000OoOo;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p231j.C2690a;

public class StylableTextView extends TextView {

    /* renamed from: a */
    public ColorStateList f6579a;

    public StylableTextView(Context context) {
        super(context);
        m7032a(context);
    }

    public StylableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7032a(context);
    }

    public StylableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7032a(context);
    }

    @TargetApi(21)
    public StylableTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m7032a(context);
    }

    /* renamed from: a */
    private void m7031a() {
        int i;
        Resources resources;
        int i2;
        if (C2690a.m6219a().mo36462d()) {
            i = Color.parseColor(C2690a.m6219a().mo36461c().mo35690b());
        } else {
            ColorStateList colorStateList = this.f6579a;
            if (colorStateList == null) {
                if (!isEnabled()) {
                    resources = getResources();
                    i2 = C2364R.C2365color.ysf_theme_color_disabled;
                } else if (!isPressed()) {
                    resources = getResources();
                    i2 = C2364R.C2365color.ysf_blue_337EFF;
                } else {
                    resources = getResources();
                    i2 = C2364R.C2365color.ysf_theme_color_pressed;
                }
                i = resources.getColor(i2);
            } else {
                i = colorStateList.getColorForState(getDrawableState(), this.f6579a.getDefaultColor());
            }
        }
        if (getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) getBackground()).setColor(i);
        } else if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: a */
    private void m7032a(Context context) {
        setBackgroundResource(C2364R.C2366drawable.ysf_theme_button_shape);
        setTextColor(-1);
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization == null) {
            this.f6579a = C7009o000OoOo.m18255OooO00o(context, C2364R.C2365color.ysf_button_color_state_list);
            m7031a();
            return;
        }
        try {
            if (uICustomization.buttonBackgroundColorList > 0) {
                this.f6579a = C7009o000OoOo.m18255OooO00o(context, uICustomization.buttonBackgroundColorList);
                m7031a();
            }
            if (uICustomization.buttonTextColor != 0) {
                setTextColor(uICustomization.buttonTextColor);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C1709a.m3016c("STV", "ui customization error: " + e.toString());
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        m7031a();
    }
}
