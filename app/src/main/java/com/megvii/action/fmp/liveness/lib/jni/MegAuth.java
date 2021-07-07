package com.megvii.action.fmp.liveness.lib.jni;

public class MegAuth {
    public static native String nativeGetContext(String str, String str2);

    public static native long nativeGetExpireTime(String str);

    public static native boolean nativeSetLicence(String str);
}
