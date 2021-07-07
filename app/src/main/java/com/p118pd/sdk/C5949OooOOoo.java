package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOOoo  reason: case insensitive filesystem */
public class C5949OooOOoo {
    public Context OooO00o;

    public C5949OooOOoo(Context context) {
        this.OooO00o = context;
    }

    public static C5949OooOOoo OooO00o(Context context) {
        return new C5949OooOOoo(context);
    }

    public int OooO0O0() {
        Configuration configuration = this.OooO00o.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m16739OooO0OO() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.OooO00o).hasPermanentMenuKey();
    }

    public int OooO0Oo() {
        TypedArray obtainStyledAttributes = this.OooO00o.obtainStyledAttributes(null, C0033R.styleable.OooO00o, C0033R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0033R.styleable.ActionBar_height, 0);
        Resources resources = this.OooO00o.getResources();
        if (!m16738OooO0O0()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0033R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public int OooO00o() {
        return this.OooO00o.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16737OooO00o() {
        return this.OooO00o.getApplicationInfo().targetSdkVersion < 14;
    }

    public int OooO0OO() {
        return this.OooO00o.getResources().getDimensionPixelSize(C0033R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16738OooO0O0() {
        return this.OooO00o.getResources().getBoolean(C0033R.bool.abc_action_bar_embed_tabs);
    }
}
