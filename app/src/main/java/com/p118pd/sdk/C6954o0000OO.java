package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000OO  reason: case insensitive filesystem */
public class C6954o0000OO {
    public static final String OooO00o = "ViewUtils";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Method f19150OooO00o;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f19150OooO00o = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f19150OooO00o.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18147OooO00o(View view) {
        return ViewCompat.m14593OooO0o(view) == 1;
    }

    public static void OooO00o(View view, Rect rect, Rect rect2) {
        Method method = f19150OooO00o;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    public static void OooO00o(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }
}
