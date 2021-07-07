package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: com.pd.sdk.o00oOOo  reason: case insensitive filesystem */
public class C7198o00oOOo {
    public static boolean OooO00o(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
