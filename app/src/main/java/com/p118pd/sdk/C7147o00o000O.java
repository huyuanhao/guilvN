package com.p118pd.sdk;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.pd.sdk.o00o000O  reason: case insensitive filesystem */
public final class C7147o00o000O {
    public static final String OooO00o = "PopupWindowCompatApi21";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f19514OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Method f19515OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f19516OooO00o;
    public static Method OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f19517OooO0O0;
    public static boolean OooO0OO;

    public static void OooO00o(@NonNull PopupWindow popupWindow, @NonNull View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C7092o00OOO0.OooO00o(i3, ViewCompat.m14593OooO0o(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public static void OooO00o(@NonNull PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            if (!OooO0OO) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f19514OooO00o = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i(OooO00o, "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                OooO0OO = true;
            }
            Field field = f19514OooO00o;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i(OooO00o, "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18516OooO00o(@NonNull PopupWindow popupWindow) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return popupWindow.getOverlapAnchor();
        }
        if (i < 21) {
            return false;
        }
        if (!OooO0OO) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f19514OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(OooO00o, "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            OooO0OO = true;
        }
        Field field = f19514OooO00o;
        if (field == null) {
            return false;
        }
        try {
            return ((Boolean) field.get(popupWindow)).booleanValue();
        } catch (IllegalAccessException e2) {
            Log.i(OooO00o, "Could not get overlap anchor field in PopupWindow", e2);
            return false;
        }
    }

    public static void OooO00o(@NonNull PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f19516OooO00o) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f19515OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f19516OooO00o = true;
        }
        Method method = f19515OooO00o;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static int OooO00o(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return popupWindow.getWindowLayoutType();
        }
        if (!f19517OooO0O0) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                OooO0O0 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f19517OooO0O0 = true;
        }
        Method method = OooO0O0;
        if (method != null) {
            try {
                return ((Integer) method.invoke(popupWindow, new Object[0])).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }
}
