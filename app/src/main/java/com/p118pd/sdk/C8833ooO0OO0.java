package com.p118pd.sdk;

import android.content.Intent;

/* renamed from: com.pd.sdk.ooO0OO0  reason: case insensitive filesystem */
public class C8833ooO0OO0 {
    public static final String OooO00o = "NIM_EXTRA_NOTI";

    public static void OooO00o(Intent intent) {
        intent.putExtra("NIM_EXTRA_NOTI", true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20458OooO00o(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("NIM_EXTRA_NOTI", false);
    }
}
