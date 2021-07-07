package com.p118pd.sdk;

import android.os.Build;
import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00o000  reason: case insensitive filesystem */
public final class C7145o00o000 {
    @Nullable
    public static View.OnTouchListener OooO00o(@NonNull Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((PopupMenu) obj).getDragToOpenListener();
        }
        return null;
    }
}
