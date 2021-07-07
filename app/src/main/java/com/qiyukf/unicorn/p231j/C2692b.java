package com.qiyukf.unicorn.p231j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.unicorn.j.b */
public final class C2692b {
    /* renamed from: a */
    public static ColorStateList m6226a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{Color.parseColor(str), i});
    }

    /* renamed from: a */
    public static StateListDrawable m6227a(Context context, String str) {
        Drawable drawable = context.getResources().getDrawable(C2364R.C2366drawable.ysf_ic_robot_useful_selected);
        drawable.setColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_ATOP);
        Drawable drawable2 = context.getResources().getDrawable(C2364R.C2366drawable.ysf_ic_robot_useful);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable);
        stateListDrawable.addState(new int[0], drawable2);
        stateListDrawable.setBounds(0, 0, stateListDrawable.getMinimumWidth(), stateListDrawable.getMinimumHeight());
        return stateListDrawable;
    }

    /* renamed from: a */
    public static StateListDrawable m6228a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        StateListDrawable stateListDrawable = new StateListDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) C1862c.m3540a(5.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#E1E3E6"));
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius((float) C1862c.m3540a(5.0f));
        gradientDrawable2.setStroke(C1862c.m3540a(0.5f), Color.parseColor("#F2F2F5"));
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    /* renamed from: a */
    public static StateListDrawable m6229a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str2));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) C1862c.m3540a(100.0f));
        gradientDrawable.setStroke(C1862c.m3540a(1.0f), Color.parseColor(str));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#E0E0E0"));
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius((float) C1862c.m3540a(100.0f));
        gradientDrawable2.setStroke(C1862c.m3540a(1.0f), Color.parseColor(str));
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* renamed from: b */
    public static StateListDrawable m6230b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#ffffff"));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) C1862c.m3540a(2.0f));
        gradientDrawable.setStroke(C1862c.m3540a(0.5f), Color.parseColor(str));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#ffffff"));
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius((float) C1862c.m3540a(2.0f));
        gradientDrawable2.setStroke(C1862c.m3540a(0.5f), Color.parseColor("#999999"));
        stateListDrawable.addState(new int[]{16842913}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    /* renamed from: c */
    public static StateListDrawable m6231c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#F2F3F5"));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) C1862c.m3540a(2.0f));
        gradientDrawable.setStroke(C1862c.m3540a(1.0f), Color.parseColor(str));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#F2F3F5"));
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius((float) C1862c.m3540a(2.0f));
        stateListDrawable.addState(new int[]{16842913}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }
}
