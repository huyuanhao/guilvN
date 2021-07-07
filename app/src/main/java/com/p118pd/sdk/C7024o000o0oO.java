package com.p118pd.sdk;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o000o0oO  reason: case insensitive filesystem */
public final class C7024o000o0oO {
    @NonNull
    public static CursorWindow OooO00o(@Nullable String str, long j) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new CursorWindow(str, j);
        }
        if (i >= 15) {
            return new CursorWindow(str);
        }
        return new CursorWindow(false);
    }
}
