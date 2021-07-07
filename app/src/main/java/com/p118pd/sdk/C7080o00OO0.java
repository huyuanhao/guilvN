package com.p118pd.sdk;

import android.os.Build;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.pd.sdk.o00OO0  reason: case insensitive filesystem */
public class C7080o00OO0 {
    public static boolean OooO00o(@Nullable Object obj, @Nullable Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int OooO00o(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int OooO00o(@Nullable Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
