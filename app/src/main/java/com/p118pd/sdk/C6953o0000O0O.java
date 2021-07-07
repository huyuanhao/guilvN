package com.p118pd.sdk;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o0000O0O  reason: case insensitive filesystem */
public class C6953o0000O0O {
    public static void OooO00o(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnLongClickListenerC6991o000OO.OooO00o(view, charSequence);
        }
    }
}
