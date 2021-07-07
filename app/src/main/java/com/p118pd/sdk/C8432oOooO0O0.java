package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOooO0O0  reason: case insensitive filesystem */
public final class C8432oOooO0O0 {
    public static String OooO00o(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }
}
