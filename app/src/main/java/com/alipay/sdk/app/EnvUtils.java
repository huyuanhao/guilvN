package com.alipay.sdk.app;

public class EnvUtils {
    public static EnvEnum OooO00o = EnvEnum.ONLINE;

    public enum EnvEnum {
        ONLINE,
        SANDBOX
    }

    public static void OooO00o(EnvEnum envEnum) {
        OooO00o = envEnum;
    }

    public static EnvEnum OooO00o() {
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m14975OooO00o() {
        return OooO00o == EnvEnum.SANDBOX;
    }
}
