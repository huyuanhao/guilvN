package com.p118pd.sdk;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o00OoO0  reason: case insensitive filesystem */
public final class C7117o00OoO0 {
    public static final int OooO00o = 8;
    public static final int OooO0O0 = 9;
    public static final int OooO0OO = 10;

    @NonNull
    public static <T extends View> T OooO00o(@NonNull Window window, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) window.requireViewById(i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }
}
