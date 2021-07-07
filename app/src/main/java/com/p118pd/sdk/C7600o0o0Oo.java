package com.p118pd.sdk;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0o0Oo  reason: case insensitive filesystem */
public class C7600o0o0Oo {
    public static Field OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Method f20429OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f20430OooO00o;
    public static boolean OooO0O0;

    /* renamed from: com.pd.sdk.o0o0Oo$OooO00o */
    public interface OooO00o {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean OooO00o(@NonNull View view, @NonNull KeyEvent keyEvent) {
        return ViewCompat.OooO0O0(view, keyEvent);
    }

    public static boolean OooO00o(@NonNull OooO00o oooO00o, @Nullable View view, @Nullable Window.Callback callback, @NonNull KeyEvent keyEvent) {
        if (oooO00o == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return oooO00o.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return OooO00o((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return OooO00o((Dialog) callback, keyEvent);
        }
        if ((view == null || !ViewCompat.OooO00o(view, keyEvent)) && !oooO00o.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public static boolean OooO00o(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f20430OooO00o) {
            try {
                f20429OooO00o = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f20430OooO00o = true;
        }
        Method method = f20429OooO00o;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    public static boolean OooO00o(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && OooO00o(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.OooO00o(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    public static DialogInterface.OnKeyListener OooO00o(Dialog dialog) {
        if (!OooO0O0) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            OooO0O0 = true;
        }
        Field field = OooO00o;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    public static boolean OooO00o(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener OooO00o2 = OooO00o(dialog);
        if (OooO00o2 != null && OooO00o2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.OooO00o(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
