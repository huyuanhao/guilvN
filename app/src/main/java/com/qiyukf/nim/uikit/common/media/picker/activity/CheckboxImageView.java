package com.qiyukf.nim.uikit.common.media.picker.activity;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p231j.C2690a;

public class CheckboxImageView extends ImageView {

    /* renamed from: a */
    public int[] f3545a;

    /* renamed from: b */
    public boolean f3546b;

    public CheckboxImageView(Context context) {
        super(context);
        m3650a();
    }

    public CheckboxImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3650a();
    }

    public CheckboxImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3650a();
    }

    @TargetApi(21)
    public CheckboxImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m3650a();
    }

    /* renamed from: a */
    private void m3650a() {
        setBackgroundResource(C2364R.C2366drawable.ysf_circle_shape_bg);
        int[] iArr = new int[2];
        this.f3545a = iArr;
        iArr[0] = getResources().getColor(C2364R.C2365color.ysf_picker_unselected_color);
        this.f3545a[1] = getResources().getColor(C2364R.C2365color.ysf_blue_337EFF);
        if (C2690a.m6219a().mo36462d()) {
            this.f3545a[1] = Color.parseColor(C2690a.m6219a().mo36461c().mo35690b());
            return;
        }
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization != null && uICustomization.buttonBackgroundColorList > 0) {
            try {
                ColorStateList colorStateList = getResources().getColorStateList(uICustomization.buttonBackgroundColorList);
                if (colorStateList != null) {
                    this.f3545a[1] = colorStateList.getColorForState(View.ENABLED_STATE_SET, colorStateList.getDefaultColor());
                }
            } catch (Exception e) {
                C1709a.m3016c("CIV", "ui customization error: " + e.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo34227a(boolean z) {
        this.f3546b = z;
        int i = z ? this.f3545a[1] : this.f3545a[0];
        if (getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) getBackground()).setColor(i);
        } else if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
        invalidate();
    }
}
