package com.p118pd.sdk;

import android.net.Uri;
import com.umeng.socialize.common.SocializeConstants;

/* renamed from: com.pd.sdk.o0oo00oO  reason: case insensitive filesystem */
public final class C7674o0oo00oO {
    public static final int OooO00o = 512;
    public static final int OooO0O0 = 384;

    public static boolean OooO00o(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean OooO00o(Uri uri) {
        return OooO0O0(uri) && !OooO0Oo(uri);
    }

    public static boolean OooO0O0(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && SocializeConstants.KEY_PLATFORM.equals(uri.getAuthority());
    }

    public static boolean OooO0OO(Uri uri) {
        return OooO0O0(uri) && OooO0Oo(uri);
    }

    public static boolean OooO0Oo(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
