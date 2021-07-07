package com.p118pd.sdk;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0OO00O */
public class o0OO00O {
    public static final Rect OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Class<?> f20116OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20117OooO00o = "DrawableUtils";
    public static final String OooO0O0 = "android.graphics.drawable.VectorDrawable";

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f20116OooO00o = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static Rect OooO00o(Drawable drawable) {
        if (f20116OooO00o != null) {
            try {
                Drawable OooO00o2 = C7043o00O0000.m18313OooO00o(drawable);
                Object invoke = OooO00o2.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(OooO00o2, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    Field[] fields = f20116OooO00o.getFields();
                    for (Field field : fields) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
            }
        }
        return OooO00o;
    }

    public static void OooO0O0(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C6948o00000oO.OooO0o0);
        } else {
            drawable.setState(C6948o00000oO.OooO0oo);
        }
        drawable.setState(state);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18877OooO00o(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            OooO0O0(drawable);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18878OooO00o(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m18878OooO00o(drawable2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof AbstractC7041o00O00) {
            return m18878OooO00o(((AbstractC7041o00O00) drawable).OooO00o());
        } else {
            if (drawable instanceof C5946OooOOOo) {
                return m18878OooO00o(((C5946OooOOOo) drawable).OooO00o());
            }
            if (drawable instanceof ScaleDrawable) {
                return m18878OooO00o(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static PorterDuff.Mode OooO00o(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
