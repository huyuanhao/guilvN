package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import com.learnium.RNDeviceInfo.SystemBarTintManager;

/* renamed from: com.pd.sdk.oooO0O  reason: case insensitive filesystem */
public class C9122oooO0O {
    public static int OooO00o(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int OooO0O0(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int OooO0OO(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField(SystemBarTintManager.SystemBarConfig.STATUS_BAR_HEIGHT_RES_NAME).get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int OooO00o(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels - OooO0OO(context);
    }
}
