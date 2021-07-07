package com.p118pd.sdk;

import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000Ooo0  reason: case insensitive filesystem */
public final class C7011o000Ooo0 {
    public static final String OooO00o = "android.intent.extra.HTML_TEXT";
    public static final String OooO0O0 = "android.intent.extra.START_PLAYBACK";
    public static final String OooO0OO = "android.intent.category.LEANBACK_LAUNCHER";

    @NonNull
    public static Intent OooO00o(@NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 15) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
        Intent intent = new Intent(str);
        intent.addCategory(str2);
        return intent;
    }
}
