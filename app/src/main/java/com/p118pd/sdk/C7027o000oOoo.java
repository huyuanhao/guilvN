package com.p118pd.sdk;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000oOoo  reason: case insensitive filesystem */
public final class C7027o000oOoo {
    public static void OooO00o(@NonNull SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }
}
