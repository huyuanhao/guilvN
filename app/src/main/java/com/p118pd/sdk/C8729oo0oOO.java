package com.p118pd.sdk;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.Window;

/* renamed from: com.pd.sdk.oo0oOO  reason: case insensitive filesystem */
public class C8729oo0oOO {
    public static void OooO00o(Activity activity, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = activity.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void OooO00o(Dialog dialog, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = dialog.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
