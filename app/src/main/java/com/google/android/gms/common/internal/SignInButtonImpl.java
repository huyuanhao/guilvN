package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.C0950R;
import com.google.android.gms.common.util.DeviceProperties;
import com.p118pd.sdk.C7043o00O0000;

public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, null);
    }

    public static int zaa(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void configure(Resources resources, SignInButtonConfig signInButtonConfig) {
        configure(resources, signInButtonConfig.getButtonSize(), signInButtonConfig.getColorScheme());
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    public final void configure(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C0950R.C0952drawable.common_google_signin_btn_icon_dark;
        int i5 = C0950R.C0952drawable.common_google_signin_btn_icon_light;
        int zaa = zaa(i2, i4, i5, i5);
        int i6 = C0950R.C0952drawable.common_google_signin_btn_text_dark;
        int i7 = C0950R.C0952drawable.common_google_signin_btn_text_light;
        int zaa2 = zaa(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            zaa = zaa2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable OooO0O0 = C7043o00O0000.m18317OooO0O0(resources.getDrawable(zaa));
        C7043o00O0000.OooO00o(OooO0O0, resources.getColorStateList(C0950R.C0951color.common_google_signin_btn_tint));
        C7043o00O0000.OooO00o(OooO0O0, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(OooO0O0);
        int i8 = C0950R.C0951color.common_google_signin_btn_text_dark;
        int i9 = C0950R.C0951color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zaa(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(C0950R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C0950R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
