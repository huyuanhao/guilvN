package com.baidu.idl.face.platform.utils;

import android.os.Build;

public final class APIUtils {
    public static boolean hasFroyo() {
        return Build.VERSION.SDK_INT >= 8;
    }

    public static boolean hasGingerbread() {
        return Build.VERSION.SDK_INT >= 9;
    }

    public static boolean hasHoneycomb() {
        return Build.VERSION.SDK_INT >= 11;
    }

    public static boolean hasHoneycombMR1() {
        return Build.VERSION.SDK_INT >= 12;
    }

    public static boolean hasICS() {
        return Build.VERSION.SDK_INT >= 14;
    }

    public static boolean hasJellyBean() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean hasJellyBeanMR1() {
        return Build.VERSION.SDK_INT >= 17;
    }
}
