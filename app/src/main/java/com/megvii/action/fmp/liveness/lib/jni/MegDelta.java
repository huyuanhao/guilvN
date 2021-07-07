package com.megvii.action.fmp.liveness.lib.jni;

public class MegDelta {
    public static native byte[] decodeJsonStr(String str, byte[] bArr);

    public static native String encodeJsonStr(String str);
}
