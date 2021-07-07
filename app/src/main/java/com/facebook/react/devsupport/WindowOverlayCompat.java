package com.facebook.react.devsupport;

import android.os.Build;
import com.netease.nis.captcha.Captcha;

public class WindowOverlayCompat {
    public static final int ANDROID_OREO = 26;
    public static final int TYPE_APPLICATION_OVERLAY = 2038;
    public static final int TYPE_SYSTEM_ALERT;
    public static final int TYPE_SYSTEM_OVERLAY;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = TYPE_APPLICATION_OVERLAY;
        TYPE_SYSTEM_ALERT = i < 26 ? Captcha.WEB_VIEW_HTTP_ERROR : TYPE_APPLICATION_OVERLAY;
        if (Build.VERSION.SDK_INT < 26) {
            i2 = 2006;
        }
        TYPE_SYSTEM_OVERLAY = i2;
    }
}
