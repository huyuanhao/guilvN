package com.p118pd.sdk;

import android.os.Build;
import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00OoooO  reason: case insensitive filesystem */
public final class C7140o00OoooO {
    @Deprecated
    public static View.OnTouchListener OooO00o(Object obj, View view) {
        return OooO00o((ListPopupWindow) obj, view);
    }

    @Nullable
    public static View.OnTouchListener OooO00o(@NonNull ListPopupWindow listPopupWindow, @NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return listPopupWindow.createDragToOpenListener(view);
        }
        return null;
    }
}
